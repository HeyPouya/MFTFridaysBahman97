package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_data);


        TextView txtName = findViewById(R.id.txtName);
        Button btnConfirm = findViewById(R.id.btnConfirm);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");


        txtName.setText(name);


        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_OK);
                finish();
            }
        });
    }
}
