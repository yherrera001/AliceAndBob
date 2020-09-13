import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Getting the input from user
        String username1 = "Alice";
        String username2 = "Bob";
        boolean correctName = false;

        while (correctName == false) {
            System.out.println("Type in Username: ");
            String name = scanner.next();
            if (username2.equalsIgnoreCase(name)) {
                System.out.println("HELLO! WELCOMEEEE!");
                break;
            }
            if (username1.equalsIgnoreCase(name)) {
                System.out.println("HELLOOOOO WELCOMEEEE!");
                break;
            } else {
                System.out.println("GET OUT OF HEREE!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }
    }
}

