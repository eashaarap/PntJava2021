package datastructureandalgorithm.sort;

public class LearnBubbleSort {
    /*
        Bubble sort
     */
    public static void main(String[] args) {
        int [] stId={2, 4,10, 44, 2, 39, 60, 102};

        System.out.println();
     LearnBubbleSort.bubbleSort(stId);


    }
    public static void bubbleSort(int num[]){
        int length=num.length;
        int temp=0;
        for(int i=0; i < length; i++){
            for (int j =1; j <(num.length-i); j++){
                if (num[j-1] >num[j]){
                    //swap element
                    temp = num[j-1];
                    num[j-1] = num[j];
                    num[j]=temp;
                }
            }
        }
    }
}
