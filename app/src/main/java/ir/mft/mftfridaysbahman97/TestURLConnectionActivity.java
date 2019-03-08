package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestURLConnectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_urlconnection);


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL obj = new URL("https://api.aladhan.com/v1/timingsByCity?city=Dubai&country=United%20Arab%20Emirates&method=8");

                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");
                    con.setRequestProperty("User-Agent", "Mozilla/5.0");

                    int responseCode = con.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {

                        BufferedReader in = new BufferedReader(new InputStreamReader(
                                con.getInputStream()));

                        String inputLine;
                        StringBuffer response = new StringBuffer();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }

                        JSONObject object = new JSONObject(response.toString());
                        String s = object.getString("data");

                        JSONObject object1 = new JSONObject(s);
                        String s1 = object1.getString("timings");

                        JSONObject object2 = new JSONObject(s1);
                        String s2 = object2.getString("Maghrib");


                        Log.d("MAGHRIB", s2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }
}
