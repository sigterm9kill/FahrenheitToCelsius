/* Sean O'Brien
*  CSC 206, intermediate programming
*  Fahrenheit to Celsius with rounding a double
 */
package fahrenheittocelsius;

/* User enters a double value for fahrenheit,
*  Program returns Celsius rounded to 2 decimals
 */
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.printf("Celsius %.2f", celsius);
        System.out.print(" is equal to "
                + fahrenheit + " Farenheit degrees.");
    }
}
