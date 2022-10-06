package com.example.s5q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n=Integer.parseInt(e1.getText().toString());
                long f=1;
                for(int i=n;i>0;i--)
                {
                    f=f*i;
                }
                String res= String.valueOf(f);
                e2.setText(res);
            }
        });
    }
}