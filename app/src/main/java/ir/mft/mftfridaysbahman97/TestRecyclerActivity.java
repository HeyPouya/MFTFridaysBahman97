package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);


        ArrayList<String> list = new ArrayList();
        list.add("Pouya Heydari");
        list.add("Morteza Hooshmand");
        list.add("Negar Ghafoori");
        list.add("Nima Ataee");
        list.add("Hamid Parvizi");
        list.add("Milad Hosseinzade");
        list.add("Arash Kahbasi");



        RecyclerView recycler = findViewById(R.id.recycler);
        TestRecyclerAdapter adapter = new TestRecyclerAdapter(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
}
