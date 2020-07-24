package com.instagram.p009ui.widget.avatarlike;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;
import p000X.ANC;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass1Q6;
import p000X.C019000b;
import p000X.C06400Ox;
import p000X.C112014ru;
import p000X.C23433AMg;
import p000X.C26771Ff;
import p000X.C27181Gu;
import p000X.C36601iJ;

/* renamed from: com.instagram.ui.widget.avatarlike.AvatarLikesView */
public class AvatarLikesView extends View {
    public static final int[] A0J = {C0003R.color.igds_gradient_red, C0003R.color.igds_gradient_orange, C0003R.color.igds_gradient_yellow, C0003R.color.igds_gradient_green, C0003R.color.igds_gradient_blue, C0003R.color.igds_gradient_purple};
    public long A00;
    public Bitmap A01;
    public Bitmap A02;
    public Bitmap A03;
    public List A04;
    public List A05;
    public List A06;
    public List A07;
    public boolean A08;
    public int A09;
    public long A0A;
    public long A0B;
    public Paint A0C;
    public RectF A0D;
    public AnonymousClass1Q6 A0E;
    public ArrayList A0F;
    public boolean A0G;
    public final Map A0H = new HashMap();
    public final Map A0I = new HashMap();

    public static void A07(AvatarLikesView avatarLikesView, boolean z, Bitmap bitmap, boolean z2, Integer num, Float f) {
        long max;
        List list;
        Bitmap bitmap2;
        boolean z3;
        long max2;
        AvatarLikesView avatarLikesView2 = avatarLikesView;
        if (z2) {
            if (avatarLikesView.A06.size() < 180) {
                max = Math.max(SystemClock.elapsedRealtime(), avatarLikesView.A00 + ((long) (((double) 1) * (((double) 0) + (((double) 50) * Math.random())))));
                avatarLikesView2.A00 = max;
                list = avatarLikesView2.A06;
                bitmap2 = null;
                z3 = true;
            } else {
                return;
            }
        } else if (bitmap != null) {
            if (avatarLikesView.A04.size() < 200) {
                long random = (long) (((double) 1) * (((double) 100) + (((double) DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD) * Math.random())));
                if (z) {
                    max2 = SystemClock.elapsedRealtime();
                } else {
                    max2 = Math.max(SystemClock.elapsedRealtime(), avatarLikesView.A0A + random);
                }
                avatarLikesView2.A0A = max2;
                avatarLikesView2.A04.add(avatarLikesView2.A02(max2, z, bitmap, false, num, f));
                return;
            }
            return;
        } else if (avatarLikesView.A07.size() < 200) {
            if (z) {
                max = SystemClock.elapsedRealtime();
            } else {
                max = Math.max(SystemClock.elapsedRealtime(), avatarLikesView.A0B + ((long) (((double) 1) * (((double) 100) + (((double) DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD) * Math.random())))));
                avatarLikesView2.A0B = max;
            }
            list = avatarLikesView2.A07;
            bitmap2 = null;
            z3 = false;
        } else {
            return;
        }
        list.add(avatarLikesView2.A02(max, z, bitmap2, z3, num, f));
    }

