using Inhertance.logic;

namespace Inhertance
{


    internal class Program
    {
        static void Main(string[] args)
        {

           person person=new person();
            person.FirstName = "sita";
            person.LastName = "Tanpure";

            Console.WriteLine("Name:{0} {1}",person.FirstName,person.LastName);

            Employee emp=new Employee();
            emp.Id= 1;

            Console.WriteLine("ID:{2}, Name:{0}  {1}", person.FirstName, person.LastName, emp.Id);

        }
    }
}
