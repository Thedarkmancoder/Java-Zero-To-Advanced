public class changeArray {
    public static void main(String[] args){
        int[] arr = {2,4,6};
        arr[1] = 20; // change second element
        for(int val : arr){
            System.out.println(val);
        }
    }
}
// output 
// 2
// 20
// 6