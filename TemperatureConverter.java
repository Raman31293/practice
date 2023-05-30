import java.util.Scanner;

public class TemperatureConverter {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in); 

System.out.print("Enter the temperature: ");

double temperature = scanner.nextDouble(); 

System.out.println("\n----- Conversion Menu -----");

System.out.println("1. Celsius to Fahrenheit");

System.out.println("2. Fahrenheit to Celsius");

System.out.println("---------------------------");

System.out.print("Enter your choice: ");

int choice = scanner.nextInt();

double convertedTemperature;

switch (choice) {

case 1:
//celsius to fahrenheit
convertedTemperature = ((temperature*9)/5 +32);
System.out.println(convertedTemperature);

break;

case 2:
//fahrenheit to celsius
convertedTemperature = ((temperature - 32)*5/9);
System.out.println(convertedTemperature);

break;

default:

System.out.println("Invalid choice!");

break;

}

scanner.close();


}
}