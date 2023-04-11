package kg.geeks.android1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    AppCompatButton button;
    EditText editText, editTextTwo, editTextThree;

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
                if (!editText.getText().toString().isEmpty()&&
                        !editTextTwo.getText().toString().isEmpty()&&
                        !editTextThree.getText().toString().isEmpty()) {
                    navigateToSecond(
                            editText.getText().toString(),
                            editTextTwo.getText().toString(),
                            editTextThree.getText().toString());
                }else {
                    System.out.println("Input some data in field");
                }
            }
        });
    }


    private void navigateToSecond(String data, String dataTwo, String dataThree){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("data_main",data);
        intent.putExtra("data_main2",dataTwo);
        intent.putExtra("data_main3",dataThree);
        startActivity(intent);
    }
    private void initUI() {
        button=findViewById(R.id.btn_main);
        editText=findViewById(R.id.edittext_main);
        editTextTwo =findViewById(R.id.edittext_main2);
        editTextThree =findViewById(R.id.edittext_main3);
    }
}