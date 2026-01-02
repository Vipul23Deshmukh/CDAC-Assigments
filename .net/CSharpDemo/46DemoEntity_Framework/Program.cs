using _46DemoEntity_Framework.DAL;
using _46DemoEntity_Framework.Models;

namespace _46DemoEntity_Framework
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IETDBContext _dbContext=new IETDBContext();
            while (true)
            {
                Console.WriteLine("Enter Your Choice 1.For Select 2.Insert 3.Update 4.Delete");
                int opchoice=Convert.ToInt32(Console.ReadLine());

                switch (opchoice)
                {
                    case 1:
                       // List<Employee> allEmployees=_dbContext.emps.ToList();
                        break;
                }


            }
        }
    }
}
