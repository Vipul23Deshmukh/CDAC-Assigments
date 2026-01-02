namespace _04Conventional_Routing
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();

           // app.MapDefaultControllerRoute();
            app.MapControllerRoute(
                name: "default",
                pattern:"{controller=Home}/{action=Index}"
                );

            app.MapControllerRoute(
                name: "demo1" ,
                pattern: "{controller=Demo}/{action=Index}"
                );

            app.MapControllerRoute(
                name: "demo2",
                pattern: "{controller=Admin}/{action=Index}"
                );

            app.Run();

           
        }
    }
}
