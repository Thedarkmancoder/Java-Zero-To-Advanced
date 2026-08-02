// Problem Statement:- Print the size of a HashMap, clear it and then print the size again.
// Hint:- Use size() to get the numbers of entries and clear() to empty the map.

import java.util.HashMap;
public class GetgTheSizeAndClrgMap {
    public static void main(String[] args){
//Hint: size() returns the number of entries, clear() empties the map.
        HashMap<String, String>capitals = new HashMap<>();
        capitals.put("Canada", "Ottawa");
        capitals.put("Australlia", "Caraberra");
        capitals.put("New Zealand", "Wellington");
        System.out.println("Size before clear : " + capitals.size());
        capitals.clear();
        System.out.println("Size After Clear : " + capitals.size());
    }
}
// Output:-
// Size before clear : 3
// Size After Clear : 0