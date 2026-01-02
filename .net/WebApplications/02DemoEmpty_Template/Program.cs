namespace _02DemoEmpty_Template
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();

            #region app.get,put,post,delete methods

           
            //app.MapGet("/", () => "Hello World!");
            //app.MapPost("/", () => " Hello from post");
            //app.MapPut("/", () => " hello from put");
            //app.MapDelete("/", () => " hello from delete");


            #endregion

            #region app.run cannot pass http context to another app.run

            app.Run(async (context) =>
            {
                await context.Response.WriteAsync(" Hello from harry !!!!");
                await context.Response.WriteAsync("\n How are you ?");
            });

            //app.Run(async (context) => {
            //    await context.Response.WriteAsync("Bye Hugh Jackman!!");
            //}); 
            #endregion
        }
    }
}
