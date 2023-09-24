public class Pattern2 {

    static void printSpace(int noOfSpace){
        if(noOfSpace == 0){
            return;
        }
        System.out.print(" ");
        printSpace(noOfSpace-1);
    }
    static void printStar(int noOfStar){
        if(noOfStar == 0){
            return;
        }
        System.out.print("*");
        printStar(noOfStar-1);
    }

    static void printLines(int noOfLines, int MAX_LINES){
        if(noOfLines == 0){
            return;
        }
        //stack build
        printLines(noOfLines-1, MAX_LINES);
        // stack fall
        printSpace(MAX_LINES - noOfLines);
        printStar(noOfLines);
        System.out.println();  // new line
    }

    public static void main(String[] args) {
        final int MAX_LINES = 5;
        printLines(MAX_LINES, MAX_LINES);
    }
}
