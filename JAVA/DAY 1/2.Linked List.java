import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
public class one {
        public static void main(String args[]){
            LinkedList<String> al=new LinkedList<String>();
            al.add("I");
            al.add("AM");
            al.remove("Not");
            al.add("Hero");
            Iterator<String> itr=al.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
    }