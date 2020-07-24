package p000X;

import android.content.Context;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.AOD */
public final class AOD {
    public AnonymousClass7QQ A00;
    public String A01;
    public final C87023q3 A02;
    public final C23300zv A03;
    public final C11200ea A04 = new AP9(this);
    public final C11200ea A05 = new APA(this);
    public final C11200ea A06 = new API(this);
    public final AnonymousClass0C1 A07;
    public final boolean A08;

    public AOD(Context context, AnonymousClass0C1 r6, String str, AnonymousClass7QQ r8) {
        this.A07 = r6;
        this.A02 = new C87023q3(context, r6, "instagram_live");
        boolean A012 = AnonymousClass3TG.A01(context);
        this.A08 = A012;
        this.A00 = r8;
        if (A012) {
            if (str != null) {
                C87023q3 r3 = this.A02;
                CameraAREffect A022 = r3.A02(str);
                if (A022 != null) {
                    r3.A0E(A022, "user_action", (String) null, (String) null);
                } else {
                    AnonymousClass0QD.A01("CameraEffectFacade", AnonymousClass000.A0E("Attempting to set unknown effect: ", str));
                }
            }
            this.A01 = str;
            C23300zv A002 = C23300zv.A00(r6);
            A002.A02(C85303n8.class, this.A04);
            A002.A02(C84123l9.class, this.A05);
            A002.A02(C84283lP.class, this.A06);
            this.A03 = A002;
        }
    }
}
