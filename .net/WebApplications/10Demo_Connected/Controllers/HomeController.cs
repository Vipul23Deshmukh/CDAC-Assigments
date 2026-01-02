using _10Demo_Connected.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace _10Demo_Connected.Controllers
{
    public class HomeController : Controller
    {
        private readonly IETDBContext _DbContext;

        public HomeController(IETDBContext context)
        {
            _DbContext = context;
        }

        public IActionResult Index()
        {
            var allEmps = _DbContext.GetAllEmps();
            return View(allEmps);
        }

        
    }
}
