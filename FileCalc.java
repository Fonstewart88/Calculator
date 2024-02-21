package calculator;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import  java.io.BufferedReader;

public class FileCalc {

    public void newFile() {
    try {
            File file = new File("archive.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                //System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
    }
    public void newWrite(String arr) {
    try {
            FileWriter writer = new FileWriter("archive.txt", true);
            writer.write(arr);
            writer.write("\n");
            writer.close();
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл");
            ex.printStackTrace();
        }
    }

    public void FileReade() {
          
        try{
            BufferedReader reader = new BufferedReader(new FileReader("archive.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
             System.out.println(line);
            }
            reader.close();
            
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }       
    }     
}
