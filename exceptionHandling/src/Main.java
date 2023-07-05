public class Main {
    public static void main(String[] args) {
        try
        {
            int[] numbers = new int[] {1,2,3};
            System.out.println(numbers[5]);
        }catch (Exception exception){
            System.out.println("Error! =>>> " + exception);
        }finally {
            System.out.println("I'll work all the way.");
        }

    }
}