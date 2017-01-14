package com.example.student.db011401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb, pb2;
    SeekBar sb;
    TextView tv2, tv3, tv4, tv5;
    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = (ProgressBar) findViewById(R.id.progressBar);
        pb2 = (ProgressBar) findViewById(R.id.progressBar2);
        sb = (SeekBar) findViewById(R.id.seekBar);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        rb = (RatingBar) findViewById(R.id.ratingBar);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv2.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void clickShow(View v)
    {
        pb.setVisibility(View.VISIBLE);
    }

    public void clickHide(View v)
    {
        pb.setVisibility(View.INVISIBLE);
    }
    public void clickAdd(View v)
    {
        pb2.setProgress(pb2.getProgress() + 10);
    }
    public void clickRead(View v)
    {
        tv3.setText(String.valueOf(sb.getProgress()));
        tv4.setText(String.valueOf(rb.getProgress()));
        tv5.setText(String.valueOf(rb.getRating()));
    }
}
