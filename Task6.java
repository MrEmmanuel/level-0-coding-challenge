//Task 0.6


public class Task6 {
    public static void main(String[] args){

        System.out.println("Maximum: " + maximum(1,22,30));

    }
    
    //This method find the maximum number  most a list of numbers
    public static int maximum(int a, int b, int c){

        int max = 0;

        if(a>b){     //check the maximum between the first two numbers, then use the max to find the maximum between max and the third number..
            if(a>c){
                max = a;
            }else {
            	max = c;
            }
            
        }else{
            if(b>c){
            	max = b;
            }else {
            	max = c;
            }
        }
        return max;
    }
}
