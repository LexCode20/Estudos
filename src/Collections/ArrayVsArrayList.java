package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args){
        //Arrays
        String[] friendsArray = new String[4];
        friendsArray[0] = "Laís";
        friendsArray[1] = "Gabriel";
        friendsArray[2] = "Bryan";
        for(int i = 0; i<friendsArray.length;i++){
            System.out.println(friendsArray[i]);
        }
        System.out.println("____________________");
        String[] friendsArray2 = {"Jonh","Chris", "Eric", "Luke"};
        for(int j = 0; j<friendsArray2.length;j++) {
            System.out.println(friendsArray2[j]);
        }
        System.out.println("____________________");
        //ArrayList do not have a fixed size
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Lola","Palloza","Marques","Trump"));
        friendsArrayList2.add("Alexa");
        System.out.println(friendsArrayList2);
        System.out.println(friendsArrayList2.get(2));
    }
}
