package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab002 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("AB");
        //list.add(45); unable to add the integer as its only for string
        list.add("CD");
        System.out.println(list);
    }
}
