package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaKt3ApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testIfMethodReadsFiles () {
		KTFunctions ktf = new KTFunctions();
		String answer = ktf.openFile("filename.txt");
		assertTrue(answer !=  "");
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
		String answerStr = answer.get(0);
		assertEquals(answerStr,  "tere");
	}
	
	@Test
	public void testIfWordReturnsWordsWithTwoLetters () {
		KTFunctions ktf = new KTFunctions();
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("issi");
		ArrayList<String> answer = ktf.wordsSortByLetter('i', 2, myArrayList);
		String answerStr = answer.get(0);
		assertEquals(answerStr,  "issi");
	}

}
