package techkids.vn.pianotiles;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ImageView iv_w1, iv_w2, iv_w3, iv_w4, iv_w5, iv_w6, iv_w7, iv_b1, iv_b2, iv_b3, iv_b4, iv_b5;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        iv_w1 = (ImageView) findViewById(R.id.iv_w1);
        iv_w2 = (ImageView) findViewById(R.id.iv_w2);
        iv_w3 = (ImageView) findViewById(R.id.iv_w3);
        iv_w4 = (ImageView) findViewById(R.id.iv_w4);
        iv_w5 = (ImageView) findViewById(R.id.iv_w5);
        iv_w6 = (ImageView) findViewById(R.id.iv_w6);
        iv_w7 = (ImageView) findViewById(R.id.iv_w7);
        iv_b1 = (ImageView) findViewById(R.id.iv_b1);
        iv_b2 = (ImageView) findViewById(R.id.iv_b2);
        iv_b3 = (ImageView) findViewById(R.id.iv_b3);
        iv_b4 = (ImageView) findViewById(R.id.iv_b4);
        iv_b5 = (ImageView) findViewById(R.id.iv_b5);

        this.hideStatusBar();
        this.taptap();
    }

    private void taptap() {
        iv_w1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_w1.setImageResource(R.drawable.pressed_white_key);
                        Log.d(TAG, "onTouch: do");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_w1.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });

        iv_w2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_w2.setImageResource(R.drawable.pressed_white_key);
                        Log.d(TAG, "onTouch: re");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_w2.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });

        iv_w3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_w3.setImageResource(R.drawable.pressed_white_key);
                        Log.d(TAG, "onTouch: mi");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_w3.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });

        iv_w4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_w4.setImageResource(R.drawable.pressed_white_key);
                        Log.d(TAG, "onTouch: fa");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_w4.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });

        iv_w5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_w5.setImageResource(R.drawable.pressed_white_key);
                        Log.d(TAG, "onTouch: son");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_w5.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });

        iv_w6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_w6.setImageResource(R.drawable.pressed_white_key);
                        Log.d(TAG, "onTouch: la");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_w6.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });

        iv_w7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_w7.setImageResource(R.drawable.pressed_white_key);
                        Log.d(TAG, "onTouch: si");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_w7.setImageResource(R.drawable.default_white_key);
                        return true;
                }
                return false;
            }
        });

        iv_b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_b1.setImageResource(R.drawable.pressed_black_key);
                        Log.d(TAG, "onTouch: #1");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_b1.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });

        iv_b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_b2.setImageResource(R.drawable.pressed_black_key);
                        Log.d(TAG, "onTouch: #2");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_b2.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });

        iv_b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_b3.setImageResource(R.drawable.pressed_black_key);
                        Log.d(TAG, "onTouch: #3");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_b3.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });

        iv_b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_b4.setImageResource(R.drawable.pressed_black_key);
                        Log.d(TAG, "onTouch: #4");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_b4.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });

        iv_b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iv_b5.setImageResource(R.drawable.pressed_black_key);
                        Log.d(TAG, "onTouch: #5");
                        return true;
                    case MotionEvent.ACTION_UP:
                        iv_b5.setImageResource(R.drawable.default_black_key);
                        return true;
                }
                return false;
            }
        });
    }

    private void hideStatusBar() {
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }
}
