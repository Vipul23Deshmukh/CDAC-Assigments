namespace _25DemoDictionary
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            Employee emp1= new Employee();
            Employee emp2= new Employee();
            Employee emp3= new Employee();

            emp1.Eid = 11;
            emp1.Ename = "harry";
            emp1.Address = "hogward";

            emp2.Eid = 12;
            emp2.Ename = "harminy";
            emp2.Address = "pune";

            emp3.Eid = 13;
            emp3.Ename = "chris";
            emp3.Address = "L.A";


            #region Dictionary

            Dictionary<int,Employee> empdic= new Dictionary<int,Employee>();
            empdic.Add(1, emp1);
            empdic.Add(2, emp2);
            empdic.Add(3, emp3);

            //using key valuepair
            foreach (KeyValuePair<int,Employee> element in empdic)
            {
                Employee emp= element.Value;

                //element.value gives employee object
                //element.key gives eid
                Console.WriteLine($"Id {emp.Eid} Name:{emp.Ename} Address:{emp.Address}");
            }


            //using keys
            foreach (int key in empdic.Keys)
            {
                Employee emp=empdic[key] as Employee;
                Console.WriteLine($"Key = {key}, Id: {emp.Eid}, Name: {emp.Ename}, Address : {emp.Address}");
            }
            #endregion

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
