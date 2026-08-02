// Problem Statement:- Create a  HashMap of Country-capital Pairs and print the Map.
// Hint:- Use put(key , value) to add entries.

import java.util.HashMap;
public class CreatgAndPopulatingHashMap{
 public static void main(String[] args){
    HashMap<String, String>capitals = new HashMap<>();
    capitals.put("India", "Delhi");
    capitals.put("Japan","Tokyo");
    capitals.put("Germany", "Berlin");
    capitals.put("Canada", "Ottawa");
    capitals.put("France", "Paris");
    capitals.put("Brazil", "Brasilia");
    capitals.put("USA" , "Washington , D.C");
    System.out.println(" Country Capitals : " + capitals);
 }   
}
// output:- Country Capitals : {Canada=Ottawa, USA=Washington , D.C, Japan=Tokyo, Brazil=Brasilia, France=Paris, Germany=Berlin, India=Delhi}
