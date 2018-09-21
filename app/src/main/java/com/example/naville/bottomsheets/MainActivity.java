package com.example.naville.bottomsheets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.naville.bottomsheets.BottomSheet.CustomBottomSheet;
import com.example.naville.bottomsheets.BottomSheet.CustomBottomSheetBehavior;

import static com.example.naville.bottomsheets.CustomLog.CustomLog.Logd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.hehe)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomBottomSheetBehavior.changeFragment(MainActivity.this, new deletar(), R.id.fragment);
            }
        });

        View bottomSheet = findViewById(R.id.fragment);
        new CustomBottomSheetBehavior().init(bottomSheet).setPeekHeight(32).setActions(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View view, int i) {
                Logd(i + "");
            }

            @Override
            public void onSlide(@NonNull View view, float v) {
//                Logd("e2ae");
            }
        }).setState(3);
    }
}
