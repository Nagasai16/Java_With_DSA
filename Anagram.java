import java.util.Arrays;

class Main {
    // Changed return type from void to boolean to match the return statements
    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr2);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        
        // Pass the strings into the method
        boolean result = isAnagram(s1, s2);
        
        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}

/*import java.util.*;

 class Anagram {
    static void anagram() 
    {
        new HashMap<>();
        String s[] = {"eat","tea","tan","ate","nat","bat"};
        
    }
 }*/