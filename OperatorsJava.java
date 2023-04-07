class OperatorsJava {
    
     public static void main(String[] args) {
        
        int a = 5;
       // int b=a++ + ++a + --a;
       int b=a++ + ++a + ++a +a++ + --a + a--;//5+7+8+8+8+8(POST/PRE INC and DEC)
       // a++;//46
       // a--; //44
    
       //System.out.println(a + b);
      // System.out.println(a - b);
      //System.out.println(a  * b);
     //
    // System.out.println(a / b);
    //  System.out.println(a % b);
    //a++;
    //++a;
    //--a;
    //a--;
    System.out.println(a);
    System.out.println(b);

     }}