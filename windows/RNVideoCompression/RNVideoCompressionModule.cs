using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Video.Compression.RNVideoCompression
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNVideoCompressionModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNVideoCompressionModule"/>.
        /// </summary>
        internal RNVideoCompressionModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNVideoCompression";
            }
        }
    }
}
