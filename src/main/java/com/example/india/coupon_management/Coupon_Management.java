package com.example.india.coupon_management;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;


public class Coupon_Management extends AppCompatActivity {
    Button distributePageButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon__management);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        distributePageButton = (Button) findViewById(R.id.distributePageButton);
        editText = (EditText) findViewById(R.id.editText);

        final Context context = this;

        distributePageButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Distribute_Coupon.class);
                /*Bundle bundle = new Bundle();
                bundle.putString("name",textView.getText().toString());*/
                intent.putExtra("com.example.india.coupon_management.name",editText.getText().toString());

                startActivity(intent);

            }

        });

    }

}