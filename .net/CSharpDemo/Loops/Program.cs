namespace Loops
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region forloop

            int sum = 0;
            for (int i = 0; i <= 5; i++) {

               
                    sum=sum + i;
                

            }
            Console.WriteLine(sum);
            Console.WriteLine("-----------------------");


            #endregion

            #region whileloop

            int k = 0;
            while (k< 5)
            {
                Console.WriteLine(k);
                k++;
            }


            Console.WriteLine("-----------------------");

            #endregion

            #region do while

            int m = 0;
            do
            {
                Console.WriteLine(m);
                m++;
            }while (m< 5);

            Console.WriteLine("-----------------------");
            #endregion

            #region switch case
            Console.WriteLine("enter the choice");
            string ch=Console.ReadLine();

            int choice=Convert.ToInt32(ch);
            switch(choice)
            {
                case 1:
                    Console.WriteLine("selected option 1");
                    break;

                case 2:

                    Console.WriteLine("selected option 2");
                    break;

                case 3:
                    Console.WriteLine("selected option 3");
                    break;

                default:
                    Console.WriteLine("insert correct number");
                    break;

            }
            #endregion

            Console.WriteLine("Hello, World!");
        }
    }
}
