package slidingWindow;

import java.util.HashMap;

class longestSubArrayWithUniqueKChar {

    public static int findSubArray(String s, int size) {
        int n = s.length();
        int i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = -1;

        while (j < n) {

            if (map.size() < size) {
                j++;

                if (j < n) {
                    map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                    if (map.size() == size)
                        max = Math.max(max, j - i + 1);
                }
            } 
            
            else {
                while (map.size() > size) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findSubArray("aabacbebebe", 3));
    }
}
