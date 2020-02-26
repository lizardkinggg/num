public class MinMaxNum {
 
 public static void main(String[] args)
 {
 
 int[] nums = new int[]{8903,56,89,24,68,-389,1176};
 
 int x = nums[0];
 int y = nums[0];
 
 for(int i = 0; i < nums.length; i++) {
 
   
    if(nums[i] >= x) {
   
      x= nums[i];
   
    }
   
    if(nums[i] <= y)
       
       y = nums[i];
   
   
 
 }
 
 
 System.out.println("Max number is: " +x +"and min number is: " +y);
 
 
 }

}
