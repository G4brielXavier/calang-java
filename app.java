import java.util.Scanner;

public class app {
    static int numberOne = 0;
    static int numberTwo = 0;

    public static void main(String[] args) {
        
        System.out.println("<JV>CALANG");
        System.out.println("View the Github README to all commands of CALANG");
        System.out.println();

        while(true) {
            String cmdv = ipt();
            interpretator(cmdv);
        }
    }


    
    // input commands
    public static String ipt() {
        Scanner scan = new Scanner(System.in);

        System.out.println("<@cmd-cal>");
        String cmd = scan.next();


        return cmd;
    }

    // setNumberOne - to change the numberOne for calc 
    public static void set_number_one() {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("#one>");

        int newNumber = scan.nextInt();

        System.out.println();
        // set a new value to numberOne
        numberOne = newNumber;
    }

    // setNumberTwo - to change the numberTwo for calc
    public static void set_number_two() {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("#two>");

        int newNumber = scan.nextInt();

        System.out.println();

        numberTwo = newNumber;
    }

    // global interpretator
    public static void interpretator(String cmd) {
        funcs func = new funcs();

        // code-block to verify that commands was typed
        switch (cmd) {
            case "setNumberOne" -> set_number_one();
            
            case "setNumberTwo" -> set_number_two();

            case "add" -> func.sum(numberOne, numberTwo);

            case "sub" -> func.sub(numberOne, numberTwo);

            case "mul" -> func.mult(numberOne, numberTwo);

            case "div" -> func.div(numberOne, numberTwo);

            default -> {
                System.out.println();
                System.out.println("Error ~ This command " + cmd + " not exist");
                System.out.println();
            }
            }
    }
}