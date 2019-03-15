package ir.mft.mftfridaysbahman97;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TestPagerAdapter extends FragmentPagerAdapter {


    public TestPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TestFragment fragment = new TestFragment();
                return fragment;
            case 1:
                TestFragment fragment1 = new TestFragment();
                return fragment1;
            case 2:
                TestFragment fragment2 = new TestFragment();
                return fragment2;
            default:
                TestFragment fragment3 = new TestFragment();
                return fragment3;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Page 1";
            case 1:
                return "Page 2";
            case 2:
                return "Page 3";
            default:
                return "Unknown page !";
        }
    }
}
