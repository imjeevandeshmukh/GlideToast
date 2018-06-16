package com.jeevandeshmukh.glidetoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jeevandeshmukh.glidetoastlib.GlideToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new GlideToast.makeToast(MainActivity.this,"Some random here", GlideToast.LENGTHQUICK, GlideToast.CUSTOMTOAST, GlideToast.TOP,R.drawable.ic_android_black_24dp, "#EC407A").show();




            }
        });

    }

}
