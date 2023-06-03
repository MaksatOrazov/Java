public class Main {
    public static void main(String[] args) {

        int number = -4;
        int total = 0;

        if (number<=0){
            System.out.println("Unidentified number!");
            return;
        }

        for (int i=1;i<number;i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total==number) {
            System.out.println("Perfect number");
        }else {
            System.out.println("Not perfect number");
        }
    }
}