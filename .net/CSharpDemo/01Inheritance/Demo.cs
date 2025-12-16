using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01Inheritance
{
    internal class Baseclass
    {
        private int a;
        public Baseclass()
        {

        }

        public Baseclass(int a)
        {
            this.a = a;

            Console.WriteLine("You passed {0}", a);
        }

        public void Method1()
        {
            Console.WriteLine("from base class method");
        }
    }

    internal class Derivedclass : Baseclass
    {
        //constructor mapping
        public Derivedclass(int no) : base(no)
        {

        }

        public void Method2()
        {
            Console.WriteLine(" from derive class method");

        }
    }
}
