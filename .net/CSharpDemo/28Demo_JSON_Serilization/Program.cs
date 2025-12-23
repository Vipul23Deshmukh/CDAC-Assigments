using System.Text.Json;

namespace _28Demo_JSON_Serilization
{
    internal class Program
    {
        static void Main(string[] args)
        {
         
            Movies mu=new Movies();
            mu.Movie_id = 01;
            mu.Movie_name = "Tere Naam";
            mu.M_Actor = "Selmon Bhai";
            mu.M_Actress = "Bhumika Chawala";
            

            

            #region JSON Serilization
            string url = @"C:\Users\IET\Desktop\VipulPriyanka\.net\CSharpDemo\28Demo_JSON_Serilization\Movies\movies.json";

            //FileStream fs = null;

            //if (File.Exists(url)) { 
            
            //fs=new FileStream(url, FileMode.Open, FileAccess.Write);
            //}

            //else
            //{
            //    fs = new FileStream(url, FileMode.Create,FileAccess.Write);
            //}

            //JsonSerializer.Serialize<Movies>(fs, mu);
            //fs.Close();


            //Console.WriteLine("Done...!");




            #endregion



            #region For JSON Deserilization


            FileStream fs1 = null;

            if (File.Exists(url))
            {

                fs1 = new FileStream(url, FileMode.Open, FileAccess.Read);
            }

            else
            {
                Console.WriteLine("File not found");
            }

            Movies  m=JsonSerializer.Deserialize<Movies>(fs1) ;
            Console.WriteLine($"ID:{m.Movie_id}, Movie Name:{m.Movie_name},Actor:{m.M_Actor},Actress:{m.M_Actress}");
            fs1.Close();

            #endregion

        }
    }



   public class Movies
    {
        private int mid;
        private string Mname;
        private string Actor;
        private string Actress;

        
        public int Movie_id
        {
            get { return mid; }
            set { mid = value; }
        }

        public string Movie_name
        {
            get { return Mname; }
            set { Mname = value; }
        }

        public string M_Actor
        {
            get { return Actor; }
            set { Actor = value; }
        }

        public string M_Actress
        {
            get { return Actress; }
            set { Actress = value; }
        }



    }
}
