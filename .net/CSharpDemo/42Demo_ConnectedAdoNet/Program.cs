using Microsoft.Data.SqlClient;

namespace _42Demo_ConnectedAdoNet
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //  Console.WriteLine("Hello, World!");
            string connectionstring = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IET;Integrated Security=True";

            #region InSeRt query

            //SqlConnection conn = new SqlConnection(connectionstring);

            //Console.WriteLine(" enter id");
            //int id = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine(" enter name");
            //string? nm = Console.ReadLine();

            //Console.WriteLine("enter address");
            //string address = Console.ReadLine();

            //string insertquery = $"insert into Employee (id,name,address) values('{id}','{nm}','{address}')";

            //SqlCommand cmd = new SqlCommand(insertquery, conn);

            //conn.Open();
            //int n = cmd.ExecuteNonQuery();

            //if (n > 0)
            //{
            //    Console.WriteLine("record inserted successfully");
            //}
            //else
            //{
            //    Console.WriteLine("error");
            //}
            #endregion


            #region select query

            //SqlConnection con = new SqlConnection(connectionstring);
            //string selectquery = "select * from employee";

            //SqlCommand cmd = new SqlCommand(selectquery, con);
            ////cmd.CommandType = System.Data.CommandType.Text;
            ////cmd.CommandText = selectquery;
            ////cmd.Connection = con;
            //con.Open();

            //SqlDataReader reader = cmd.ExecuteReader();
            //while (reader.Read())
            //{
            //    int id = Convert.ToInt32(reader["Id"]);
            //    string? nm = reader["Name"].ToString();
            //    string? address = reader["Address"].ToString();
            //    Console.WriteLine($"Id:{id}, Name: {nm}, Address: {address}");
            //}

            //con.Close();
            #endregion

            #region update

            //SqlConnection conn = new SqlConnection(connectionstring);

            //Console.WriteLine(" enter id");
            //int id = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine(" enter name");
            //string? nm = Console.ReadLine();

            //Console.WriteLine("enter address");
            //string address = Console.ReadLine();

            //string updatequery = $"update Employee set name='{nm}' ,address='{address}' where id={id}";

            //SqlCommand cmd = new SqlCommand(updatequery, conn);

            //conn.Open();
            //int n = cmd.ExecuteNonQuery();

            //if (n > 0)
            //{
            //    Console.WriteLine("record updated successfully");
            //}
            //else
            //{
            //    Console.WriteLine("error");
            //}
            #endregion

            #region delete 

            SqlConnection conn = new SqlConnection(connectionstring);

            Console.WriteLine(" enter id");
            int id = Convert.ToInt32(Console.ReadLine());

           

            string updatequery = $"delete from employee where id={id}";

            SqlCommand cmd = new SqlCommand(updatequery, conn);

            conn.Open();
            int n = cmd.ExecuteNonQuery();

            if (n > 0)
            {
                Console.WriteLine("record deleted successfully");
            }
            else
            {
                Console.WriteLine("error");
            }
            #endregion
        }
    }
}
