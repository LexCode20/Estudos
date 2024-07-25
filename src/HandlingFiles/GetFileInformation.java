package HandlingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GetFileInformation {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File myFile = new File("C:\\Users\\alexv\\IdeaProjects\\Estudos\\src\\HandlingFiles\\fruits.txt");
            if (myFile.createNewFile()) {
                FileWriter myWriter = new FileWriter("C:\\Users\\alexv\\IdeaProjects\\Estudos\\src\\HandlingFiles\\fruits.txt");
                myWriter.write("Banana\nPineaple\nStrawberry\nWathermellon\nApple");
                myWriter.close();
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }
        File myFile = new File("C:\\Users\\alexv\\IdeaProjects\\Estudos\\src\\HandlingFiles\\fruits.txt");
            if (myFile.exists()) {
                Scanner sc = new Scanner(myFile);
                    while (sc.hasNextLine()) {
                        for (int i = 1; i <= 5; i++) {
                        String data = sc.nextLine();
                        System.out.println("Content Inside the file line:" + i +"° " + data);
                        }
                    }

                    System.out.println("File name: " + myFile.getName());
                    System.out.println("Absolute path: " + myFile.getAbsolutePath());
                    System.out.println("Writeable: " + myFile.canWrite());
                    System.out.println("Readable " + myFile.canRead());
                    System.out.println("File size in bytes " + myFile.length());

            } else {
                System.out.println("This file does not exist.");
            }
        }
    }

