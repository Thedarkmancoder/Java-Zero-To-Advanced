//Parblem Statement:- Update the capital of "japan" in the HashMap and print the updated map.
//Hint:- Reuse put(key, value) with the existng key to update the value.

import java.util.HashMap;
public class UpdatingAValue{
    public static void main(String[] args){
        //Hnt: puttng a value for an  existing key updates it.
        HashMap<String, String>capitals = new HashMap<>();
        capitals.put("Japan" , "Tokyo");
        System.out.println("Before Update : " + capitals);
        capitals.put("Japan", "Kyata");
        //update capital of japan
        System.out.println("After Update : " + capitals);
    }
}

//Output:- Before Update : {Japan=Tokyo}
// After Update : {Japan=Kyata}