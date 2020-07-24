package p000X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.AV5 */
public final class AV5 implements Runnable {
    public final /* synthetic */ AV3 A00;

    public AV5(AV3 av3) {
        this.A00 = av3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    public final void run() {
        C23627AUp aUp;
        BrowserLiteCallback browserLiteCallback;
        Intent intent;
        Uri uri;
        FileOutputStream fileOutputStream;
        Activity activity = this.A00.getActivity();
        File file = new File(activity.getFilesDir(), "browser_lite");
        try {
            AX7.A00(file);
        } catch (AX6 unused) {
            ATK.A03("unable to create directory ", file.getAbsolutePath());
            file = null;
        }
        File file2 = null;
        if (file != null) {
            File file3 = new File(file, "bugreport");
            try {
                AX7.A00(file3);
                file2 = file3;
            } catch (AX6 unused2) {
                ATK.A03("unable to create directory: %s", file3.getAbsolutePath());
            }
        }
        HashMap hashMap = null;
        if (file2 != null) {
            HashMap hashMap2 = new HashMap();
            boolean z = activity instanceof Activity;
            if (z) {
                Activity activity2 = activity;
                if (activity.getParent() != null) {
                    activity2 = activity.getParent();
                }
                View decorView = activity2.getWindow().getDecorView();
                Bitmap bitmap = null;
                try {
                    bitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
                    decorView.draw(new Canvas(bitmap));
                } catch (Exception e) {
                    ATK.A03("exception while taking screenshot: %s", e.getMessage());
                }
                if (bitmap != null) {
                    File file4 = new File(file2, "screenshot.png");
                    if (file4.exists()) {
                        file4.delete();
                    }
                    try {
                        fileOutputStream = new FileOutputStream(file4);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            uri = Uri.fromFile(file4);
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        } catch (IOException unused4) {
                            try {
                                ATK.A03("unable to write screenshot to %s", file4.getAbsolutePath());
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused5) {
                                }
                                uri = null;
                                hashMap2.put("screenshot_uri", uri);
                                hashMap2.put("raw_view_description_file_uri", (Object) null);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("intent_extras", intent.getExtras().toString());
                                hashMap2.put("debug_info_map", hashMap3);
                                hashMap = hashMap2;
                                try {
                                    browserLiteCallback.BGx(hashMap);
                                } catch (RemoteException unused6) {
                                }
                                aUp = this.A00.A00;
                                if (aUp != null || aUp.getDialog() != null) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused7) {
                                }
                                throw th;
                            }
                        }
                    } catch (IOException unused8) {
                        fileOutputStream = null;
                        ATK.A03("unable to write screenshot to %s", file4.getAbsolutePath());
                        fileOutputStream.close();
                        uri = null;
                        hashMap2.put("screenshot_uri", uri);
                        hashMap2.put("raw_view_description_file_uri", (Object) null);
                        HashMap hashMap32 = new HashMap();
                        hashMap32.put("intent_extras", intent.getExtras().toString());
                        hashMap2.put("debug_info_map", hashMap32);
                        hashMap = hashMap2;
                        browserLiteCallback.BGx(hashMap);
                        aUp = this.A00.A00;
                        if (aUp != null || aUp.getDialog() != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        fileOutputStream.close();
                        throw th;
                    }
                    hashMap2.put("screenshot_uri", uri);
                }
            }
            hashMap2.put("raw_view_description_file_uri", (Object) null);
            HashMap hashMap322 = new HashMap();
            if (!(!z || (intent = activity.getIntent()) == null || intent.getExtras() == null)) {
                hashMap322.put("intent_extras", intent.getExtras().toString());
            }
            hashMap2.put("debug_info_map", hashMap322);
            hashMap = hashMap2;
        }
        if (!(hashMap == null || (browserLiteCallback = ATL.A00().A06) == null)) {
            browserLiteCallback.BGx(hashMap);
        }
        aUp = this.A00.A00;
        if (aUp != null && aUp.getDialog() != null) {
            this.A00.A00.getDialog().dismiss();
        }
    }
}
