


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class one {
        public static void main(String args[]){
            ArrayList<String> al=new ArrayList<String>();
            al.add("PUBG");
            al.add("MINECRAFT");
            al.remove("FREEFIRE");
            al.remove("CALLOFDUTY");
            Iterator<String> itr=al.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
                
            }
        }
    }

