import java.util.Scanner;

public class project_calculator {
    public static void main(String args[]){

        project_calculator obj = new project_calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator Application - By Java Plus DSA");
       
        // Take input from user and decide which operation to perform
       do {                            // atleast one time program execute
           System.out.println("Choose an Operation: ( *, +, -, %, / )");
           System.out.print("->");
            String input = sc.next();      // string input
            char ch = input.charAt(0);  // string to char conversion with only one character in starting so index is zero 
            if(input.length()!=1) {           // more then one input then error
                System.out.println("Wrong input, please try again");
            }else {                     // only one input
                obj.chooseOperation(ch);   // call chooseaoperation with one input character
            }
            boolean exit = obj.exitProgram();
            if(exit){       // if exit = true then break and out of the loop
                break;
            }
       } while (true);
        System.out.println("Thanks for using our service");
        
    }
    
    /*
    This function will prompt the user to enter his choice on exiting the program.
    If user chooses 'y' then program will exit.
    If user chooses 'n' then program will continue.
    If wrong input is given, then program will retry at max 5 times and after that
    it will exit forcefully
    */
    public boolean exitProgram(){
        Scanner sc = new Scanner(System.in);
        int times = 0;
        int retry = 5;
    
        for(times = 0; times < retry; times++){
            System.out.println("Do you want to continue? (y/n)");
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);
            if (exitInput.length()==1 && (ch1 == 'n' || ch1 == 'N')){
                return true;
            } else if (exitInput.length()==1 && (ch1 == 'y'|| ch1 == 'Y')) {
                return false;
            }else{
                System.out.println("Wrong input, please try again");
            }
        }
        if(times >= retry){
            System.out.println("Maximum retry count exceeded! Exiting forcefully");
            return true;
        }
        return false;   // not mendetory
    }
    
    // function to take integer as input
   /*  public int getInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number -> ");
        int num = sc.nextInt();
       return num;
    }
    */
    public double getDouble(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
       return num;
    }
    /*
    Take a character as input and decides which operation to perform.
    In case none of the operations match, it will prompt 'Unknown Operation' 
    */
    public void chooseOperation(char ch){


        switch (ch){
            case '*':
                System.out.println("Enter first number");
                double num1 = getDouble();
                System.out.println("Enter second number");
                double num2 = getDouble();
                System.out.println("Multiply Result -> " + (num1*num2));
                break;
            case '+':
                System.out.println("Enter first number");
                double num3 = getDouble();
                System.out.println("Enter second number");
                double num4 = getDouble();
                System.out.println("Addition -> " + (num3+num4));
                break;
            case '-':
                System.out.println("Enter first number");
                double num5 = getDouble();
                System.out.println("Enter second number");
                double num6 = getDouble();
                System.out.println("Subtraction -> "+ (num5 - num6));
                break;
            case '/':
                System.out.println("Enter first number");
                double num7 = getDouble();
                System.out.println("Enter second number");
                double num8 = getDouble();
                if (num8 == 0){
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Division -> "+ (num7/num8));
                break;
            case '%':
                System.out.println("Enter first number");
                double num9 = getDouble();
                System.out.println("Enter second number");
                double num10 = getDouble();
                if (num10 == 0){
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Modulo -> "+ (num9%num10));
                break;
            default:
                System.out.println("Unknown Operation");
        }
    }
}
