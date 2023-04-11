package kg.geeks.android1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    AppCompatButton button;
    EditText editText, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        setClicks();
    }

    private void setClicks() {
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!editText.getText().toString().isEmpty()&&!editText2.getText().toString().isEmpty()&&!editText3.getText().toString().isEmpty()) {
                    navigateToSecond(
                            editText.getText().toString(),
                            editText2.getText().toString(),
                            editText3.getText().toString());
                }else {
                    System.out.println("Input some data in field");
                }
            }
        });
    }


    private void navigateToSecond(String data, String data2, String data3){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("data_main",data);
        intent.putExtra("data_main2",data2);
        intent.putExtra("data_main3",data3);
        startActivity(intent);
    }
    private void initUI() {
        button=findViewById(R.id.btn_main);
        editText=findViewById(R.id.edittext_main);
        editText2=findViewById(R.id.edittext_main2);
        editText3=findViewById(R.id.edittext_main3);
    }
}