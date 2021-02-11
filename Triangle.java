//Task 0.5


// This Class use areaOfTriangle method to calculate the area of a triangle using provided parameter inputs
public class Triangle {

    public static void main(String[] args){

        System.out.println("The area of a triangle with sides 3, 4 and 5 is " + areaOfTriangle(3,4,5));
       

    }

    //Method to calculate the area of a triangle using 3 3 side lengths
    public static int areaOfTriangle(int a, int b, int c){

    double semiPerimeter = (a+b+c)/2;    //Calculate the semiperimeter to be used to calculate the area


    int area = (int)Math.sqrt((semiPerimeter)*(semiPerimeter - a )*(semiPerimeter - b)*(semiPerimeter - c)); //calculate the area using Heron's formula

    return area;
    }

}
