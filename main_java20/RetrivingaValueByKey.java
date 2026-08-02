// Problem Statement:- Retrieving and print the capital of "France" from the HashMap.
// Hint:- Use get(key) to acess the value.

import java.util.HashMap;
public class RetrivingaValueByKey {
    public static void main(String[] args) {
        // Hint: Retrive the capital using get(key)

        HashMap<String, String>capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("USA", "Washington, D.C");
        String capitalOfFrance = capitals.get("France");
        System.out.println("Capital Of France : " + capitalOfFrance);
    }
}
// output:- Capital Of France : Paris