package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Cherry");
        myList.add("Mango");
        myList.add("Pineapple");
        //Adding object at specific index
        myList.add(3, "Grapes");
        myList.add(1, "Kiwi");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Kiwi");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
