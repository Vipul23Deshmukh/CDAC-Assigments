using Microsoft.AspNetCore.Mvc;

namespace ReturnTypesOfAction.Controllers
{
    public class HomeController : Controller
    {
        //most common return type
        public IActionResult Index()
        {
            return View();
        }

        //most common in old mvc
        public ActionResult About()
        {
            return View();
        }

        //stronglyTyped return type

        public ActionResult<int> GetNumber()
        {
            return 100;
        }

        public ViewResult M1()
        {
            return View("~/Views/Home/About.cshtml");
        }

        public string getsomething(string name)
        {
            return $"{name}";
        }

        public JsonResult GetData()
        {
            var Data = new
            {
                Id = 101,
                Name = "shreya",
                Address = "Bankok"
            };
            return Json(Data);
        }

        public StatusCodeResult GetStatus()
        {
            return StatusCode(404);
        }

        public ObjectResult GetObject()
        {
            var obj = new
            {
                id = 102,
                name = "piya",
                address = "NYC"
            };
            return new ObjectResult(obj);
        }

        public EmptyResult GetEmpty()
        {
            return new EmptyResult();
        }

        public async Task<ViewResult> GetResult()
        {
            await Task.Delay(3000);
            return View("~/Views/Home/GetData.cshtml");
        }

        public FileResult DownloadFile()
        {
            var byteArray = System.IO.File.ReadAllBytes(@"C:\Users\IET\Desktop\VipulPriyanka\.net\WebApplications\OfACtion\Data\quote.pdf");

            return File(byteArray, "application/pdf", "quote.pdf");
        }
    }


}
