import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Balikesir");
        cities.add("Istanbul");
        cities.add("Tbilisi");
        cities.remove("Istanbul");
        Collections.sort(cities);
        for(String city: cities){
            System.out.println(city);
        }
    }
}