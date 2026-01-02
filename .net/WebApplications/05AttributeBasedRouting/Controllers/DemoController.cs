using Microsoft.AspNetCore.Mvc;

namespace _05AttributeBasedRouting.Controllers
{
    [Route("Demo")]
    public class DemoController : Controller
    {
        [Route("Index")]
        public IActionResult Index()
        {
            return View();
        }

        [Route("Greet")]
        public string SayHi()
        {
            return "HEllo From IET Pune";
        }

        [Route("Number")]
        public int GetNumber()
        {
            return 80;
        }
    }
}
