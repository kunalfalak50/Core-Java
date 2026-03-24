class  Add2
{
    public static void main(String args[])
    {
       int a =10;
       double d = 4.5;
        
       
      double addition = a+d;
      double division = a/d;

      System.out.println("add : " + a);
       System.out.println("divison : " + d);
    
      System.out.println("add : " + addition);
      System.out.println("division : " + division);


        
        d = (int) division;
       System.out.println("Division after casting to int: " + d);
}
}
     