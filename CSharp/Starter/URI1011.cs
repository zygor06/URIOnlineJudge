using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI1010
{
    class Program
    {
        static void Main(String[] args)
        {
          double a = ToDouble(Console.ReadLine());
          double pi = 3.14159;
          double result = (4.0/3) * pi * (a * a * a);

          Console.WriteLine("VOLUME = " + DoubleToString(result,3));       


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