namespace _34Demo_CustomAttributes
{
    [AttributeUsage(AttributeTargets.Class)]
    public class TableAttribute:Attribute
    {
        private string tablename;

        public string TableName
        {
            get { return tablename; }
            set { tablename = value; }
        }


    }

    [AttributeUsage (AttributeTargets.Property)]
    public class ColumnAttribute:Attribute

    {
        private string columnName;
        private string columnType;

       

        public string ColumnName
        {
            get { return columnName; }
            set { columnName = value; }
        }
        public string ColumnType
        {
            get { return columnType; }
            set { columnType = value; }
        }
    }
}
