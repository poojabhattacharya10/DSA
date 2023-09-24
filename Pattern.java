public class Pattern {


    static void printStars(int noOfStars){
        // termination case
        if(noOfStars == 0){
            return;
        }
        System.out.print("*");
        printStars(noOfStars-1);
    }

    static void printLines(int lines){
        // Termination Case
        if(lines == 0){
            return;
        }
        // recursion build
        printStars(lines);
        System.out.println(); // print one new line at a time
        printLines(lines-1);  // recursion
        // recursion fall
        // first print star
        // then print new line

    }

    public static void main(String[] args) {
        final int MAX_LINES = 5;
        printLines(MAX_LINES);
    }
}
