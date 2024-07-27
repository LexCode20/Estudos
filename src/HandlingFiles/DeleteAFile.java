package HandlingFiles;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\alexv\\IdeaProjects\\Estudos\\src\\HandlingFiles\\fruits.txt");
        if(myFile.delete()){
            System.out.println("Delete the folder: " + myFile.getName());
        }else{
            System.out.println("Failed to delete the folder.");
        }
    }
}
