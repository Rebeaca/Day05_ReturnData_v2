package com.example.user.day05_returndata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.day05_returndata.uitls.Contants;

public class ActivityB extends AppCompatActivity {
    private Button bt_c,bt_d;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        bt_c= (Button) findViewById(R.id.button_C);
        bt_d= (Button) findViewById(R.id.button_D);
        bt_c.setOnClickListener(new ButtonListener());
        bt_d.setOnClickListener(new ButtonListener());
        intent=getIntent();
    }
    public class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
          // intent.putExtra(Contants.DATA_C);
            switch (v.getId())
            {
                case R.id.button_C:
                    intent.putExtra(Contants.KEY_C,Contants.DATA_C);
                    setResult(Contants.KEY_A);
                    break;
                case R.id.button_D:
                    intent.putExtra(Contants.KEY_D,Contants.DATA_D);
                    setResult(Contants.KEY_B);
                    break;

            }
            finish();
        }

    }
}
