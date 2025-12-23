namespace _26FileIODemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            string filePath = @"C:\Users\IET\Desktop\VipulPriyanka\.net\CSharpDemo\26FileIODemo\Files\demo1.txt";

            #region streamwriter

            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs= new FileStream(filePath,FileMode.Open,FileAccess.Write);

            //}
            //else
            //{
            //    {
            //        fs = new FileStream(filePath, FileMode.Create, FileAccess.Write);
            //    }
            //}

            //StreamWriter writer=new StreamWriter(fs);
            //writer.WriteLine(" Hello Students how are you?...");
            //writer.Flush();
            //writer.Close();
            //fs.Close();
            //Console.WriteLine("Done");

            #endregion

            #region FileReader

            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine(" Sorry...File not found");
            //}

            //StreamReader reader = new StreamReader(filePath);
            //string content=reader.ReadToEnd();

            //reader.Close();
            //fs.Close();
            //Console.WriteLine($" File content: {content}");

            #endregion

            //writing object to file
            Employee emp= new Employee();
            emp.Eid = 22;
            emp.Ename = "kris";
            emp.Address = "holland";

            FileStream fs = null;

            if (File.Exists(filePath))
            {
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);

            }
            else
            {
                fs = new FileStream(filePath, FileMode.Create, FileAccess.Write);
            }

            //streamwritter will not writ exact data on file 
            //it will only give fully qualified name of the class
            //so store class object in a file we need to do 
            //  SERIALIZATION

            StreamWriter writer= new StreamWriter(fs);
            writer.Write(emp);
            writer.Flush();
            writer.Close();
            fs.Close();
            Console.WriteLine(" done");

        }

        public class Employee
        {
            private int eid;
            private string ename;
            private string address;




            public int Eid
            {
                get { return eid; }
                set { eid = value; }
            }

            public string Ename
            {
                get { return ename; }
                set { ename = value; }
            }


            public string Address
            {
                get { return address; }
                set { address = value; }
            }
        }
    }
}
