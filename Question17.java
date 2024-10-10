public class Question17 {
  //Question-->Find the maximum & minimum number in an array of integers.
  public static void main(String[] args) {
    int []numbers = {23,54, 89,98,67,87 };  
    

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
   
     for(int i=0; i<numbers.length; i++) {
         if(numbers[i] < min) {
             min = numbers[i];
         }
         if(numbers[i] > max) {
             max = numbers[i];
         }
     }


     System.out.println("Largest number is : " + max);
     System.out.println("Smallest number is : " + min);
    }
}
