import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class One {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        set.add("PEAKY");
        set.remove("BLINDER");
        set.add("IS");
        set.add("ROWDY");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
