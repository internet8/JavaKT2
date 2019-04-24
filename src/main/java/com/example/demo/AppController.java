package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@GetMapping("/input")
    @ResponseBody
    public InputText getInput(@RequestParam(name="text", required=true) String text)  {
    	String result = "";
    	if (text.equals("loe")) {    		
    		KTFunctions ktf = new KTFunctions();
    		String str = ktf.openFile("filename.txt");
    		ArrayList<String> wordList = new ArrayList();
    		wordList = ktf.stringToList(str);
    		wordList = ktf.wordsToLowercase(wordList);
    		wordList = ktf.wordsSortByLetter('i', 2, wordList);
    		for (String word : wordList) {
				result += (word + " ");
			}
    		
    	} else {
    		result = "funktsionaalsuse testimiseks kirjutage 'http://localhost:8080/input?text=loe'";
    	}
    	
    	
        return new InputText(result);
    }

}
