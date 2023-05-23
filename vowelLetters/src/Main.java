public class Main {
    public static void main(String[] args) {
        char letter = 'E';

        switch (letter) {
            case 'A':
            case 'O':
            case 'U':
                System.out.println("Thick vovels");
                break;
            default:
                System.out.println("Thin vovels");
        }

    }
}