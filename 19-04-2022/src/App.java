import java.util.ArrayList;

import java.util.List;

public class App {

	public static void trimAllString(List<String> list) {

		// ***first way***
//		List<String> trimStr = new ArrayList<String>();
//		for (String s : list) {
//			trimStr.add(s.trim());
//		}
//
//		list = trimStr;
//		
		// ***second way***
		list.replaceAll(String::trim);
		
		list.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add(" shubham   ");
		aList.add("    nigam  ");
		aList.add("   Java is BEST    ");
		aList.add("  GENPACT   ");

		App.trimAllString(aList);

	}
}
