import admin.AdminSneaker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static  Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        AdminSneaker adminSneaker = new AdminSneaker();

        boolean check = true;
        while (check) {
            System.out.println("---Menu---");
            System.out.println("1. Admin");
            System.out.println("0. Exit");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Log in");
                        scanner.nextLine();
                        System.out.println("Account");
                        String acc = scanner.nextLine();
                        System.out.println("Password");
                        String pass = scanner.nextLine();
                        adminSneaker.checkAdmin(acc,pass);
                        break;
                    case 0:
                        System.exit(0);
                    default:
                }
            } catch (InputMismatchException e ) {
                System.err.println("Enter a number");
                Main.scanner.nextLine();
            }
        }
    }
}
