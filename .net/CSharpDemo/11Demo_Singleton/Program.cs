namespace _11Demo_Singleton
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true) {

                Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");

                int dbchoice1=Convert.ToInt32(Console.ReadLine());

                DataBaseFactory FactoryDB=new DataBaseFactory();
                Database database = FactoryDB.GetDatabase(dbchoice1);

                Console.WriteLine(" ENTER DB operation choice 1.Insert 2.Update 3.Delete");
                int ochoice=Convert.ToInt32(Console.ReadLine());

                switch (ochoice)
                {

                    case 1:
                        database.Insert();
                        break;

                    case 2:
                        database.Update(); 
                        break;
                    case 3:
                        database.Delete();
                        break;
                    default:
                        Console.WriteLine(" enter correct choice");
                        break;


                }

                Console.WriteLine("Do you want to continue? y/n");
                string ynChoice = Console.ReadLine();
                if (ynChoice == "n")
                {
                    break;
                }


            }



        }
    }

    public class Logger
    {
        private static readonly Logger _logger = new Logger();


        private Logger()
        {
            Console.WriteLine("Loger obj is created for first time");
        }

        public static Logger GetLogger()
        {
            return _logger;
        }


        public void Log(String message)
        {
            Console.WriteLine("Logged at {0} ,message :{1}", DateTime.Now.ToString(), message);
        }

    }


    public abstract class Database
    {

        public Logger _logger = null;
        public Database()
        {
            _logger = Logger.GetLogger();

        }

        protected abstract void DoInsert();

        protected abstract void DoUpdate();

        protected abstract void DoDelete();

        protected abstract string GetDatabaseName();



        public void Insert()
        {
            DoInsert();
            _logger.Log($"insert from {GetDatabaseName} done");
        }
        public void Update()
        {
            DoUpdate();
            _logger.Log($"Update from {GetDatabaseName} done");
        }

        public void Delete()
        {
            DoDelete ();
            _logger.Log($"Delete from {GetDatabaseName} done");
        }

    }



    public class MySqlServer : Database
    {

        protected override string GetDatabaseName()
        {
            return "MySqlServer";
        }


        protected override void DoInsert() {
            Console.WriteLine("Record Inserted in MySql Successfylly"); }





        protected override void DoUpdate()
        {
            Console.WriteLine("Record updatede in MySql Successfylly");
        }




        protected override void DoDelete()
        {
            Console.WriteLine("Record Delete in MySql Successfylly");


        }

    }
        public class SqlServer : Database
        {
            protected override string GetDatabaseName()
            {
                return "Sql Server";
            }
            protected override void DoInsert()
            {
                Console.WriteLine("Record Inserted in SqlServer Successfylly");
            }
            protected override void DoUpdate()
            {
                Console.WriteLine("Record Updated in SqlServer Successfylly");
            }
            protected override void DoDelete()
            {
                Console.WriteLine("Record Deleted from SqlServer Successfylly");
            }
        }

        public class OracleServer : Database
        {
            protected override string GetDatabaseName()
            {
                return "Oracle Server";
            }
            protected override void DoDelete()
            {
                Console.WriteLine("Record Deleted from OracleServer Successfylly");
            }

            protected override void DoInsert()
            {
                Console.WriteLine("Record Inserted from OracleServer Successfylly");
            }

            protected override void DoUpdate()
            {
                Console.WriteLine("Record Updated from OracleServer Successfylly");
            }
        }



        public class DataBaseFactory
        {
            public Database GetDatabase(int dbchoice) {



                Database db = null;
                switch (dbchoice)
                {
                    case 1:
                        db = new SqlServer();
                        break;
                    case 2:
                        db = new MySqlServer();
                        break;
                    case 3:
                        db = new OracleServer();
                        break;
                    default:
                        db = null;
                        break;
                }
                return db;
            }


        }


    }







