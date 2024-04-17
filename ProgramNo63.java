// // 63.WAP TO PRINT PRIME NUMBER B/W 1 TO 50.

// public class ProgramNo63 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 50; i++) {
//             int count = 0;
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) {
//                     count++;
//                 }
//             }
//             if (count == 2) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }




// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



// 63.WAP TO PRINT PRIME NUMBER B/W 1 TO 50.

public class ProgramNo63 {
    int primeNumber(int num){
        int count=0;
        for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
        return count;
    }
    public static void main(String[] args) {
        ProgramNo63 obj = new ProgramNo63();
        for (int i = 1; i <= 50; i++) {
            if (obj.primeNumber(i) == 2) {
                System.out.print(i + " ");
            }
        }
    }
}