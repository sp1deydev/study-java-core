package Collections.Map;

import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> studentList = new TreeMap<>();
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
