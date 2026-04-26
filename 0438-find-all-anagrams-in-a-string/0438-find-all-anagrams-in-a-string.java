class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

            if (i >= k) {
                char left = s.charAt(i - k);

                if (sMap.get(left) == 1) {
                    sMap.remove(left);
                } else {
                    sMap.put(left, sMap.get(left) - 1);
                }
            }

            if (sMap.equals(pMap)) {
                res.add(i - k + 1);
            }
        }

        return res;
    }
}