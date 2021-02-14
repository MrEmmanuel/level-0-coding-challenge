import java.util.ArrayList;

//Task 0.10


public class Task10 {

    public static void main(String[] args){

        commonCharacters("Computers", "House"); 
        commonCharacters("Maximum", "Minimum");
        
    }

    //This method finds the common letters between to words
    public static void commonCharacters(String firstWord, String secondWord){

       
        char[] firstWordChars = firstWord.toLowerCase().toCharArray();
        char[] secondWordChars = secondWord.toLowerCase().toCharArray();
        
        ArrayList<Character> common = new ArrayList<>();
        ArrayList<Character> alreadyPrinted  = new ArrayList<>();
        
        if(firstWordChars.length >= secondWordChars.length){   
                for(int i=0; i < firstWordChars.length; i++){
                    for(int x=0; x<secondWordChars.length; x++){
                        if(firstWordChars[i] == secondWordChars[x]){
                        	
                            common.add(firstWordChars[i]);
                            break;
                        }
                    }
                }
        }else{
            for(int i=0; i < secondWordChars.length; i++){
                for(int x=0; x < firstWordChars.length; x++){
                    if(firstWordChars[x] == secondWordChars[i] ){
                        
                        common.add(secondWordChars[i]);
                        
                        break;
                    }
                }
            }
        }
        
        if(common.size() != 0) {
        	
        	if(common.size() > 1){
        		
        		System.out.print("Common letters: ");
        		System.out.print(common.get(0));
        		alreadyPrinted.add(common.get(0));
        		
                for (int i = 0; i < common.size(); i++) {
                	
                	 	if(!alreadyPrinted.contains(common.get(i))) {
                	 		
                	 		System.out.print("," + common.get(i));
                	 		alreadyPrinted.add(common.get(i));
                	 	}
                 	}
        		System.out.println();     
        	}
        	else {
        		System.out.println("Common letter: "+ common.get(0));
        	}
        }else{
            System.out.println("Common letters: No common letters");
        }    
    }
}