    private C112014ru A02(long j, boolean z, Bitmap bitmap, boolean z2, Integer num, Float f) {
        Object obj;
        float floatValue;
        int i;
        C112014ru r3 = (C112014ru) this.A0E.A2N();
        if (r3 == null) {
            r3 = new C112014ru();
        }
        if (num != null) {
            int intValue = num.intValue();
            Map map = this.A0H;
            Integer valueOf = Integer.valueOf(intValue);
            if (!map.containsKey(valueOf)) {
                Map map2 = this.A0H;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                paint.setColorFilter(new PorterDuffColorFilter(C019000b.A00(getContext(), intValue), PorterDuff.Mode.SRC_IN));
                map2.put(valueOf, paint);
            }
            obj = this.A0H.get(valueOf);
        } else {
            obj = this.A0F.get(new Random().nextInt(A0J.length));
        }
        Paint paint2 = (Paint) obj;
        Resources resources = getResources();
        Float f2 = f;
        r3.A05 = j;
        double random = Math.random();
        int i2 = 1;
        if (random < 0.5d) {
            i2 = -1;
        }
        r3.A04 = i2;
        if (f == null) {
            floatValue = 0.1f;
        } else {
            floatValue = f2.floatValue();
        }
        r3.A00 = floatValue;
        if (z) {
            r3.A00 = floatValue + (r3.A08.nextFloat() * 0.3f);
        }
        if (z2) {
            i = (int) ((1.0d - Math.log(random + 0.01d)) * 3000.0d);
        } else {
            i = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        }
        r3.A01 = i;
        int i3 = C0003R.dimen.avatar_like_oscillation_width;
        if (z2) {
            i3 = C0003R.dimen.burst_like_oscillation_width;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i3);
        r3.A03 = r3.A08.nextInt(dimensionPixelSize << 1) - dimensionPixelSize;
        r3.A02 = (int) (random * ((double) dimensionPixelSize));
        if (bitmap != null) {
            C36601iJ r5 = new C36601iJ(bitmap, false);
            r3.A07 = r5;
            r5.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            r3.A07 = null;
        }
        r3.A06 = paint2;
        return r3;
    }

    private void A03() {
        this.A0E = new AnonymousClass1Q6(583);
        this.A07 = new ArrayList();
        this.A04 = new ArrayList();
        Resources resources = getResources();
        this.A03 = BitmapFactory.decodeResource(resources, C0003R.C0004drawable.live_like);
        Paint paint = new Paint(1);
        this.A0C = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.A0C;
        Context context = getContext();
        paint2.setColorFilter(C26771Ff.A00(C019000b.A00(context, C0003R.color.white_90_transparent)));
        getResources();
        this.A0C.setStrokeWidth((float) resources.getDimensionPixelSize(C0003R.dimen.avatar_like_stroke_width));
        this.A0D = new RectF();
        getContext();
        this.A09 = context.getResources().getDimensionPixelSize(C0003R.dimen.avatar_likes_width);
        getContext();
        this.A0G = C06400Ox.A02(context);
        this.A0F = new ArrayList();
        for (int A002 : A0J) {
            ArrayList arrayList = this.A0F;
            Paint paint3 = new Paint(1);
            paint3.setStyle(Paint.Style.FILL);
            getContext();
            paint3.setColorFilter(new PorterDuffColorFilter(C019000b.A00(context, A002), PorterDuff.Mode.SRC_IN));
            arrayList.add(paint3);
        }
    }

    private void A04(Bitmap bitmap, Canvas canvas, C112014ru r6, float f, float f2, float f3, int i) {
        RectF rectF = this.A0D;
        rectF.left = f - f3;
        rectF.right = f + f3;
        rectF.top = f2 - f3;
        rectF.bottom = f2 + f3;
        Paint paint = r6.A06;
        paint.setAlpha(i);
        canvas.drawBitmap(bitmap, (Rect) null, this.A0D, paint);
    }

    private int getHeartsColumnCenterX() {
        if (this.A0G) {
            return getLeft() + (this.A09 >> 1);
        }
        return getRight() - (this.A09 >> 1);
    }

    public final void A08() {
        this.A0B = 0;
        this.A0A = 0;
        this.A00 = 0;
        this.A07.clear();
        this.A04.clear();
        List list = this.A06;
        if (list != null) {
            list.clear();
        }
        List list2 = this.A05;
        if (list2 != null) {
            list2.clear();
        }
    }

