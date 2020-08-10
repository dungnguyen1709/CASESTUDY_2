import admin.AdminSneaker;

import java.util.Scanner;

public class Test {
   public static  Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        AdminSneaker adminSneaker = new AdminSneaker();

        boolean check = true;
        while (check) {
            System.out.println("Menu");
            System.out.println("1. Admin");
            System.out.println("0. Exit");
            System.out.println("Enter your choice (ENTER NUMBER): ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Log in");
                        scanner.nextLine();
                        System.out.println("Account");
                        String acc = scanner.nextLine();
                        System.out.println("Password");
                        String pass = scanner.nextLine();
                        adminSneaker.check(acc,pass);
                        break;
                    case 0:
                        System.exit(0);
                    default:
            }
        }
    }
}
