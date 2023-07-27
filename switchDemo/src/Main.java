public class Main {
    public static void main(String[] args) {
        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Excellent : Passed");
                break;
            case 'B':
                System.out.println("Very Good : Passed");
                break;
            case 'C':
            case 'D':
                System.out.println("Not bad : Passed");
                break;
            case 'F':
                System.out.println("Not Passed");
                break;
            default:
                System.out.println("Entered Unidentified Note");
        }
    }
}