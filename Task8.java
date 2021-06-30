
public class Task8 {

	public static void main(String[] args) {
	
		hoursAndMinutes(0);
		hoursAndMinutes(60);  
		hoursAndMinutes(50);
		hoursAndMinutes(133); 
		hoursAndMinutes(71);
		hoursAndMinutes(61);
		hoursAndMinutes(121);
		hoursAndMinutes(2);
		hoursAndMinutes(-2);
	}
	public static void hoursAndMinutes(int num) {
		int hours;
		int minutes;
		int number = num;
		
		if(number < 0){
			System.out.println("Invalid number");   
		}else {
			if(number < 60 ) {
				hours = 0;
				minutes = number;
			}else {
				hours = number / 60;         
				minutes = number%60; 
			}
			
			if(hours == 0 && minutes == 0) {
				zeroHourZeroMinute(minutes, hours, number);
			}else if(hours <= 1) {
				if(minutes <= 1) {
					checkLessThanMinute(minutes, hours, number);
				}else {
					checkGreaterThanMinute(minutes, hours, number);
				}
			}else if(hours > 1 && minutes <= 1) {
				if(minutes == 0) {
					zeroHourZeroMinute(minutes, hours, number);
				}else {
					System.out.println(number + " is "+ hours+ " hours, "+ minutes + " minute");
				}
			}else{
				zeroHourZeroMinute(minutes, hours, number);
			}
		}
	}
	public static void checkLessThanMinute(int aMinute, int anHour, int num) {
		int minutes = aMinute;
		int hours = anHour;
		int number = num;
		
		if((hours <= 1 && minutes == 0) || (hours == 0 && minutes <= 1)) {
			System.out.println(number + " is "+ hours+ " hour, "+ minutes + " minutes ");
		}else{
			System.out.println(number + " is "+ hours+ " hour, "+ minutes + " minute ");
		}
	}
	public static void zeroHourZeroMinute(int aMinute, int anHour, int num) {
		System.out.println(num + " is "+ anHour+ " hours, "+ aMinute + " minutes");
	} 
	public static void checkGreaterThanMinute(int aMinute, int anHour, int num) {
		int minutes = aMinute;
		int hours = anHour;
		int number = num;
		if(	hours == 0) {
			System.out.println(number + " is "+ hours+ " hours, "+ minutes + " minutes");
		}else {
			System.out.println(number + " is "+ hours+ " hour, "+ minutes + " minutes");
		}	
	}
}
