using _31Demo_BVSAttribute;
using System.Reflection;

namespace MyApplication
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"C:\Users\IET\Desktop\VipulPriyanka\.net\CSharpDemo\33EmpDemo_Emplib\bin\Release\net8.0\33EmpDemo_Emplib.dll";

            Assembly asm=Assembly.LoadFrom(asmPath);
            Type[] types = asm.GetTypes();

            for (int i = 0; i < types.Length; i++)
            {
                Type type= types[i];
                Console.WriteLine(type.FullName);

                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute atr= allAttributes[j];
                    //
                    //Console.WriteLine(atr.ToString);
                   // Console.WriteLine(atr);

                    if(atr is ACTSpuneAttributes)
                    {
                        ACTSpuneAttributes acb = atr as ACTSpuneAttributes;

                        Console.WriteLine($"Class {type.Name} is developed by {acb.DeveloperName} of company {acb.CompanyName} ");

                    }

                    if(atr is SerializableAttribute)
                    {
                        Console.WriteLine($"class:{type.Name} is Marked as serializable");
                    }

                }

            }
        }
    }
}
