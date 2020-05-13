package com.coder.zzq.system.version.sdk.adaptation.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import com.coder.zzq.toolkit.log.EasyLogger;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        ActivityCompat.shouldShowRequestPermissionRationale()
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        EasyLogger.d("on start command!");
        return super.onStartCommand(intent, flags, startId);
    }
}
