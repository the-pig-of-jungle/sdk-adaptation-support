package com.coder.zzq.system.version.sdk.thirdpartylib;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;

import java.io.File;

public class CaptureUtils {
    public static void capture(Context context) {
        Intent capturePicIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File destinationFile = new File(context.getFilesDir(), "my_pic.jpg");
        Uri savePicFileUri = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            savePicFileUri = FileProvider.getUriForFile(context, context.getString(R.string.file_provider_authorities), destinationFile);
        } else {
            savePicFileUri = Uri.fromFile(destinationFile);
        }
        capturePicIntent.putExtra(MediaStore.EXTRA_OUTPUT, savePicFileUri);
        context.startActivity(capturePicIntent);
    }
}
