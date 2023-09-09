import java.util.Arrays;

public class Swapping {
    public void seprate(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            while(left<right && nums[left]<0){
                left++;
            }
            while(left<right && nums[right] >=0){
                right--;
            }
            if(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
    }
    public static void main(String args[]){
        Swapping swapping = new Swapping();
        int[] nums = {-4, 6, 8, -5, -2, 9, 1, -3};
        System.out.println("Original Array: " + Arrays.toString(nums));
        swapping.seprate(nums);
        System.out.println("Array after swapping : " + Arrays.toString(nums));

    }
}
