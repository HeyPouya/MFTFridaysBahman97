package ir.mft.mftfridaysbahman97;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtShowName = findViewById(R.id.txtShowName);


        Intent intent = getIntent();
        String userName = intent.getStringExtra("name");


        txtShowName.setText(userName);

    }

}
