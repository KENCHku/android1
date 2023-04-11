package kg.geeks.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView, textViewTwo, textViewThree;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initUI();
        getIntentFromMain();
    }

    private void getIntentFromMain() {
       String data =  getIntent().getStringExtra("data_main");
       String dataTwo =  getIntent().getStringExtra("data_main2");
       String dataThree =  getIntent().getStringExtra("data_main3");
       textView.setText(data);
       textViewTwo.setText(dataTwo);
       textViewThree.setText(dataThree);
    }

    private void initUI() {
        textView=findViewById(R.id.text_view_second);
        textViewTwo =findViewById(R.id.text_view_second2);
        textViewThree =findViewById(R.id.text_view_second3);
        imageView=findViewById(R.id.image_view);
    }
}