package ec.com.galactic.market.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import ec.com.galactic.market.commons.GalacticMarketMessage;
import ec.com.galactic.market.controllers.ProcessDataController;

public class GalacticMarketInstanceTest {
	
	@Test
	public void testGalacticMarketMessageForKey() {
		String sentence = GalacticMarketMessage.getInstance()
				.getMessageForKey("ec.com.galactic.market.question.symbol");
		assertNotNull("Sentence is not null", sentence);
		System.out.println("Sentence is: ".concat(sentence));
	}
	
	@Test
	public void testProcessData() {
		List<String> result = ProcessDataController.processData("D:\\introData.txt");
		for (Object string : result) {
			System.out.println(string);
		}
	}

}
