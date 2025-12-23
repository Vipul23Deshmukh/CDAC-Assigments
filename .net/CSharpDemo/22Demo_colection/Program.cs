using System.Collections;
using System.Net.NetworkInformation;

namespace _22Demo_colection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            #region intarray
            //int[] arr=new int[5];
            //arr[0] = 1; 
            //arr[1] = 2;
            //arr[2] = 3;
            //arr[3] = 4;
            //arr[4] = 5;
            //for (int i = 0; i < 5; i++)
            //{
            //    Console.WriteLine(i);
            //}


            #endregion

            #region String array

            //string[] arr1=new string[5];
            //arr1[0] = "sita";
            //arr1[1] = "john";
            //arr1[2] = "bob";
            //arr1[3] = "alice";

            //for(int i=0;i<arr1.Length;i++)
            //{
            //    Console.WriteLine(arr1[i]);
            //}

            #endregion

            Employee emp1=new Employee();
            emp1.eid = 101;
            emp1.Empname = "ram";
            emp1.Empaddress = "pune";

            Employee emp2 = new Employee();
            emp2.eid = 102;
            emp2.Empname = "shyam";
            emp2.Empaddress = "mumbai";

            Employee emp3= new Employee();
            emp3.eid = 103;
            emp3.Empname = "ghanshyam";
            emp3.Empaddress = "pune";



            #region Arrayofemp

            //Employee[] emps=new Employee[3];
            //emps[0]=emp1;
            //emps[1]=emp2;
            //emps[2]=emp3;


            //for(int i = 0;i < 3;i++)
            //{
            //    Console.WriteLine($"Id:{emps[i].eid},Name:{emps[i].Empname} Address:{emps[i].Empaddress}");
            //}

            //#endregion



            //Book book1=new Book();
            //book1.Author = "Robin Sharma";
            //book1.BookName = "Who will cry When you will die";


            //Book book2=new Book();
            //book2.Author = "J.R.R";
            //book2.BookName = "Hobbit an unseen Jounery";

            //Book book3=new Book();
            //book3.Author = "oda Sensei";
            //book3.BookName = "one piece";

            #endregion

            #region Object Array

            //Object[] obj=new Object[3];
            //obj[0]=book1;
            //obj[1]=emp1;
            //obj[2]=4;


            //for(int i = 0; i < obj.Length; i++)
            //{

            //    Object  Element=obj[i];

            //    if(Element is int)
            //    {
            //        int a=Convert.ToInt32(Element);
            //        Console.WriteLine($"value is :{a}");
            //    }
            //    if(Element is Employee)

            //    {
            //        Employee emp=Element as Employee;
            //        Console.WriteLine($"Value is {emp.eid},{emp.Empname},{emp.Empaddress}");

            //    }

            //    if(Element is Book)
            //    {
            //        Book book=Element as Book;
            //        Console.WriteLine($"value is {book.Author},{book.BookName}");
            //    }




            //}
            #endregion

            #region hashtable

            //Hashtable ht=new Hashtable();
            //ht.Add(1,101);
            //ht.Add("A","Allen");
            //ht.Add("B", "bob");
            //ht.Add("C", "charlie");
            //ht.Add(2, 102);

            ////it will print keys hashtables
            //foreach (object key in ht.Keys)
            //{
            //    Console.WriteLine(key);
            //}

            ////it will value from hashtables
            //foreach (object value in ht.Values)
            //{
            //    Console.WriteLine(value);
            //}

            ////it will print keys and values

            //foreach (object key in ht.Keys)
            //{
            //    Console.WriteLine($"key={key},value={ht[key]}");
            //}

            #endregion


            //generic collections

            #region list

            //List<int> numbers = new List<int>();

            //numbers.Add(1);
            //numbers.Add(2);
            //numbers.Add(3);
            //numbers.Add(4);

            //for (int i = 0; i < numbers.Count; i++)
            //{
            //    Console.WriteLine(numbers[i]); 
            //}
            #endregion

            #region tuples

            //var empDetails = Display(100, "neha", "l.A");
            //Console.WriteLine($"Id={empDetails.Id} Name={empDetails.Name} Address={empDetails.Address}");
            //static (int Id,string Name,string Address) Display(int id,string name,string address)
            //{
            //    int Id = id;
            //    string Name = name;
            //    string Address = address;

            //    return (Id, Name, Address);
            //}
            #endregion

        }


        public class Employee
        {
            private int Eid;
            private string Ename;
            private string Eaddress;

            public string Empaddress
            {
                get { return Eaddress; }
                set { Eaddress = value; }
            }

            public string Empname
            {
                get { return Ename; }
                set { Ename = value; }
            }

            public int eid
            {
                get { return Eid; }
                set { Eid = value; }
            }



        }


        public class Book
        {
            private string author;
            private string bookname;

            public string BookName
            {
                get { return bookname; }
                set { bookname = value; }
            }


            public string Author
            {
                get { return author; }
                set { author = value; }
            }

        }

        
    }
}
