package Collections;

import java.util.ArrayList;
import java.util.List;

public class list_prg {
    public static void main(String[] args) {
        List lst = new ArrayList();
        lst.add(22);
        lst.add(25);
        lst.add(30);
        lst.add(40);
        System.out.println(lst);
        System.out.println(lst.size());
        System.out.println(lst.isEmpty());
        System.out.println(lst.contains("30"));

    }
}
