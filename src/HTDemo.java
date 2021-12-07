//Demonstrate a Hashtable.
import java.util.*;
public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String,Double> balance=new Hashtable<String,Double>();
        Enumeration<String> names;
        String str;
        double bal;
        balance.put("A",34456.00);
        balance.put("B",3879.09);

        balance.put("C",4956.00);

        balance.put("D",6789.00);
        names=balance.keys();
        while(names.hasMoreElements()){
            str=names.nextElement();
            System.out.println(str+":"+balance.get(str));
        }
        System.out.println();
        bal=balance.get("A");
        balance.put("A",bal+1000);
        System.out.println("A's new balane :"+ balance.get("A"));

    }
}
