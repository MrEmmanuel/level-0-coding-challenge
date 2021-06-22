public class Task5 {

    public static void main(String[] args){

        System.out.println("The area of a triangle with sides 3, 4 and 5 is " + areaOfTriangle(3,4,5));
    }
    public static int areaOfTriangle(int a, int b, int c){

        double semiPerimeter = (a+b+c)/2;   
        int area = (int)Math.sqrt((semiPerimeter)*(semiPerimeter - a )*(semiPerimeter - b)*(semiPerimeter - c));
        
    return area;
    }

}
