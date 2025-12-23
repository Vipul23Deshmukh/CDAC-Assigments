namespace _01Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
           Baseclass ba=new Baseclass();
           
            ba.Method1();

            
            Derivedclass de=new Derivedclass(10);
            de.Method1();
            de.Method2();
            

            Baseclass b = new Derivedclass(100);
            b.Method1();


            #region method overloading
            AdvancedMath adv=new AdvancedMath();
            Console.WriteLine(adv.add(2, 8));
            adv.mult(3, 5);
            #endregion
        }
    }
}
