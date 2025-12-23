using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Reflection.Metadata;
using System.Text;
using System.Threading.Tasks;

namespace _29Demo_Reflection
{
    internal class programv2
    {
        //static void Main(string[] args)
        //{

        //    Console.WriteLine("Hello, World!");
        //    string assemblyPath = @"C:\Users\IET\Desktop\VipulPriyanka\.net\CSharpDemo\Demo_myMath\bin\Release\net8.0\Demo_myMath.dll";
        //    Assembly asm = Assembly.LoadFrom(assemblyPath);

        //    Type[] alltypes = asm.GetTypes();

        //    for (int i = 0; i < alltypes.Length; i++)
        //    {
        //        Type type = alltypes[i];

        //        string methodsignature = " ";

        //        MethodInfo[] allmethods = type.GetMethods();

        //        for (int j = 0; j < allmethods.Length; j++)
        //        {
        //            MethodInfo method = allmethods[j];

        //            methodsignature = method.ReturnType.ToString() + " " + method.Name + "(";

        //            if(method.ReturnType.ToString()=="System.Int32")
        //            {
        //                methodsignature="int"+" "+method.Name+"(";
        //            }

        //            ParameterInfo[] parameters = method.GetParameters();

        //            for (int k=0; k < parameters.Length; k++)
        //            {
        //                ParameterInfo parameter= parameters[k];
        //                methodsignature = methodsignature + parameter.ParameterType.ToString() + " " + parameter.Name + ",";
                             

        //            }
        //            methodsignature = methodsignature.TrimEnd(',') + ")";
        //                  Console.WriteLine(methodsignature);

        //        }


        //    }
        //}


    }
}
