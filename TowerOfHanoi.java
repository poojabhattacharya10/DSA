public class TowerOfHanoi {

    /*
     * Disk 1 moved from A to B
     * Disk 2 moved from A to C
     * Disk 1 moved from B to C
     * no. of moves = (2^n)-1
     * move one disk at a time.
     * smaller disk is always over the larger.
     */

    static void TOH(int n, char pegA, char pegB, char pegC){
        if(n == 1){
            System.out.println(pegA + " --> " + pegC);
            return;
        }
        TOH(n-1, pegA, pegC, pegB);
        System.out.println(pegA + " --> " + pegC);
        TOH(n-1, pegB, pegA, pegC);

    }

    public static void main(String[] args) {
        int n = 3;
        char pegA = 'A';
        char pegB = 'B';
        char pegC = 'C';
        TOH(n, pegA, pegB, pegC);
    }
}
