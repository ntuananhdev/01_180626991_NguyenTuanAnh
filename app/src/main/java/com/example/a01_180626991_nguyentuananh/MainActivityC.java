package com.example.a01_180626991_nguyentuananh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityC extends AppCompatActivity {
    ArrayList<Poular> arrayList;
    private ListAdapter listAdapter;
    private ListView listView;
    private TextView tvSub;
    private TextView tvTotal;
    private Button btnCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c);

        tvSub = findViewById(R.id.tvPriceSub);
        tvTotal = findViewById(R.id.tvPriceTotal);

        arrayList = new ArrayList<>();
        Intent intent = getIntent();
        Poular poular = (Poular) intent.getSerializableExtra("pou");
        arrayList.add(poular);

        tvSub.setText(poular.getPricePoular());
        tvTotal.setText(tvSub.getText());

        listAdapter = new ListAdapter(MainActivityC.this,R.layout.list_item,arrayList);
        listView = findViewById(R.id.lvPoularCart);
        listView.setAdapter(listAdapter);
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=  tvSub.getText().toString();
                String price = tvTotal.getText().toString();
                String quanty = tvTotal.getText().toString();
                API.apiService.addEmployee(new Bill(name, price, quanty)).enqueue(new Callback<Bill>() {

                    @Override
                    public void onResponse(Call<Bill> call, Response<Bill> response) {

                        Intent intent=  new Intent(MainActivityC.this,MainActivityA.class);
                        startActivity(intent);
                        Toast.makeText(MainActivityC.this, "Success", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Bill> call, Throwable t) {

                    }
                });


            }
        });


    }
}