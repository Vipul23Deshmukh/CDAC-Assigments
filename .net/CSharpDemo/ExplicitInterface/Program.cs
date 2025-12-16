namespace ExplicitInterface
{
    internal class Program
    {
       

   interface IAddition
    {
        int Calculate(int a, int b);
    }

    interface IMultiplication
    {
        int Calculate(int a, int b);
    }

    class MyMath : IAddition, IMultiplication
    {
        // Explicit implementation for IAddition
        int IAddition.Calculate(int a, int b)
        {
            return a + b;
        }

        // Explicit implementation for IMultiplication
        int IMultiplication.Calculate(int a, int b)
        {
            return a * b;
        }
    }

    


        static void Main(string[] args)
        {

            MyMath math = new MyMath();

            // ❌ Not accessible directly
            // math.Calculate(5, 3); // ERROR

            // ✅ Accessible via interface references
            IAddition addObj = math;
            Console.WriteLine("Addition: " + addObj.Calculate(5, 3)); // Output: 8

            IMultiplication mulObj = math;
            Console.WriteLine("Multiplication: " + mulObj.Calculate(5, 3)); // Output: 15
        }
    }
}
