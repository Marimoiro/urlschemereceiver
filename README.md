# urlschemereceiver for unity
 
# Install
Import this [unitypackage](https://github.com/Marimoiro/urlschemereceiver/blob/master/urlreceiver.unitypackage)


## iOS
Set UrlScheme from iOS ProjectSettings

## Android

Add below sentence in \<application\> in AndroidManifest.xml

```
        <!-- url receiver activity -->
        <activity android:name="urlreceiver.IntentReceiveActivity">
            <intent-filter>
                <data android:scheme="{Your Url Scheme}" />
                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />
                <action android:name="android.intent.action.VIEW" />
            </intent-filter>
        </activity>
```

# Usage
UrlSchemeReceiver class is ALL

```
    public static class UrlSchemeReceiver
    {
        /// <summary>
        /// true if app open from url scheme. otherwise false 
        /// </summary>
        public static bool OpenFromUrlScheme { get; private set; }

        /// <summary>
        /// urlscheme
        /// e.g. urlscheme://example
        /// 
        /// if app is opened by other way. This value is null
        /// </summary>
        public static string OpenUrl { get; private set; }

        /// <summary>
        /// specificpart of urlscheme
        /// e.g. example
        /// 
        /// if app is opened by other way. This value is null
        /// </summary>
        public static  string SpecificPart { get; private set; }
        
    }
```
