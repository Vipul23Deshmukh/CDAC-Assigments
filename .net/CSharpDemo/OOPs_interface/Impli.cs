using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPs_interface
{
    internal class Impli
    {


        public interface IX
        {
            int add(int x,int y);
            int sub(int x,int y);



        }

        public interface IY
        {
            int add(int x,int y);
            int mul(int x,int y);
        }



        public interface IDemo
        {
            int div(int x,int y);

            void log(string message);



        }

        public class MyMath : IX, IY
        {
            public int add(int x, int y)
            {
                return x + y;
            }

            public int mul(int x, int y)
            {
                return x * y;
            }

            public int sub(int x, int y)
            {
                return x - y;
            }
        }
    }
}
