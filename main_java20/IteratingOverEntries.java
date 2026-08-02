// Problem Statement:- Iterate over the key-value paris in a HashMap using the entry set and print each pair.
// Hint:- Use entrySet() for a direct iteration over map.Entry objects.

import java.util.HashMap;

public class IteratingOverEntries {
    public static void main(String[] args){
// Hint:- Use entrySet() to iterate through key- value pairs.
        HashMap<String, String>capitals = new HashMap<>();
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rame");
        capitals.put("Spain", "Madrid");
        capitals.put("India", "New Delhi");
        for(var entry : capitals.entrySet()){
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
// output:-
// Italy=>Rame
// Germany=>Berlin
// Spain=>Madrid
// India=>New Delhi