public class Calculator 
{

    public static void main(String[] args) 
    {
        int num1, num2; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        new Addition().add(num1,num2);
        new Subtraction().difference(num1,num2);
        new Multiplication().product(num1,num2);
        new Division().ratio(num1,num2);
        
    }    
}