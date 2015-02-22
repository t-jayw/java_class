/*
 * Student s17tw, Tyler WOOD
 * Homework 5
 * Usage: java Homework5
 * Sample Output:
 * false
 * RED
 * false
 * ORANGE
 * false
 * YELLOW
 * false
 * GREEN
 * y
 * yellowmellow
 * true
 */

public class Homework5{
    public static void main( String[] args ){

    String[] colors = { "red", "orange", "yellow", "green" };

    for(String s: colors){
        System.out.println(s.startsWith("R"));
        System.out.println(s.toUpperCase());
    }

    String justonestring = colors[2];

    System.out.println(justonestring.charAt(0));
    System.out.println(justonestring.concat("mellow"));
    System.out.println(justonestring.contains("l"));
    }
}
        
