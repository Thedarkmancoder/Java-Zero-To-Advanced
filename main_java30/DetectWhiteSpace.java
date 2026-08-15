//Problem Statement:- Check if String s contains any whitespace character.
//Hint:- Use \s with find().

package main_java30;
import java.util.regex.*;
public class DetectWhiteSpace {
    public static void main(String[] args) {
        String s = " Hello Nitish ";
        //1. Pattern for any Whitespace
        Pattern p = Pattern.compile("\\s");
        //2. matcher
        Matcher m = p.matcher(s);
        //3. find() returns true if any match exists
        boolean hasWhiteSpace = m.find();
        System.out.println(hasWhiteSpace);
    }
}
// Output:- true
// Explanation:-
// . Regex \s matches any whitespace(space, tab, newline).
// . find() scans string and returns true on first match.