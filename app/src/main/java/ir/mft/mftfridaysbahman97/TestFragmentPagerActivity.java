package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TestFragmentPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment_pager);


        ViewPager pager = findViewById(R.id.pager);
        TabLayout tab = findViewById(R.id.tab);

        TestPagerAdapter adapter = new TestPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(adapter);


        tab.setupWithViewPager(pager);

    }
}
