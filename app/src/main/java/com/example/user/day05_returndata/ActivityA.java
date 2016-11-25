package com.example.user.day05_returndata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.user.day05_returndata.uitls.Contants;

public class ActivityA extends AppCompatActivity {
private Button bt_a,bt_b;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        bt_a= (Button) findViewById(R.id.button_a);
        bt_b= (Button) findViewById(R.id.button_b);
        bt_a.setOnClickListener(new ButtonListener());
        bt_b.setOnClickListener(new ButtonListener());

    }
    public class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(ActivityA.this,ActivityB.class);
            switch (v.getId())
            {
                case R.id.button_a:
                    startActivityForResult(intent, Contants.KEY_A);
                    break;
                case R.id.button_b:
                    startActivityForResult(intent, Contants.KEY_B);
                    break;

            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Contants.KEY_A){
            Log.d("aaa","data----a");
        }
        if (requestCode == Contants.KEY_B){
            Log.d("bbb","data----b");
        }

    }
}
