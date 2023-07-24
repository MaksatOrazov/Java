import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("book","kitap");
        dictionary.put("table","masa");
        dictionary.put("pen","kalem");
        System.out.println(dictionary);
        System.out.println(dictionary.size());
        System.out.println(dictionary.get("table"));
        //dictionary.remove("table");
        //dictionary.clear();
        System.out.println(dictionary);
        System.out.println("-------------------");

        for (String item:dictionary.keySet()){
            System.out.println("Item -"+item+" Value -"+dictionary.get(item));
        }
    }
}