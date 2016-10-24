package com.gourd.adien.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
    }

    public void myClick(View v){
        Toast.makeText(Act4.this, "布局xml定义", Toast.LENGTH_SHORT).show();
    }
}
