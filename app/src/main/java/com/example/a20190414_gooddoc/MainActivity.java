package com.example.a20190414_gooddoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnf;
    EditText edtf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnf = findViewById(R.id.btnf);
        edtf = findViewById(R.id.Edtf);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edtf.getText().toString();

                Toast.makeText(MainActivity.this, str+"을 검색합니다.", Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "종로", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
