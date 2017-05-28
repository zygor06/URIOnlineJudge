using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI1007
{
    class Program
    {
        static void Main(String[] args)
        {
            string nome = Console.ReadLine();
            double salarioFixo = ToDouble(Console.ReadLine());
            double vendas = ToDouble(Console.ReadLine());

            double total = (vendas * 0.15) + salarioFixo;

            Console.WriteLine("TOTAL = " + DoubleToString(total, 2));

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