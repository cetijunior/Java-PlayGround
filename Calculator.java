import java.util.*;

public class Calculator {
    static Scanner in = new Scanner(System.in);

    static int num1;
    static int num2;
    static double rezultati;
    static String veprimi;

    public static void main(String[] args) {
        System.out.println("Shkruaj numrin e pare: ");
        num1 = in.nextInt();

        System.out.println("Zgjidh veprimin \n(+) \n(-) \n(/) \n(*)");
        veprimi = in.next();

        System.out.println("Shkruaj numrin e dyte: ");
        num2 = in.nextInt();

        if (veprimi.equals("+")) {
            rezultati = num1 + num2;
            System.out.print(rezultati);
        } else if (veprimi.equals("-")) {
            rezultati = num1 - num2;
            System.out.print(rezultati);
        } else if (veprimi.equals("/")) {
            rezultati = num1 / num2;
            System.out.print(rezultati);
        } else if (veprimi.equals("*")) {
            rezultati = num1 * num2;
            System.out.print(rezultati);
        }
    }
}
