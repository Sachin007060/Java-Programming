// 60.WAP TO PRINT ****SPECIAL NO**** B/W 10 AND 100


// public class ProgramNo60 {
//     int specialTwoDigit(int num) {
//         int mul = 1;
//         while (num > 0) {
//             int rem = 0;
//             rem = num % 10;
//             mul *= rem;
//             num /= 10;
//         }
//         return mul;
//     }

//     int sumOfDigit(int num) {
//         int sum = 0;
//         while (num > 0) {
//             int rem = 0;
//             rem = num % 10;
//             sum += rem;
//             num /= 10;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         ProgramNo60 obj = new ProgramNo60();

//         for(int i=10; i<=100; i++){
//             int temp = i;
//             int result = obj.specialTwoDigit(i) + obj.sumOfDigit(i);
//             if (result == temp) {
//                 System.out.print(result + " ");
//             }
//         }

//     }
// }



// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



public class ProgramNo60 {
    int specialTwoDigit(int num) {
        int first = num % 10;
        int last = num / 10;
        int mul = first * last;
        int add = first + last;
        int sum = mul + add;
        return sum;
    }

    public static void main(String[] args) {
        ProgramNo60 obj = new ProgramNo60();

        for (int i = 10; i <= 100; i++) {
            int temp = i;
            if (obj.specialTwoDigit(i) == temp) {
                System.out.print(temp + " ");
            }
        }
    }
}
