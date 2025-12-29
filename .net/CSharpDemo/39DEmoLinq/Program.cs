namespace _39DEmoLinq
{
    internal class Program
    {
       
        
        static void Main(string[] args)
        {
            List<Food> foods = new List<Food>()
        {
            new Food(){No=1,Fname="pizza",Taste="delicious"},
            new Food(){No=2,Fname="pasta",Taste="yummy"},
            new Food(){No=3,Fname="burger",Taste="marvellous"},
            new Food(){No=4,Fname="donut",Taste="sweet"},
            new Food(){No=5,Fname="frenchfries",Taste="crunchy"},
            new Food(){No=6,Fname="vadapav",Taste="spicy"},
            new Food(){No=7,Fname="dabheli",Taste="good"}
        };

            #region filter food anmes

            Console.WriteLine(" enter food name");
            string? fnm=Console.ReadLine().ToLower();

            //foreach (Food f1 in foods)
            //{
            //    if(f1.Fname.ToLower()==fnm)
            //    {
            //        Console.WriteLine($"No:{f1.No} ,FoodName:{f1.Fname}, Taste:{f1.Taste}");
            //    }
            //}

            //using func delegate
            Func<Food,bool> fdel= food=>food.Fname.ToLower().StartsWith(fnm);


            Console.WriteLine("using predicate delegate");
            foreach (Food f in foods)
            {
                if(fdel(f))
                {
                    Console.WriteLine($"No:{f.No} ,FoodName:{f.Fname}, Taste:{f.Taste}");
                }
            }
            #endregion
        }
    }

    public class Food
    {
        public int No { get; set; }
        public string Fname { get; set; }

        public string Taste { get; set; }
    }

}
