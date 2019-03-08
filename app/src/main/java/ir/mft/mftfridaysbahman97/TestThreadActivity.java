package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);


        String s = Thread.currentThread().getName();
        Log.d("THREAD", s);




        new Thread(new Runnable() {
            @Override
            public void run() {



                
            }
        }).start();





    }
}
