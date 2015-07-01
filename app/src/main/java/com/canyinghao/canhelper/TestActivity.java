package com.canyinghao.canhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.canyinghao.canhelper.utils.AnimeHepler;

/**
 * Created by yangjian on 15/7/1.
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       final Button btn= new Button(this);
        setContentView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimeHepler.getInstance().scalSpringAnime(btn, 1, 0.5f, 150, 5);
            }
        });


    }
}
