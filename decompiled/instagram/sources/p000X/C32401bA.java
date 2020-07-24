package p000X;

import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.feed.p005ui.text.BulletAwareTextView;
import com.instagram.feed.p005ui.text.IgLikeTextView;
import com.instagram.p009ui.mediaactions.MediaActionsView;

/* renamed from: X.1bA  reason: invalid class name and case insensitive filesystem */
public final class C32401bA implements AnonymousClass1RO {
    public ImageView A00;
    public C36841ih A01;
    public AnonymousClass0C1 A02;
    public Handler A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewStub A07;
    public ViewStub A08;
    public ViewStub A09;
    public ViewStub A0A;
    public TextView A0B;
    public C26571Ea A0C;
    public C26571Ea A0D;
    public AnonymousClass1NJ A0E;
    public BulletAwareTextView A0F;
    public BulletAwareTextView A0G;
    public IgLikeTextView A0H;
    public MediaActionsView A0I;
    public final C29181Ox A0J;
    public final AnonymousClass78M A0K;

    public final ImageView A00() {
        if (this.A00 == null) {
            this.A00 = (ImageView) this.A09.inflate();
        }
        return this.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final void BB7(C36841ih r6, int i) {
        CharSequence A042;
        AnonymousClass78M r1;
        if (i == 12) {
            this.A0J.A09(this.A0E);
            IgLikeTextView igLikeTextView = this.A0H;
            AnonymousClass1NJ r3 = this.A0E;
            AnonymousClass0C1 r2 = this.A02;
            C29181Ox r12 = this.A0J;
            if (C36451i4.A06(r3, r2)) {
                A042 = r12.A05(r3);
            } else if (C36451i4.A05(r3, r2)) {
                A042 = r12.A04(r3);
            } else {
                igLikeTextView.setVisibility(8);
                r1 = this.A0K;
                if (r1 == null) {
                    r1.A02(this.A0E);
                    C37191jG.A04(this.A0H, this.A0E, this.A02, this.A0K);
                    return;
                }
                return;
            }
            C37191jG.A05(r2, igLikeTextView, A042, r3);
            r1 = this.A0K;
            if (r1 == null) {
            }
        }
    }

    public C32401bA(C29181Ox r1, AnonymousClass78M r2, AnonymousClass0C1 r3) {
        this.A0J = r1;
        this.A0K = r2;
        this.A02 = r3;
    }
}
