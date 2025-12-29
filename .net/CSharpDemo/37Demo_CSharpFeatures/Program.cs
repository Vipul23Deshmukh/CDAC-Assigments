using System.Collections;
using System.Collections.ObjectModel;
using System.Linq;
using System.Security.Cryptography.X509Certificates;

namespace _37Demo_CSharpFeatures
{

    public delegate bool MyDelegate(int num);
    public delegate int MyDelegate2(int num);
    public delegate int MyDelegate3(int num1,int num2);
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            //Console.WriteLine("Enter a number");
            //int no=Convert.ToInt32(Console.ReadLine());

           // Console.WriteLine("Enter a number");
            //int num1 = Convert.ToInt32(Console.ReadLine());

           // Console.WriteLine("Enter a number");
            //int num2 = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter a number");
            //double num1 = Convert.ToDouble(Console.ReadLine());

            //Console.WriteLine("Enter a number");
            //double num2 = Convert.ToDouble(Console.ReadLine());




            #region Normal Function Call for Check Method 
            //var result = check(no);
            //if (result)
            //{
            //    Console.WriteLine($"Number {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"Number {no} is less than 10 ");
            //}



            #endregion

            #region Check Method Call with MyDelegate :
            //MyDelegate del1 = new MyDelegate(check);
            //var result1=del1(no);

            //if (result1) 
            //{
            //    Console.WriteLine($"Number {no} is greater than 10");

            //}
            //else
            //{
            //    Console.WriteLine($"Number {no} is less  than 10");

            //}

            #endregion


            #region Annonymous method with mydelegate and delegate keyword

            //using new keyword
            //MyDelegate2 del3=new MyDelegate2(delegate(int num)

            //                      {
            //                          return num * 10;
            //                      });

            //var result3=del3(no);
            //Console.WriteLine($"Number : {no} * 10 = {result3}");


            //without using new keyword

            //MyDelegate2 del4 = delegate (int num)
            //{
            //    return num * 100;
            //};
            //var result4=del4(no);

            //Console.WriteLine($"Number : {no} * 100= {result4}");

            #endregion

            #region Lamabada Expression : => goes to operator:

            //MyDelegate3 del33 = (int num1, int num2) =>
            //                                    {
            //                                        return num1 + num2;
            //                                    };

            //var result33 = del33(num1, num2);
            //Console.WriteLine($"Addition of num1 and num2 : {result33}");

            //MyDelegate dell = (int num1) =>
            //                            {
            //                                return num1 == 10;
            //                            };
            //var resultt=dell(num1);
            //Console.WriteLine($"is number equal to 10: {resultt}");


            #endregion

            #region Predicate<T> in built delecate

            ////always point to a method which checks some condition and return true or false
            //Predicate<double> pre = num1 => num1 == num2;

            //var result11 = pre(num1);

            //if (result11)
            //{



            //    Console.WriteLine($"the number {num1} and {num2} are Equal");
            //}

            //else
            //{

            //    Console.WriteLine($"the number {num1} and {num2} are  not Equal");
            //}




            #endregion


            #region In-built Sum Extension Method and normal MySum Method

            int[] arr = { 1,2, 3, 4, 5, 6, 7, 8, 9, 10 };
            var resultSum = arr.Sum();
            Console.WriteLine($"using inbuild {resultSum}");

            var result12 = MySum(arr);
            Console.WriteLine($"using our MySum methode {result12}");

            string[] names =new string[] { "ABC", "BCD", "CDE", "EFG" };
           var result13 = MySum(names);
            Console.WriteLine($"THe sum of string is {result13}");

            //var resultS = names.Sum();
            //Console.WriteLine(resultS);





            #endregion


            #region valid emailid checking code uing extension

            //Console.WriteLine("enter email id");
            //string? email=Console.ReadLine();

            //if(email != null)
            //{
            //    if (email.IsEmailIdValid())

            //        Console.WriteLine("valid email");

            //    else

            //        Console.WriteLine("invalid email");


            //}
            #endregion

            #region  converting arrays to string using extension method

            //int[] numbers = { 11, 22, 33, 44, 55, 66, 77, 88 };
            //string[] days = { "sun", "mon", "tues", "wed", "thurs", "fri", "satur" };

            //List<int> list1 = numbers.ConvertToList(0011);
            //foreach(int i in list1)
            //{
            //    Console.WriteLine($"Number List:{i}");
            //}

            //List<string> list2 = days.ConvertToList(0022);
            //foreach (string s in list2)
            //{
            //    Console.WriteLine($"String List:{s}");
            //}
            #endregion

            #region iterator

            int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };

            foreach(int num in arr2)
            {
                Console.WriteLine($" array elements: {num}");
            }

            List<int> list = new List<int>();
            list.Add(1);

            #endregion


            #region CustomCollection 
            MyCustomCollection myc=new MyCustomCollection();
            myc.Add(1);
            myc.Add(3);

            myc.Add(7);
            var result111 = myc.GetElements;

          for (int i = 0; i < result111.Count; i++)
                {
                    Console.WriteLine(result111[i]);
                }


                #endregion

                #region MyCollection

                Mycollection mycollection = new Mycollection();
            foreach(string day in mycollection)
            {
                Console.WriteLine(day);
            }

            #endregion

        }


        public static bool check(int num)
        {
            return num > 10;
        }


        public static T MySum<T>(IEnumerable<T> arr)
        {
            dynamic sum = 0;
            foreach (var ele in arr)
            {
                sum += ele;
            }
            return sum;
        }

       

    }

    public static class MyClass
    {
        public static bool IsEmailIdValid(this string email)
        {
            return email.Contains("@g.com");
        }

        public static List<T> ConvertToList<T>(this IEnumerable<T> source, int nonsenseParameter)
        {
            List<T> list = new List<T>();
            foreach (var item in source)
            {
                list.Add(item);
            }
            Console.WriteLine($"Nonsense Parameter value = {nonsenseParameter}");
            return list;
        }
    }



    public class MyCustomCollection : IEnumerable
    { private ArrayList arr =new ArrayList();


       public ArrayList GetElements
        {
            get
            {
                return arr;
            }

            
        }


        public void Add(int element)
        {
            arr.Add(element);
        }

        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < arr.Count; i++)
            {
                yield return arr[i];
                // yield keyword forces CLR to remeber last element index, which we have returned from this for loop and next time returns next element by increasing index as per the for loop syntax condition.
            }
        }
      
        
    }

    public class Mycollection : IEnumerable
    {
        private string[] days = new string [] { "Mon", "tue","wed","thus","fri","sat","sun"};
        public IEnumerator GetEnumerator()
        {
            for(int i = 0; i < days.Length; i++)
            {
                string day = days[i];
                yield return day;
               
            }
            throw new NotImplementedException();
        }
    }


}
