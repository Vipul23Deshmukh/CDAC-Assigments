namespace _24GenericDelegate
{

    public delegate void mydelegate1();
    public delegate void mydelegate2<T>(T para);
    public delegate void mydelegate3<T1, T2>(T1 x, T2 y);
    public delegate bool booldelegate<T>(T para);
    public delegate R FuncDelegate<T, R>(T para);

    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            Demo demo=new Demo();
            mydelegate1 del1=new mydelegate1 (demo.SayHi);
            del1();

            mydelegate2<string> del2 = new mydelegate2<string>(demo.SayHello);
            del2("alexa");

            mydelegate2<int> del4=new mydelegate2<int>(demo.display);
            del4(5);

            mydelegate3<string, string> del3 = new mydelegate3<string, string>(demo.greet);
            del3("alexa", "!! how are you?");


            booldelegate<int> b1=new booldelegate<int> (demo.checkodd);
            bool isodd = b1(4);
            Console.WriteLine($"number 4  is odd:{isodd} ");

            booldelegate<int> b2 = new booldelegate<int>(demo.checkodd);
            bool iseven = b2(5);

            Console.WriteLine($"the numer 5 is even {iseven}");



        }
    }

    public class Demo
    {
        public void SayHi()
        {
            Console.WriteLine(" Hey hi !!!");
        }

        public void SayHello(string name)
        {
            Console.WriteLine($"Hello,{name}");
        }

        public void greet(string name,string message)
        {
            Console.WriteLine($"{name},{message}");
        }

        public void display(int num)
        {
            Console.WriteLine($"Number is :{num}");
        }

        public bool checkodd(int n)
        {
            return n % 2 != 0;
        }


        public bool checkeven(int n)
        {
            return n % 2 == 0;
        }

        public int add(int[] numbers)
        {
            int sum = 0;
            foreach (var num in numbers)
            {
                sum=sum+num;
            }
            return sum;
        }

        public void add(int n1,int n2,int n3,out int sum)
        {
            sum = n1 + n2 + n3;
        }
    }

    public class Math
    {

    }
}
