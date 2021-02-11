//Task 0.7

//This class implement  two methods that 1. convert temperature from celsius to fahrenheit and 2. convert temperature from fahrenheit to celsius
public class ConvertTemperature {

	public static void main(String[] args) {
		
			System.out.println(celsiusToFahrenheit(32) + "°F");
			
			System.out.println(fahrenheitToCelsius(74) + "°C");

	}
	
	//This method convert the temperature from celsius to fahrenheit 
	public static int celsiusToFahrenheit(int cel) {
		
		int celsius = cel;
		int fahrenheit = 0;
		
		fahrenheit = (celsius * (9/5)) + 32;  //calculate the temperature in fahrenheit
		
		
		return fahrenheit;
	}
	
	
	//This method convert the temperature from fahrenheit to celsius 
	public static int fahrenheitToCelsius(int fah) {
		
		//double celsius = 0;
		int fahrenheit = fah;
		
		double celsius = ((fahrenheit) - 32) * (0.55555555556);    //calculate the temperature in celsius 
		
		
		return (int)celsius;
	}

}
