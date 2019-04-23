using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using UnityEditor;
using UnityEngine;

public class Packaging
{
    [MenuItem("Build/Package")]
    public static void Package()
    {
        var dir = new[] {"Assets/Plugins", "Assets/UrlSchemeReceiver"};
        var paths = AssetDatabase.GetAllAssetPaths().Where(a => dir.Any(d => a.StartsWith(d))).ToArray();
        AssetDatabase.ExportPackage(
            dir,
            "urlreceiver.unitypackage",
            ExportPackageOptions.Recurse);
    }
}
