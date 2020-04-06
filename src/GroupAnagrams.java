class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> groups = new HashMap<String, List>();
        for (String str: strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String key = String.valueOf(s);
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(str);
        }
        return new ArrayList(groups.values());

    }
}
