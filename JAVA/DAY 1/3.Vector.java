import java.util.LinkedList;
import java.util.Iterator;
import java.util.Vector;
public class one {
    public static void main(String args[]) {
        Vector<String> al = new Vector<String>();
        al.add("HE");
        al.add("IS");
        al.remove("SO");
        al.add("STUPID");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
