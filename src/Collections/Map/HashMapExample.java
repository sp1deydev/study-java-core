package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<>();
        studentList.put(1, "Tran Van A");
        studentList.put(3, "Nguyen Van C");
        studentList.put(2, "Do Thi B");
        for(int key: studentList.keySet()) {
            System.out.println(key + ". " + studentList.get(key));
        }
        //get key student list
        Iterator<Integer> iterator = studentList.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //get value student list
        Iterator<String> iterator2 = studentList.values().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        for(String element : studentList.values()) {
            System.out.println(element);
        }
    }
}
