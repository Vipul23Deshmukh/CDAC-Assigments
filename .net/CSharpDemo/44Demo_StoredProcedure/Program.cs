using Microsoft.Data.SqlClient;

namespace _44Demo_StoredProcedure
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IET;Integrated Security=True";

            //  InsertDepartment(connectionString, "Sales");
            //InsertDepartment(connectionString, "Cyber Security");
            //InsertEmployee(connectionString, "Roy", 4);
            //InsertEmployee(connectionString, "joseph", 2);
            //InsertEmployee(connectionString, "john", 2);

            GetEmpById(connectionString, 3);
            GetEmpById(connectionString, 4);
            Console.WriteLine("Doneee");

        }

        public static void InsertDepartment(string constr,string deptname)
        {
            using (SqlConnection connection=new SqlConnection(constr))
            {
                connection.Open();
                using (SqlCommand cmd=new SqlCommand())
                {
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.CommandText = "InsertDepartment";
                    cmd.Connection=connection;
                    cmd.Parameters.AddWithValue("@DepartmentName", deptname);
                    cmd.ExecuteNonQuery();

                }
            }
        }

        public static void InsertEmployee(string constr, string empname, int deptid)
        {
            using (SqlConnection connection = new SqlConnection(constr))
            {
                connection.Open();
                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.CommandText = "InsertEmployee";
                    cmd.Connection = connection;
                    cmd.Parameters.AddWithValue("@EmployeeName", empname);
                    cmd.Parameters.AddWithValue("@Departmentid", deptid);
                    cmd.ExecuteNonQuery();


                }
            }

        }

        public static void GetEmpById(string constr, int id)
        {
            using (var connection = new SqlConnection(constr))
            {
                connection.Open();

                using (var command = new SqlCommand("GetEmployeeByDepartment", connection))
                {
                    command.CommandType=System.Data.CommandType.StoredProcedure;
                    command.Parameters.AddWithValue("@Departmentid", id);

                    using (var reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            Console.WriteLine($"Id:{reader["id"]}, Name:{reader["EmployeeName"]}");
                        }
                    }
                }

            }


        }

    }
}
