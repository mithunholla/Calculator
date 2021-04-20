package org.example;

import java.util.Scanner;

public class caculator {

    public static void main(String[] args) {

        boolean calculate = true;    //If the calculate is true, the code will keep executing

        while (calculate) {

            System.out.print("Do you like to perform calculation?  (y/n)");

            Scanner perform = new Scanner(System.in);
            char rec = perform.next().charAt(0);


            if (rec == 'n') {             // If 'y' then calculation can be performed.  Otherwise will exit the calculator.
                calculate = false;
            } else {

                System.out.println("Enter first Number");  //Read first number
                double input1 = getInteger();

                System.out.println("Enter second Number");  //Read Second number
                double input2 = getInteger();

                System.out.println("Which operation would you like to perform?  For addition (+) , Subtraction (-), Multiplication (*), Division (/)  ");
                String operator = getStringFromUser();     //Read which operation to perform


                double result = '0';
                switch (operator) {

                    case "+" :
                        result = addition(input1,input2);  // Call Add method
                        break;
                    case "-" :
                        result = sub(input1,input2);      // Call Subtract method
                        break;
                    case  "*" :
                        result = mul(input1,input2);      // Cal Mul method
                        break;
                    case "/" :
                        result = div(input1,input2);;    // Call Div method
                        break;
                    default:
                        System.out.println(operator + "is not supported");
                }

                System.out.println("and the result of " + input1 + operator + input2 + " is " + result);  // Output
            }
        }

    }

    public static double addition(double n1, double n2){      //Method to add
        return n1+n2;
    }
    public static double sub(double n1, double n2){          // Method to Sub
        return n1-n2;
    }
    public static double mul(double n1, double n2){          // Method to multiply
        return n1*n2;
    }
    public static double div(double n1, double n2){         // Method to Divide
        return n1/n2;
    }

    public static String getStringFromUser() {             // Scan key Method
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double getInteger() {
        boolean valid = false;
        double number = 0;
        while(!valid) {
            try {
                number = Double.parseDouble(getStringFromUser().trim().replace(',','.'));
                valid = true;
            }catch(NumberFormatException e) {
                System.out.println("Input was not a number");
            }
        }
        return number;
    }

}
