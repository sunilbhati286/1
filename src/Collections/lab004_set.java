package Collections;

import java.util.*;

public class lab004_set {
    public static void main(String[] args) {
        Set sett = new HashSet();
        sett.add("Sunil");
        sett.add("Sunil");
        sett.add("Sunil");
        sett.add("sunil");
        sett.add("SuNil");
        sett.add("Null"); // we can add one null value also
        System.out.println(sett); // it will not allowed the duplicate order will not be added
        System.out.println("---------------------------");
        LinkedHashSet lkd = new LinkedHashSet();
        lkd.add("Sunil");
        lkd.add("Bhati");
        lkd.add("Diya");
        lkd.add("Hinal");
        lkd.add("sB");
        lkd.add("S");
        System.out.println(lkd);

    }
}
