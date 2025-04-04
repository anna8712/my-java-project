package leetcode;
public class MyApplication{

    public static void main(String[] args) {

        // Test the validPolindrom method
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";

        System.out.println(" ");
        System.out.println("IN: " + input1 + "\n" + "EXP: true, " + "OUT: " + Strings.validPolindrom(input1) + "\n");
        System.out.println("IN: " + input2 + "\n" + "EXP: false, " + "OUT: " + Strings.validPolindrom(input2) + "\n");
        System.out.println("IN: " + input3 + "\n" + "EXP: true, " + "OUT: " + Strings.validPolindrom(input3) + "\n");
    
    }
}