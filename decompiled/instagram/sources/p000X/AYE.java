package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYE */
public final class AYE extends C17920r1 {
    public final /* synthetic */ C60892kk A00;
    public final /* synthetic */ C23844AcF A01;

    public AYE(C60892kk r1, C23844AcF acF) {
        this.A00 = r1;
        this.A01 = acF;
    }

    public final void onFail(C43791v5 r7) {
        int A03 = AnonymousClass0Z0.A03(96290820);
        C23844AcF acF = this.A01;
        DLog.m41e(DLogTag.LIVE, C06360Ot.formatString("confirm failed: %s", acF), new Object[0]);
        AnonymousClass0Z0.A0A(-1280216297, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-480596760);
        int A032 = AnonymousClass0Z0.A03(-1285545807);
        C23844AcF acF = this.A01;
        DLog.m40d(DLogTag.LIVE, C06360Ot.formatString("confirmed: %s", acF), new Object[0]);
        AnonymousClass0Z0.A0A(-1839362953, A032);
        AnonymousClass0Z0.A0A(-445630654, A03);
    }
}
