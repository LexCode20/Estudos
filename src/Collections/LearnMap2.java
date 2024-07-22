package Collections;

import java.util.HashMap;
import java.util.Map;

public class LearnMap2 {
    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();

        map.put("user", "maria");
        map.put("phone", "2823044");

        for (String key: map.keySet()){
            System.out.println("Chave = " + key + ", Valor = " + map.get(key));
        }

    }
}
