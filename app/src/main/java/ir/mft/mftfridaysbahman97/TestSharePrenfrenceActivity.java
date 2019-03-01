package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class TestSharePrenfrenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_share_prenfrence);

        PreferenceManager.getDefaultSharedPreferences(TestSharePrenfrenceActivity.this)
                .edit()
                .putString("name", "Pouya")
                .putString("family","Heydari")
                .apply();


        String s = PreferenceManager.getDefaultSharedPreferences(this)
                .getString("family", "UnKnown!!!");


        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
