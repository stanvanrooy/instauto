package com.facebook.soloader;

import android.util.Log;
import java.util.List;
import p000X.AnonymousClass0Y1;

public abstract class NativeLibrary {
    public Boolean A00 = true;
    public List A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile UnsatisfiedLinkError A04 = null;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e A[Catch:{ UnsatisfiedLinkError -> 0x0031, all -> 0x002f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    public final void A00() {
        boolean z;
        synchronized (this.A03) {
            if (!this.A00.booleanValue()) {
                z = this.A02;
            } else {
                try {
                    List<String> list = this.A01;
                    if (list != null) {
                        for (String A08 : list) {
                            AnonymousClass0Y1.A08(A08);
                        }
                    }
                    this.A02 = true;
                    this.A01 = null;
                } catch (UnsatisfiedLinkError e) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (initial check): ", e);
                    this.A04 = e;
                    this.A02 = false;
                    this.A00 = false;
                    z = this.A02;
                    if (!z) {
                    }
                } catch (Throwable th) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (other error): ", th);
                    this.A04 = new UnsatisfiedLinkError("Failed loading libraries");
                    this.A04.initCause(th);
                    this.A02 = false;
                    this.A00 = false;
                    z = this.A02;
                    if (!z) {
                    }
                }
                this.A00 = false;
                z = this.A02;
            }
        }
        if (!z) {
            throw this.A04;
        }
    }

    public NativeLibrary(List list) {
        this.A01 = list;
    }
}
