// Problem Statement:- Remove the entry for "Brazil" from the hashmap and print the resulting map.
// Hint:- Use remove(key) to delete the entry.
import java.util.HashMap;
public class RemovingAnEntry{
    public static void main(String[] args){
// Hint: Remove an entry by key.
    HashMap<String, String >capital = new HashMap<>();
    capital.put("Brazil", "Brasilia");
    capital.put("Canada", "Ottawa");
    capital.put("Austrailia", "Canberra");
    System.out.println("Before removal : " + capital);
    capital.remove("Brazil");
    System.out.println("After removal : " + capital);       
    }
}
// output:- Before removal : {Canada=Ottawa, Brazil=Brasilia, Austrailia=Canberra}
// After removal : {Canada=Ottawa, Austrailia=Canberra}