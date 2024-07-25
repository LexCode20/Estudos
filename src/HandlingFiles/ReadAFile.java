package HandlingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[] args){
        try {
            File myFile = new File("C:\\Users\\alexv\\IdeaProjects\\Estudos\\src\\HandlingFiles\\familia.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
