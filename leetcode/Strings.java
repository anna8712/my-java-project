package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Strings {

    public static boolean validAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        if(s.length() != t.length()) { 
            return false;
        }

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            Integer count = map.get(c);
            if(count != null && count > 0) {
                map.put(c, count - 1);   
                if(map.get(c) == 0){
                    map.remove(c);
                }
            }

            else{
                return false;
            }
        }
        return true;
    }
    

    public static boolean validPolindrom(String s) {
                int n = s.length();
                int left = 0;
                int right = n-1;
        
                while(left < right)
                {
                    while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
                    {
                        left++;
                    }
        
                    while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
                    {
                         right--;
                    }
                    if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                        return false;
                    }
                    left++;
                    right--;
                }
                
                return true;
            }
    }