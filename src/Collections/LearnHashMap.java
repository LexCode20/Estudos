package Collections;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        //System.out.println(capitalCities);
        //capitalCities.clear();
        //System.out.println(capitalCities.get("England"));
        //System.out.println(capitalCities.remove("Germany"));
        //System.out.println(capitalCities.clone());
        //System.out.println(capitalCities.size());
        //System.out.println(capitalCities.keySet());
        //System.out.println(capitalCities.values());
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + "| value: " + capitalCities.get(i));

            //Other Types
            //Keys and values in a HashMap are actually objects. In the examples above, we used
            //objects of type "String". Remember that a String in Java is an object (not a primitive type).
            //To use other types, such as int, you must specify an equivalent wrapper class: Integer.
            //For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
            // Create a HashMap object called people
            HashMap<String, Integer> people = new HashMap<String, Integer>();


            // Add keys and values (Name, Age)
            people.put("John", 32);
            people.put("Steve", 30);
            people.put("Angie", 33);

            for (String j : people.keySet()) {
                System.out.println("key: " + j + " value: " + people.get(j));
            }
        }
    }
}