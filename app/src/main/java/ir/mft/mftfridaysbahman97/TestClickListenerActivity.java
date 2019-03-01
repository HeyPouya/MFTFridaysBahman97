package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TestClickListenerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_click_listener);

        Button btnClick = findViewById(R.id.btnClick);
        final EditText edtName = findViewById(R.id.edtName);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = edtName.getText().toString();


                Intent intent = new Intent(TestClickListenerActivity.this, MainActivity.class);


                intent.putExtra("name",s);

                startActivity(intent);

            }
        });


    }

}
