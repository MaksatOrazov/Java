import mathematics.FourOperation;
import mathematics.Logarithm;
// import mathematics.*;    <<<---- import everything in mathematics package

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name : ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        FourOperation fourOperation = new FourOperation();
        System.out.println(fourOperation.sum(4,5));
        Logarithm logarithm = new Logarithm();
        System.out.println(logarithm.logarithmaCalculate());


    }
}