public class Task6 {
    public static void main(String[] args){

        System.out.println("Maximum: " + maximum(1,22,30));

    }
    public static int maximum(int a, int b, int c){
        
        int max = 0;
        if(a>b){
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
