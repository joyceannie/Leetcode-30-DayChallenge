class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int count = 0;
        for (int i=0; i<shift.length; i++) {
            if (shift[i][0]==1) {
                count +=shift[i][1];
            } else {
                count -=shift[i][1];
            }
        }
        System.out.println(count);
            
        
        StringBuilder sb = new StringBuilder();
        if (count<0) {
            //left shift
            count = -1 *count;
            count = count%s.length();
            sb.append(s.substring(count));
            sb.append(s.substring(0, count));
            
        } else {
            //right shift
            count = count%s.length();
            sb.append(s.substring(s.length()-count));
            sb.append(s.substring(0, s.length() - count));
        }
        return sb.toString();
    }
}
