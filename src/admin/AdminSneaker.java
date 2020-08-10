package admin;

import san_pham_va_chuc_nang.SneakerManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminSneaker {
    public static Scanner sc = new Scanner(System.in);

    public void admin() {
        SneakerManager sneakerManager = new SneakerManager();

        boolean check = true;
        while (check) {
            int choice;
            System.out.println();

            System.out.println(" MENU : ");
            System.out.println("1. Hiển thị danh sách sản phẩm : ");
            System.out.println("2. Thêm sản phẩm : ");
            System.out.println("3. Xóa sản phẩm : ");
            System.out.println("4. Sửa sản phẩm : ");
            System.out.println("5. Sắp xếp sản phẩm : ");
            System.out.println("6. Tìm kiếm : ");
            System.out.println("0. Thoát : ");
            System.out.println("Enter your choice (ENTER NUMBER): ");


            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                       sneakerManager.show();
                        break;
                    case 2:
                           sneakerManager.add();
                           System.out.println("Đã thêm thành công");
                           sc.nextLine();
                           System.out.println();
                       break;
                    case 3:
                        System.out.println("Nhập ID bạn muốn xóa : ");
                        sc.nextLine();
                        int stt = sc.nextInt();
                        sneakerManager.remove(stt);
                        break;
                    case 4:
                        System.out.println("Nhập ID bạn muốn sửa : ");
                        sc.nextLine();
                        int stt2 = sc.nextInt();
                        sneakerManager.edit(stt2);
                        break;
                    case 5:
                        sneakerManager.sort();
                        break;
                    case 6:
                        System.out.println("Tìm kiếm  :");
                        sneakerManager.search();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                }

            } catch (InputMismatchException e) {
                System.err.println("Bạn phải nhập số : ");
                AdminSneaker.sc.nextLine();
            }
        }
    }

    public void check(String account ,String pass){
        if (account.equals("tobi")){
            if (pass.equals("tobi")){
                admin();
            }else {
                System.out.println("Sai pass");
            }
        }else {
            System.out.println("Sai account");
        }
    }

}
