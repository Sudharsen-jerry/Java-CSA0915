import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
public class one {
    public static void main(String args[]) {
        Queue<String> al = new LinkedList<>();
        al.add("MY");
        al.add("NAME");
        al.add("IS");
        al.add("JERRY");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
