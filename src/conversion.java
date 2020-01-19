import java.util.Scanner;
class conversion{
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter a degree in Fahrenheit: ");
    	float number = input.nextFloat();
    	float Celcius = ((number - 32)*5)/9; 
    	System.out.println(number + " degree Fahrenheit is equal to " + Celcius + " in Celcius");
    }
}