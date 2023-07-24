public class Main {
    public static void main(String[] args) {
        System.out.println(getCity());
        System.out.println(total(4,6));
        int total = total2(3,45,7,8,43,7,8);
        System.out.println(total);


    }

    public static void add(){

    }
    public static void delete(){

    }
    public static void update(){
        System.out.println("Updated");

    }
    public static int total2(int... numbers){
        int total = 0;
        for (int number: numbers){
            total+=number;
        }
        return total;
    }

    public static int total(int number1, int number2) {
        return number1 + number2;
    }
    public static String getCity(){
        return "Tbilisi";
    }
}