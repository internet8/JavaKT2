package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KTFunctions implements KT3 {

	@Override
	public String openFile(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new FileReader(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		while(in.hasNext()) {
		    sb.append(in.next());
		}
		in.close();
		return sb.toString();		
	}

	@Override
	public ArrayList<String> stringToList(String str) {
		return new ArrayList<String>(Arrays.asList(str.split("\\s+|,\\s*|\\.\\s*")));
	}

	@Override
	public ArrayList<String> wordsToLowercase(ArrayList<String> listIn) {
		ArrayList<String> result = new ArrayList();
	    for (String word : listIn) {
	        word = word.toLowerCase();
	        result.add(word);
	    }
	    return result;
	}

	@Override
	public ArrayList<String> wordsSortByLetter(char letter, int count, ArrayList<String> listIn) {
		ArrayList<String> result = new ArrayList<String>();
		for (String word : listIn) {
			int counter = 0;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					counter++;
				}
				if (counter >= 2) {
					result.add(word);
					break;
				}
			}
	    }
	    return result;
	}

}
