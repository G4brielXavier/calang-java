public class funcs {
    // add - to calc adding
    public void sum(int n1, int n2) {
        System.out.println();
        System.out.println("The result is " + (n1 + n2));
        System.out.println();
    }

    // sub - to calc subtraction
    public void sub(int n1, int n2) {
        System.out.println();
        System.out.println("The result is " + (n1 - n2));
        System.out.println();
    }

    // mult - to calc multiplication
    public void mult(int n1, int n2) {
        System.out.println();
        System.out.println("The result is " + n1 * n2);
        System.out.println();
    }

    // div - to calc division
    public void div(int n1, int n2) {
        try {
            System.out.println();
            System.out.println("The result is " + n1 / n2);
            System.out.println();
        }
        catch(ArithmeticException ex) {
            System.out.println();
            System.out.println("Error ~ " + ex );
            System.out.println();
        }
    }
}
