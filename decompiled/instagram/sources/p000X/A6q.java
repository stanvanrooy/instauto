package p000X;

import android.net.Uri;
import android.view.SurfaceView;

/* renamed from: X.A6q */
public abstract class A6q extends SurfaceView {
    public int A00;
    public Uri A01;
    public C29664D3x A02;
    public String A03;
    public float A04;

    public abstract void A00();

    public abstract void A01();

    public abstract void A02();

    public abstract void A03();

    public abstract void A04(double d);

    public void setVideoUri(String str) {
        this.A01 = Uri.parse(str);
    }

    public A6q(A3N a3n) {
        super(a3n);
    }

    public void setBufferSegmentNum(int i) {
        this.A00 = i;
    }

    public void setResizeMode(String str) {
        this.A03 = str;
    }

    public void setStateChangedListener(C29664D3x d3x) {
        this.A02 = d3x;
    }

    public void setVolume(float f) {
        this.A04 = f;
    }
}
