package com.example.boyraztalha.coinradaranimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

    RippleBackground rippleBackground;
    Animation animation;
    LinearLayout l1,l2,l3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = findViewById(R.id.results1);
        l2 = findViewById(R.id.results2);
        l3 = findViewById(R.id.results3);
        rippleBackground = findViewById(R.id.content);
        rippleBackground.startRippleAnimation();

        /*animation = AnimationUtils.loadAnimation(this,R.anim.bganim);
        l1.setVisibility(View.GONE);
        l2.setVisibility(View.GONE);
        l3.setVisibility(View.GONE);

        l1.startAnimation(animation);
        l2.startAnimation(animation);
        l3.startAnimation(animation);*/
    }
}
