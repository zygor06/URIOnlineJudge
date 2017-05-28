using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI1014
{
    class Program
    {
        static void Main(String[] args)
        {
            int km = Int32.Parse(Console.ReadLine());
            double gas = ToDouble(Console.ReadLine());

            double km_l = km / gas;

            Console.WriteLine(DoubleToString(km_l,3) + " km/l");
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

            if (casas > 0)
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