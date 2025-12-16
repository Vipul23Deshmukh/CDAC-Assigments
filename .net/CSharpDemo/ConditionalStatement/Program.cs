namespace ConditionalStatement
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region ifelse
            int a = 20;
            int b = 30;
            if (a == b)
            {
                Console.WriteLine("equal");
            }
            else
            {
                Console.WriteLine("not equal");
            }


            #endregion

            #region ifStatement

            
            int age = 1;

            if(age >= 18)
            {

                Console.WriteLine("Elegiable to vote");
            }

            if(age< 18)
            {
                Console.WriteLine("not Elegiable to vote");
            }
            #endregion

            #region 

            #endregion
            Console.WriteLine("Hello, World!");
        }
    }
}
