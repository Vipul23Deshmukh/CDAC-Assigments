namespace _47Demo_Exception
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine(" enter n1");
                int n1=Convert.ToInt32(Console.ReadLine());

                Console.WriteLine(" enter n2");
                int n2=Convert.ToInt32(Console.ReadLine());

                if(n2==0)
                {
                    throw new MyCustomException($" cant divide by zero");
                }
                int DivResult = n1 / n2;

                Console.WriteLine($" Division ={DivResult} ");

            }
            catch(MyCustomException e)
            {
                Console.WriteLine(e.MyMessage);
            }
            catch(DivideByZeroException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public class MyCustomException : Exception
        {
            public string MyMessage { get; set; }   
            public MyCustomException(string msg) 
            {
                MyMessage = msg;
                    
             }
        }
    }
}
