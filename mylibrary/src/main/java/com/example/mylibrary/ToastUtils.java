package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    public static  void toastString(Context context){
        Toast.makeText(context,"我是来自jitpack",Toast.LENGTH_SHORT).show();
    }


}
