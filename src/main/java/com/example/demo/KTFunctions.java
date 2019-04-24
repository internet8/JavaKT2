package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KTFunctions implements KT3 {

	@Override
	public String openFile(String filename) {

		byte[] encoded;
		try {
			encoded = Files.readAllBytes(Paths.get(filename));
			return new String(encoded);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public ArrayList<String> stringToList(String str) {
		return new ArrayList<String>(Arrays.asList(str.split(" ")));
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
