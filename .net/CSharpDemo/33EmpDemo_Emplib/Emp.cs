using _31Demo_BVSAttribute;
using _34Demo_CustomAttributes;
using System;
namespace _33EmpDemo_Emplib
{

    [ACTSpuneAttributes(CompanyName = "ACTS", DeveloperName = "Vipul Deshmukh")]
    [Serializable] 
    [Table(TableName = "Employee")]
    public class Emp
    {

        private int _Id;
        private string _Name;
        private string _Address;

        [Column(ColumnName = "EId", ColumnType = "int")]
        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }
        [Column(ColumnName = "Name", ColumnType = "varchar(50)")]
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }
        [Column(ColumnName = "EAddress", ColumnType = "varchar(50)")]
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }
    }
}
