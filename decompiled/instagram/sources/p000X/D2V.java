package p000X;

import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;

/* renamed from: X.D2V */
public final class D2V {
    public final C25947Bcz A00;
    public final D35 A01;
    public final VideoPlayContextualSetting A02;
    public final C40001nu A03;
    public final boolean A04;
    public final boolean A05;

    public static boolean A00(D2V d2v, boolean z) {
        VideoPlayContextualSetting videoPlayContextualSetting;
        if (!z || (videoPlayContextualSetting = d2v.A02) == null || !videoPlayContextualSetting.A02) {
            return false;
        }
        return true;
    }

    public final int A01() {
        if (this.A05) {
            C40001nu r1 = this.A03;
            if (A00(this, false)) {
                return this.A02.A01.A03;
            }
            return r1.A0N;
        }
        C40001nu r12 = this.A03;
        if (A00(this, r12.A0s)) {
            return this.A02.A01.A00;
        }
        return r12.A0G;
    }

    public final int A02() {
        if (this.A05) {
            C40001nu r1 = this.A03;
            if (A00(this, false)) {
                return this.A02.A01.A02;
            }
            return r1.A0L;
        }
        C40001nu r12 = this.A03;
        if (A00(this, r12.A0s)) {
            return this.A02.A01.A01;
        }
        return r12.A0I;
    }

    public final int A03() {
        if (!this.A05) {
            C40001nu r1 = this.A03;
            if (A00(this, r1.A0s)) {
                return this.A02.A01.A05;
            }
            return r1.A0V;
        } else if (A00(this, false)) {
            return this.A02.A01.A04;
        } else {
            return 85;
        }
    }

    public final int A04() {
        double d;
        if (this.A05) {
            d = (double) 50000;
        } else {
            d = (double) this.A03.A0Y;
        }
        return (int) (d * 1.0d);
    }

    public final int A05() {
        boolean A012;
        boolean A013;
        boolean A014;
        if (this.A01.A06()) {
            return 0;
        }
        if (this.A05) {
            C25947Bcz bcz = this.A00;
            if (bcz == null) {
                A014 = false;
            } else {
                A014 = bcz.A01();
            }
            if (A014) {
                return this.A03.A0T;
            }
            return this.A03.A0S;
        } else if (A00(this, this.A03.A0s)) {
            C25947Bcz bcz2 = this.A00;
            if (bcz2 == null) {
                A013 = false;
            } else {
                A013 = bcz2.A01();
            }
            if (A013) {
                return this.A02.A01.A06;
            }
            return this.A02.A01.A07;
        } else {
            C25947Bcz bcz3 = this.A00;
            if (bcz3 == null) {
                A012 = false;
            } else {
                A012 = bcz3.A01();
            }
            if (A012) {
                return this.A03.A0b;
            }
            return this.A03.A0c;
        }
    }

    public D2V(C40001nu r3, C25947Bcz bcz, VideoPlayContextualSetting videoPlayContextualSetting, D35 d35, boolean z) {
        this.A03 = r3;
        this.A00 = bcz;
        this.A02 = videoPlayContextualSetting;
        this.A01 = d35;
        this.A05 = z;
        String A002 = d35.A00();
        synchronized (this.A01) {
        }
        boolean equalsIgnoreCase = "fb_stories".equalsIgnoreCase(A002);
        this.A04 = "reel_feed_timeline".equalsIgnoreCase(A002);
    }
}
