package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Strings {


    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazinLetters = new HashMap<>();

        for(char c : magazine.toCharArray()) {
            magazinLetters.put(c, magazinLetters.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()) {
            
            if(magazinLetters.containsKey(c) && magazinLetters.get(c) > 0) {
            
                magazinLetters.put(c, magazinLetters.get(c) - 1);
            }
            else {
                return false;
            }
        }

        return true;
    }
    
    // abc is a subsequence of ahbgdc
    // acb is not a subsequence of ahbgdc
    // a, b, c are in order
    // a,c, b are not in order
    public static boolean isSubsequence(String s, String t) {
        int indexS = 0;
        int indexT = 0;
  
          if(s.length() == 0)
          {
              return true;
          }
  
        while(indexT < t.length())
        {
           if(s.charAt(indexS) == t.charAt(indexT))
           {
              indexS++;
              if(indexS == s.length()){
                  return true;
              }
           }
           indexT++;
        }
        return false;
      }
    
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