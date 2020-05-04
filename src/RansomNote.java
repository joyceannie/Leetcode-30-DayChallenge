class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> count = new HashMap<>();
        for (Character ch: magazine.toCharArray()) {
            count.putIfAbsent(ch, 0);
            count.put(ch, count.get(ch)+1);
        }
        for (Character ch:ransomNote.toCharArray()) {
            if (!count.containsKey(ch) || count.get(ch)<=0) {
                return false;
            } else {
                count.put(ch, count.get(ch)-1);
            }
        }
        return true;
    }
}
