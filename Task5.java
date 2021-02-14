//Task 0.5


public class Task5 {

    public static void main(String[] args){

        System.out.println("The area of a triangle with sides 3, 4 and 5 is " + areaOfTriangle(3,4,5));
       

    }

    //Method to calculate the area of a triangle using 3 3 side lengths
    public static int areaOfTriangle(int a, int b, int c){

    double semiPerimeter = (a+b+c)/2;   


    int area = (int)Math.sqrt((semiPerimeter)*(semiPerimeter - a )*(semiPerimeter - b)*(semiPerimeter - c)); //calculate the area using Heron's formula

    return area;
    }

}
