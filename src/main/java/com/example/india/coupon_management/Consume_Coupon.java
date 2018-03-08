package com.example.india.coupon_management;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Consume_Coupon extends AppCompatActivity {

    Button consumeCoupon;
    EditText input;
    String m_Text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consume__coupon);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        consumeCoupon = (Button) findViewById(R.id.consumeCoupon);
        input = (EditText) findViewById(R.id.couponCode);


        // final Context context = this;

        consumeCoupon.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //to print toast msg on same screen(Consume Coupon)
                input.setTextColor(Color.BLUE);
                String displayString = "Coupon code is " + input.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(), displayString, Toast.LENGTH_LONG);
                msg.show();

                //to show pop up on same screen(Consume Coupon)
                AlertDialog.Builder builder = new AlertDialog.Builder(Consume_Coupon.this);
                builder.setMessage("Coupon code is " + input.getText().toString());

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        m_Text = "Coupon code is " + input.getText().toString();
                    }
                });
                builder.show();

            }

        });

    }

}