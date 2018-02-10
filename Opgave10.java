import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Opgave10 {
        public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Lige");
        set.add("Ulige");
        set.add("Ulige22");
        set.add("Lige10");
        removeOddLength(set);
        }

        public static void removeOddLength(Set<String> a)
        {
            for(Iterator<String> iterator = a.iterator(); iterator.hasNext();) // i dette tilfælde ku jeg også bruge metoden removeIf jeg brugte tidligere
            {
                String s = iterator.next();
                if (s.length() % 2 != 0) // hvis String ikke er lige, bliver den fjernet
                {
                    iterator.remove();
                }
            }
            System.out.println(a); // udskriver Set af strings
        }
}
