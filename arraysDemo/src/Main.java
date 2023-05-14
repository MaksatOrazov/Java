public class Main {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0]="Maxi";
        students[1]="Duygu";
        students[2]="Efe";
        for (int i=0;i<students.length;i++) {
            System.out.println(students[i]);

        }
        System.out.println("*************************");
        for (String student:students){
            System.out.println(student);
        }
    }
}