namespace _15Demo_CMath
{
    public class CMath
    {
        public void Add(int  x,int y) {
        
        Console.WriteLine($"The Addition is { x + y}");
        }


        private void Sub(int x, int y) { 
        
        Console.WriteLine($"The subtraction is {x-y}");
        }


        protected void Mul(int x ,int y)
        {


            Console.WriteLine($"The multiplications is {x * y}");
        }

        internal void Div(int x, int y) {
            Console.WriteLine($"The division is {x / y}"); 
        
        }

        protected internal void Square(int x)
        {
            Console.WriteLine($"The square is {x*x}");
        }





    }



    public class AdvMath : CMath { 
    public void Adv_wrapper()
        {
            base.Add(1,2);
            base.Mul(1,2);
            base.Div(1,2);
            base.Square(5);
        }
    
    }
}
