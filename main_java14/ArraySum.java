public class ArraySum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int val : arr){
            sum = sum + val;
        }
        System.out.println("Sum : " + sum);
    }
}
// output
// Sum : 45