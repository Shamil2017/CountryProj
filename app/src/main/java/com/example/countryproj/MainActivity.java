package com.example.countryproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button[] btns = new Button[3];
    ImageView ivEmbl, ivFlag;
    TextView tvName;
    int[] embl = {R.drawable.russia_embl,R.drawable.gerbchina, R.drawable.gerbiran  };
    int[] flag = {R.drawable.russia_l, R.drawable.flagchina, R.drawable.flagiran};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btns[0] = findViewById(R.id.btn1);
        btns[1] = findViewById(R.id.btn2);
        btns[2] = findViewById(R.id.btn3);
        ivEmbl = findViewById(R.id.ivEmbl);
        ivFlag = findViewById(R.id.ivFlag);
        tvName = findViewById(R.id.tvName);
    }

    public void goPict(View view) {
        for (int i=0; i<flag.length; i++)
            if (view==btns[i])
            {
                ivEmbl.setImageResource(embl[i]);
                ivFlag.setImageResource(flag[i]);
                tvName.setText(btns[i].getText().toString());
            }
    }
}