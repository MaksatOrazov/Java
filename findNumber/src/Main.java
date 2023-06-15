public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,5,6,8,0};
        int wanted = 7;
        boolean  isYes = false;
        for (int number: numbers){
            if(number==wanted){
                isYes=true;
                break;
            }
        }
        if (isYes){
            System.out.println("The number is available");
        }else {
            System.out.println("The number is not available");
        }

    }
}