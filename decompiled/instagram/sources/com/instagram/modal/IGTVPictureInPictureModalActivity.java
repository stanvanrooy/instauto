package com.instagram.modal;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.C0003R;
import java.util.ArrayDeque;
import java.util.Deque;
import p000X.Constants;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass713;
import p000X.AnonymousClass71W;
import p000X.AnonymousClass72M;
import p000X.AnonymousClass72P;
import p000X.AnonymousClass72S;
import p000X.C06500Ph;
import p000X.C11130eT;
import p000X.C162256wC;
import p000X.C162516wc;
import p000X.C62622o3;

public class IGTVPictureInPictureModalActivity extends ModalActivity implements C62622o3, C162516wc {
    public Handler A00;
    public AnonymousClass72M A01;
    public Deque A02;

    public final boolean A0a() {
        return !this.A01.A04();
    }

    public final void A3w(C162256wC r2) {
        this.A02.add(r2);
    }

    public final C162256wC ARz() {
        return (C162256wC) this.A02.peekLast();
    }

    public final void BbN(C162256wC r2) {
        this.A02.remove(r2);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        Integer num;
        AnonymousClass72M r3 = this.A01;
        if (r3.A02) {
            if (z) {
                num = Constants.A0C;
            } else {
                num = Constants.ZERO;
            }
            r3.A01 = num;
            if (!z) {
                AnonymousClass72M.A02(r3, false);
            }
            for (AnonymousClass71W onPictureInPictureModeChanged : r3.A07) {
                onPictureInPictureModeChanged.onPictureInPictureModeChanged(z);
            }
            if (r3.A03 && !z) {
                r3.A04.finish();
                r3.A03 = false;
            }
        }
        super.onPictureInPictureModeChanged(z);
    }

    public final AnonymousClass72M ARy() {
        return this.A01;
    }

    public final void finish() {
        finishAndRemoveTask();
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.orientation = 1;
        C06500Ph.A01(this, configuration);
        int[] A0b = A0b();
        if (A0b != null) {
            overridePendingTransition(A0b[2], A0b[3]);
        }
        AnonymousClass72M r1 = this.A01;
        if (r1 != null && !r1.A04() && !r1.A03) {
            AnonymousClass0ZA.A09(this.A00, new AnonymousClass72P(this, (ActivityManager) getSystemService("activity")), (long) getResources().getInteger(C0003R.integer.config_bottomInOutTransitionDur), 1443958489);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1637235447);
        this.A00 = new Handler();
        this.A02 = new ArrayDeque();
        AnonymousClass72M r3 = new AnonymousClass72M(this);
        this.A01 = r3;
        AnonymousClass713 A003 = AnonymousClass713.A00();
        if (A003.A00 != null) {
            AnonymousClass0QD.A02("PictureInPictureManager", "PictureInPictureController has already been registered");
        }
        A003.A00 = r3;
        r3.A07.add(A003);
        super.onCreate(bundle);
        AnonymousClass0Z0.A07(-1237580096, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-631911519);
        super.onDestroy();
        AnonymousClass713 A003 = AnonymousClass713.A00();
        if (A003.A00 != this.A01) {
            AnonymousClass0QD.A02("PictureInPictureManager", "Unregistering a PictureInPictureController that does not match the currently registered PictureInPictureController");
        }
        AnonymousClass72M r0 = A003.A00;
        if (r0 != null) {
            r0.A07.remove(A003);
            A003.A00 = null;
        }
        AnonymousClass72M r3 = this.A01;
        C11130eT.A01.A03(AnonymousClass72S.class, r3.A05);
        r3.A07.clear();
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        AnonymousClass0Z0.A07(-1513502757, A002);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A01.A01 = Constants.ZERO;
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.orientation = 1;
        C06500Ph.A01(this, configuration);
        A0Z(intent);
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        AnonymousClass72M r1 = this.A01;
        if (r1.A02) {
            for (AnonymousClass71W BU6 : r1.A07) {
                BU6.BU6();
            }
        }
    }
}
