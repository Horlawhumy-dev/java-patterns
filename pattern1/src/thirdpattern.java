public class thirdpattern {
    public static void main(String[] args) {
        pattern3(10);
    }

    public static void pattern3(int n){
//        outer loop in n times
        for (int row = 1; row <= n; row++) {
            int cols = n - row + 1;
//            inner loop will in n minus row times --> to achieve upside down triangle pattern
            for (int col = 1; col <= cols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}

/*
Design Pattern 3
* * * * *
* * * *
* * *
* *
*
 */