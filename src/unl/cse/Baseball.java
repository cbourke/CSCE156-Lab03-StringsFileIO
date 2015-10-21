package unl.cse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baseball {

	public static void main(String args[]) {
		
		String fileName = "data/mlb_nl_2011.txt";
		Scanner s = null;
		try {
			s = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Team teams[] = new Team[16];

		//TODO: read in and process the data file, create teams and add them to the array

		System.out.println("Teams: ");
		for(Team t : teams) {
			System.out.println(t);
		}

		Arrays.sort(teams, new Comparator<Team>() {
			@Override
			public int compare(Team a, Team b) {
				return b.getWinPercentage().compareTo(a.getWinPercentage());
			}
			
		});
		
		System.out.println("\n\nSorted Teams: ");
		for(Team t : teams) {
			System.out.println(t);
		}
		
		//TODO: output the team array to a file as specified
		
	}
	
}
