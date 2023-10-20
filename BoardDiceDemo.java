public class BoardDiceDemo {

    static void diceBoardGame(int start ,int end ,String result){
        if(start==end){
            System.out.println(result+ " , ");
            return;
        }
        if(start>end){
            return;
        }

        // 2 possibilities
        for(int dice=1; dice<=2; dice++){
            diceBoardGame(start+dice, end, result+dice);
        }
    }

    public static void main(String[] args) {
        System.out.println();
        diceBoardGame(0,4,"");
    }
}


// public class BoardDiceDemo {

//     static void diceBoardGame(int start ,int end ,String result){
//         if(start==end){
//             System.out.println(result+ " , ");
//             return;
//         }
//         if(start>end){
//             return;
//         }

//         // 6 possibilities
//         for(int dice=1; dice<=6; dice++){
//             diceBoardGame(start+dice, end, result+dice);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println();
//         diceBoardGame(0,10,"");
//     }
// }
