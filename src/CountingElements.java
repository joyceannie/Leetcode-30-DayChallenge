class CountingElements {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int ar: arr) {
            set.add(ar);
        }
        int count = 0;
        for (int ar: arr) {
            if (set.contains(ar+1)) {
                count++;
            }
        }
        return count;
    }
}
