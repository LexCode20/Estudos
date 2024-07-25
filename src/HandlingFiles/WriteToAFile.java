package HandlingFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\alexv\\IdeaProjects\\Estudos\\src\\HandlingFiles\\familia.txt");
            myWriter.write("My name is Alexandre but can call me Alex\nI'm twenty years old\nMy family is also Laís\nI love her so much");
            myWriter.close();
            System.out.println("Sucessfully wrote to the file.");
        }catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
