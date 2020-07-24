package p000X;

import com.instagram.model.videocall.VideoCallInfo;

/* renamed from: X.Ad4 */
public final class Ad4 extends C17920r1 {
    public final /* synthetic */ Ad6 A00;

    public Ad4(Ad6 ad6) {
        this.A00 = ad6;
    }

    public final void onFail(C43791v5 r7) {
        Integer num;
        int A03 = AnonymousClass0Z0.A03(-303512516);
        Ad7 ad7 = (Ad7) r7.A00;
        String str = null;
        if (ad7 == null || ad7.A01 == null) {
            if (ad7 != null) {
                num = Integer.valueOf(ad7.mStatusCode);
            } else {
                num = null;
            }
            if (ad7 != null) {
                str = ad7.getErrorMessage();
            }
            this.A00.A03.A01(new C23872Acl(num, str));
        } else {
            Ad6.A00(this.A00, ad7);
            this.A00.A03.A00(new VideoCallInfo(ad7.A01, (String) null));
        }
        AnonymousClass0Z0.A0A(1341945708, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-600210367);
        Ad7 ad7 = (Ad7) obj;
        int A032 = AnonymousClass0Z0.A03(-653725457);
        Ad6.A00(this.A00, ad7);
        this.A00.A03.A00(new VideoCallInfo(ad7.A01, (String) null));
        AnonymousClass0Z0.A0A(1803413627, A032);
        AnonymousClass0Z0.A0A(-1176089323, A03);
    }
}
