namespace _48Demo_GC
{
    internal class Program
    {
        static void Main(string[] args)
        {

            MyClass obj=new MyClass();
            obj.SayHI();
            obj.Dispose();


            using (MyClass obj2 = new MyClass())
            {
                obj2.SayHI();
            }

            GC.Collect();
            Console.WriteLine(GC.MaxGeneration);

            MyClass obj3 = new MyClass();
            Console.WriteLine(GC.GetGeneration(obj3));
            GC.WaitForPendingFinalizers();
            
        }

        public class MyClass : IDisposable
        {
            public void Dispose() 
            {
                Console.WriteLine("Dispose Methode Gets CAlled");
                GC.SuppressFinalize(this);
            }
        public void SayHI()
            {
                Console.WriteLine("Hiiiii");
            }


        
        }

       
    }
}
