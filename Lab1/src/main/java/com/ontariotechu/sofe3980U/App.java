package com.ontariotechu.sofe3980U;
import java.util.Scanner;
import org.joda.time.LocalTime;
/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program: The entry point of the program. It creates two binary variables, adds them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String input0 = sc.nextLine();
        Binary binary0 = new Binary(input0);
        System.out.println("Enter the second binary number:");
        String input1 = sc.nextLine();
        Binary binary1 = new Binary(input1);

    // addition
        Binary sum = Binary.add(binary0, binary1);
        System.out.println("The sum of them is: " + sum.getValue());
    // or
        Binary or = Binary.or(binary0, binary1);
        System.out.println("The OR operation of them is: " + or.getValue());
    // and
        Binary and = Binary.and(binary0, binary1);
        System.out.println("The AND operation of them is: " + and.getValue());
    // multiplication

        Binary multiply = Binary.multiply(binary0, binary1);
        System.out.println("The multiplication of them is: " + multiply.getValue());
        sc.close();
    }
}
