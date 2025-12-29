using _43Demo_ConnectedADO.DAL;
using _43Demo_ConnectedADO.Models;

namespace _43Demo_ConnectedADO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            IETDB_Context  dbContext=new IETDB_Context();
            int RowsAffected = 0;


            while (true)
            {
                Console.WriteLine("Enter your choices 1.Select 2.searchbyid 3.insert 4.update 5.Delete");
                int choice = Convert.ToInt32(Console.ReadLine());




                switch (choice)
                {
                    case 1:
                        var Record = dbContext.GetEmpRecord();
                        foreach (var emp in Record)
                        {
                            Console.WriteLine($"Id: {emp.Id}, Name:{emp.Name},  Address:{emp.Address}");
                        }
                        break;

                    case 2:
                        Console.WriteLine("Enter ID To be searched");
                        int IdToBeSearched=Convert.ToInt32(Console.ReadLine());

                        var Record2 = dbContext.GetById(IdToBeSearched);

                        if(Record2 != null)
                        {
                           Emp emp1 = Record2.FirstOrDefault();


                            if (emp1 != null)
                            {
                                Console.WriteLine($"Id: {emp1.Id}, Name:{emp1.Name},   Address:{emp1.Address}");

                            }

                            else
                            {
                                Console.WriteLine($"Emp not found{IdToBeSearched}");
                            }

                        }


                        else
                        {
                            Console.WriteLine($"Employee  id the ID {IdToBeSearched} not exits");
                        }

                        break;


                    case 3:
                        Emp empins=new Emp();
                        Console.WriteLine("enter id");
                        empins.Id = Convert.ToInt32(Console.ReadLine());

                        Console.WriteLine( " enter name");
                        empins.Name = Console.ReadLine();

                        Console.WriteLine(" enter address");
                        empins.Address=Console.ReadLine();  

                        RowsAffected = dbContext.InsertEmpRecord(empins);
                        {
                            if(RowsAffected>0)
                            {
                                Console.WriteLine("EmpRecord inserted successfully");
                            }
                            else
                            {
                                Console.WriteLine(" error while inserting");
                            }
                        }
                        break;


                    case 4:

                        Emp emptoupdate= new Emp();
                        Console.WriteLine("enter id to update");
                        emptoupdate.Id = Convert.ToInt32(Console.ReadLine());

                        Console.WriteLine(" enter name");
                        emptoupdate.Name = Console.ReadLine();

                        Console.WriteLine(" enter address");
                        emptoupdate.Address = Console.ReadLine();

                        RowsAffected = dbContext.UpdateEmpRecord(emptoupdate.Id,emptoupdate);
                        {
                            if (RowsAffected > 0)
                            {
                                Console.WriteLine("EmpRecord updated successfully");
                            }
                            else
                            {
                                Console.WriteLine(" error while inserting");
                            }
                        }
                        break;

                    case 5:
                        Console.WriteLine(" enter id of emp to  be deleted");
                        int id=Convert.ToInt32(Console.ReadLine());

                        RowsAffected=dbContext.DeleteRecordById(id);
                        if (RowsAffected > 0)
                        {
                            Console.WriteLine("record deleted successfully");
                        }
                        else
                        {
                            Console.WriteLine(" you doing something wrong");
                        }

                      break;

                    default:
                        Console.WriteLine(" use your unused brain");
                        break;
                        
                }

                Console.WriteLine(" do you want to continue");
                string ynchoice= Console.ReadLine();

                if(ynchoice=="n")
                {
                    break;
                }
            }
        }
    }
}
