package com.wku.picassoexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final EditText keyword = (EditText) findViewById(R.id.input);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final String baseurl = "http://picsum.photos/320/240/?random";

        final Picasso p = Picasso.with(getApplicationContext());

        p.load(baseurl)
                .placeholder(R.drawable.progress_animation)
//                .resize(320, 240)
                .into(imageView);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            int i = 0;

            @Override
            public void onClick(View view) {
//                String url = baseurl + keyword.getText().toString() + "?random=" + i++;
                p.load(baseurl)
                        .placeholder(R.drawable.progress_animation)
                        .resize(320, 240)
                        .centerCrop()
                        .into(imageView);
            }
        });


    }
}
