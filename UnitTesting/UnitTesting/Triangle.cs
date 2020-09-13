using System;
using System.Collections.Generic;
using System.Linq;
using System.Text; 
using System.Threading.Tasks;

namespace UnitTesting
{
    class Triangle
    {
        static public bool CheckCreationPossibility(float a,float b,float c)
        {
            var allSides = new float[3] { a, b, c };
            if (allSides.Max()<=0||(allSides.Max()*2>a+b+c))
            {
                return false;
            }
            return true;
        }
    }
}
