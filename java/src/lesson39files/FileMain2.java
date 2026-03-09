package lesson39files;

import java.io.File;
import java.util.List;

public class FileMain2 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Emrah\\Desktop\\Java Ders\\javakids4");
        findFiles(List.of(file.listFiles()));
    }

    public static void findFiles(List<File> files) {
        for (File file:files){
            if(file.isFile()){
                System.out.println(file.getName());
                System.out.println(file.getPath());
                System.out.println(file.length()/1024D+" kb");

            }else{
                findFiles(List.of(file.listFiles()));
            }
        }

    }
}
