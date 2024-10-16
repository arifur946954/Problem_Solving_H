import java.util.HashMap;

public class FindDuplicateString {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character, Integer> charCountMap =new HashMap();
        for (char ch : str.toCharArray()) {

            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {

                charCountMap.put(ch, 1);
            }
        }
    }
}
