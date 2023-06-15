import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){
        File file = new File("F:\\Java Maxi\\Files\\students.txt");
        try{
            if (file.createNewFile()){
                System.out.println("File created.");
            }else {
                System.out.println("File already exists.");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file = new File("F:\\Java Maxi\\Files\\students.txt");
        if (file.exists()){
            System.out.println("File name : " + file.getName());
            System.out.println("File path : " + file.getPath());
            System.out.println("is File writeable : " + file.canWrite());
            System.out.println("is File readable : " + file.canRead());
            System.out.println("File size : " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("F:\\Java Maxi\\Files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Java Maxi\\Files\\students.txt",true));
            writer.newLine();
            writer.write("Efe");
            System.out.println("Written to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}






















