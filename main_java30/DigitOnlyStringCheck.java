// Problem Statement:- Determine if a given string s consits entirely of digits(0-9).
// Hint:- Use anchors ^ and $ around \d+.

package main_java30;
import java.util.regex.*;
public class DigitOnlyStringCheck {
    public static void main(String[] args){
        String s = "2025";
    //1.Compile a pattern: start(^), digit+ , end($)
    Pattern p = Pattern.compile("^\\d+$");
    //2. Create a matcher for the input string
    Matcher m = p.matcher(s);
    //3. matches() return true only if the entire string mateche
    Boolean isDigitsOnly = m.matches();
    //4. print result
    System.out.println(isDigitsOnly);
    }
}
