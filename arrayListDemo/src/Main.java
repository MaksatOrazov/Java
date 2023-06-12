import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(10);
        numbers.add("Balikesir");
        System.out.println(numbers);
        System.out.println("----------------------");

        System.out.println(numbers.get(0));
        numbers.set(0,100);  // change contents
        numbers.set(2,"Tbilisi");
        //numbers.remove(0);
        //numbers.clear();

        for (Object i:numbers){
            System.out.println(i);
        }
    }
}