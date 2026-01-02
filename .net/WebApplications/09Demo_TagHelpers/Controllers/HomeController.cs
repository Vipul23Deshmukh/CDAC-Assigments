using _09Demo_TagHelpers.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace _09Demo_TagHelpers.Controllers
{
    public class HomeController : Controller
    {
       

        

        public IActionResult Index()
        {
            return View();
        }
 

        public IActionResult GetNewUserDetails(NewUser newuser)//model binder
        {

            return View(newuser);
        }
       
    }
}
