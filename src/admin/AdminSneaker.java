package admin;

import san_pham_va_chuc_nang.SneakerManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminSneaker {
    public static Scanner sc = new Scanner(System.in);
    private static final String ONE = "1";
    private static final String TWO = "2";
    private static final String THREE = "3";
    private static final String FOUR = "4";
    private static final String FIVE = "5";
    private static final String SIX = "6";
    private static final String ZERO = "0";

    public void admin() {
        SneakerManager sneakerManager = new SneakerManager();

        boolean check = true;
        while (check) {
            String choice;

            System.out.println();

            System.out.println(" MENU : ");
            System.out.println("1. Hiển thị danh sách sản phẩm : ");
            System.out.println("2. Thêm sản phẩm : ");
            System.out.println("3. Xóa sản phẩm : ");
            System.out.println("4. Sửa sản phẩm : ");
            System.out.println("5. Sắp xếp sản phẩm : ");
            System.out.println("6. Tìm kiếm : ");
            System.out.println("0. Thoát : ");


            try {
                choice = sc.nextLine();
                switch (choice) {
                    case ONE:
                       sneakerManager.show();
                        break;
                    case TWO:
                       try {
                           sneakerManager.add();
                           sc.nextLine();
                           System.out.println("Add to public");
                           System.out.println();
                       } catch (InputMismatchException e) {
                           System.err.println("Enter a number");
                           sneakerManager.editEx();
                       }
                       break;
                    case THREE:
                        System.out.println("Enter id remove : ");
                        sc.nextLine();
                        int stt = sc.nextInt();
                        sneakerManager.remove(stt);
                        break;
                    case FOUR:
                        System.out.println("Enter id edit : ");
                        sc.nextLine();
                        int stt2 = sc.nextInt();
                        sneakerManager.edit(stt2);
                        break;
                    case FIVE:
                        sneakerManager.sort();
                        break;
                    case SIX:
                        System.out.println("Enter search :");
                        sneakerManager.search();
                        break;
                    case ZERO:
                        System.exit(0);
                    default:
                }

            } catch (InputMismatchException e) {
                System.err.println("Enter a number ");
                AdminSneaker.sc.nextLine();
            }
        }
    }

    public void check(String account ,String pass){
        if (account.equals("admin")){
            if (pass.equals("admin")){
                admin();
            }else {
                System.out.println("Sai pass");
            }
        }else {
            System.out.println("Sai account");
        }
    }

}
