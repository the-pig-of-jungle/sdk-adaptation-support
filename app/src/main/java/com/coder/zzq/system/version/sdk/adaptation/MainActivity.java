package com.coder.zzq.system.version.sdk.adaptation;

import android.app.job.JobScheduler;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.coder.zzq.toolkit.Toolkit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            WebView.enableSlowWholeDocumentDraw();
        }
        setContentView(R.layout.activity_main);

        Toolkit.init(getApplication());
        Toolkit.setEnablePrintLog(true);
        String a = Camera.ACTION_NEW_PICTURE;
        String b = Camera.ACTION_NEW_VIDEO;
        JobScheduler


    }

}
