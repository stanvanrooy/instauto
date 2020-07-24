package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import com.facebook.analytics2.logger.HighPriUploadRetryReceiver;

/* renamed from: X.05n  reason: invalid class name and case insensitive filesystem */
public final class C031205n extends Thread {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ HighPriUploadRetryReceiver A03;

    public C031205n(HighPriUploadRetryReceiver highPriUploadRetryReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.A03 = highPriUploadRetryReceiver;
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
    }

    public final void run() {
        try {
            C033806t A002 = C033806t.A00(this.A02.getExtras(), this.A01);
            C034006v.A02(C034006v.A00(this.A01), "com.facebook.analytics2.logger.UPLOAD_NOW", new C033806t((Messenger) null, (Bundle) null, "com.facebook.analytics2.logger.UPLOAD_NOW", A002.A06, A002.A02, new C033506q(0, 0, "com.facebook.analytics2.logger.UPLOAD_NOW"), this.A01), (C033906u) null, (String) null, (C032406e) null);
            this.A00.finish();
        } catch (C031305p e) {
            AnonymousClass0DB.A0I("HighPriUploadRetryReceiver", "Exception when scheduling high pri upload via alarm", e);
        }
    }
}
