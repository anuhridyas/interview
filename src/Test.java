import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {

        public static void main(String[] args) {
            Object i = new ArrayList<>().iterator();
            System.out.println(i instanceof List);
            System.out.println(i instanceof ListIterator);
            System.out.println(i instanceof Iterator);

        }

}
