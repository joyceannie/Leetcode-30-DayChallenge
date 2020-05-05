class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) {
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch)+1);
        }
        
        for (int i=0; i<s.length(); i++) {
            if (map.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}
