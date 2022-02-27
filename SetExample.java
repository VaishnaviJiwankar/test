package CoreJava;
import java.util.*;

public class SetExample {
    public static void main(String[] args){
        Set<String>hs=new LinkedHashSet();
        hs.add("INDIA");
        hs.add("JAPAN");
        hs.add("CHINA");
        hs.add("NEPAL");
        System.out.println(hs);
        Set<String>hs1=new HashSet();
        hs1.add("INDIA");
        hs1.add("JAPAN");
        hs1.add("CHINA");
        hs1.add("NEPAL");
        System.out.println(hs);
        Set<String>hs2=new TreeSet();
        hs1.add("INDIA");
        hs1.add("JAPAN");
        hs1.add("CHINA");
        hs1.add("NEPAL");
        System.out.println(hs2);
    }
}
