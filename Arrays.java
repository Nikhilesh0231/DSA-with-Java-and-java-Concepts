class Arrays{
  //Arrau --> Array is a collection of items stored in a list of same data type.
  public static void main(String[] args) {
    int marks[] = new int[5];
    marks[0] = 90;
    marks[1] = 80;
    marks[2] = 70;
    marks[3] = 60;
    marks[4] = 50;
    System.out.println("Marks of five students are:");
    for(int i=0;i<5;i++)
    { 
      System.out.println("Student "+(i+1)+" has got "+marks[i]+" marks");
    }
  }
}