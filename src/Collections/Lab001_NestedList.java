package Collections;

import java.util.ArrayList;

public class Lab001_NestedList {
    public static void main(String[] args) {
        ArrayList arylist = new ArrayList();
        arylist.add("Sunil");
        arylist.add("Bhati");
        arylist.add("Bhati"); // Dupicate will be allowed
        arylist.add(45);
        ArrayList arylist1 = new ArrayList();
        arylist.add("Hinal");
        arylist.add("Bhati");
        arylist.add("Diya"); // Dupicate will be allowed
        arylist.add(20);
        ArrayList arylistMain = new ArrayList();
        arylistMain.add(arylist); // we can add array list at arguments also
        arylistMain.add(arylist1);
        System.out.println(arylistMain);
        System.out.println(arylistMain.contains("hinal"));
    }
}
