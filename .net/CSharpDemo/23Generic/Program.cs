using System.Diagnostics.CodeAnalysis;
using System.Formats.Asn1;

namespace _23Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            #region Swapping using reference

            //int a = 10;
            //int b = 20;

            //Console.WriteLine($"Before Swapping:A={a},B={b}");
            //CMath cMath = new CMath();
            //cMath.swap(ref a, ref b);

            //Console.WriteLine($"After Swapping:A={a},B={b}");

            #endregion

            #region With Template Swaped methode

            //double a = 10.5;
            //double b = 20.6;

            //Console.WriteLine($"Before Swapping:A={a},B={b}");
            //CMath cMath = new CMath();
            //cMath.Swap<double>(ref a, ref b);

            //Console.WriteLine($"After Swapping:A={a},B={b}");
            #endregion

            #region Dynamic Type 
            //CMath cMath = new CMath();

            //Console.WriteLine(cMath.Add<int>(20,2));
            //Console.WriteLine(cMath.Add<string>("vipul","deshmukh"));

            #endregion

            #region generic overloaded result method
            //CMath math= new CMath();
            //char result = math.Result<double, int, char, string>(12.1, 3, 'A', "sita");
            //Console.WriteLine(result);

            //double result1 = math.Result<double, int, char>(12.3, 3, 'A');
            //Console.WriteLine(result1);
            #endregion

            #region example out parameter

            //double area, circumference = 0;
            //double r = 5;
            //CMath cm=new CMath();
            //cm.calculateCircleArea(r,out area,out circumference);
            //Console.WriteLine($"Area: {area} Circumference:{circumference}");
            #endregion

            #region params example

            //Demo demo= new Demo();
            //demo.PlayerNames(2, "sunil chhetri", "messi");

            #endregion


            #region Template class

            MyClass<string> myclass= new MyClass<string>();
            myclass.SayHi("bob");
            Console.WriteLine(myclass.display("gita"));
            #endregion

        }

        public class CMath
        {
            //swaping using reference
            public void swap(ref int x, ref int y)
            {
                int temp = x;

                x = y;
                y = temp;

            }


            //swaping using template
            public void Swap<T>(ref T x, ref T y)
            {
                T temp = x;
                x = y;
                y = temp;

            }



            // adding Using dynamic param in template

            public T Add<T>(T x, T y)
            {
                dynamic para1= x;
                dynamic para2= y;
                dynamic sum= para1+para2;
                return sum;
            }


            //template overloading
            public R Result<P,Q,R,S>(P p,Q q,R r,S s)
            {
                return r;
            }

            public T1 Result<T1,T2,T3>(T1 t1,T2 t2,T3 t3)
            {
                return t1;
            }

            //example of out
            public void calculateCircleArea(double r,out double area,out double  circumference )
            {
                area = r * r*3.14;
                circumference = 2 * 3.14 * r;
            }



        }

        public class Demo
        {
            //example of params
            public void PlayerNames(int x, params string[] nms)
            {
                string output = "Player Names:";
                for (int i = 0; i < nms.Length; i++)
                {
                    output += nms[i] + " ";
                }
                Console.WriteLine(output);
                Console.WriteLine(x);

            }
        }


        //example of template class
        public class MyClass<T>
        {
            public void SayHi(T para)
            {
                Console.WriteLine($" hello hi....{para}");
            }

            public string display(string name)
            {
                return name;
            }
        }
    }
}
