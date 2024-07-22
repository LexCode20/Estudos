package Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.println("Digite o caminho do arquivo: ");
        // C:\Users\alexv\in.txt
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);
                if(map.get(name) == null){
                    map.put(name,votes);
                }else{
                    map.put(name, votes + map.get(name));
                }


                line = br.readLine();
            }
            for (String key: map.keySet()){
                System.out.println(key + ": " + map.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
