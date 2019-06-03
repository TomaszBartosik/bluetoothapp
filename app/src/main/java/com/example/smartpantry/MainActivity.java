package com.example.smartpantry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText messEditText;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      setContentView(R.layout.activity_main_active);
      messEditText = findViewById(R.id.messageEditText);

    }

    public void onLogClick(View view) {


    }

    public void onToastClick(View view) {
        Toast.makeText(getApplication().getBaseContext(),"kurwa chuj", Toast.LENGTH_SHORT).show();
    }

    public void onRewriteClick(View view) {
        final TextView messRewrText = (TextView) findViewById(R.id.rewriteText);
        messRewrText.setText(messEditText.getText().toString());
    }
}
