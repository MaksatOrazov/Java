public class Main {
    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;
        boolean isPrime = true;

        if(number==1){
            System.out.println("The number is Prime");
            return;
        }
        if(number<1){
            System.out.println("Unidentified number");
        }

        for (int i=2;i<number;i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("The number is Prime");
        }else {
            System.out.println("The number is not Prime");
        }
    }
}