namespace _40DemoLinq
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello, World!");
            List<Emp> emps = new List<Emp>() {

                new Emp() { Id = 1, Name = "Ganesh", Address = "Pune" },
                new Emp() { Id = 2, Name = "Mitesh", Address = "Mumbai" },
                new Emp() { Id = 3, Name = "Suresh", Address = "Patna" },
                new Emp() { Id = 4, Name = "Prathmesh", Address = "Pune" },
                new Emp() { Id = 5, Name = "Naresh", Address = "Mumbai" },
                new Emp() { Id = 6, Name = "Jignesh", Address = "Puri" },
                new Emp() { Id = 7, Name = "Suyash", Address = "Nashik" },
                new Emp() { Id = 8, Name = "Durgesh", Address = "Pune" },
                new Emp() { Id = 9, Name = "Pritesh", Address = "Pune" }
            };

            Console.WriteLine("Enter first charecter of city name");
            string ? city =Console.ReadLine().ToLower();


            #region CSharpSyntax


            //var filterbasedonCity = new List<Emp>();
            //foreach (Emp  emp in emps)
            //{
            //    if(emp.Address.ToLower().StartsWith(city))
            //    {
            //        Console.WriteLine($"Id : {emp.Id}, Name: {emp.Name},Address {emp.Address}");
            //    }

            //}
            #endregion


            #region LINQ : Language Integrated Query Syntax


            var Result = from emp in emps
                         select emp.Name;


            foreach(string name in Result)
            {
                Console.WriteLine(name);

            }




            var usingLinQ=from emp in emps
                          where emp.Address.ToLower().StartsWith(city)
                          select emp;

            foreach(Emp emp in usingLinQ)
            {
                Console.WriteLine($"ID: {emp.Id}, Name:{emp.Name}, Address:{emp.Address}");
            }

            #endregion



        }
    }

     public class Emp
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }


    }
}
