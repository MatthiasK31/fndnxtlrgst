/*
Matthias Kim
Mr. Hendricks
3/12/22
Extra: Calculates the average of the next greatest values
 */
public class NumberSearchRunner
{
    public static void main( String args[] )
    {
        double average = 0;

        //2d array of the numbers for each data set
        int [][] arrays = {
                {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1},
                {10, 30, 20, 40, 50, 15},
                {3, 4, 5, 6, 8, 9, 10, 11, 2, 3, 4, 65},
                {100, 110, 1000, 25000, 65535}
        };
        int [] targetNums = {5, 12, 25, 32767};

        //loop through and print out the next greatest value
        for (int i = 0; i < arrays.length; i++) {
            for (int num : arrays[i])
                System.out.print(num + " ");
            System.out.println("\nThe next largest value after " + targetNums[i] + " is " + NumberSearch.getNextLargest(arrays[i], targetNums[i]) + "\n");
            average += NumberSearch.getNGI();
        }

        //print average of all the values
        System.out.println("The average of the next greatest values is " + (average /= arrays.length));
    }
}

/* OUTPUT:
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
The next largest value after 5 is 6

10 30 20 40 50 15
The next largest value after 12 is 15

3 4 5 6 8 9 10 11 2 3 4 65
The next largest value after 25 is 65

100 110 1000 25000 65535
The next largest value after 32767 is 65535

The average of the next greatest values is 16405.25
 */