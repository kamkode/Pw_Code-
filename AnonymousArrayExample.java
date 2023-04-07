public class AnonymousArrayExample {
   public static void main(String[] args) {
      // Create an anonymous array of integers with five elements {10, 20, 30, 40, 50}
      int sum = calculateSum(new int[]{10, 20, 30, 40, 50});
      // Call the calculateSum method with the anonymous array as an argument
      System.out.println("Sum of array elements: " + sum);
      // Print the result of calculateSum method
   }

   public static int calculateSum(int[] array) {
      // Declare and initialize the sum variable to 0
      int sum = 0;
      // Iterate over each element in the array
      for (int i = 0; i < array.length; i++) {
         // Add the current element to the sum variable
         sum += array[i];
      }
      // Return the sum of the array elements
      return sum;
   }
}
