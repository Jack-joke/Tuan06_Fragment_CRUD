package com.example.student.fragment_txs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class XuLyActivity extends AppCompatActivity {
    public  static  final  int GOITRALAI=200;
    EditText edta, edtb;
    Button btnadd;
    ArrayList<Human> ls;
    ArrayAdapter<Human> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuly);

        edta = (EditText)findViewById(R.id.edt_Ma);
        edtb = (EditText)findViewById(R.id.edt_Ten);
        btnadd = (Button) findViewById(R.id.btnThem2);

        Intent insv= getIntent();

        //nếu sửa thì tái hiện thông tin
        Intent intent= getIntent();

        if(intent.getSerializableExtra("SUA")!=null)
        {
            Human h = (Human) insv.getSerializableExtra("SUA");
            edta.setText(h.getMa());
            edtb.setText(h.getTen());
            btnadd.setText("Cap Nhat");
        }
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnadd.getText().equals("Them")) {
                    Human h = new Human();

                    h.setMa(edta.getText().toString());
                    h.setTen(edtb.getText().toString());


                    return;
                }else {
                    Human h = new Human();

                    h.setMa(edta.getText().toString());
                    h.setTen(edtb.getText().toString());

                    //dbHelper.Update(sv);
                    //Toast.makeText(this, "Sua thành công !", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }



}
