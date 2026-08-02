// Problem Statement:- iterate over keys in a HashMap and print each key with its corresponding value.
// Hint:- Use KeySet() to retrieve keys , then get values with get(key).

import java.util.HashMap;
public class IteratingOverKsys {
    public static void main(String[] args){
//Hint: Use keySet() to iterate over keys.
        HashMap<String, String>capitals = new HashMap<>();
        capitals.put("USA", "Washington,D.C");
        capitals.put("France", "Paris");
        capitals.put("japan", "Tokyo");
        for(String country : capitals.keySet()){
            System.out.println(country + "-> " + capitals.get(country));
        }
    }
}
// output:-
// USA-> Washington,D.C
// japan-> Tokyo
// France-> Paris