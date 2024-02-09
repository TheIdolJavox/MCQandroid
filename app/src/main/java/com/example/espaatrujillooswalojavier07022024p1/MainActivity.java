package com.example.espaatrujillooswalojavier07022024p1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewProduct1 = findViewById(R.id.imageViewProduct1);
        ImageView imageViewProduct2 = findViewById(R.id.imageViewProduct2);

        imageViewProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProductDetails();
            }
        });

        imageViewProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProductDetails();
            }
        });
    }

    public void showProductDetails() {
        Intent intent = new Intent(this, ProductDetailsActivity.class);
        startActivity(intent);
    }
}
