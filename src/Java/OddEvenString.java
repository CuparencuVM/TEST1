package Java;

import java.util.ArrayList;
import java.util.List;

public class OddEvenString {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        System.out.println(Numar(list));
    }     // aici se inchide metoda main

    //metoda ce rezolva problema aici incepe

    public static StringBuilder Numar (List<Integer> list) {
        StringBuilder Nr = new StringBuilder();
        for (Integer str: list) {
            if (str % 2==0) {
                Nr.append("e" + str + " " );
            } else {
                Nr.append("o" + str + " ");
            }
        }
        return Nr;
    }
}

}
