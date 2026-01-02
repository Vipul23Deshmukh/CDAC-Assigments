using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _46DemoEntity_Framework.DAL
{
    public class IETDBContext: DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            //read appsetting.json
            var builder = new ConfigurationBuilder();


            builder.SetBasePath(Directory.GetCurrentDirectory());

            // Add the JSON file to the configuration and copy appsettings.json file to the output directory
            builder.AddJsonFile("appsettings.json");


            //build configuration
            IConfiguration config = builder.Build();

            //read config file

            optionsBuilder.UseSqlServer(config.GetConnectionString("IETDb"));
        }
    }
}
