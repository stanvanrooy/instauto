package p000X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.1yk  reason: invalid class name and case insensitive filesystem */
public final class C45891yk {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public final int A00(float f) {
        int i = this.A03;
        int i2 = (int) (((f - this.A01) / this.A00) * ((float) i));
        if (i2 < 0) {
            return Math.max(0, this.A02 + i2);
        }
        return Math.min(i, this.A02 + i2);
    }

    public C45891yk(View view) {
        Resources resources = view.getResources();
        this.A06 = resources.getDimensionPixelSize(C0003R.dimen.video_scrubber_touch_margin);
        this.A05 = resources.getDimensionPixelSize(C0003R.dimen.video_scrubber_min_scrub_range);
        this.A04 = resources.getDimensionPixelSize(C0003R.dimen.video_scrubber_max_scrub_range);
        this.A07 = view.getWidth();
    }
}
