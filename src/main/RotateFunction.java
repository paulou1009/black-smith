package main;

public class RotateFunction {

    public static int[] rotateFunction(int[] nums, int startPos){

        int[] rotate = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            rotate[i] = nums[(i + startPos) % nums.length];
        }

        return rotate;
    }

    public static int getRotateMax(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){ //rotating
            int[] rotate = rotateFunction(nums, i);
            int val = computeFunctionValue(rotate);
            max = Math.max(max, val);
        }
        return max;
    }

    public static int computeFunctionValue(int[] nums){
        int value = 0;
        for(int i = 0; i < nums.length; i++){
            value += nums[i] * i;
        }
        return value;
    }
}
