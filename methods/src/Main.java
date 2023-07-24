public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber(){
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
            giveMessage("The number i available: " +wanted);
        }else {
            giveMessage("The number is not available : " +wanted);
        }
    }

    public static void giveMessage(String message){
        System.out.println("The number is available : ");
    }
}