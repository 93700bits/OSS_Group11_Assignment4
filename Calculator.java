public class Calculator 
{

    public static void main(String[] args) 
    {
        int num1 =5;
        int num2 =6;
        
// Take operator input from user

        int sum, operation;
        System.out.println("Enter the operation you want to perform 1.Add 2.Sub 3.Mul 4.Div");
        operation = sc.nextLine();

        if(operation == "Add"){
        new Addition().add(num1,num2);
        }else if(operation == "Sub"){
        new Subtraction().difference(num1,num2);
        }else if(operation == "Mul"){
        new Multiplication().product(num1,num2);
        }else if(operation == "Div"){
        new Division().ratio(num1,num2);
        }else{
            System.out.println("Please enter valid input");
        }
        
    }    
}