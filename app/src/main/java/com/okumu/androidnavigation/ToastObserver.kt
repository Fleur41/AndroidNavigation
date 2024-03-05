package com.okumu.androidnavigation

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class ToastObserver(private val context: Context): LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun showToastOnResume(){
        Toast.makeText(context, "Called from Observer", Toast.LENGTH_SHORT).show()
    }
}