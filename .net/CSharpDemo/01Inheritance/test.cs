using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01Inheritance
{
    public class CMath
    {
        public int add(int x, int y)
        {
            return x + y;
        }

        public void add(int x, int y, int z)
        {
            Console.WriteLine(x + y + z);   
        }


        public void sub( int a,int b)
        {
            Console.WriteLine(a - b);
        }

        public virtual void mult( int a,int b)
        {
            Console.WriteLine(a * b);
        }
    }


    public class AdvancedMath : CMath
    {
        public override void mult(int a, int b)
        {
            Console.WriteLine("AdvanceMath:{0}", a * b * 10);
        }

        public void Add(int a, int b)
        {
            Console.WriteLine("Adv Math Add: {0}", (a + b) * 100);
        }

        // Method overloading within across the inherited class
        public int Add(int a, int b, int p, int q)
        {
            return a + b + p + q;
        }
    }

    
}
