package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class testKT3 {
	@Test
	public void testIfReturnTypeIsString () {
		KTFunctions ktf = new KTFunctions();
		String answer = ktf.openFile("filename.txt");
		assertEquals(answer.getClass().getName(),  "String");
	}
	
	@Test
	public void testIfResultIsNotNull () {
		KTFunctions ktf = new KTFunctions();
		String answer = ktf.openFile("filename.txt");
		assertNotEquals(answer,  null);
	}
	
	@Test
	public void testIfStringIsSplitted () {
		KTFunctions ktf = new KTFunctions();
		ArrayList<String> answer = ktf.stringToList("tere kere");
		String answerStr = answer.get(1);
		assertEquals(answerStr,  "kere");
	}
	
	@Test
	public void testIfStringIsSplittedWithDot () {
		KTFunctions ktf = new KTFunctions();
		ArrayList<String> answer = ktf.stringToList("tere.kere");
		String answerStr = answer.get(1);
		assertEquals(answerStr,  "kere");
	}
	
	@Test
	public void testIfWordIsLowercase () {
		KTFunctions ktf = new KTFunctions();
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Tere");
		ArrayList<String> answer = ktf.wordsToLowercase(myArrayList);
		String answerStr = answer.get(1);
		assertEquals(answerStr,  "tere");
	}
	
	@Test
	public void testIfWordReturnsWordsWithTwoLetters () {
		KTFunctions ktf = new KTFunctions();
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("issi");
		ArrayList<String> answer = ktf.wordsSortByLetter("i", 2, myArrayList);
		String answerStr = answer.get(1);
		assertEquals(answerStr,  "issi");
	}
}
