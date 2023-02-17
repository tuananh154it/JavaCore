import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] a ={1,2,2,2,3,2,5};
        int val = 2;
        System.out.println(Arrays.toString(a));
        removeElement(a,val);
        System.out.println(Arrays.toString(a));
    }
    public static int removeElement(int[] nums, int val) {
        int leng = nums.length;
        int k = 0;
        for(int i = 0; i<leng;i++){
            if(nums[i]  != val){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
        return k;
    }
}
//Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số
// nguyên b, c (b < c). Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].