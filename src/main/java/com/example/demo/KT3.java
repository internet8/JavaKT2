package com.example.demo;

import java.util.ArrayList;

public interface KT3 {
	public String openFile (String filename);
	public ArrayList<String> stringToList (String str);
	public ArrayList<String> wordsToLowercase (ArrayList<String> listIn);
	public ArrayList<String> wordsSortByLetter (String letter, int count, ArrayList<String> listIn);
}
