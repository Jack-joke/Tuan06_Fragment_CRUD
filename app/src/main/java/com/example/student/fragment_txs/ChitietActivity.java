package com.example.student.fragment_txs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChitietActivity extends AppCompatActivity {
    TextView tvid, tvname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        tvid = findViewById(R.id.tv_id);
        tvname = findViewById(R.id.tv_name);

        Intent intent = getIntent();
        Human h = (Human)intent.getSerializableExtra("gui");
        tvid.setText(h.getMa());
        tvname.setText(h.getTen());
    }
}
