public class NumberSearch
{
    private static int pos = 0;
    private static int[] sortedArr;
    public static int getNextLargest(int[] numArray, int searchNum)
    {
        int length = numArray.length;
        sortedArr = ascendingOrder(numArray);

        pos = 1;

        //loop through the array until the end is reached
        do {
            //if the number below is greater than or equal to the search key and the following number is greater, return the greater number
            if (searchNum >= sortedArr[pos-1] && searchNum < sortedArr[pos]){
                //System.out.println("found");
                return sortedArr[pos];
            }
            //else increase the arr position by 1
            pos++;
        } while (pos < length);

        return -1;
    }

    //extra: return next greatest value
    public static int getNGI(){
        return sortedArr[pos];
    }

    public static int [] ascendingOrder(int [] numArray){
        int l = numArray.length;

        //bubble sort to sort the array in ascending order
        for (int i = 0; i < l; i++){
            for (int j = 0; j < l-i-1; j++) {
                if (numArray[j] > numArray[j+1]){
                    int temp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                }
            }
        }
        return numArray;
    }
}