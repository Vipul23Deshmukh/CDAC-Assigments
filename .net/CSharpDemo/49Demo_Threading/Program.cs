namespace _49Demo_Threading
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region ByDefault threads are nameless

            //Thread t=Thread.CurrentThread;
            //t.Name = "MAIN THREAD";
            //Console.WriteLine(t.Name);

            #endregion

            #region Method call without thread

            //M1();
            //M2();
            //M3();


            #endregion

            #region Method call using thread

            //Thread t1 = new Thread(M1) { Name="Th01"};
            //Thread t2 = new Thread(M1) { Name = "Th02" };
            //Thread t3= new Thread(M1) { Name = "Th03" };

            //t1.Start();
            //t2.Start();
            //t3.Start();

            //ThreadStart ts = new ThreadStart(() =>
            //{
            //    Console.WriteLine("Method Call....");
            //});
            //Thread t4 = new Thread(ts);
            //t4.Start();

            #endregion

            #region isalive and join method
            Console.WriteLine(" main method execution started...");

            Thread t5 = new Thread(Program.F1);
            t5.Start();

            Thread t6 = new Thread(Program F2);
            t6.Start();

            if (t5.Join(2000)) {
                Console.WriteLine(" F1 execution complete");
            }

            t6.Join();

            Console.WriteLine(" F2 Execution complete");

            if(t5.IsAlive)
            {
                //Console.WriteLine(" F1 ");
            }

            #endregion


            static void M1()
            {
                Console.WriteLine($" METHOD STARTED USING THREAS {0} ", Thread.CurrentThread.Name);

                for (int i = 0; i < 5; i++)
                {
                    Console.WriteLine($"Method 1 : Count {i}");
                }
            }

            static void M2()
            {
                Console.WriteLine($" METHOD STARTED USING THREAS {0} ", Thread.CurrentThread.Name);

                for (int i = 0; i < 5; i++)
                {
                    Console.WriteLine($"Method 2: Count {i}");
                }
            }
            static void M3()
            {
                Console.WriteLine($" METHOD STARTED USING THREAS {0} ", Thread.CurrentThread.Name);

                for (int i = 0; i < 5; i++)
                {
                    Console.WriteLine($"Method 3 : Count {i}");
                }
            }
        }
    }
}
