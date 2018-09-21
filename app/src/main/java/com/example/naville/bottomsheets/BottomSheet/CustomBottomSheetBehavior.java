package com.example.naville.bottomsheets.BottomSheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CustomBottomSheetBehavior {

    private static BottomSheetBehavior bottomSheetBehavior;

    public CustomBottomSheetBehavior init(View layout){
        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) layout.getLayoutParams();
        params.setBehavior(new BottomSheetBehavior());
        layout.requestLayout();
        bottomSheetBehavior = BottomSheetBehavior.from(layout);
        return this;
    }

    public CustomBottomSheetBehavior setPeekHeight(int height){
        bottomSheetBehavior.setPeekHeight(height * 3);
        return this;
    }

    public CustomBottomSheetBehavior setHideable(boolean hideable){
        bottomSheetBehavior.setHideable(hideable);
        return this;
    }

    public CustomBottomSheetBehavior setActions(BottomSheetBehavior.BottomSheetCallback callback){
        bottomSheetBehavior.setBottomSheetCallback(callback);
        return this;
    }

    public CustomBottomSheetBehavior setState(int state){
        bottomSheetBehavior.setState(state);
        return this;
    }

    public static void changeFragment(AppCompatActivity activity, Fragment fragment, int fragment_conteiner_id){
        if (fragment != null) {
            FragmentManager fragmentManager = activity.getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(fragment_conteiner_id, fragment, "TAG").commit();
        }
    }
}
