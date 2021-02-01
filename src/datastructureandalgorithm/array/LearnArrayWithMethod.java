package datastructureandalgorithm.array;

public class LearnArrayWithMethod {

    public static void main(String[] args) {

        int [] numbers = { 23, 34, 65, 12, 7, 102, 87, 46, 304};

        LearnArrayWithMethod.checkMinimum(numbers);
        LearnArrayWithMethod.checkMaximum(numbers);
        System.out.println(LearnArrayWithMethod.getArray());
    }


    static void checkMinimum(int num[]){
        int min = num[0];
        for(int i=0; i<num.length; i++){
            if(min<num[i]){
                min=num[i];
            }
        }
        System.out.println("Minimum value is " + min);
    }
    static void checkMaximum(int num[]){
        int max = num[0];
        for(int i=0; i<num.length; i++){
            if(max>num[i]){
                max=num[i];
            }
        }
        System.out.println("Maximum value is " + max);

    }
    static int[] getArray(){
        return new int[]{88,66,70,90,23,12,405};
    }
}
