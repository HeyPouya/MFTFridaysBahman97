package ir.mft.mftfridaysbahman97;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnterDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_data);

        final EditText edtName = findViewById(R.id.edtName);

        Button btnOk = findViewById(R.id.btnOk);


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtName.getText().toString();

                Intent intent = new Intent(EnterDataActivity.this, ConfirmDataActivity.class);

                intent.putExtra("name", name);

                startActivityForResult(intent,1954);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 1954){
            if (resultCode == Activity.RESULT_OK){
                Toast.makeText(this, "You've confirmed your information!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "You have'nt confirmed your information!", Toast.LENGTH_SHORT).show();

            }
        }


    }
}
