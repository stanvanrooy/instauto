package p000X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;

/* renamed from: X.1hp  reason: invalid class name and case insensitive filesystem */
public final class C36301hp extends C256219o {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C51362Kj A01;
    public final /* synthetic */ C49742Dk A02;
    public final /* synthetic */ C51382Kl A03;

    public C36301hp(C51362Kj r1, View view, C51382Kl r3, C49742Dk r4) {
        this.A01 = r1;
        this.A00 = view;
        this.A03 = r3;
        this.A02 = r4;
    }

    public final void A08(C255119b r3, int i) {
        AnonymousClass0Z0.A0A(1362420910, AnonymousClass0Z0.A03(108258823));
    }

    public final void A09(C255119b r8, int i, int i2, int i3, int i4, int i5) {
        float f;
        int A032 = AnonymousClass0Z0.A03(-189066572);
        if (this.A00.getLocalVisibleRect(this.A01.A00)) {
            f = ((float) this.A01.A00.bottom) / ((float) this.A00.getHeight());
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        try {
            C51432Kq r6 = this.A03.A01;
            C49672Dd r5 = this.A02.A00;
            ArrayList arrayList = new ArrayList();
            C51402Kn r2 = new C51402Kn(f);
            if (arrayList.size() == 0) {
                arrayList.add(C51412Ko.A00(r2));
                r6.A00(r5, new C51422Kp(arrayList));
                AnonymousClass0QD.A00().BYg("last_on_scroll_hash", String.valueOf(System.identityHashCode(this.A02.A00)));
                AnonymousClass0Z0.A0A(1012866470, A032);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        } catch (IllegalStateException e) {
            IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass000.A0G(e.getMessage(), " on_scroll hash: ", System.identityHashCode(this.A02.A00)));
            AnonymousClass0Z0.A0A(-1439502354, A032);
            throw illegalStateException;
        }
    }
}
