import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class exercise_20 {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(map.containsKey(key)){
                ArrayList<String> list = map.get(key);
                list.add(s);
                
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
            
        }
        for (ArrayList<String> list : map.values()) {
            System.out.println(list);
        }

    }
}
