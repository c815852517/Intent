package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit=(EditText)findViewById(R.id.edit);
                Intent intent=new Intent();
                intent.setAction("android.intent.action.VIEW");
                //String url="http://"+edit.getText().toString();
                String url=edit.getText().toString();
                intent.putExtra("url",url);
                //intent.setData(Uri.parse(url));
                /*Intent chooser=Intent.createChooser(intent,"请选择一个浏览器进行网页浏览");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }*/
                startActivity(intent);
            }
        });
    }
}
