//Task 0.4


public class Task4 {
    public static void main(String[] args){

        //Test the method
        evenOrOdd(3);
        evenOrOdd(4);

    }
    //Method to check if a number is even or odd then output even or odd accordingly
    public static void evenOrOdd(int x){
        if(x%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }

}
