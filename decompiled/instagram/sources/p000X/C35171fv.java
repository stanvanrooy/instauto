package p000X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.1fv  reason: invalid class name and case insensitive filesystem */
public final class C35171fv extends AnonymousClass0O9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass1IY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35171fv(AnonymousClass1IY r5, Context context) {
        super(58, 4, true, false);
        this.A01 = r5;
        this.A00 = context;
    }

    public final void run() {
        AnonymousClass1IY r4 = this.A01;
        Context context = this.A00;
        int i = 0;
        boolean z = false;
        while (true) {
            String[] strArr = r4.A06;
            if (i < strArr.length) {
                if (new File(strArr[i]).canRead()) {
                    r4.A05[i].startWatching();
                    z = true;
                }
                i++;
            } else {
                boolean A07 = C35251g3.A07(context, "android.permission.READ_EXTERNAL_STORAGE");
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_android_story_screenshot_directory", r4);
                A002.A0A("screenshot_directory_exists", Boolean.valueOf(z));
                A002.A0G("phone_model", Build.MODEL);
                A002.A0A("has_read_external_storage_permission", Boolean.valueOf(A07));
                AnonymousClass0WN.A01(r4.A03).BcG(A002);
                synchronized (this.A01) {
                    this.A01.A00 = null;
                }
                return;
            }
        }
    }
}
