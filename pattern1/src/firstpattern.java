public class firstpattern {
    public static void main(String[] args) {
        pattern1(10);
    }
//  pattern function
    public static void pattern1(int n){
//        outer loop will run in n no of times
        for (int row = 1; row <= n; row++) {
//            inner loop will run in row times each --> to achieve a right triangle pattern
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
//          print new lin at every row
            System.out.println();
        }
    }

}

// 1. Ensure no of lines == no of rows (for the outermost loop)
// 2. Check if no of each row == no of elements in each column --> row 1 with 1 element in column 1.(for inner loop)
// 3. print whatever element.

/*
Pattern 1 to be achieved
*
* *
* * *
* * * *
* * * * *
'
'
'
'
'
'
n ' ' ' ' ' ' ' '  m

 */