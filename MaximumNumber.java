//Task 0.6

public class MaximumNumber {
    public static void main(String[] args){

        System.out.println("Maximum: " + maximum(1,22,3,2));

    }
    
    //This method find the maximum number  amongst a list of numbers
    public static int maximum(int a, int b, int c, int d){

        //5,3,4
        int max = 0;

        if(a>b){     //check the maximum between the first two numbers, then use the max to find the maximum between max and the third number.. and eventually the fourth number
            if(a>c){
                
            	if(a>d) {
            		
            		max = a;
            	}
            	else {
            		max = d;
            	}
            }
            else{
            	if(c>d) {    
            		max = c;
            	}
            	else {
            		max = d;
            	}
            }
            
        }else{ 
            if(b>c){
            	if(b>d){
            		max = b;
            	}
            	else {
            		max = d;
            	}
            }
            else{
            	if(c>d){        
            		
            		max = c;
            	}
            	
            	else{
            		max = d;
            	}
            }
        }
        return max;
    }
}
