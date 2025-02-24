package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu: ");
        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++) {
            numberList.add(scanner.nextInt());
        }
        //diplay Array List value
        System.out.println("Danh sach Array List: ");
        for(int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + " ");
        }
    }
}
