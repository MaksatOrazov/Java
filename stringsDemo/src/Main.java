import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String message = "The weather is good today.";
        System.out.println(message);

        /*System.out.println("Character number = " + message.length());
        System.out.println("5th character : " + message.charAt(4));
        System.out.println(message.concat(" Oley!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("A"));
        char[] characters = new char[5];
        message.getChars(0,4,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('d'));*/

        System.out.println(message.replace(' ','-'));
        System.out.println(message.substring(4,11));
        for (String word : message.split(" ")) {
            System.out.println(word);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //cumlenin basindaki ve sonundaki bosluklari siler

    }
}