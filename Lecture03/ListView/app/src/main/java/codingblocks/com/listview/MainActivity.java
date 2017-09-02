package codingblocks.com.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students.add("Naman");
        students.add("Tenzin");
        students.add("Rijul");
        students.add("Ansh");
        students.add("Deepak");
        students.add("Ashwani");
        students.add("Amit");
        students.add("Sooraj");
        students.add("Kartik");
        students.add("Swarnima");
        students.add("Shobhit");

        final ListView listView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.item_row,
                R.id.textView,
                students);

        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(arrayAdapter);
            }
        });

    }
}
