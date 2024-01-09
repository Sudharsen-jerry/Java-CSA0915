import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
public class one {
        public static void main(String args[]){
            Stack<String> al=new Stack<String>();
            al.add("Apple");
            al.remove("Mango");
            al.add("Orange");
            al.add("Banana");
            Iterator<String> itr=al.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());

            }
        }
    }