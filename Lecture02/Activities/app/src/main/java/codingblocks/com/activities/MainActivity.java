package codingblocks.com.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    static int count = 0;
    TextView textView1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        textView1 = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText2);

    }

    public void incrementCount(View view) {
//        count++;
//        Log.d(TAG, "incrementCount: was called " + count + " times");
//        textView1.setText("The value of Counter is " + count);
        String etContent = editText.getText().toString();
        textView1.setText(etContent);

    }
}
