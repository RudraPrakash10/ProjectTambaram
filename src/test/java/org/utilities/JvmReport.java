package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
public static void generateJvmReport(String jsonpath) {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");

		Configuration con = new Configuration(f, "adactin hotelapp");
		con.addClassifications("platform name", "windows 10");
		con.addClassifications("Browser name", "Chrome");
		con.addClassifications("Browser version", "90.0");
		con.addClassifications("Sprint number", "1");
		
		List<String> list= new ArrayList<String>();
		list.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(list, con);
		r.generateReports();
}

}
