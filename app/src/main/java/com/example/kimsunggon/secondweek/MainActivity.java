package com.example.kimsunggon.secondweek;

import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt;
    Intent intent;
    EditText text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.bt_1);
        text1 = (EditText)findViewById(R.id.text_1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create intent instance
                String phone = text1.getText().toString();
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + phone));
                startActivity(intent);
            }
        });
    }
}
