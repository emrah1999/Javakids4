package lesson39files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Emrah\\Desktop\\Java kids\\javakids4\\java\\newfile.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Fayl yaradila bilmedi");
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Salam ushaqlar");
            fileWriter.write(" Necesiz");
            fileWriter.close();

            FileWriter fileWriter1 = new FileWriter(file,true);
            fileWriter1.write("Yaxshiyam");
            fileWriter1.close();
            System.out.println("Melumat yazildi");
        }catch (Exception e){
            System.out.println("Melumat yaizlmasi mumkun olmadi");
        }
    }
}
