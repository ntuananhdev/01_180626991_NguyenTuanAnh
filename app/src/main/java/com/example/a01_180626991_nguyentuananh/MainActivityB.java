package com.example.a01_180626991_nguyentuananh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityB extends AppCompatActivity {
    private ImageView imgPoular;
    private TextView tvName;
    private TextView tvPrice;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        imgPoular = findViewById(R.id.imagesPoularB);
        tvName = findViewById(R.id.tvNameB);
        tvPrice = findViewById(R.id.tvPriceB);

        btnAdd = findViewById(R.id.btnAdd);

        Intent intent = getIntent();
        Poular poular = (Poular) intent.getSerializableExtra("poular");
        imgPoular.setImageResource(poular.getImagesPoular());
        tvPrice.setText(poular.getPricePoular());
        tvName.setText(poular.getNamePoular());

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivityB.this, MainActivityC.class);
                intent1.putExtra("pou",poular);
                startActivity(intent1);
            }
        });
    }
}