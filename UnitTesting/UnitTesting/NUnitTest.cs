using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks; 

namespace UnitTesting
{
    [TestFixture]
    class NUnitTest
    {
       
            [TestCase]
            public void TestCase1()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(1, 2, 3), false);
                Assert.AreEqual(Triangle.CheckCreationPossibility(2, 2, 2), true);
                Assert.AreEqual(Triangle.CheckCreationPossibility(2, 4, 4), true);
            }
            [TestCase]
            public void TestCase2()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(-1, 1, 1), false);
                Assert.AreEqual(Triangle.CheckCreationPossibility(1, -1, 1), false);
                Assert.AreEqual(Triangle.CheckCreationPossibility(1, 1, -1), false);
            }
            [TestCase]
            public void TestCase3()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(-1, -2, -3), false);
            }
            [TestCase]
            public void TestCase4()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(0, 0, 0), false);
            }
            [TestCase]
            public void TestCase5()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(0, 1, 1), false);
                Assert.AreEqual(Triangle.CheckCreationPossibility(1, 0, 1), false);
                Assert.AreEqual(Triangle.CheckCreationPossibility(1, 1, 0), false);
            }
            [TestCase]
            public void TestCase6()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(float.MaxValue, float.MaxValue, float.MaxValue), false);
            }
            [TestCase]
            public void TestCase7()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(float.MinValue, float.MinValue, float.MinValue), false);
            }
            [TestCase]
            public void TestCase8()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(22.22f, 33.33f, 22.22f), true);
            }
            [TestCase]
            public void TestCase9()
            {
                Assert.AreEqual(Triangle.CheckCreationPossibility(float.MaxValue, 1, 1), false);
                Assert.AreEqual(Triangle.CheckCreationPossibility(1, float.MaxValue, 1), false);
                Assert.AreEqual(Triangle.CheckCreationPossibility(1, 1, float.MaxValue), false);
            }
            [TestCase]
            public void TestCase10()
            {
                for (float i = 1; i < 9999; i += 0.01f)
                    Assert.AreEqual(Triangle.CheckCreationPossibility(i, i, i), true);
            }
        }
}
