package CoreJava;

import java.util.Set;
import java.util.TreeSet;
    public class SetEmployeeExample {

        public static void main(String[] args) {
// TODO Auto-generated method stub
            Empl emp1 = new Empl(1001,"RAMESH","IT");
            Empl emp2 = new Empl(9021,"SURESH","Marketing");
            Empl emp3 = new Empl(5329,"HARISH","QA");
            Empl emp4 = new Empl(2245,"JACKKY","Operations");
            Set<Empl> hs = new TreeSet();
            hs.add(emp1);
            hs.add(emp2);
            hs.add(emp3);
            hs.add(emp4);
            for(Empl e: hs)
                System.out.println(e);

        }

    }
