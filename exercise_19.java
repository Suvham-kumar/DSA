//wap is valid anagram or not
import java.util.Scanner;

public class exercise_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.next();
        System.out.println("Enter the second String: ");
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
        }else{
            int[] count = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                count[s1.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s2.length(); i++) {
                count[s2.charAt(i) - 'a']--;
            }

            boolean isAnagram = true;
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                System.out.println("Anagram");
            }else{
                System.out.println("Not anagram");
            }
        }
        sc.close();
    }
}
