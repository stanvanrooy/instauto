package p000X;

import android.os.Handler;
import android.os.MessageQueue;

/* renamed from: X.1Ik  reason: invalid class name and case insensitive filesystem */
public final class C27581Ik extends C27591Il implements AnonymousClass18C, C27601Im, C27611In {
    public static final C12610h5 A0D = C12610h5.A00("feed_story_failed");
    public static final C12610h5 A0E = C12610h5.A00("feed_failed");
    public static final C12610h5 A0F = C12610h5.A00("media_loading_failed");
    public static final C12610h5 A0G = C12610h5.A00("media_timeout");
    public static final C12610h5 A0H = C12610h5.A00("story_failed");
    public static final C12610h5 A0I = C12610h5.A00("unknown");
    public Integer A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final C12600h4 A06;
    public final Runnable A07 = new C27621Io(this);
    public final MessageQueue A08;
    public final C11200ea A09 = new C27631Ip(this);
    public final C27321Hj A0A;
    public final String A0B;
    public volatile boolean A0C;

    public final synchronized void A0E(boolean z) {
        if (z) {
            A0A("FEED_REQUEST_SUCCEEDED");
            if (this.A02 || !this.A0C) {
                this.A00 = Constants.A0Y;
            } else {
                AnonymousClass0ZA.A09(this.A05, this.A07, 300000, -2095859087);
                this.A00 = Constants.ONE;
            }
            A0A("NETWORK_FEED_UI_RENDER_START");
            this.A08.addIdleHandler(new C37521jn(this));
        } else {
            A0A("FEED_REQUEST_FAILED");
            this.A00 = Constants.A0C;
            A00(this);
        }
    }

    public final synchronized void AtI(AnonymousClass1GK r3, C36591iI r4) {
        AnonymousClass0ZA.A08(this.A05, this.A07);
        Integer num = this.A00;
        if (num == Constants.ONE) {
            this.A00 = Constants.A0Y;
        } else if (num == Constants.A12) {
            this.A00 = Constants.A14;
        } else {
            this.A02 = true;
        }
        A0A("FIRST_MEDIA_LOAD_END");
        A00(this);
    }

    public final synchronized void B70(AnonymousClass1GK r3) {
        AnonymousClass0ZA.A08(this.A05, this.A07);
        this.A00 = Constants.A0j;
        A0A("FIRST_MEDIA_LOAD_FAILED");
        A00(this);
    }

    public final void B72(AnonymousClass1GK r1, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r4 == p000X.Constants.A0N) goto L_0x0018;
     */
    public static void A00(C27581Ik r6) {
        boolean z;
        Integer num;
        C12610h5 r1;
        Integer num2 = r6.A00;
        Integer num3 = Constants.A0C;
        boolean z2 = false;
        if (!(num2 == num3 || num2 == Constants.A14 || num2 == Constants.A0j || num2 == Constants.A0u)) {
            z = false;
        }
        z = true;
        Integer num4 = r6.A01;
        if (!(num4 == Constants.ZERO || num4 == Constants.ONE)) {
            z2 = true;
        }
        if (z && z2) {
            if ((num2 == Constants.A14 && num4 == Constants.A12) || (num2 == (num = Constants.A0N) && num4 == num)) {
                r1 = C12610h5.A02;
            } else if (num2 == Constants.A0j) {
                r1 = A0F;
            } else if (num2 != num3 && num4 == num3) {
                r1 = A0H;
            } else if (num2 == Constants.A0u) {
                r1 = A0G;
            } else if (num2 == num3 && num4 != num3) {
                r1 = A0E;
            } else if (num2 == num3 && num4 == num3) {
                r1 = A0D;
            } else {
                r1 = A0I;
            }
            r6.A06.A04(r1);
        }
    }

    public final void A0A(String str) {
        this.A06.A07(this, str);
    }

    public final void A0B(String str, String str2) {
        C12600h4 r2 = this.A06;
        AnonymousClass0h8 r1 = r2.A00;
        if (r1 != null && r1.A02 == this) {
            if (r1.A05) {
                r2.A04.markerPoint(25100289, str, str2);
            }
            r2.A04.markerPoint(15335435, str, str2);
        }
    }

    public final void A0C(String str, String str2, long j) {
        C12600h4 r2 = this.A06;
        AnonymousClass0h8 r1 = r2.A00;
        if (r1 != null && r1.A02 == this) {
            String str3 = str;
            if (r1.A05) {
                r2.A04.markerPoint(25100289, str);
            }
            r2.A04.markerPoint(15335435, str3, str2, j);
        }
    }

    public final void A0D(boolean z) {
        if (z) {
            this.A01 = Constants.ONE;
            A0A("STORIES_REQUEST_SUCCEEDED");
            A0A("NETWORK_STORIES_TRAY_UI_RENDER_START");
            this.A08.addIdleHandler(new C40981pZ(this));
            return;
        }
        this.A01 = Constants.A0C;
        A0A("STORIES_REQUEST_FAILED");
        A00(this);
    }

    public final String AKA() {
        return this.A0B;
    }

    public final void AsP() {
        C11130eT.A01.A02(AnonymousClass1FF.class, this.A09);
        this.A0A.A0B(this);
    }

    public final void Azk() {
        C11130eT.A01.A03(AnonymousClass1FF.class, this.A09);
        this.A0A.A0C(this);
    }

    public final void BYa(float f) {
        if (f >= 1.0f && !this.A03) {
            A0A("FEED_PULL_TO_REFRESH");
            this.A03 = true;
        }
    }

    public C27581Ik(C12600h4 r2, String str, C27321Hj r4, MessageQueue messageQueue) {
        Integer num = Constants.ZERO;
        this.A00 = num;
        this.A01 = num;
        this.A06 = r2;
        this.A0B = str;
        this.A05 = new Handler();
        this.A0A = r4;
        this.A08 = messageQueue;
    }

    public final void A09(C255119b r3, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0Z0.A03(374267543);
        if (i > 0) {
            A0A("FEED_SCROLL_DOWN");
            this.A0A.A0C(this);
        }
        AnonymousClass0Z0.A0A(-84411351, A032);
    }
}
