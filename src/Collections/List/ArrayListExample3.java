package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();
        System.out.println("Xin moi nhap lua chon");
        while (true) {
            System.out.println("------------------------------");
            System.out.print("1. Them sinh vien \n 2.Xem danh sach \n 3.Sua sinh vien \n 4. Xoa sinh vien \n 5. Thoat \n");
            int seleted = sc.nextInt();
            sc.nextLine();
            if (seleted == 5) {
                break;
            }
            switch (seleted) {
                case (1): {
                    System.out.print("Nhap ten sinh vien: ");
                    String studentName = sc.nextLine();
                    while(!studentName.isEmpty()) {
                        studentList.add(studentName);
                        System.out.print("Nhap ten sinh vien: ");
                        studentName = sc.nextLine();
                    }
                    break;
                }
                case (2): {
                    System.out.println("Danh sach sinh vien:");
                    for(String element : studentList) {
                        System.out.println(element);
                    }
                    break;
                }
                case (3): {
                    System.out.print("Nhap STT sinh vien muon sua: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap thong tin moi cua sinh vien: ");
                    String newInfo = sc.nextLine();
                    studentList.set(index, newInfo);
                    break;
                }
                case (4): {
                    System.out.print("Nhap STT sinh vien muon xoa: ");
                    int index = sc.nextInt();
                    studentList.remove(index);
                    break;
                }
                default: {
                    break;
                }
            }
        }
        System.out.println("--End--");
    }
}
