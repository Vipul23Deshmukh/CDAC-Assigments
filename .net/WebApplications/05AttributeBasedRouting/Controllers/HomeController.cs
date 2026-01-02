using Microsoft.AspNetCore.Mvc;

namespace _05AttributeBasedRouting.Controllers
{
    [Route("Home")]
    public class HomeController : Controller
    {
        [Route("Index")]

        public IActionResult Index()
        {
            return View();
        }

        [Route("About")]
        public IActionResult About()
        {
            return View();
        }

        [Route("Ani")]
        public IActionResult Animal()
        {
            return View("~/Views/Animal/Index.cshtml");
        }

    }
}
