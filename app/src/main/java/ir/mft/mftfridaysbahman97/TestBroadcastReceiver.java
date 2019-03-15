package ir.mft.mftfridaysbahman97;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "AirPlaneMode Changed", Toast.LENGTH_LONG).show();
    }
}
