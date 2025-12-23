namespace DataFactoryAndInterface
{
    internal class Program
    {
        public interface IDatabase
        {
            void insert();
            void update();

            void delete();


        }
        public class SqlServer : IDatabase

        {
            public void insert()
            {
                Console.WriteLine("data inserted using sqlserver");
            }

            public void update()
            {
                Console.WriteLine(" data updated using sqlserver");
            }

            public void delete()
            {
                Console.WriteLine("data deleted using sqlserver");
            }

        }

        public class MySqlServer : IDatabase
        {
            public void insert()
            {
                Console.WriteLine("data inserted using mysqlserver");
            }

            public void update()
            {
                Console.WriteLine(" data updated using mysqlserver");
            }

            public void delete()
            {
                Console.WriteLine("data deleted using myqlserver");
            }

        }

        public class OracleServer:IDatabase
        {

            public void insert()
            {
                Console.WriteLine("data inserted using oracleserver");
            }

            public void update()
            {
                Console.WriteLine(" data updated using oracleserver");
            }

            public void delete()
            {
                Console.WriteLine("data deleted using orackeserver");
            }
        }


        public class DatabaseFactory
        {
            public IDatabase GetSomeDatabase(int choice)
            {
                IDatabase db= null;

                switch(choice)
                {
                    case 1:
                        db = new MySqlServer();
                        break;

                    case 2:
                        db= new OracleServer();
                        break;
                    case 3:
                        db = new SqlServer();
                        break;
                    default:
                        Console.WriteLine("give correct choice");
                        break;
                }
                return db;
            }
        }
            static void Main(string[] args)
        {


            Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DatabaseFactory factory = new DatabaseFactory();
            IDatabase sdobject= factory.GetSomeDatabase(dbChoice);

            Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
            int opChoice = Convert.ToInt32(Console.ReadLine());

            switch(opChoice)
            {
                case 1:
                    sdobject.insert();
                    break;

                case 2:
                    sdobject.update();
                    break;

                case 3:
                    sdobject.delete();
                    break;
                default:
                    Console.WriteLine("Invalid Db operation Choice");
                    break;
            }


        }
    }
}
