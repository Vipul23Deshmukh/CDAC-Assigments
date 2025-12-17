namespace _12Demo_SealedClass
{
    internal class Program
    {


        public class CMath
        {
            public int Add(int x,int y)
            {
                        return x + y;
            }

            public int  Sub(int x,int y) 
            { 
                return x - y; 
            }
        }

        public class AdvanceMath
        {
            public virtual int  square (int x)
            {
                return x * x;
            }
        }


        public class MyMath : AdvanceMath
        {
            public virtual void sayhi()
            {
                Console.WriteLine(" hi from mymath derived class");
            }

            public sealed override int square(int x)
            {
                return x * x * 10 ;
            }
        }


        public class Mymath2 : MyMath
        {
            public sealed override void sayhi()
            {
                Console.WriteLine(" hi from mymath2");
            }

            
        }
        static void Main(string[] args)
        {
            Mymath2 m2=new Mymath2();
            MyMath m1=new MyMath();

            m1.sayhi() ;
           Console.WriteLine( m1.square(10));


            m2.sayhi() ;
           Console.WriteLine(m2.square(20));
        }
    }
}
