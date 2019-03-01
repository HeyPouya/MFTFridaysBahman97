package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TestDrawerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_drawer);


        TextView txtDrawer = findViewById(R.id.txtDrawer);

        txtDrawer.setText("Hamburger Menu Page");
    }
}
