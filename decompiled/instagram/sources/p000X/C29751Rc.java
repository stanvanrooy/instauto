package p000X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.1Rc  reason: invalid class name and case insensitive filesystem */
public final class C29751Rc {
    public static final C29751Rc A04;
    public static final C29751Rc A05;
    public static final C29751Rc A06;
    public static final C29751Rc A07;
    public static final C29751Rc A08;
    public static final C29751Rc A09 = new C29751Rc(0, 0, C29761Rd.SLIDE_IN, false);
    public static final C29751Rc A0A;
    public static final C29751Rc A0B;
    public final int A00;
    public final int A01;
    public final C29761Rd A02;
    public final boolean A03;

    static {
        C29761Rd r4 = C29761Rd.SLIDE_OUT;
        A0B = new C29751Rc(5000, CameraEnumerationAndroid.C01581.MIN_FPS_THRESHOLD, r4, false);
        A08 = new C29751Rc(5000, 5000, r4, false);
        A0A = new C29751Rc(0, 3000, r4, false);
        A05 = new C29751Rc(-1, -1, r4, false);
        A06 = new C29751Rc(3000, -1, r4, false);
        A04 = new C29751Rc(0, -1, r4, false);
        A07 = new C29751Rc(0, 0, r4, true);
    }

    public C29751Rc(int i, int i2, C29761Rd r3, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r3;
        this.A03 = z;
    }
}
