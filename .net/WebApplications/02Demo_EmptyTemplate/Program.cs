namespace _02Demo_EmptyTemplate
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

            //app.Run();

            #endregion

            #region app.run cannot pass http context to another app.run

            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync(" Hello from harry !!!!");
            //    await context.Response.WriteAsync("\n How are you ?");
            //});

            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("Bye Hugh Jackman!!");
            //});

            //app.Run();


            #endregion

            #region app use

            app.Use(async (context, next) =>

            {
                await context.Response.WriteAsync("Hello harry");
                await context.Response.WriteAsync("\nHow are you ");
                next(context);

            });
            app.Use(async (context, next) => {
                await context.Response.WriteAsync(" \nWelcome Harry !!");
                next(context);
                await context.Response.WriteAsync(" \nNice to meet you ?");
            });


            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("\n Bye Harry !!");

            });
            app.Run();

            #endregion

        }
    }
}
