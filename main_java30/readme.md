File Handling
 Problem Statement:-
 Given an integer array arr, return true if the number of occurences of each value in the array is unique, otherwise return false. Use a Map<Interger, Integer> to count Frequencies, then a Set<Integer> to check for duplicate counts.

 Example 1:-
 Input : arr = [1,2,2,1,1,3]
 Output : true

 Explanation:- Occurences are
 {1->3, 2->2 , 3->1},
 all counts are unique.

 Example 2:-
 Input : arr = [1,2]
 Output : False

 Explanation: Both 1 and 2 occurence -> duplicate occurence count.

 Theory: Regex

 Concepts of Java Regex
 Pattern & Matcher
  
 Pattern:-
 A compiled representation of a regular expression

 Matcher:-
 An engine that applies a Pattern to a given input string.

 Use:-
 Pattern p = pattern.compile("regex");
 Matcher m = p.matcher(input);

 Basic Metacharacters:-
 .-> matches any single character(except newline).
 \d -> matches a digit[0-9].
 \w -> matches a word character [A-Za-z0-9_].
 \s -> matches whitespace(space , tab , newline).

 #Qualifiers:-
 *-> 0 or more occurences of the preceding element.
 + -> 1 or more occurences.
 ? -> 0 or 1 occurences(optional).
 {n}, {n,} , {n,m} -> exactly , atleast or between min/max times.

 #Character Classes & Negation.
 [abc]:- Matches a, b or c.
 [A-Z]:- any uppercase letter.
 [^0-9]:- any non-digit(negated class).

 #Anchors & Boundaries 
 ^:- start of the input (or line in MULTILINE mode).
 $:- end of the input(or line).
 \b:- word boundary(transition between word and non-word).

 #Escaping & java strings
 In java source, backslash must be escaped, "\\d+" represents the regex \d+.
 //snippet:- compile and test simple digit pattern.
 Pattern p = Pattern.compile("\\d+"); //regex, one or more digits.
 Matcher m = p.matcher("order 12345");
 boolean found = m.find();
 // true if any digit sequence present.