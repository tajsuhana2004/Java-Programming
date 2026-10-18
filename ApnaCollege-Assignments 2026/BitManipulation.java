public class BitManipulation {

//Question Number:1 
  //Swap two numbers without using any third values

  public static void main(String args[]){
    /*int x=3, y=4;
    System.out.println("Before swap: x ="+ x+"and y ="+ y);
    //Swap using XOR
    x=x^y;
    y=x^y;
    x=x^y;
    System.out.println("After swap: x ="+ x+"and y ="+ y);*/

  

  //Question Number:2
  //Add 1 to an integer using Bit Manipulation

  int x=6;
  System.out.println(x+ "+" +1+ "is" +-~x);
  x=-4;
  System.out.println(x+ "+" +1+ "is" +-~x);
  x=0;
  System.out.println(x+ "+" +1+ "is" +-~x);


  //Question Number 3: Convert Uppercase characters to lower case using bits

  for(char ch='A'; ch<='z';ch++){
    System.out.println((char)(ch |' '));
  }

    
}
}
