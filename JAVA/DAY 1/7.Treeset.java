import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class One {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("HE");
        set.add("IS");
        set.add("VERY");
        set.add("BAD");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
