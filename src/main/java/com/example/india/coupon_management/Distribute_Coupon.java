package com.example.india.coupon_management;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Distribute_Coupon extends AppCompatActivity {

Button consumeCoupon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribute__coupon);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView = (TextView) findViewById(R.id.distributeTextView);
       /* Bundle bundle = getIntent().getExtras();
        textView.setText("Hello"+bundle.getString("name"));*/
        String obj1 = getIntent().getExtras().getString("com.example.india.coupon_management.name");
        textView.setText("Hello, " + obj1);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        consumeCoupon = (Button) findViewById(R.id.consumeCoupon);

        final Context context = this;

        consumeCoupon.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Consume_Coupon.class);
                startActivity(intent);

            }

        });

    }

}
