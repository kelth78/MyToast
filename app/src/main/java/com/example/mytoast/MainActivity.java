package com.example.mytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Log.d(TAG, "showToast");
        // Text to show
        Toast t = Toast.makeText(this, "Show something...", Toast.LENGTH_SHORT);
        // Toast position (optional)
        //t.setGravity(Gravity.TOP|Gravity.LEFT, 0 /*x offset*/, 0 /*y offset*/);
        t.show();
    }

    public void showCustomToast(View view) {
        Log.d(TAG, "showCustomToast");
        LayoutInflater inflater = getLayoutInflater();
        // Inflat layout from xml
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup)findViewById(R.id.custom_toast_container));
        // Set text in custom view
        TextView textView = (TextView)layout.findViewById(R.id.custom_toast_text);
        textView.setText("custom text");

        Toast t = new Toast(this);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.setView(layout);
        t.show();
    }
}
