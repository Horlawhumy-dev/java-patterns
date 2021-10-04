public class sceondpattern {
    public static void main(String[] args) {
        pattern2(10, 5);
    }

    public static void pattern2(int i, int j){
//      outer loop for the rows
        for (int row = 1; row <= i; row++) {
//            inner loop for the cols
            for (int col = 1; col <= j; col++) {
                System.out.print(col + " ");
            }
//            printing new line
            System.out.println();
        }
    }
}

/*
Design Pattern 2
* * * *
* * * *
* * * *
* * * *
* * * *
'
'
'
'
'
'
n * * *
 */