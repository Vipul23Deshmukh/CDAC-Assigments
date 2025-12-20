using System.Xml.Serialization;

namespace _28Demo_XmlSerialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Employee e1= new Employee();
            e1.Eid = 11;
            e1.Ename = "Tom cruise";
            e1.Company = "Hollywood";

            Book book= new Book();
            book.BookId = 1001;
            book.BookName = "monk who sold his ferrari";
            book.Author = "robin sharma";


            string filePath = @"C:\Users\IET\Desktop\VipulPriyanka\.net\CSharpDemo\28Demo_XmlSerialization\Files2\demox.xml";


            #region xmlserialization for writing object to file

            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.Create, FileAccess.Write);
            //}

            // XmlSerializer xr = new XmlSerializer(typeof(Employee));
            
            // xr.Serialize(fs, e1);
           
            //fs.Close();
            //Console.WriteLine(" done");

            #endregion
            #region xmldeserialization for reading object from file

            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine(" sorry ....!! we dont foun file");
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Employee));
            //Employee emp=xr.Deserialize(fs) as Employee;
            //fs.Close();
            //Console.WriteLine(" done");
            //Console.WriteLine($"Id:{emp.Eid} Name:{emp.Ename} Address:{emp.Company}");

            #endregion
        }
    }

    public class Employee
    {
        private int eid;
        private string ename;
        private string company;

        


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

        public string Company
        {
            get { return company; }
            set { company = value; }
        }

    }

    public class Book
    {
        private int bookid;
        private string bookName;
        private string author;

       


        public int BookId
        {
            get { return bookid; }
            set { bookid = value; }
        }

        public string BookName
        {
            get { return bookName; }
            set { bookName = value; }
        }
        public string Author
        {
            get { return author; }
            set { author = value; }
        }

    }
}
