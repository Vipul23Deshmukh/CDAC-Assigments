namespace _09_OOP_interface
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Enter ur choice 1.Fox 2.Elephant");

            int choice=Convert.ToInt32(Console.ReadLine());

            AnimalFactory animalFactory = new AnimalFactory();
            
            IAnimal animal=animalFactory.GetSomeAnimal(choice);


            Console.WriteLine("Enter choice  for Animal Habits 1.Food 2.Type 3.Sound");
            int achoice=Convert.ToInt32(Console.ReadLine());

            switch (achoice) { 
            
            case 1:
                    animal.food();
                    break;
            case 2:
                    animal.type();
                    break;
            case 3:
                    animal.Sound();
                    break;

                default:
                    Console.WriteLine("enter valid choice");
                    break;
            }

        }


        public interface IAnimal
        {
            void food();
            void type();
            void Sound();
        }


        public class Fox : IAnimal
        {
            public void food()
            {
                Console.WriteLine("Fox eat lion");
            }
            public void type()
            {
                Console.WriteLine("TrustWorthy Wild Animal");
            }

            public void Sound()
            {
                Console.WriteLine("ueueuueueu");
            }


        }


        public class Elephant : IAnimal
        {
            public void food()
            {
                Console.WriteLine("Elephant eats Banana");
            }
            public void type()
            {
                Console.WriteLine("Friendly Wild Animal");
            }

            public void Sound()
            {
                Console.WriteLine("hmmuummm");
            }
        }


        public class AnimalFactory
        {
            public IAnimal GetSomeAnimal(int dbchoice)
            {

                IAnimal ob = null;


                switch (dbchoice)
                {
                    case 1:
                        ob = new Fox();
                        break;



                    case 2:
                        ob= new Elephant();
                        break;

                    default:
                        Console.WriteLine("Enter a valid choice");
                        break;

                }

                return ob;
            }
        }

        }
}
