public class BitManipulationSetBit {
  public static void main(String[] args) {
    //Set Bit
    int num = 5; // 0101 in binary
    int pos = 1; // position of bit to be set
    int BitMask = 1 << pos; // create a mask to set the bit at position pos
    System.out.println("Number before setting bit: " + num);
    int newNum = num | BitMask; // set the bit at position pos
    System.out.println("Number after setting bit: " + newNum);
  }
}
