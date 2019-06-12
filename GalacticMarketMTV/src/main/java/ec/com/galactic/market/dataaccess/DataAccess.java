package ec.com.galactic.market.dataaccess;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Read a file as List
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public final class DataAccess {
	
	/**
	 * Read file and transform it into a String collection
	 * 
	 * @param fileName path where file is saved
	 * @return list of lines from file
	 */
	public static List<String> readFileAsList(String fileName){
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Error at reading file: " + e.getMessage());
		}
		return lines;
	}
	
}
