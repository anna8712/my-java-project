package leetcode;
public class MyApplication{

    public static void main(String[] args) {
        // Test the validAnagram method
        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        System.out.println("\n Is Valid Anagram");
        System.out.println("IN: s=" + s1 + "t=" + t1 + "\n" + "EXP: true, " + "OUT: " + Strings.validAnagram(s1, t1) + "\n");
        System.out.println("IN: s=" + s2 + "t=" + t2 + "\n" + "EXP: false, " + "OUT: " + Strings.validAnagram(s2, t2) + "\n");
        


        // Test the validPolindrom method
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";

        System.out.println("\n Is Valid Polindrom");
        System.out.println("IN: " + input1 + "\n" + "EXP: true, " + "OUT: " + Strings.validPolindrom(input1) + "\n");
        System.out.println("IN: " + input2 + "\n" + "EXP: false, " + "OUT: " + Strings.validPolindrom(input2) + "\n");
        System.out.println("IN: " + input3 + "\n" + "EXP: true, " + "OUT: " + Strings.validPolindrom(input3) + "\n");
    
    }
}