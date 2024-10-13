public class BitManipulationGetBit{
  public static void main(String[] args) {
    //Get Bit
    int n = 5;//0101
    int bitPosition = 2;
    int bitMask = 1<<bitPosition;
    if((bitMask & n)==0){
      System.out.println("Bit was zero");
    }
    else{
      System.out.println("Bit was one");
    }

  }
}