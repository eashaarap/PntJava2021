package negash;

public class PlayWithBubbleSorting {

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~Ascending~~~~~~~~~~~~~ ");
        bubblingIncreasing();
        System.out.println("~~~~~~~~~~~Descending~~~~~~~~~~~~~ ");
        bubblingDecreasing();

    }

    public static void bubblingIncreasing() {
        int[] l = {12, 45, 98, 75, 600, 2, 65, 75, 90};
        // in bubble sorting - the program will look for the consecutive indexes and swap them using a temp
        // if index at 0 is greater than the index at 1  = swap them
        //    temp = index[0]  - empty index 0 to temp
        //    index[0] = index[1] - fill up index 0 with index 1 - at this point index 1 is empty
        //    index[1] = temp   - fill up index 1 with temp vlaue

        for (int i = 0; i < l.length; i++) { // outer loop will iterate with the length of our array
            int flag = 0;                   // this is a flag that will check if we have any swap in the if
            for (int j = 0; j < l.length - i - 1; j++) { //this loop can go up to array length -1 or else j+1 will push out of index
                                                        // adding -i is for efficiency - just to focus only on the unsorted part
                if (l[j + 1] < l[j]) { // if index +1 is less than index
                    int temp = l[j];    // please swap
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                    flag = 1;           // and flag
                } // end of if condition
            }// j loop
            if (flag == 0) {            // if flag is 0 no swap so come out of the loop
                break;
            }
        }// i loop

        for (int getMySortedL : l) {
            System.out.print(getMySortedL + "\t");
        }
        System.out.println();
    }// end of bubblingIncreasing
    public static void bubblingDecreasing() {
        int[] l = {12, 45, 98, 75, 600, 2, 65, 75, 90};
        // in bubble sorting - the program will look for the consecutive indexes and swap them using a temp
        // if index at 0 is greater than the index at 1  = swap them
        //    temp = index[0]  - empty index 0 to temp
        //    index[0] = index[1] - fill up index 0 with index 1 - at this point index 1 is empty
        //    index[1] = temp   - fill up index 1 with temp vlaue

        for (int i = 0; i < l.length; i++) { // outer loop will iterate with the length of our array
            int flag = 0;                   // this is a flag that will check if we have any swap in the if
            for (int j = 0; j < l.length - i - 1; j++) { //this loop can go up to array length -1 or else j+1 will push out of index
                                                        // adding -i is for efficiency - just to focus only on the unsorted part
                if (l[j + 1] > l[j]) { // if index +1 is less than index
                    int temp = l[j];    // please swap
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                    flag = 1;           // and flag
                } // end of if condition
            }// j loop
            if (flag == 0) {            // if flag is 0 no swap so come out of the loop
                break;
            }
        }// i loop

        for (int getMySortedL : l) {
            System.out.print(getMySortedL + "\t");
        }

    }// end of bubblingDecreasing
}
