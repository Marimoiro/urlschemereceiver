//original http://westhillapps.blog.jp/archives/25883001.html

package urlreceiver;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unity3d.player.UnityPlayerActivity;


public class IntentReceiveActivity extends Activity {

    private static String scheme;
    private static String specific;
    
    private static Activity mThisActivity;

    private static Handler mMoveActivityHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (mThisActivity != null) {
                // if u use custom activity. Replace this code UnityPlayerActivity to CustomActivity
                Intent i = new Intent(mThisActivity.getApplication(), UnityPlayerActivity.class);
                mThisActivity.startActivity(i);
                mThisActivity.finish();
                mThisActivity = null;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        specific = getIntent().getData().getSchemeSpecificPart();
        scheme = getIntent().getData().getScheme();

        mThisActivity = this;
        mMoveActivityHandler.sendEmptyMessageDelayed(0, 10);
    }

    public static String GetSpecific(){
        return specific;
    }

    public static String GetScheme(){
        return scheme;
    }

    @Override
    public void onBackPressed() {
        // nothing to do
        // super.onBackPressed();
    }
}
