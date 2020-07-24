package com.instagram.p009ui.videothumbnail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import p000X.AnonymousClass000;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass7M4;
import p000X.AnonymousClass7M5;
import p000X.AnonymousClass7M8;
import p000X.C1647470w;
import p000X.C37671k2;
import p000X.C37691k4;
import p000X.C40441of;

/* renamed from: com.instagram.ui.videothumbnail.ThumbView */
public class ThumbView extends View implements C1647470w {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Rect A03;
    public AnonymousClass7M5 A04;
    public boolean A05;
    public int A06;
    public final Path A07 = new Path();
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();

    public static void A00(ThumbView thumbView) {
        AnonymousClass7M5 r2 = thumbView.A04;
        if (r2 != null) {
            AnonymousClass7M8 r7 = new AnonymousClass7M8(AnonymousClass00B.A01);
            String str = r2.A01.A05;
            int i = thumbView.A01;
            int i2 = thumbView.A06;
            long j = r2.A00;
            int hashCode = str.hashCode();
            HashMap hashMap = new HashMap();
            hashMap.put("number_of_seeks", Integer.toString(i));
            hashMap.put("number_of_thumbs_served", Integer.toString(i2));
            hashMap.put("number_of_thumbnail_errors", Integer.toString(0));
            hashMap.put("max_thumbnail_delay", Long.toString(j));
            C40441of.A00(1900591, hashCode, hashMap);
            r7.A00.markerEnd(1900591, hashCode, 2);
            thumbView.A04.A00 = 0;
        }
        thumbView.A06 = 0;
        thumbView.A01 = 0;
    }

    public final void A01() {
        AnonymousClass7M5 r2 = this.A04;
        if (r2 != null && !this.A05) {
            AnonymousClass7M8 r1 = new AnonymousClass7M8(AnonymousClass00B.A01);
            r1.A00.markerPoint(1900591, r2.A01.A05.hashCode(), "thumbnail_drawn");
            this.A05 = true;
        }
    }

    public final void A02(int i, int i2) {
        int i3;
        int i4;
        AnonymousClass7M5 r7 = this.A04;
        if (r7 != null) {
            C37691k4 r13 = r7.A01.A02;
            if (r13 == null || r13.A00().isEmpty()) {
                AnonymousClass7M5.A00(r7);
                if (r13 != null && r13.A00().isEmpty()) {
                    AnonymousClass0QD.A01("VideoThumbnailController", AnonymousClass000.A0E("Thumbnail info missing sprite URL. videoId: ", r7.A01.A05));
                    return;
                }
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (r7.A02) {
                new AnonymousClass7M8(AnonymousClass00B.A01).A00.markerPoint(1900591, r7.A01.A05.hashCode(), "thumbnail_requested");
            }
            int i5 = i;
            if (r13 == null) {
                i3 = -1;
            } else {
                i3 = (int) (((float) i5) / (r13.A01 * 1000.0f));
            }
            if (r13 != null && (i4 = i3 / r13.A02) >= 0 && i4 <= r13.A00().size() - 1) {
                int i6 = i4 + 1;
                int i7 = i4;
                while (true) {
                    if ((i7 < 0 || i4 - i7 >= 2) && (i6 >= r13.A00().size() || i6 - i4 >= 2)) {
                        break;
                    }
                    if (i7 >= 0) {
                        AnonymousClass12C.A0c.A0H((ImageUrl) r13.A00().get(i7), "VideoThumbnailController");
                        i7--;
                    }
                    if (i6 < r13.A00().size()) {
                        AnonymousClass12C.A0c.A0H((ImageUrl) r13.A00().get(i6), "VideoThumbnailController");
                        i6++;
                    }
                }
            } else {
                i4 = -1;
            }
            if (i4 == -1 || i3 == -1) {
                AnonymousClass7M5.A00(r7);
                return;
            }
            AnonymousClass1GH A0C = AnonymousClass12C.A0c.A0C((ImageUrl) r13.A00().get(i4));
            A0C.A02(new AnonymousClass7M4(r7, new boolean[]{true}, i5, i2, elapsedRealtime, r13, i3));
            A0C.A01();
        }
    }

    public final void A03(C37671k2 r6) {
        AnonymousClass7M5 r0 = this.A04;
        if (r0 != null) {
            if (!r0.A01.A05.equals(r6.A05)) {
                A00(this);
                this.A04 = null;
                this.A02 = null;
                this.A03 = null;
                this.A05 = false;
                invalidate();
            }
            this.A04.A03.add(this);
            AnonymousClass7M8 r1 = new AnonymousClass7M8(AnonymousClass00B.A01);
            String str = r6.A05;
            int hashCode = str.hashCode();
            r1.A00.markerStart(1900591, hashCode);
            HashMap hashMap = new HashMap();
            hashMap.put(TraceFieldType.VideoId, str);
            C40441of.A00(1900591, hashCode, hashMap);
        }
        this.A04 = new AnonymousClass7M5(r6);
        this.A04.A03.add(this);
        AnonymousClass7M8 r12 = new AnonymousClass7M8(AnonymousClass00B.A01);
        String str2 = r6.A05;
        int hashCode2 = str2.hashCode();
        r12.A00.markerStart(1900591, hashCode2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(TraceFieldType.VideoId, str2);
        C40441of.A00(1900591, hashCode2, hashMap2);
    }

    public final void Bof(Bitmap bitmap, Rect rect, int i, int i2, double d) {
        this.A02 = bitmap;
        this.A03 = rect;
        this.A06++;
    }

    public final void onDraw(Canvas canvas) {
        Rect rect;
        this.A08.set(0, 0, canvas.getWidth(), canvas.getHeight());
        if (this.A00 > 0) {
            this.A09.set(this.A08);
            this.A07.rewind();
            Path path = this.A07;
            RectF rectF = this.A09;
            float f = (float) this.A00;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        Bitmap bitmap = this.A02;
        if (!(bitmap == null || (rect = this.A03) == null)) {
            canvas.drawBitmap(bitmap, rect, this.A08, (Paint) null);
        }
        super.onDraw(canvas);
        postInvalidate();
    }

    public void setScrubberThumbnailCallback(C1647470w r2) {
        AnonymousClass7M5 r0 = this.A04;
        if (r0 != null) {
            r0.A03.add(r2);
        }
    }

    public AnonymousClass7M5 getThumbnailController() {
        return this.A04;
    }

    public void setBitmap(Bitmap bitmap) {
        this.A02 = bitmap;
    }

    public void setSrcRect(Rect rect) {
        this.A03 = rect;
    }

    public void setThumbRoundRadius(int i) {
        this.A00 = i;
    }

    public ThumbView(Context context) {
        super(context);
    }

    public ThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
