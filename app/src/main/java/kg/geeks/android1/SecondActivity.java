package kg.geeks.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView, textView2, textView3;
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
       String data2 =  getIntent().getStringExtra("data_main2");
       String data3 =  getIntent().getStringExtra("data_main3");
       textView.setText(data);
       textView2.setText(data2);
       textView3.setText(data3);
    }

    private void initUI() {
        textView=findViewById(R.id.text_view_second);
        textView2=findViewById(R.id.text_view_second2);
        textView3=findViewById(R.id.text_view_second3);
        imageView=findViewById(R.id.image_view);
    }
}