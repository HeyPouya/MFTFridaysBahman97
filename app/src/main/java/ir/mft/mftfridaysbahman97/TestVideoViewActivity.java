package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        Uri video = Uri.parse("https://hw17.cdn.asset.aparat.com/aparat-video/3e564e2cfbbcbbfa80b4d7df2498ba3314048244-144p__73764.mp4");

        VideoView vv = findViewById(R.id.vv);
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(video);
        vv.start();
    }
}
