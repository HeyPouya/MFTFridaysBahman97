package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TestMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(1,2,0,"Fourth Item");

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.firstItem:
                Toast.makeText(this, "First Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.secondItem:
                Toast.makeText(this, "Second Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.thirdItem:
                Toast.makeText(this, "Third Item", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Fourth Item", Toast.LENGTH_SHORT).show();
                break;
            default:
                    Toast.makeText(this, "Unknown Item", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}
