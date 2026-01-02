using _46Demo2EntityFramework.DAL;
using _46Demo2EntityFramework.Models;

namespace _46Demo2EntityFramework
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IETDBContext _DbContext = new IETDBContext();

            while (true)
            {
                Console.WriteLine("Enter your Db Operation Choice:");
                Console.WriteLine("1. Select, 2. Insert, 3. Update, 4. Delete");
                int opChoice = Convert.ToInt32(Console.ReadLine());
                switch (opChoice)
                {
                    case 1:
                        List<Emp> AllEmployee=_DbContext.emps.ToList();
                        foreach (var emp in AllEmployee)
                        {
                            Console.WriteLine($"Id: {emp.Id}, Name: {emp.Name}, Address: {emp.Address}");

                        }

                        break;
                      case 2:
                        Emp newEmp=new Emp();
                        Console.WriteLine("Enter the Name of Employee");
                        newEmp.Name = Console.ReadLine();
                        Console.WriteLine("Enter Address");
                        newEmp.Address = Console.ReadLine();

                        _DbContext.emps.Add(newEmp);
                        _DbContext.SaveChanges();   
                        break;

                    case 3:

                        Console.WriteLine(" emter id to update data");
                        int idtobeupdated=Convert.ToInt32(Console.ReadLine());

                        Emp EmpUpdate = _DbContext.emps.Find(idtobeupdated);

                        Console.WriteLine(" enter new name");
                        EmpUpdate.Name = Console.ReadLine();

                        Console.WriteLine(" enter new address");
                        EmpUpdate.Address = Console.ReadLine();

                        _DbContext.SaveChanges();
                        break;

                    case 4:
                        Console.WriteLine(" enter id to delete");
                        int idtobedeleted=Convert.ToInt32(Console.ReadLine());
                        Emp EmpDelete = _DbContext.emps.Find(idtobedeleted);

                        _DbContext.emps.Remove(EmpDelete);
                        _DbContext.SaveChanges();
                        break;

                    default:
                        Console.WriteLine("Invalid Operation Choice");
                        break;
                }
                Console.WriteLine(" do you want to continue");
                string ynchoice=Console.ReadLine();

                if(ynchoice=="n")
                {
                    break;
                }

            }
        }
    }
}
