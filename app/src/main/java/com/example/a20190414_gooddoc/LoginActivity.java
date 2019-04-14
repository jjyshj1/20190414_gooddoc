package com.example.a20190414_gooddoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
//ID : tjeit,  PW : qwer1234
// 로그인되면 메인화면 열고
//    아니면 토스트로 로그인 실패 메세지

    EditText txtid;
    EditText txtpw;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtid = findViewById(R.id.txtid);
        txtpw = findViewById(R.id.txtpw);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = txtid.getText().toString();
                String userPw = txtpw.getText().toString();

                if (userId.equals("qqqq") && userPw.equals("qwer1234")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();//로그인화면 종료

                }
                else{
                    Toast.makeText(LoginActivity.this, "로그인에 실패했습니다. ID/PW를 확인하세요.", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
