package com.instagram.process.secondary;

import android.content.Context;
import com.facebook.breakpad.BreakpadManager;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0QQ;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0ZA;
import p000X.BWG;
import p000X.C248116c;

public final class InstagramApplicationForSecondaryProcess extends AnonymousClass0QQ {
    public final Class TAG = InstagramApplicationForSecondaryProcess.class;
    public final Context mContext;

    public File getCacheDir(File file) {
        if (C248116c.A00) {
            File file2 = new File(file, "browser_proc");
            if (file2.isDirectory() || file2.mkdirs()) {
                return file2;
            }
        }
        return file;
    }

    public String getDir(String str, int i) {
        if (!C248116c.A00 || !"webview".equals(str)) {
            return str;
        }
        return "browser_proc_webview";
    }

    public InstagramApplicationForSecondaryProcess(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void onCreate(String str, long j, long j2, long j3, long j4) {
        super.onCreate(str, j, j2, j3, j4);
        if (str == null || str.isEmpty()) {
            throw new IllegalStateException("Can't find current process's name");
        }
        AnonymousClass0DB.A00(6);
        AnonymousClass0Y1.A05(this.mContext);
        try {
            AnonymousClass0Y1.A08("c++_shared");
            BreakpadManager.start(this.mContext, 0);
        } catch (Throwable th) {
            AnonymousClass0DB.A05(this.TAG, "Can't load breakpad", th);
        }
        BWG bwg = BWG.A06;
        Context context = this.mContext;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        bwg.A00 = context;
        bwg.A02 = str;
        AnonymousClass0ZA.A09(bwg.A03, bwg.A04, TimeUnit.MINUTES.toMillis(1), -743080298);
    }
}
