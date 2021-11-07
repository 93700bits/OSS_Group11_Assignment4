public class Calculator 
{

    public static void main(String[] args) 
    {
        int num1 =5;
        int num2 =6;
        
        new Addition().add(num1,num2);
        new Subtraction().difference(num1,num2);
        new Multiplication().product(num1,num2);
        new Division().ratio(num1,num2);
        
    }    
}