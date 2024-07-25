package HandlingFiles;

import java.io.IOException;
import java.io.File;

public class CreateFile {
    public static void main(String[] args){
        try {
            File myFile = new File("C:\\Users\\alexv\\IdeaProjects\\Estudos\\src\\HandlingFiles\\familia.txt");
            if (myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            }else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
