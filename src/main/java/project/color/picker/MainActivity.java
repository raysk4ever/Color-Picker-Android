package project.color.picker;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mRed, mBlue, mGreen, mResultTv;
    LinearLayout mResult;
    Button mRedP, mRedM, mGreenP, mGreenM, mBlueP, mBlueM;

    int red = 0, green = 0, blue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRedP = findViewById(R.id.mRedP);
        mRedM = findViewById(R.id.mRedM);

        mBlueP = findViewById(R.id.mBlueP);
        mBlueM = findViewById(R.id.mBlueM);

        mGreenP = findViewById(R.id.mGreenP);
        mGreenM = findViewById(R.id.mGreenM);

        mRed = findViewById(R.id.mRed);
        mBlue = findViewById(R.id.mBlue);
        mGreen = findViewById(R.id.mGreen);

        mResultTv = findViewById(R.id.mResultTv);

        mRedP.setOnClickListener(this);
        mRedM.setOnClickListener(this);
        mGreenP.setOnClickListener(this);
        mGreenM.setOnClickListener(this);
        mBlueP.setOnClickListener(this);
        mBlueM.setOnClickListener(this);


        mResult = findViewById(R.id.mResult);
        mResult.setBackgroundColor(Color.rgb(red, green ,blue));

        mResultTv.setText("rgb(" + red + ", " + green + ", " + blue + ")");
        mResultTv.setTextColor(Color.rgb(255, 255, 255));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mRedP:
                if (red == 255)
                    red = 0;
                else
                    red++;
                break;
            case R.id.mRedM:
                if (red == 0)
                    red = 255;
                else
                    red--;
                break;
            case R.id.mGreenP:
                if (green == 255)
                    green = 0;
                else
                    green++;
                break;
            case R.id.mGreenM:
                if (green == 0)
                    green = 255;
                else
                    green--;
                break;
            case R.id.mBlueP:
                if (blue == 255)
                    blue = 0;
                else
                    blue++;
                break;
            case R.id.mBlueM:
                if (blue == 0)
                    blue = 255;
                else
                    blue--;
                break;
        }
        mResult.setBackgroundColor(Color.rgb(red, green, blue));
        mResultTv.setText("rgb(" + red + ", " + green + ", " + blue + ")");
        mRed.setText(String.valueOf(red));
        mGreen.setText(String.valueOf(green));
        mBlue.setText(String.valueOf(blue));
        mResultTv.setTextColor(Color.rgb(  255-red,255-green,255-blue));

    }
}
