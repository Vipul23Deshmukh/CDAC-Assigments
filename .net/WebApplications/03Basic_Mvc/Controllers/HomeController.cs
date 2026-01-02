using Microsoft.AspNetCore.Mvc;

namespace _03Basic_Mvc.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
