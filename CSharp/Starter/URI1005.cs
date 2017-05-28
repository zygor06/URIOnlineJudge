using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI1005
{
    class Program
    {
        static void Main(string[] args)
        {

            double a = ToDouble(Console.ReadLine());
            double b = ToDouble(Console.ReadLine());

            double media = ((a * 3.5) + (b * 7.5)) / 11.0;

            Console.WriteLine("MEDIA = " + DoubleToString(media, 5));
        }

        public static double ToDouble(String value)
        {
            if (value == null)
                return 0;
            return Double.Parse(value, System.Globalization.CultureInfo.InvariantCulture);
        }

        public static string DoubleToString(double value, int casas)
        {
            int n = casas;
            string s = "0";

            if(casas > 0)
            {
                s += ".";
            }
            do
            {
                n--;
                s += "0";
            } while (n != 0);
            return value.ToString(s, System.Globalization.CultureInfo.InvariantCulture);
        }
    }
}
