namespace _31Demo_BVSAttribute
{
    [AttributeUsage(AttributeTargets.Class)]
    public class ACTSpuneAttributes: Attribute
    {
        private string companyName;
        private string developerName;


        public string CompanyName
        {
            get { return companyName; }
            set { companyName = value; }
        }


        public string DeveloperName
        {
            get { return developerName; }
            set { developerName = value; }
        }



    }
}
