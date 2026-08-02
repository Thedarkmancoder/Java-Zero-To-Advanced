// Problem Statement:- check if the HashMap contains the key "India" and the value "Paris" then print the results.
// Hint:- Use containsKey(key) and containsValue(value) for verification.

import java.util.HashMap;
public class checkingForKeyAndValue {
    public static void main(String[] args){
//Hint: verify key and value using containsKey and containsValue.
    HashMap<String, String>capitals = new HashMap<>();
    capitals.put("India", "New Delhi");
    capitals.put("UK", "London");
    capitals.put("Bihar", "Patna");
    System.out.println("Contains Key 'India' : " + capitals.containsKey("India"));
    System.out.println("Contains Value 'Paris' : " + capitals.containsKey("Paris"));            
    }
} 
// Output:- Contains Key 'India' : true
// Contains Value 'Paris' : false