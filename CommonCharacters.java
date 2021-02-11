//Task 0.10


//This Class implement a method that find the common characters between 2 strings
public class CommonCharacters {

    public static void main(String[] args){

        commonCharacters("Computers", "House");   //test the method
        commonCharacters("Maximum", "Minimum"); 
        
    }

    //This method finds the common letters between to words
    public static void commonCharacters(String firstWord, String secondWord){

        
        String str = "";
        char[] firstWordChars = firstWord.toLowerCase().toCharArray();
        char[] secondWordChars = secondWord.toLowerCase().toCharArray();
        char[] commonChars;

        if(firstWordChars.length >= secondWordChars.length){   //check which word is longer to use for iteration, use the first word if its longer
                for(int i=0; i < firstWordChars.length; i++){
                    for(int x=0; x<secondWordChars.length; x++){
                        if(firstWordChars[i] == secondWordChars[x]){
                        	
                            str += firstWordChars[i];    //if there is a common letter append it to  string, break and go to the next letter in the word
                            break;
                        }
                    }
                }
        }else{													//Else use the second word if its longer than the first word

            for(int i=0; i < secondWordChars.length; i++){
                for(int x=0; x < firstWordChars.length; x++){
                    if(firstWordChars[x] == secondWordChars[i] ){
                        str += secondWordChars[i]; 			//if there is a common letter append it to  string, break and go to the next letter in the word
                        break;
                    }
                }
            }
        }
        
 
        
        if(str.length() != 0) {         //check if there are any common letters found to output
        	commonChars = str.toCharArray();
        	if(commonChars.length > 1){
        		
        		System.out.print("Common letters: ");
        		System.out.print(commonChars[0]);
        		
                 for (int i = 1; i < str.length(); i++) {
                	 int x = i;
                	 while(x>0) {					//Go through the letter already printed to check if the current is already printed out, print it if not already printed out
                    	 if(commonChars[i] == commonChars[x-1]){
                    		 continue;
                    	 }                   	 
                		x--; 
                	 }
                	System.out.print("," + commonChars[i]);  // put comma in between letters
                 }
        		System.out.println();     
        	}
        	else {
        		System.out.println("Common letter: "+ commonChars[0]);
        	}
            
        }else{   										//Else out put nothing if there are no common letters 
            System.out.println("Common letters: No common letters");
        }
            
    }
}
