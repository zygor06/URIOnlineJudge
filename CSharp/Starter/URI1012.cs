 2using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace URI1012
{
    class Program
    {
        static void Main(String[] args)
        {
           String[] s = Console.ReadLine().Split(' ');
           double a = ToDouble(s[0]);
           double b = ToDouble(s[1]);
           double c = ToDouble(s[2]);
           double pi = 3.14159;

           double triangulo = (a * c) / 2;
           double circulo = (c * c) * pi;
           double trapezio = ((a + b) * c) / 2;
           double quadrado = b * b;
           double retangulo = a * b;

           Console.PrintLine("TRIANGULO: " + DoubleToString(triangulo,3));
           Console.PrintLine("CIRCULO: " + DoubleToString(circulo,3));
           Console.PrintLine("TRAPEZIO: " + DoubleToString(trapezio,3));
           Console.PrintLine("QUADRADO: " + DoubleToString(quadrado,3));
           Console.PrintLine("RETANGULO: " + DoubleToString(retangulo,3));

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