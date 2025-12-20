namespace _10Demo_Report
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true) {

                

                Console.WriteLine(" select car 1.BMW 2.Bugati");
                int c = Convert.ToInt32(Console.ReadLine());

                CarFactory cf = new CarFactory();

                Car car = cf.GetSomeCar(c);
                car.GenerateCarInfo();

               

                //Console.WriteLine(" select type of info you want to know");
                //Console.WriteLine("1.start 2.checkfuel 3.igniteengine 4.move 5.speed");

                 Console.WriteLine("Do you want to continue? 'y/n'");
                string ynChoice = Console.ReadLine();

                if (ynChoice == "n")
                {
                    break;
                }
            }

        }


        public abstract class Car
        {
            protected abstract void start();
            protected abstract void checkfuel();

            protected abstract void igniteEngine();

            protected abstract void Move();

            public virtual void GenerateCarInfo()
            {
                start();
                checkfuel();
                igniteEngine();
                Move();

                Console.WriteLine("Car data displayed successfully");

            }
        }


        public abstract class SportCar : Car
        {
            protected abstract void speed();

            public override void GenerateCarInfo()
            {
                start();
                checkfuel();
                igniteEngine();
                Move();
                speed();

                Console.WriteLine("portsCar data displayed successfully");
            }
        }
            public class BMW : Car
            {
                protected override void start()
                {
                    Console.WriteLine(" bmw started using key");
                }
                protected override void checkfuel()
                {
                    Console.WriteLine("bmw has enough fuel");
                }

                protected override void igniteEngine()
                {
                Console.WriteLine(" BMW engine is working properly");
                }

                protected override void Move()
                {
                    Console.WriteLine("bmw is now ready to move !!!");
                }

            }


            public class Bugati : SportCar
             {

                protected override void start()
                {
                    Console.WriteLine(" Bugati started using key");
                }
                protected override void checkfuel()
                {
                    Console.WriteLine("Bugati has enough fuel");
                }

                protected override void igniteEngine()
                {
                Console.WriteLine(" Bugati engine is working properly");
                }

                protected override void Move()
                {
                    Console.WriteLine("Bugati is now ready to move !!!");
                }

                protected override void speed()
                {
                    Console.WriteLine("it has highest speed..lets go for a long drive!!!!");
                }
            }


            public class CarFactory
            {
                public Car GetSomeCar(int choice)
                {
                    Car c = null;

                    switch(choice)
                    {
                        case 1:
                            c = new BMW();
                            break;

                        case 2:
                            c= new Bugati();
                            break;

                        default:
                            Console.WriteLine("enter correct choice");
                            break;

                    }

                    return c;
                }
            }
        }

    
}
