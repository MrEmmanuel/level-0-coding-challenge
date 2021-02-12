//Task 0.10


public class CommonCharacters {

    public static void main(String[] args){

        commonCharacters("Computers", "House"); 
        commonCharacters("Maximum", "Minimum"); 
        
    }

    //This method finds the common letters between to words
    public static void commonCharacters(String firstWord, String secondWord){

        String str = "";
        char[] firstWordChars = firstWord.toLowerCase().toCharArray();
        char[] secondWordChars = secondWord.toLowerCase().toCharArray();
        char[] commonChars;

        if(firstWordChars.length >= secondWordChars.length){   
                for(int i=0; i < firstWordChars.length; i++){
                    for(int x=0; x<secondWordChars.length; x++){
                        if(firstWordChars[i] == secondWordChars[x]){
                        	
                            str += firstWordChars[i]; 
                            break;
                        }
                    }
                }
        }else{
            for(int i=0; i < secondWordChars.length; i++){
                for(int x=0; x < firstWordChars.length; x++){
                    if(firstWordChars[x] == secondWordChars[i] ){
                        str += secondWordChars[i]; 			
                        break;
                    }
                }
            }
        }
        
        if(str.length() != 0) {
        	commonChars = str.toCharArray();
        	if(commonChars.length > 1){
        		
        		System.out.print("Common letters: ");
        		System.out.print(commonChars[0]);
        		
                 for (int i = 1; i < str.length(); i++) {
                	 int x = i;
                	 while(x>0) {
                    	 if(commonChars[i] == commonChars[x-1]){
                    		 continue;
                    	 }                   	 
                		x--; 
                	 }
                	System.out.print("," + commonChars[i]);
                 }
        		System.out.println();     
        	}
        	else {
        		System.out.println("Common letter: "+ commonChars[0]);
        	}
            
        }else{
            System.out.println("Common letters: No common letters");
        }
            
    }
}
