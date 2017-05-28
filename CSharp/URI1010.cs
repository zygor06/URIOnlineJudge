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
           String[] l1 = Console.ReadLine().Split(' ');
           String[] l2 = Console.ReadLine().Split(' ');

           int n1 = Int32.Parse(l1[1]);
           double v1 = ToDouble(l1[2]);

           int n2 = Int32.Parse(l2[1]);
           double v2 = ToDouble(l2[2]);

           double total1 = n1 * v1;
           double total2 = n2 * v2;

           double total = total1 + total2;

           Console.WriteLine("VALOR A PAGAR: R$ " + DoubleToString(total,2));

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