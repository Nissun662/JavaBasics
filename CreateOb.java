
class Calculator 
{
    public int add(int n1, int n2)

    {
        int r = n1 + n2;
        return r;
    }
}
public class CreateOb {
    public static void main(String[] args)
    {
        int n1 = 4;
        int n2 = 5;

        Calculator calc = new Calculator(); 

        int result = calc.add(n1, n2);

        System.out.println("result: " + result);

    }
    
}
