using _07Demo_ViewBag_ViewData_tempData.Models;
using Microsoft.AspNetCore.Mvc;

namespace _07Demo_ViewBag_ViewData_tempData.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            ViewBag.Message = "This is the Way";

            Emp emp= new Emp() { Id=11,Name="Rose",Address="Titanic"};
            ViewBag.empInfo = emp;

            Emp emp1 = new Emp() { Id = 11, Name = "JAck", Address = "Titanic" };
            ViewData["emp1"] = emp1;

            TempData["PIN"] = 123123;

            return View();
        }
        public IActionResult About()
        {
            return View();
        }

    }
}