    public final void A09(int i, List list, boolean z, Integer num, Float f) {
        A06(this, this.A07);
        A06(this, this.A04);
        Integer num2 = num;
        boolean z2 = z;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ANC anc = (ANC) it.next();
                AnonymousClass1GH A0C2 = AnonymousClass12C.A0c.A0C(anc.A01);
                A0C2.A02(new C23433AMg(this, z, num, anc));
                A0C2.A01();
                i -= anc.A00;
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            A07(this, z2, (Bitmap) null, false, num2, f);
        }
        invalidate();
    }

    public final void A0A(boolean z, Integer num, Float f) {
        Integer num2;
        Float f2;
        boolean z2;
        if (this.A06 == null) {
            this.A06 = new ArrayList();
            Bitmap bitmap = this.A03;
            this.A02 = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 0.5f), (int) (((float) this.A03.getHeight()) * 0.5f), false);
            this.A05 = new ArrayList();
            Bitmap bitmap2 = this.A03;
            this.A01 = Bitmap.createScaledBitmap(bitmap2, (int) (((float) bitmap2.getWidth()) * 2.0f), (int) (((float) this.A03.getHeight()) * 2.0f), false);
        }
        A06(this, this.A06);
        int i = 0;
        while (true) {
            num2 = num;
            f2 = f;
            z2 = z;
            if (i >= 30) {
                break;
            }
            A07(this, z2, (Bitmap) null, true, num2, f2);
            i++;
        }
        A06(this, this.A05);
        if (this.A05.size() < 3) {
            this.A05.add(A02(Math.max(SystemClock.elapsedRealtime(), this.A00 + ((long) (((double) 1) * (((double) 0) + (((double) 50) * Math.random()))))), z2, (Bitmap) null, false, num2, f2));
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        int A012;
        float width;
        AvatarLikesView avatarLikesView;
        Bitmap bitmap;
        Canvas canvas2;
        C112014ru r21;
        float f;
        Canvas canvas3 = canvas;
        int height = canvas3.getHeight();
        boolean z = false;
        for (C112014ru r6 : this.A07) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r6.A05;
            if (elapsedRealtime > 0 && elapsedRealtime < 4000) {
                float f2 = ((float) elapsedRealtime) / 4000.0f;
                float height2 = ((float) (height - (this.A03.getHeight() >> 1))) - (((float) height) * f2);
                float A002 = A00(r6, f2);
                Bitmap bitmap2 = this.A03;
                Bitmap bitmap3 = bitmap2;
                A04(bitmap3, canvas3, r6, A002, height2, (float) (bitmap2.getWidth() >> 1), A01(f2, r6.A00 + 0.05f));
                z = true;
            }
        }
        for (C112014ru r7 : this.A04) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - r7.A05;
            if (elapsedRealtime2 > 0 && elapsedRealtime2 < 4000) {
                float f3 = ((float) elapsedRealtime2) / 4000.0f;
                float height3 = ((float) (height - (this.A03.getHeight() >> 1))) - (((float) height) * f3);
                float A003 = A00(r7, f3);
                float f4 = r7.A00;
                float f5 = f4 + 0.05f;
                int A013 = A01(f3, f5);
                if (f3 < 0.07f) {
                    A05(canvas3, r7, A003, height3, ((float) this.A03.getWidth()) / 2.0f, A013);
                } else if (f3 < f4) {
                    A05(canvas3, r7, A003, height3, ((float) this.A03.getWidth()) / 2.0f, 255);
                } else {
                    float f6 = f5;
                    if (f3 < f5) {
                        float A014 = (float) C27181Gu.A01((double) f3, (double) f4, (double) f6, 0.0d, 1.0d);
                        canvas2 = canvas3;
                        r21 = r7;
                        f = height3;
                        A05(canvas2, r21, A003, f, (float) ((int) ((((A014 / 2.0f) + 1.0f) * ((float) this.A03.getWidth())) / 2.0f)), (int) ((1.0f - A014) * 255.0f));
                        width = (float) ((int) ((A014 * ((float) this.A03.getWidth())) / 2.0f));
                        A013 = 255;
                        avatarLikesView = this;
                        bitmap = this.A03;
                    } else {
                        Bitmap bitmap4 = this.A03;
                        width = (float) (bitmap4.getWidth() >> 1);
                        avatarLikesView = this;
                        bitmap = bitmap4;
                        canvas2 = canvas3;
                        r21 = r7;
                        f = height3;
                    }
                    avatarLikesView.A04(bitmap, canvas2, r21, A003, f, width, A013);
                }
                z = true;
            }
        }
        List<C112014ru> list = this.A06;
        if (list != null) {
            for (C112014ru r8 : list) {
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - r8.A05;
                if (elapsedRealtime3 > 0) {
                    int i = r8.A01;
                    if (elapsedRealtime3 < ((long) i)) {
                        float pow = (float) Math.pow((double) ((((float) elapsedRealtime3) / ((float) i)) * 3.0f), 0.6000000238418579d);
                        float heartsColumnCenterX = ((float) getHeartsColumnCenterX()) + (((float) (r8.A04 * r8.A02)) * pow);
                        Bitmap bitmap5 = this.A02;
                        Bitmap bitmap6 = bitmap5;
                        Canvas canvas4 = canvas3;
                        A04(bitmap6, canvas4, r8, heartsColumnCenterX, ((float) (height - 0)) - (((float) height) * pow), (float) (bitmap5.getWidth() >> 1), A01(pow, r8.A00 + 0.05f));
                        z = true;
                    }
                }
            }
        }
        List<C112014ru> list2 = this.A05;
        if (list2 != null) {
            for (C112014ru r5 : list2) {
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - r5.A05;
                if (elapsedRealtime4 > 0 && elapsedRealtime4 < 4000) {
                    float f7 = ((float) elapsedRealtime4) / 4000.0f;
                    float f8 = ((float) (height - 0)) - (((float) height) * f7);
                    float A004 = A00(r5, f7);
                    Bitmap bitmap7 = this.A01;
                    if (f7 > 0.1f) {
                        A012 = bitmap7.getWidth() >> 1;
                    } else {
                        A012 = (int) C27181Gu.A01((double) f7, 0.0d, 0.10000000149011612d, 0.0d, (double) (bitmap7.getWidth() >> 1));
                    }
                    Bitmap bitmap8 = bitmap7;
                    Canvas canvas5 = canvas3;
                    A04(bitmap8, canvas5, r5, A004, f8, (float) A012, A01(f7, r5.A00 + 0.05f));
                    z = true;
                }
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private float A00(C112014ru r15, float f) {
        float heartsColumnCenterX = (float) (getHeartsColumnCenterX() + r15.A03);
        double d = (double) f;
        int i = r15.A02;
        return heartsColumnCenterX + ((float) C27181Gu.A01((double) ((float) ((Math.sin((((double) (r15.A04 * 6)) * 3.141592653589793d) * d) + 1.0d) / 2.0d)), 0.0d, 1.0d, (double) (-i), (double) i));
    }

    public static int A01(float f, float f2) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        if (f < 0.07f) {
            d = (double) f;
            d2 = 0.0d;
            d3 = 0.07000000029802322d;
            d4 = 0.0d;
            d5 = 255.0d;
        } else if (f < f2) {
            return 255;
        } else {
            if (f >= 0.9f) {
                return 0;
            }
            d = (double) f;
            d2 = (double) f2;
            d3 = 0.8999999761581421d;
            d4 = 255.0d;
            d5 = 0.0d;
        }
        return (int) C27181Gu.A01(d, d2, d3, d4, d5);
    }

    private void A05(Canvas canvas, C112014ru r4, float f, float f2, float f3, int i) {
        canvas.save();
        canvas.translate(f, f2);
        Paint paint = r4.A06;
        if (paint != null) {
            this.A0C.setColorFilter(paint.getColorFilter());
        }
        this.A0C.setAlpha(i);
        canvas.drawCircle(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3, this.A0C);
        float intrinsicWidth = (2.0f * f3) / ((float) r4.A07.getIntrinsicWidth());
        float f4 = -f3;
        canvas.translate(f4, f4);
        canvas.scale(intrinsicWidth, intrinsicWidth);
        r4.A07.setAlpha(i);
        r4.A07.draw(canvas);
        canvas.restore();
    }

    public static void A06(AvatarLikesView avatarLikesView, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C112014ru r5 = (C112014ru) it.next();
            if (SystemClock.elapsedRealtime() - r5.A05 > ((long) r5.A01)) {
                it.remove();
                avatarLikesView.A0E.BaL(r5);
            }
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(631067396);
        super.onAttachedToWindow();
        this.A08 = true;
        AnonymousClass0Z0.A0D(1359953749, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1917294537);
        super.onDetachedFromWindow();
        this.A08 = false;
        AnonymousClass0Z0.A0D(-886921347, A062);
    }

    public AvatarLikesView(Context context) {
        super(context);
        A03();
    }

    public AvatarLikesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public AvatarLikesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }
}
