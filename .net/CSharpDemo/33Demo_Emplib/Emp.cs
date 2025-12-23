using _31Demo_BVSAttribute;
using _34Demo_CustomAttributes;
using System;

namespace _33Demo_Emplib
{

    //[ACTSpuneAttributes(CompanyName = "Infosys", DeveloperName = "Vipul")]
    //[Serializable]
    [Table(TableName="Employee")]
    public class Emp
    {
        private int id;
        private string ename;
        private string  address;



        [Column(ColumnName ="EID", ColumnType ="int")]

        public int Eid
        {
            get { return id; }
            set { id = value; }
        }
        [Column(ColumnName = "EName" ,ColumnType = "varchar(40)")]
        public string Ename
        {
            get { return ename; }
            set { ename = value; }
        }
        [Column(ColumnName = "Address" ,ColumnType = "varchar(40)")]
        public string Address
        {
            get { return address; }
            set { address = value; }
        }

    }
}
