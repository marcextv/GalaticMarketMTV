package ec.com.galactic.market.test;

import java.util.List;

import org.junit.Test;

import ec.com.galactic.market.dataaccess.DataAccess;

public class DataAccessTest {
	
	@Test
	public void testReadFileAsList() {
		try {
		List<String> l = DataAccess.readFileAsList("D:\\introData.txt");
		for (Object string : l) {
			System.out.println(string);
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
