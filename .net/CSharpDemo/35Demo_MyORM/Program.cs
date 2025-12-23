using _34Demo_CustomAttributes;
using System.Reflection;

namespace _35Demo_MyORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"C:\Users\IET\Desktop\VipulPriyanka\.net\CSharpDemo\33EmpDemo_Emplib\bin\Release\net8.0\33EmpDemo_Emplib.dll";

            Assembly asm= Assembly.LoadFrom(asmPath);
            Type[] allTypes = asm.GetTypes();
            for (int i = 0; i < allTypes.Length; i++)
            { 
            
             Type types = allTypes[i];

                string createTableQuery = "CREATE TABLE ";
                
                Attribute[] allAttributes=types.GetCustomAttributes().ToArray();


                for (int j = 0; j < allAttributes.Length; j++)
                {

                    Attribute attr=allAttributes[j];

                    if(attr is TableAttribute)
                    {
                        TableAttribute tableAttribute = (TableAttribute)attr;

                        createTableQuery = createTableQuery + tableAttribute.TableName + " ( ";   //create table employee
                   
                    }
                }


                PropertyInfo[] allproperties= types.GetProperties();
                
                for(int k=0; k < allproperties.Length; k++)
                {
                    PropertyInfo prop=allproperties[k];
                    Attribute[] propAttr = prop.GetCustomAttributes().ToArray();

                    for(int l=0; l< propAttr.Length; l++)
                    {
                        Attribute pAttr=propAttr[l];

                        if(pAttr is ColumnAttribute)
                        {

                            ColumnAttribute col=pAttr as ColumnAttribute;

                            createTableQuery = createTableQuery + col.ColumnName + " " + col.ColumnType + ",";
                        }



                    }
                }



                createTableQuery = createTableQuery.TrimEnd(',') + ")";


                Console.WriteLine(createTableQuery);






                string Filepath = @"C:\Users\IET\Desktop\VipulPriyanka\.net\CSharpDemo\35Demo_MyORM\SQLQuery\createTableQuery.sql";
                File.WriteAllText(Filepath, createTableQuery);
                Console.WriteLine("Doneee");
            }

           

            



        }
    }
}
