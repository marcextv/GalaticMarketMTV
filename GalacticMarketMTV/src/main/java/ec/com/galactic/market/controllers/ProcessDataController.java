package ec.com.galactic.market.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ec.com.galactic.market.commons.GalacticMarketResources;
import ec.com.galactic.market.dataaccess.DataAccess;
import ec.com.galactic.market.entities.RomanValue;
import ec.com.galactic.market.enums.ResponseType;

public final class ProcessDataController {
	
	private static final String EMPTY_SPACE = " ";

	public static List<String> processData(String fileName) {
		List<String> dataSource = DataAccess.readFileAsList(fileName);
		List<String> result = new ArrayList<>();
		List<RomanValue> romanValues = new ArrayList<>();
		Map<String, Integer> units = new HashMap<>(); 
		for (String data : dataSource) {
			RomanValue newValue = new RomanValue(ResponseType.DATA);
			data = isQuestion(data, newValue);
			compareDataError(result, data, newValue, units);
			romanValues.add(newValue);
		}
		return result;
	}

	private static void compareDataError(List<String> result, String data, RomanValue newValue,
			Map<String, Integer> units) {
		if (data.contains(GalacticMarketResources.CONDITIONAL)) {
			String[] info = data.split(GalacticMarketResources.CONDITIONAL);
			if (info.length <= 2) {
				transformToRomanValue(info, newValue, units);
			} else {
				newValue.setError(true);
			}
		} else {
			newValue.setError(true);
		}
	}

	private static void transformToRomanValue(String[] data, RomanValue newValue, Map<String, Integer> units) {
		try {
		newValue.setName(data[0]);
		newValue.setValue(data[1]);
		if (newValue.getResponseType().equals(ResponseType.DATA)) {
			String[] name = newValue.getName().split(EMPTY_SPACE);
			if(name.length > 1 && hasCurrency(newValue.getValue())) {
				newValue.setType(name[name.length - 1].trim());
				String[] value = newValue.getValue().split(EMPTY_SPACE);
				if(value.length == 2) {
					newValue.setArabicValue(Integer.valueOf(value[0]));
				}
			} else {
				newValue.setError(true);
			}
		} else {

		}
		}catch (Exception e) {
			newValue.setError(true);
		}
	}

	private static String isQuestion(String string, RomanValue newValue) {
		if((string.trim().toLowerCase().contains(GalacticMarketResources.QUESTION) 
				|| string.trim().toLowerCase().contains(GalacticMarketResources.QUESTION_TYPE))
				&& string.trim().contains("?")) {
			string = string.trim().toLowerCase().replaceAll(GalacticMarketResources.QUESTION, "").trim();
			string = string.trim().toLowerCase().replaceAll(GalacticMarketResources.QUESTION_TYPE, "").trim();
			string = string.trim().toLowerCase().replaceAll("\\?", "").trim();
			newValue.setResponseType(ResponseType.QUESTION);
		}
		return string;
	}
	
	private static boolean hasCurrency(String string) {
		return string.trim().contains(GalacticMarketResources.CURRENCY);
	}
}
