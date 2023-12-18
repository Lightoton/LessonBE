package de.telran.Test1;

public class test1 {
    public static void main(String[] args) {
        String myStr = "Hallo zusamen!";
        System.out.println(myStr);
//        for (int i = 0; i < myStr.length(); i++) {
//            System.out.println(myStr.charAt(i));
//        }
    int[] arr = {2,22,10,5,6,7,9,8};
    int sum = getSum(arr);
        System.out.println(sum);
    }
    public static int getSum(int[] myArr){
        int sum = 0;
        int start = 0;
        int endIndex = myArr.length-1;
        while (start < endIndex){
            sum=myArr[start]+myArr[endIndex]+sum;
            start++;
            endIndex--;
        }
        return sum;

    }
//    public static int getMin(int[] myArr) {
//        int min = Integer.MAX_VALUE;
//        for (int j : myArr) {
//            if (j < min) {
//                min = j;
//            }
//        }
//        return min;
//    }
//    public static int getSum(int[] myArr){
//        int sum = 0;
//        for (int i = myArr.length-1; i>0; i--) {
//            if (myArr[i]%2!=0 && myArr[i]>10){
//                sum += myArr[i];
//            }
//
//            }
//        return sum;
//    }
//    public static int getSum(int[] myArr){
//        int sum = 0;
//        for (int j : myArr) {
//            if (j % 2 == 0) {
//                sum += j;
//            }
//        }
//        return sum;
//    }
}
