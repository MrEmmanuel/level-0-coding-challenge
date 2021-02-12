//Task 0.9

import java.util.ArrayList;

public class PrintVowels {

	public static void main(String[] args) {
		
		
		vowels("Computer");   

	}
	
	
	//This method takes a word and print all the vowels in the word
	public static void vowels(String str){
		
		String word = str.toLowerCase();
		
		ArrayList<String> vowels = new ArrayList<String>();
		ArrayList<String> vowelString = new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
		for(int i = 0; i < word.length(); i++) {
			
			if(vowels.contains(word.substring(i, i+1)) && !vowelString.contains(word.substring(i, i+1))){   
				
				vowelString.add(word.substring(i, i+1));
			}
		}
		if(vowelString.size() !=0){
			if(vowelString.size() >1){
				
				System.out.print("Vowels found: " + vowelString.get(0).toString()); 
				
				for(int x=1; x<vowelString.size(); x++) {
			
					System.out.print(", "+ vowelString.get(x).toString());
				}
			}
			else {
				System.out.println("Vowel found: " + vowelString.get(0).toString());
			}
		System.out.println();	
		}
		else {
			System.out.println("Vowels found: No vowel found");
		}
	}
}
