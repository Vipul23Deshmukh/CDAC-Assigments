using OOPs_interface;
using System.Security.Cryptography.X509Certificates;
using System.Xml;
//using static OOPs_interface.Impli;
using static OOPs_interface.Explicit;
using System.Numerics;
using Microsoft.VisualBasic;
namespace OOPs_interface
{
    internal class Program
    {

        public interface IDrink
        {
            void getDrink();
        }

        public class HotDrink : IDrink
        {
            public void getDrink()
            {
                Console.WriteLine("Enjoy your HotDrink Coffee !!!!");
            }
        }

        public class ColdDrink : IDrink
        {

            public void getDrink()
            {
                Console.WriteLine("enjoy your coldcoffee");
            }
        }
        static void Main(string[] args)
        {

            #region implicit implementation of interface

            Console.WriteLine(" enter your choice : ");
            int ch=Convert.ToInt32(Console.ReadLine());

            switch(ch)
            {
                case 1:
                    IDrink drink = new HotDrink();
                    drink.getDrink();
                    break;

                case 2:
                    IDrink drink2=new ColdDrink();
                    drink2.getDrink();
                    break;

                default:
                    Console.WriteLine("enter correct choice");
                    break;
            }

            #endregion

            #region implicit implementation2

            //Console.WriteLine("Enter your choice 1.IX 2.IY");


            //int ch1=Convert.ToInt32(Console.ReadLine());

            //switch (ch1) {

            //    case 1:
            //        {
            //            IX obj = new MyMath();
            //            Console.WriteLine(obj.add(10, 20));
            //            Console.WriteLine(obj.sub(50, 40));
            //            break;
            //        }

            //        case 2:
            //        {
            //            IY obj1=new MyMath();   
            //            Console.WriteLine(obj1.add(10, 20));
            //            Console.WriteLine(obj1.mul(5,5));

            //            break;
            //        }
            //    default :
            //        {
            //            Console.WriteLine("Enter a valid choice");
            //            break;
            //        }

            //}

            #endregion

          


        }

    }
}
