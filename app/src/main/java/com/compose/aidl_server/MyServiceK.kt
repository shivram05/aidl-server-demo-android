package com.compose.aidl_server

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyServiceK : Service() {

    private val impl = MyImpl()

    override fun onBind(intent: Intent?): IBinder {
        return impl
    }


    class MyImpl : IComman.Stub() {
        override fun calculate(nu: Int, num2: Int): Int {
            return nu * num2
        }
    }
}