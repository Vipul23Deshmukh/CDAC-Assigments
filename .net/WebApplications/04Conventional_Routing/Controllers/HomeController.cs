using Microsoft.AspNetCore.Mvc;

namespace _04Conventional_Routing.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
