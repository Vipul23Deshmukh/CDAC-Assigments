using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inhertance.logic
{
    internal class person
    {
        public string FirstName;
        public string LastName;

    }

    internal class Employee: person 
    {
       public int Id;

    }
}
