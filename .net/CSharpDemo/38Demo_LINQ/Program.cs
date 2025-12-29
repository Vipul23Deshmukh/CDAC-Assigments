namespace _38Demo_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello, World!");

            #region Predicate delegate  returns true or false

            //Predicate<int> Even = x => x % 2 == 0;
            //Predicate<int> Odd= x => x % 2 != 0;


            //Console.WriteLine("Enter a number");
            //int n=Convert.ToInt32(Console.ReadLine());


            //var Result = Even(n);
            //var Result1 = Odd(n);
            //Console.WriteLine($"Is even{n} :{Result} ");

            //Console.WriteLine($"Is Odd{n} :{Result1} ");

            #endregion


            #region Action delegate does not return anything

            //Action del1 = new Action(delegate ()
            //{
            //    Console.WriteLine(" hello using new keyword from action delegate");
            //});
            //del1();

            //Action del2 = delegate
            //{
            //    Console.WriteLine(" HEllo without using new keyword from action delegate");
            //};
            //del2();

            //Action del3 = () =>
            //{
            //    Console.WriteLine("hello from action delegate using lambda expression");
            //};
            //del3();

            //Action del4 = () => Console.WriteLine(" hello.............");
            //del4();

            #endregion

            #region func delegate returns value

            ////returns number
            //Func<int> fun1=delegate()
            //                        { 
            //                            return 1; 
            //                        };
            //var res1= fun1();
            //Console.WriteLine(res1);

            ////returns string
            //Func<string> fun2 = delegate ()
            //                            {
            //                                return "hello world";
            //                            };
            //var res2= fun2();
            //Console.WriteLine(res2);


            ////Func with in and out parameter

            //Func<int,bool> fundel3 = new Func <int,bool>(delegate(int x)
            // {
            //    return x == 25;
            //});

            //bool result3 = fundel3(24);
            //Console.WriteLine($"is x =25 :{result3}");

            //bool result33 = fundel3(25);
            //Console.WriteLine($"is x=25 :{ result33}");

            //Func<string, bool> fundel4 = new Func<string, bool>(s => s.Equals("placement"));
            //bool result4 = fundel4("drive");
            //Console.WriteLine($" is string equals to placement:{result4}");


            //bool result44 = fundel4("placement");
            //Console.WriteLine($" is string equals to placement:{result44}");



            #endregion

            int [] arr= {1,2,3,4,5,6,7,8,9,10};


            #region inbuilt where method it checks condition

            //Predicate<int> p1= x=>x%2==0;

            //Func<int, bool> f1 = new Func<int, bool>(p1);
            //var r1=arr.Where(f1);
            //foreach(int i in r1)
            //{
            //    Console.WriteLine(i);
            //}


            ////can do without using predicate and func also

            //var result2 = arr.Where(x => x % 2 == 0);

            //foreach (var no in result2)
            //{
            //    Console.WriteLine(no);
            //}


            #endregion

            #region select() it  selects data 


            var sel1 = arr.Select(no => no * 10);  //multiply each array elemeny by 10
            foreach (int i in sel1)
            {
                Console.WriteLine(i);
            }

            #endregion
        }
    }
}
