public class fourthpattern {
    public static void main(String[] args) {
        pattern4(5);
    }

    public static void pattern4(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int totalRowsInCols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalRowsInCols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

/*
Triangle design pattern
   1.2.3.4.5.
1. *
2. * *
3. * * *
4. * * * *
5. * * * * *
6 . * * * *
7. * * *
8. * *
9. *
 */
