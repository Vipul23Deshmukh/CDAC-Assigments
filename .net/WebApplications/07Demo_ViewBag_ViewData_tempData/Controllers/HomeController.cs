using _07Demo_ViewBag_ViewData_tempData.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections;
using System.Diagnostics;

namespace _07Demo_ViewBag_ViewData_tempData.Controllers
{
    public class HomeController : Controller
    {
        List<Emp> emplist = new List<Emp>()
        {
            new Emp(){ Id= 101, Name= "Pooja", Address="Pune"},
            new Emp(){ Id= 102, Name= "Neha", Address="Nagpur"},
             new Emp(){ Id= 103, Name= "alisha", Address="Punjab"},
             new Emp(){ Id= 104, Name= "Nehali", Address="Nagaland"},
              new Emp(){ Id= 105, Name= "Ponam", Address="Patna"},
                new Emp(){ Id= 106, Name= "sneha", Address="belapur"},

        };

        List<Customer> cslist = new List<Customer>()

        {
         new Customer(){CId= 1, Cname="Bob", BillNo= 1234 },
         new Customer(){CId= 2, Cname="Rob", BillNo= 5678 },
         new Customer(){CId= 3, Cname="Tom", BillNo= 2468 },

        };


        public IActionResult GetEmps()
        {
            return View(emplist);
        }

        public IActionResult GetRecords()
        {
            IETDBViewModel vmmodel = new IETDBViewModel() {
                allEmps = emplist,
                allCusts = cslist
            };

            return View(vmmodel);

        }
        public IActionResult Display()
        {
            Emp emp = new Emp() { Id = 44, Name = "Timothy", Address = "London" };
            Customer cust = new Customer() { CId = 88, Cname = "Tony Stark", BillNo = 007 };
            ArrayList arr = new ArrayList() { emp, cust };
            return View(arr);
        }

    }
}
