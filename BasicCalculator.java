public class BasicCalculator {  
  // Constructor
  public BasicCalculator(){

  }	  
  // add method
  public int add(int a, int b){
    int c;
	c = a + b;
	 return c;
  }

  // subtract method
  public int subtract(int a1, int b1){
    int c1;
    c1 = a1 - b1;
    return c1;
  }

  // multiply method
  public int multiply(int a2, int b2){
    int c2;
    c2 = a2*b2;
    return c2;
  }

  // divide method 
  public int divide(int a3, int b3){
    int c3;
    c3 = a3/b3;
    return c3;
  }

  // modulo method
  public int modulo(int a4, int b4){
    int c4;
    c4 = a4 % b4;
    return c4;
  }

  // main method
  public static void main(String[] args) {
    BasicCalculator myCalculator = new BasicCalculator();
    System.out.println(myCalculator.add(5, 7));

    System.out.println(myCalculator.subtract(45, 11));
  }

}
