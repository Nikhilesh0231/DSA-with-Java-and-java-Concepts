
import java.util.Scanner;

public class BitManipulationUpdateBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    //oper = 1 : set         oper = 0 : clear
    int number = 5;//0101
    int pos = 1;
    
    int bitMask = 1 << pos;
    if (oper == 1) {
      //set
      int newnumber = number | bitMask;
      System.out.println(newnumber);
      } else if (oper == 0) {
        //clear
      int newnumber = number & ~bitMask;
      System.out.println(newnumber);

      }
    sc.close();

  }
}
