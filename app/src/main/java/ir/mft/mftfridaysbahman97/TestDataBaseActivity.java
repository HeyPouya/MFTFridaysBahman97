package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TestDataBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_data_base);

        TestDBHandler handler = new TestDBHandler(this, "students", null, TestDBHandler.VERSION);


        handler.insertStudent("Pouya", "Heydari", 70);

        String s = handler.getStudentNames();

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
