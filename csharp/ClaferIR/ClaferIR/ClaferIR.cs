using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using clafer.org.ir;

namespace clafer.org.ir.ClaferIR
{
    public class ClaferIR
    {
        /// <summary>
        /// Parses the XML IR representation.
        /// </summary>
        /// <param name="fileName"></param>
        /// <returns></returns>
        public Module loadClaferModel(string fileName)
        {
            return Module.Load(fileName);
        }
    }
}
