package products;

import java.util.ArrayList;
import java.util.Scanner;

public class SneakerManager {

    public void display (ArrayList<Sneaker> list) {
        for (Sneaker sneaker : list) {
            System.out.println(sneaker);
        }
    }

    public void add(ArrayList<Sneaker> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input id : ");
        String id = sc.nextLine();
        System.out.println("input name : ");
        String name = sc .nextLine();
        System.out.println("input brand : ");
        String brand = sc.nextLine();
        System.out.println("input price : ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("input amount : ");
        int amount = ( int ) Math.round(Math.random() * 34);

        Sneaker sneaker = new Sneaker(id,name,brand,price,amount);
        list.add(sneaker);

    }

    public void edit (ArrayList<Sneaker> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                Scanner sc = new Scanner(System.in);
                System.out.println("input id :");
                String id = sc.nextLine();
                System.out.println("input name : ");
                String name = sc.nextLine();
                System.out.println("input brand : ");
                String brand = sc.nextLine();
                System.out.println("input price : ");
                int price = Integer.parseInt(sc.nextLine());
                System.out.println("input amount : ");
                int amount = (int) Math.round(Math.random() * 34);

                list.get(j).setId(id);
                list.get(j).setName(name);
                list.get(j).setBrand(brand);
                list.get(j).setPrice(price);
                list.get(j).setAmount(amount);
                break;
            }
        }
    }

    public void remove(ArrayList<Sneaker> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == 0) {
                list.remove(j);
                break;
            }
        }
    }

    public void search(ArrayList<Sneaker> list) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        boolean isExit = false;

        for (Sneaker sneaker : list) {
            if ((sneaker.getName().toUpperCase()).equals(name.toLowerCase())) {
                System.out.println(" Đôi giày có tên : " + name + " |" + " có mã sản phẩm : " + sneaker.getId() + " |" + " số lượng : " + sneaker.getAmount()  + "|"  + " có giá : " + sneaker.getPrice() + " |" + " sản phẩm thuộc hãng : " + sneaker.getBrand());
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("không tìm thấy thông tin đôi giày ");
        }
    }

}
