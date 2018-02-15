package PracticePack;

import java.util.ArrayList;
import java.util.Arrays;

public class MorseCodeTranslator {
	
	public static String run(boolean morseToEnglish, String textToTranslate) {
		
		String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?" };

      String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
              ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
              "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
              "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
              "-----", "--..--", ".-.-.-", "..--.." };
		String translatedText = "";
      
      if (morseToEnglish) {
			ArrayList<String> morseArrayWords = new ArrayList<String>(Arrays.asList(textToTranslate.split("   ")));
			StringBuffer newSentance = new StringBuffer();
			for(String words: morseArrayWords) {
				ArrayList<String> morseArrayLetters = new ArrayList<String>(Arrays.asList(words.split(" ")));
				for(String letters: morseArrayLetters) {
					System.out.println(letters);
					int counter = 0;
					for(String morseCheck:morse) {
						if(morseCheck.equals(letters)) {
							break;
						}
					counter += 1;	
					}
					System.out.println(counter);
					if (counter > 38) {
						return "Invalid Morse Code Or Spacing";
					}
					String letter = english[counter];
					newSentance.append(letter);
				}
				newSentance.append(" ");
			}
			translatedText = newSentance.toString();
      }else {
			ArrayList<String> englishArrayWords = new ArrayList<String>(Arrays.asList(textToTranslate.split(" ")));
			StringBuffer newSentance = new StringBuffer();
			for(String words: englishArrayWords) {
				ArrayList<String> englishArrayLetters = new ArrayList<String>(Arrays.asList(words.split("")));
				for(String letters: englishArrayLetters) {
					String lowLetter = letters.toLowerCase();
					System.out.println(lowLetter);
					int counter = 0;
					for(String englishCheck:english) {
						if(englishCheck.equals(lowLetter)) {
							break;
						}
					counter += 1;	
					}
					if (counter > 38) {
						return "Invalid Character Or Spacing";
					}
					String letter = morse[counter];
					newSentance.append(letter);
					newSentance.append(" ");
				}
				newSentance.append("  ");
			}
			translatedText = newSentance.toString();
      }

		return translatedText;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(run(false, "The wizard quickly jinxed the gnomes before they vaporized."));
	}

}
