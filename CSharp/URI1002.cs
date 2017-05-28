using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI1002
{
    class Program
    {
        static void Main(string[] args)
        {
            double PI = 3.14159;
            double raio = ToDouble(Console.ReadLine());
            double area = (raio * raio) * PI;

            Console.WriteLine("A=" + area.ToString("0.0000", System.Globalization.CultureInfo.InvariantCulture));
        }

        public static double ToDouble(String value)
        {
            if (value == null)
                return 0;
            return Double.Parse(value, System.Globalization.CultureInfo.InvariantCulture);
        }
    }
}
