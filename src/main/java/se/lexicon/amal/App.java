package se.lexicon.amal;
import java.util.Scanner;

/**
 * Calculator!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Calculator Program" );
        System.out.println( "(A) - Addition" );
        System.out.println( "(S) - Substraction" );
        System.out.println( "(M) - Multiplcation" );
        System.out.println( "(D) - Division" );
        System.out.println( "(E) - Exit" );

        Scanner userInput = new Scanner(System.in);

        boolean userChoise = true;

        String choise;

        double number1,number2,result;

        while (userChoise)
        {
            System.out.println( "Pleas select your choice:" );
            choise = userInput.next();

            if (choise.equalsIgnoreCase("A"))
            {
                System.out.println("Please enter your first number");
                number1= userInput.nextDouble();

                System.out.println("Please enter your second number");
                number2= userInput.nextDouble();

               result= addition(number1,number2);
                System.out.println("the resule="+result);
            }

            if (choise.equalsIgnoreCase("S"))
            {
                System.out.println("Please enter your first number");
                number1= userInput.nextDouble();

                System.out.println("Please enter your second number");
                number2= userInput.nextDouble();

                result= subtration(number1,number2);
                System.out.println("the resule="+result);
            }

            if (choise.equalsIgnoreCase("M"))
            {
                System.out.println("Please enter your first number");
                number1= userInput.nextDouble();

                System.out.println("Please enter your second number");
                number2= userInput.nextDouble();

                result= multiplication(number1,number2);
                System.out.println("the resule="+result);
            }

            if (choise.equalsIgnoreCase("D"))
            {
                System.out.println("Please enter your first number");
                number1= userInput.nextDouble();

                System.out.println("Please enter your second number");
                number2= userInput.nextDouble();

                result= division(number1,number2);
                System.out.println("the resule="+result);
            }

            if (choise.equalsIgnoreCase("E"))
            {
                userChoise=false;
            }

        }

    }

    public static double addition(double number1, double number2)
    {
        return number1+number2;
    }

    public static double subtration(double number1, double number2)
    {
        return number1-number2;

    }

    public static double multiplication(double number1, double number2)
    {
        return number1*number2;
    }

    public static double division(double number1, double number2)
    {
        return number1/number2;
    }
}
