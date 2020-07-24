package com.facebook.react.modules.camera;

import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p000X.A44;
import p000X.C206598tk;

@ReactModule(name = "ImageStoreManager")
public class ImageStoreManager extends NativeImageStoreSpec {
    public static final int BUFFER_SIZE = 8192;
    public static final String NAME = "ImageStoreManager";

    public void addImageFromBase64(String str, Callback callback, Callback callback2) {
    }

    public String getName() {
        return NAME;
    }

    public void hasImageForTag(String str, Callback callback) {
    }

    public void removeImageForTag(String str) {
    }

    public String convertInputStreamToBase64OutputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            } finally {
                try {
                    base64OutputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        return byteArrayOutputStream.toString();
    }

    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        new C206598tk(this, getReactApplicationContext(), str, callback, callback2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageStoreManager(A44 a44) {
        super(a44);
    }

    public static /* synthetic */ void access$200(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
