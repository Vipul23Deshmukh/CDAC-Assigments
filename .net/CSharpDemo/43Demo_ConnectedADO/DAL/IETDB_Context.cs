using _43Demo_ConnectedADO.Models;
using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _43Demo_ConnectedADO.DAL
{
    public class IETDB_Context

    {
        string ConnectionStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IET;Integrated Security=True";

        public List<Emp> GetEmpRecord()
        {
            SqlConnection connection=new SqlConnection(ConnectionStr);
            SqlCommand cmd = new SqlCommand("select * from Employee",connection);

            connection.Open();

            SqlDataReader reader = cmd.ExecuteReader();

            List <Emp> AllEmpRecord = new List<Emp>();

            while (reader.Read())
            {
                AllEmpRecord.Add(new Emp()
                {
                    Id=Convert.ToInt32(reader["id"]),
                    Name = reader["Name"].ToString(),

                    Address=reader["address"].ToString()

                });


            }

            connection.Close();
            return AllEmpRecord;
        }

        public List<Emp> GetById(int idToBeSearched)
        {
            SqlConnection connection = new SqlConnection(ConnectionStr);

            string SelectByIdQuery = $"select * From Employee where ID={idToBeSearched}";
            SqlCommand cmd = new SqlCommand(SelectByIdQuery,connection);

            connection.Open() ;

            SqlDataReader reader = cmd.ExecuteReader();

            List<Emp> AllEmpRecord = new List<Emp>();

            while (reader.Read())
            {
                AllEmpRecord.Add(new Emp()
                {
                    Id = Convert.ToInt32(reader["id"]),

                    Name = reader["Name"].ToString(),

                    Address = reader["address"].ToString()

                });


            }

            connection.Close();
            return AllEmpRecord;

        }

        public int InsertEmpRecord(Emp emp)
        {
            SqlConnection connection=new SqlConnection(ConnectionStr);

            string insertquery = $"Insert into Employee(id,name,address) values('{emp.Id}','{emp.Name}','{emp.Address}')";

            SqlCommand cmd = new SqlCommand(insertquery,connection);

            connection.Open() ;

            int n=cmd.ExecuteNonQuery() ;
            connection.Close() ;
            return n;
        }

        public int UpdateEmpRecord(int id,Emp emp)
        {
            SqlConnection connection = new SqlConnection(ConnectionStr);
            string updatequery = $"update Employee set name='{emp.Name}',address='{emp.Address}' where id={id}";

            SqlCommand cmd= new SqlCommand(updatequery,connection);
            connection.Open();
            int n=cmd.ExecuteNonQuery() ;
            connection.Close();
            return n;
        }


        public int DeleteRecordById(int id)
        {
            SqlConnection connection = new SqlConnection(ConnectionStr);

            string deletequery = $"delete employee where id={id}";
            SqlCommand cmd = new SqlCommand(deletequery,connection);

            connection.Open();
            int n=cmd.ExecuteNonQuery() ;
            connection.Close();
            return n;
        }
    }
}
