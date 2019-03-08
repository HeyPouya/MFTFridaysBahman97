package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TestHTMLAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_htmlativity);


        TextView txtDesc= findViewById(R.id.txtDesc);
        txtDesc.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
    }
}
