public class Diamond{

    static void printSpace(int noOfSpace){
        if(noOfSpace == 0){
            return;
        }
        System.out.print(" ");
        printSpace(noOfSpace-1);
    }

    static void printStar(int noOfStar){
        // Termination Case
        if(noOfStar == 0){
            return;
        }
        System.out.print("* ");
        printStar(noOfStar-1);
    }

    static void printLine(int rows, int currRow){
        // Termination Case
        if(rows == 0){
            return;
        }
        // print a new line
        printSpace(rows-1);
        printStar(currRow - rows + 1);
        System.out.println();
        printLine(rows-1, currRow);  // Recursion

    }

    public static void main(String[] args) {
         printLine(5,5);
    }
}