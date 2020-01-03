package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mStory;
    private Button mCh1;
    private Button mCh2;
    private int mIndex = 1;

    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStory = (TextView) findViewById(R.id.storyTextView);
        mCh1 = (Button) findViewById(R.id.buttonTop);
        mCh2 = (Button) findViewById(R.id.buttonBottom);

        mCh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 0) {
                    mCh2.setVisibility(View.VISIBLE);
                    mStory.setText(R.string.T1_Story);
                    mCh1.setText(R.string.T1_Ans1);
                    mCh2.setText(R.string.T1_Ans2);
                    mIndex = 1;
                } else if (mIndex == 1) {
                    mIndex = 3;
                    mStory.setText(R.string.T3_Story);
                    mCh1.setText(R.string.T3_Ans1);
                    mCh2.setText(R.string.T3_Ans2);
                } else if (mIndex == 3) {
                    mCh2.setVisibility(View.GONE);
                    mCh1.setText(R.string.restart);
                    mStory.setText(R.string.T6_End);
                    mIndex = 0;

                } else if (mIndex == 2) {
                    mIndex = 3;
                    mStory.setText(R.string.T3_Story);
                    mCh1.setText(R.string.T3_Ans1);
                    mCh2.setText(R.string.T3_Ans2);
                }

            }
        });

        mCh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 1) {
                    mIndex = 2;
                    mStory.setText(R.string.T2_Story);
                    mCh1.setText(R.string.T2_Ans1);
                    mCh2.setText(R.string.T2_Ans2);
                } else if (mIndex == 2) {
                    mCh2.setVisibility(View.GONE);
                    mCh1.setText(R.string.restart);
                    mStory.setText(R.string.T4_End);
                    mIndex = 0;
                } else if (mIndex == 3) {
                    mCh2.setVisibility(View.GONE);
                    mCh1.setText(R.string.restart);
                    mStory.setText(R.string.T5_End);
                    mIndex = 0;
                }

            }
        });
    }
}
