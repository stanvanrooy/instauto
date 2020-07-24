package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CH0 */
public final class CH0 implements C24154Aj4, APU {
    public CH4 A00;
    public AnonymousClass7PB A01;
    public final AnonymousClass0C1 A02;
    public final C25012Ay4 A03;
    public final C27534CGy A04;
    public final Context A05;

    public final boolean AhC() {
        return false;
    }

    public final void Bdu() {
    }

    public final void BrX(boolean z, AWN awn) {
    }

    public final void pause() {
    }

    public final boolean AeC() {
        return this.A00.A02;
    }

    public final void BgH(String str) {
        this.A03.A00.A03 = str;
    }

    public final void Bo4(ImageUrl imageUrl, String str) {
        CH4 ch4 = new CH4(true, this.A00.A03, imageUrl, this.A05.getString(C0003R.string.interactivity_ama_viewer_question_submission_sheet_info, new Object[]{str}));
        this.A00 = ch4;
        this.A04.A00(ch4);
    }

    public final void Bql() {
        C25012Ay4 ay4 = this.A03;
        ay4.A00.A01(new C168657Ie(this));
    }

    public final void destroy() {
        CH4 ch4 = this.A00;
        CH4 ch42 = new CH4(false, ch4.A03, ch4.A00, ch4.A01);
        this.A00 = ch42;
        this.A04.A00(ch42);
        this.A03.A00.A00();
    }

    public CH0(AnonymousClass0C1 r2, Context context, C27534CGy cGy, C25012Ay4 ay4, CH4 ch4) {
        this.A02 = r2;
        this.A05 = context.getApplicationContext();
        this.A04 = cGy;
        this.A03 = ay4;
        this.A00 = ch4;
        cGy.A00 = new C27535CGz(this);
    }

    public final void Bfv(AnonymousClass7PB r1) {
        this.A01 = r1;
    }
}
