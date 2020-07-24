package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: X.B6T */
public final /* synthetic */ class B6T implements Callable {
    public final B6U A00;

    public B6T(B6U b6u) {
        this.A00 = b6u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        p000X.B6U.A00(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        p000X.B6U.A00(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        throw r0;
     */
    public final Object call() {
        B6U b6u = this.A00;
        String.valueOf(b6u.A01);
        try {
            InputStream A002 = AnonymousClass0ZO.A00(b6u.A01.openConnection(), -1305589951);
            C29360CwT cwT = new C29360CwT(A002);
            b6u.A02 = A002;
            Bitmap decodeStream = BitmapFactory.decodeStream(cwT);
            if (decodeStream != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String.valueOf(b6u.A01);
                }
                B6U.A00((Throwable) null, cwT);
                B6U.A00((Throwable) null, A002);
                return decodeStream;
            }
            String valueOf = String.valueOf(b6u.A01);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Failed to decode image: ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            Log.w("FirebaseMessaging", sb2);
            throw new IOException(sb2);
        } catch (IOException e) {
            String valueOf2 = String.valueOf(b6u.A01);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 26);
            sb3.append("Failed to download image: ");
            sb3.append(valueOf2);
            Log.w("FirebaseMessaging", sb3.toString());
            throw e;
        }
    }
}
