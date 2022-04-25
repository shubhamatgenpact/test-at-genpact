package Assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class State implements Comparable<Country> {
	String state;

	public State(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int compareTo(Country o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Country {
	String countryName;
	List<State> stateList;

	public Country(String countryName, List<State> stateList) {
		super();
		this.countryName = countryName;
		this.stateList = stateList;
	}

	public String getName() {
		return countryName;
	}

	public void setName(String countryName) {
		this.countryName = countryName;
	}

	public List<State> getStateList() {
		return stateList;
	}

	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}

}

public class DisplayState {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of inputs");
		int n = sc.nextInt();
		List<State> stateList = new ArrayList<State>();
		
		List<Country> count = new ArrayList<Country>();
		
		while (n-- > 0) {
			System.out.println("Enter Country and State");
			String countryData = sc.next();
			System.out.println("Enter number of state for " + countryData);
			int n2 = sc.nextInt();
			while (n2-- > 0) {
				System.out.println("Enter state");
				String stateName = sc.next();

				State stateData = new State(stateName);

				stateList.add(stateData);
			}
			Country country = new Country(countryData, stateList);
			
			count.add(country);
		}
		
		System.out.println(count);
	}
}
