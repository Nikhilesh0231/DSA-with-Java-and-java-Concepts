public class Arrays2 {
  public static void main(String[] args) {
    int marks[]= {48,98,97,89,96};
    int sum=0;
    for(int i=0;i<marks.length;i++)
    {
      sum=sum+marks[i];
    }
    System.out.println("Sum of marks is : " +sum);
  }  
}
