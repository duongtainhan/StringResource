package com.example.duongtainhan555.stringresource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edUser, edPass;
    TextView txtInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anh xa
        btnLogin = findViewById(R.id.btnLogin);
        edUser = findViewById(R.id.edUser);
        edPass = findViewById(R.id.edPassword);
        txtInfo = findViewById(R.id.txtInfo);
        //
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tk = edUser.getText().toString();
                String mk = edPass.getText().toString();

                String ketqua = (tk.equals("Nhan") && mk.equals("1997"))?"Thanh cong":"That bai";
                String taikhoan = getResources().getString(R.string.TaiKhoan);
                String matkhau = getResources().getString(R.string.MatKhau);
                txtInfo.setText(taikhoan+tk+"\n"+matkhau+mk);
                Toast.makeText(MainActivity.this,ketqua,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
