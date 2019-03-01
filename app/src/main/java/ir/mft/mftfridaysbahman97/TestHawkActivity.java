package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.orhanobut.hawk.Hawk;

public class TestHawkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_hawk);

        Hawk.init(this).build();

        Hawk.put("name", "Pouya");

        String s = Hawk.get("name");

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }
}
