package san_pham_va_chuc_nang;

import doc_ghi_file.ReadAndWrite;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SneakerManager implements Serializable {
    private static final String TOBI = "DATA/shose.txt";
//    private static String choice;
//    private static final String ONE = "1";
//    private static final String TWO = "2";
//    private static final String THREE = "3";
//    private static final String FOUR = "4";
//    private static final String ZERO = "0";
    public static Scanner sc = new Scanner(System.in);
    private List<Sneaker> sneakers;
    private ReadAndWrite<Sneaker> readAndWrite;


    public SneakerManager() {
        readAndWrite = new ReadAndWrite();
        sneakers = readAndWrite.readFile(TOBI);


    }

    public void add() {

//        int idSp;
//        int count = 0;
//        for (int i = 0; i < sneakers.size(); i++){
//            if (count < sneakers.get(i).getId()) {
//                count = sneakers.get(i).getId();
//            }
//        }
//        idSp = count + 1;
//
//        System.out.println("Id sneaker : " + idSp);
        System.out.println("input id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("input name : ");
        String name = sc.nextLine();
        System.out.print("input amount : ");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.print("input price : ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("input brand : ");
        String brand = sc.nextLine();
        sc.nextLine();

        Sneaker sneaker = new Sneaker(id, name, amount, price, brand);
        sneakers.add(sneaker);
        readAndWrite.writeFile(TOBI,sneakers);
    }

    public void editEx() {
        sc.nextLine();
    }

    public void show() {
        System.out.printf("| %1s", "");
        System.out.printf("%-4s  |  ", "Mã giày");
        System.out.printf("%20s", "");
        System.out.printf("%-30s  |  ", "Tên giày");
        System.out.printf("%2s", "");
        System.out.printf("%-8s  |  ", "Số lượng");
        System.out.printf("%6s", "");
        System.out.printf("%-12s  |  ", "Giá giày");
        System.out.printf("%3s","");
        System.out.printf("%-7s |  ", "Nhà sản xuất");
        System.out.println();

        for (Sneaker list : sneakers) {
            System.out.printf("|%3s", "");
            System.out.printf("%-3d  |  ", list.getId());
            System.out.printf("%-50s  |  ", list.getName());
            System.out.printf("%-10s  |  ", list.getAmount());
            System.out.printf("%-18s  |  ", list.getPrice());
            System.out.printf("%3s","");
            System.out.printf("%-7s  |  ", list.getBrand());
            System.out.println();

        }
    }

    public void remove(int id) {
        Sneaker sneakerList = null;
        for (int i = 0; i < sneakers.size(); i++) {
            if (sneakers.get(i).getId() == id) {
                sneakerList = sneakers.get(i);
                break;
            }
        }
        if (sneakerList != null) {
            System.out.println(" delete sneaker : " + sneakerList.getName());
            sneakers.remove(sneakerList);
            readAndWrite.writeFile(TOBI,sneakers);
        } else {
            System.out.printf("Id = %d no thing.\n", id);
        }
    }

    public void edit(int id) {
        boolean isExit = false;
        for (int i = 0; i < sneakers.size(); i++) {
            if (id == (sneakers.get(i).getId())) {
                isExit = true;

                System.out.println("MENU");
                System.out.println("1. Sửa mã id : ");
                System.out.println("2. Sửa tên giày : ");
                System.out.println("3. Sửa số lượng : ");
                System.out.println("4. Sửa giá : ");
                System.out.println("5. Sửa hãng : ");
                System.out.println("6. Hoàn thành !");
                System.out.println("0. Kêt thúc");

                int choice;
                boolean check = true;

                while (check) {
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Sửa mã id : " + sneakers.get(i).getId()+ " Fort :" );
                            sc.nextLine();
                            int SneakerId = sc.nextInt();
                            sneakers.get(i).setId(SneakerId);
                            System.out.println("ID đã sửa :");
                            display(sneakers.get(i));
                            break;
                        case 2:
                            System.out.println("Sửa tên giày  : " + sneakers.get(i).getName()+ " Fort :");
                            sc.nextLine();
                            String SneakerName = sc.nextLine();
                            sneakers.get(i).setName(SneakerName);
                            System.out.println("Tên đã sửa :");
                            display(sneakers.get(i));
                            break;
                        case 3:
                            System.out.println("Sửa số lượng : " + sneakers.get(i).getAmount() + " Fort :");
                            sc.nextLine();
                            int SneakerAmount = sc.nextInt();
                            sneakers.get(i).setAmount(SneakerAmount);
                            System.out.println("Số lượng đã sửa :");
                            display(sneakers.get(i));
                            break;
                        case 4:
                            System.out.println("Sửa giá : " + sneakers.get(i).getPrice() + " Fort :");
                            sc.nextLine();
                            int SneakerPrice = sc.nextInt();
                            sneakers.get(i).setPrice(SneakerPrice);
                            System.out.println("Giá đã sửa :");
                            display(sneakers.get(i));
                            break;
                        case 5:
                            System.out.println("Sửa hãng : " + sneakers.get(i).getBrand()+ " Fort :");
                            sc.nextLine();
                            String SneakerBrand = sc.nextLine();
                            sneakers.get(i).setBrand(SneakerBrand);
                            System.out.println("Hãng sau khi sửa :");
                            display(sneakers.get(i));
                            break;
                        case 6:
                            System.out.println("Chỉnh sửa thành công !");
                            System.out.println();
                            sc.nextLine();
                            check = false;
                            break;
                        case 0:
                            System.exit(0);
                        default:
                    }
                }
            }
        }
        if (!isExit) {
            System.out.printf("Id = %d nothing.\n", id);
        } else {
            readAndWrite.writeFile(TOBI,sneakers);
        }
    }

    private void display(Sneaker sneaker) {
        System.out.printf("|%3s","");
        System.out.printf("%-3d  |   ",sneaker.getId());
        System.out.printf("%-34s  |   ",sneaker.getName());
        System.out.printf("%-10s  |   ",sneaker.getAmount());
        System.out.printf("%-10s  |   ",sneaker.getPrice());
        System.out.printf("%3s", "");
        System.out.printf("%-7s  |   ",sneaker.getBrand());
        System.out.println();
    }

    public void search() {
        String name = sc.nextLine();
        boolean isExited = false;
        for (Sneaker sneaker : sneakers) {
            if (sneaker.getName().toUpperCase().equals(name.toUpperCase())) {
                System.out.println(" Đôi giày có tên : " + name + " |" + " có mã sản phẩm : " + sneaker.getId() + " |" + " số lượng : " + sneaker.getAmount() +  " |" + " có giá : " + sneaker.getPrice() + " |" + " sản phẩm thuộc hãng : " + sneaker.getBrand());
                isExited = true;
            }
        }
        if (!isExited) {
            System.out.println("nothing sneaker " + name);
        }
    }

   public  void sort() {
       System.out.println("Chọn kiểu sắp xếp :");
       System.out.println("1. Sắp xếp theo tên :");
       System.out.println("2. Sắp xếp theo giá :");
       System.out.println("3. Thoát :");
        int choice;
       choice = sc.nextInt();
       switch (choice) {
           case 1:
               sortName();
               break;
           case 2:
               sortPrice();
               break;
           case 3:
               System.exit(0);
               break;
           default:

       }
   }

    void sortName() {
        sneakers.sort(new Comparator<Sneaker>() {
            @Override
            public int compare(Sneaker o1, Sneaker o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    void sortPrice() {
        sneakers.sort(new Comparator<Sneaker>() {
            @Override
            public int compare(Sneaker o1, Sneaker o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

}
