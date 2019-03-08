package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;
import cz.msebera.android.httpclient.Header;
import ir.mft.mftfridaysbahman97.pray.PrayTimesClass;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

public class TestAsyncHttpClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_http_client);


        String url = "http://www.mocky.io/v2/5c812807310000c813771df9";

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Gson gson = new Gson();
                PrayTimesClass  pray = gson.fromJson(response.toString(),PrayTimesClass.class);


                String maqrib = pray.getData().getTimings().getMaghrib();

                Log.d("MAGHRIB",maqrib);
            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);



            }
        });
    }
}
