//Task 0.8

//This class implement a method that convert a number into hours and minutes
public class HoursAndMinutes {

	public static void main(String[] args) {
	
		hoursAndMinutes(60);    //Test method hoursAndMinutes
		hoursAndMinutes(133); 
		hoursAndMinutes(71);
		hoursAndMinutes(62);
		hoursAndMinutes(50);
		hoursAndMinutes(120);
		hoursAndMinutes(-2);
	}
	
	//This method convert a number into hours and minutes, handling both singular and plurals for hours and minutes
	public static void hoursAndMinutes(int num) {
		
		int hours;
		int minutes;
		int number = num;
		if(number < 0){
			System.out.println("Invalid number");   //print Invalid if a number given is below zero
		}else {
		
			if(number < 60 ) {
				hours = 0;
				minutes = number;
				
			}else {
			
				hours = number / 60;         //convert number to hours
				minutes = number%60;		//convert number to minutes 
			}
		
			if(hours <= 1 && minutes <=1 ) {
				System.out.println(number + " is "+ hours+ " hour, "+ minutes + " minute ");
			}else if(hours <= 1 && minutes > 1) {
				System.out.println(number + " is "+ hours+ " hour, "+ minutes + " minutes");
			}else if(hours > 1 && minutes <= 1) {
				System.out.println(number + " is "+ hours+ " hours, "+ minutes + " minute");
			}else{
				System.out.println(number + " is "+ hours+ " hours, "+ minutes + " minutes");
			}
		}
	}

}
