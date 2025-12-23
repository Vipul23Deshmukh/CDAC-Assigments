using System.Collections.Specialized;

namespace _21Demo_ObserverPattern
{

    public delegate void NotifyEventHandler(string message);
    internal class Program
    {
        static void Main(string[] args)
        {
         
            Console.WriteLine("Hello, World!");
        
            Subscriber subscriber = new Subscriber();
            Publisher publisher = new Publisher();


            publisher.Notify += subscriber.methode1;
            publisher.Notify += subscriber.methode2;

           // publisher.Notify -= subscriber.methode2;


            publisher.NotifySuscriber("sale sale sale uppp tooo....70% gold()()(0...");



            publisher.NotifySuscriber("Sale is over ...");



        
        
        
        }

        public class Subscriber
        {

            public void methode1(string message)
            {
                Console.WriteLine($"Message recivced from methode1{message}");
            }
            public void methode2(string message)
            {
                Console.WriteLine( $"message recived from methode2{message}");
            }

        }


        public class Publisher
        {
            public event NotifyEventHandler Notify;


            public void NotifySuscriber(string message)
            {

                Notify?.Invoke(message);
            }

        }



    }


    
}
