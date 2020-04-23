/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class LeftMostColumnWithOne {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimension = binaryMatrix.dimensions();
        int x = 0;
        int y = dimension.get(1)-1;
        int pos = Integer.MAX_VALUE;
        while (x<dimension.get(0) && y>=0) {  
            if (binaryMatrix.get(x,y)==0) {
                x++;
            } else {
                pos = Math.min(pos, y);
                y--;
            }
        }
        return pos==Integer.MAX_VALUE? -1: pos; 
    }
}
