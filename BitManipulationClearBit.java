public class BitManipulationClearBit {
  public static void main(String[] args) {
    //Clear Bit
    int number = 5; // 0101
    int pos = 2;
    int bitMask = 1<<pos;
    int notBitMask = ~(bitMask);
    int newnumber = notBitMask&number;
    System.out.println(newnumber); 
  }
}
