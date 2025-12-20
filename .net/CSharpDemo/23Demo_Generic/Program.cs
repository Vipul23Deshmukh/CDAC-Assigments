namespace _23Demo_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            #region Demo Run

            //int[] no=new int[3];
            //no[0] = 1;
            //no[1] = 2;
            //no[2] = 3;
            //Demo obj=new Demo();

            //obj.Add(no);
            
            #endregion


        }


        public class Demo { 
        
        
        public void Add(int[] arr)
            {
                int sum = 0;
                for(int i=0;i<arr.Length; i++)
                {
                    sum= sum+arr[i];
                }
            
                
                    Console.WriteLine(sum);



            }

            
        }

    }
}
