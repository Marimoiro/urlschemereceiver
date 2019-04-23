using System.Collections;
using System.Collections.Generic;
using Assets.UrlSchemeReceiver;
using UnityEngine;
using UnityEngine.UI;

public class ReceiverSample : MonoBehaviour
{
    public Text OpenFrom;

    public Text Url;
    public Text SpecificPart;
    // Start is called before the first frame update
    void Start()
    {
        var of = UrlSchemeReceiver.OpenFromUrlScheme ? "UrlSchemeReceiver" : "OtherWay";
        OpenFrom.text = $"Open From {of}";
        if (UrlSchemeReceiver.OpenFromUrlScheme)
        {
            Url.text = UrlSchemeReceiver.OpenUrl;
            SpecificPart.text = UrlSchemeReceiver.SpecificPart;
        }
        else
        {
            SpecificPart.text = Url.text = "null null";
        }
    }

}
