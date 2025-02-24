package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu: ");
        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++) {
            numberList.add(scanner.nextInt());
        }
        //assign value to a new array list
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < numberList.size(); i++) {
           if(!newList.contains(numberList.get(i))) {
               newList.add(numberList.get(i));
           }
        }
        System.out.println("Danh sach khong trung lap: ");
        for(int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
        // another way to write for loop for "newList"
        System.out.println("\nDanh sach khong trung lap: ");
        for(int element : newList) {
            System.out.print(element + " ");
        }
    }
}
