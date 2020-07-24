package com.instagram.arlink.p027ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass29T;
import p000X.AnonymousClass8M7;
import p000X.C175357eL;
import p000X.C175367eM;
import p000X.C175397eP;
import p000X.C72663Gk;

/* renamed from: com.instagram.arlink.ui.GridPatternView */
public class GridPatternView extends View {
    public static final float[][] A0O = {new float[]{-45.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 45.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER}, new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 45.0f}, new float[]{45.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER}, new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -45.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 45.0f}};
    public int A00;
    public int A01;
    public C175397eP A02;
    public Integer A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public Bitmap A0F;
    public Bitmap A0G;
    public Bitmap A0H;
    public Bitmap A0I;
    public Integer A0J = Constants.ZERO;
    public String A0K;
    public final Matrix A0L = new Matrix();
    public final Paint A0M = new Paint();
    public final TextPaint A0N = new TextPaint();

    private void A00() {
        Bitmap selfieWithStickerBitmap;
        switch (this.A0J.intValue()) {
            case 1:
                selfieWithStickerBitmap = getEmojiBitmap();
                break;
            case 2:
                Resources resources = getResources();
                int i = this.A0B;
                int i2 = this.A0A;
                Rect rect = new Rect();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(resources, i, options);
                rect.right = options.outWidth;
                rect.bottom = options.outHeight;
                int min = Math.min(Math.max(rect.width() / i2, rect.height() / i2), Math.max(rect.width() / i2, rect.height() / i2));
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = Math.max(min, 1);
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                selfieWithStickerBitmap = C72663Gk.A07(BitmapFactory.decodeResource(resources, i, options2), i2, i2);
                break;
            case 3:
                selfieWithStickerBitmap = getSelfieWithStickerBitmap();
                break;
            default:
                selfieWithStickerBitmap = null;
                break;
        }
        if (selfieWithStickerBitmap != null && !selfieWithStickerBitmap.isRecycled()) {
            A02(selfieWithStickerBitmap, this.A0G, 4);
            int i3 = this.A0C;
            if (i3 % 4 > 0) {
                A02(selfieWithStickerBitmap, this.A0H, i3 % 4);
            }
        }
    }

    private void A01() {
        this.A0N.setAntiAlias(true);
        this.A0N.setDither(true);
        this.A0N.setFilterBitmap(true);
        this.A0M.setAntiAlias(true);
        this.A0M.setDither(true);
        this.A0M.setFilterBitmap(true);
        this.A04 = (float) getResources().getDimensionPixelSize(C0003R.dimen.emoji_text_size);
    }

    private void A02(Bitmap bitmap, Bitmap bitmap2, int i) {
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bitmap2.eraseColor(0);
            Canvas canvas = new Canvas(bitmap2);
            float width = (((float) (this.A0D - bitmap.getWidth())) / 2.0f) + ((float) this.A07);
            float height = (((float) (this.A0D - bitmap.getHeight())) / 2.0f) + ((float) this.A07);
            float width2 = ((float) bitmap.getWidth()) / 2.0f;
            float height2 = ((float) bitmap.getHeight()) / 2.0f;
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    if (i2 % 2 == i3 % 2) {
                        canvas.save();
                        int i4 = this.A0D;
                        canvas.translate(((float) (i3 * i4)) + width, ((float) (i4 * i2)) + height);
                        this.A0L.reset();
                        this.A0L.setRotate(A0O[i2][i3], width2, height2);
                        canvas.drawBitmap(bitmap, this.A0L, this.A0M);
                        canvas.restore();
                    }
                }
            }
        }
    }

    private Bitmap getEmojiBitmap() {
        Bitmap bitmap = this.A0F;
        int i = this.A0D;
        Bitmap A062 = C72663Gk.A06(bitmap, i, i);
        this.A0F = A062;
        Canvas canvas = new Canvas(A062);
        this.A0N.setTextSize(this.A04);
        float measureText = this.A0N.measureText(this.A0K);
        if (measureText > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.A0N.setTextSize((((float) this.A0D) * this.A04) / measureText);
        }
        StaticLayout staticLayout = new StaticLayout(this.A0K, this.A0N, this.A01, Layout.Alignment.ALIGN_CENTER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
        canvas.save();
        canvas.translate((float) (-AnonymousClass29T.A00(staticLayout)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        staticLayout.draw(canvas);
        canvas.restore();
        AnonymousClass8M7 r4 = new AnonymousClass8M7(this.A0F);
        new C175357eL(r4, new C175367eM(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{r4.A00});
        return this.A0F;
    }

    private Bitmap getSelfieWithStickerBitmap() {
        Bitmap bitmap = this.A0I;
        if (bitmap != null && (bitmap.getWidth() > this.A0A || this.A0I.getHeight() > this.A0A)) {
            Bitmap bitmap2 = this.A0I;
            int i = this.A0A;
            this.A0I = C72663Gk.A07(bitmap2, i, i);
        }
        return this.A0I;
    }

    public void setEmoji(String str) {
        this.A0K = str;
        this.A03 = null;
        this.A0J = Constants.ONE;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public void setSelfieWithSticker(Bitmap bitmap) {
        if (this.A0D > 0) {
            int i = this.A0A;
            this.A0I = C72663Gk.A07(bitmap, i, i);
        } else {
            this.A0I = bitmap;
        }
        this.A0J = Constants.A0N;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public void setSticker(int i) {
        this.A0B = i;
        this.A0J = Constants.A0C;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public Integer getDominantColor() {
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0.isRecycled() != false) goto L_0x0026;
     */
    public final void onDraw(Canvas canvas) {
        boolean z;
        Bitmap bitmap;
        super.onDraw(canvas);
        canvas.clipRect(0, this.A0E, this.A01, this.A00 - this.A06);
        Bitmap bitmap2 = this.A0G;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            Bitmap bitmap3 = this.A0H;
            if (bitmap3 != null) {
                z = true;
            }
            z = false;
            for (int i = 0; i < this.A09; i++) {
                for (int i2 = 0; i2 < this.A08; i2++) {
                    canvas.save();
                    canvas.translate((((float) (this.A0G.getWidth() * i2)) - this.A05) - ((float) (((i2 << 1) + 1) * this.A07)), (float) (((this.A0G.getHeight() * i) + this.A0E) - ((i << 1) * this.A07)));
                    if (i != this.A09 - 1 || !z) {
                        bitmap = this.A0G;
                    } else {
                        bitmap = this.A0H;
                    }
                    canvas.drawBitmap(bitmap, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Paint) null);
                    canvas.restore();
                }
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1477078933);
        super.onSizeChanged(i, i2, i3, i4);
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            View view = (View) parent;
            View findViewById = view.findViewById(C0003R.C0005id.top_bar);
            if (findViewById != null) {
                this.A0E = findViewById.getMeasuredHeight();
            }
            View findViewById2 = view.findViewById(C0003R.C0005id.bottom_bar);
            if (findViewById2 != null) {
                this.A06 = findViewById2.getMeasuredHeight();
            }
            if (this.A0E > 0 && this.A06 > 0) {
                break;
            }
        }
        this.A01 = i;
        this.A00 = i2;
        int i5 = (i2 - this.A0E) - this.A06;
        float f = (float) i;
        int ceil = (int) Math.ceil((double) (((float) i5) / (0.2f * f)));
        this.A0C = ceil;
        double sqrt = Math.sqrt(2.0d);
        int i6 = (int) (((double) i5) / ((((double) ceil) + sqrt) - 1.0d));
        this.A0D = i6;
        int i7 = (int) ((((double) i6) * (sqrt - 1.0d)) / 2.0d);
        this.A07 = i7;
        float f2 = (float) i6;
        this.A0A = (int) (0.75f * f2);
        this.A05 = Math.max(((((float) Math.ceil((double) (f / f2))) * f2) - f) / 2.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        int ceil2 = (int) Math.ceil((double) ((i6 << 2) + (i7 << 1)));
        this.A09 = (int) Math.ceil((double) (((float) ceil) / 4.0f));
        this.A08 = (int) Math.ceil((double) (f / (f2 * 4.0f)));
        this.A0G = C72663Gk.A06(this.A0G, ceil2, ceil2);
        int i8 = this.A0C % 4;
        if (i8 > 0) {
            this.A0H = C72663Gk.A06(this.A0H, ceil2, (i8 * this.A0D) + (this.A07 << 1));
        } else {
            Bitmap bitmap = this.A0H;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.A0H.recycle();
            }
            this.A0H = null;
        }
        A00();
        AnonymousClass0Z0.A0D(939819688, A062);
    }

    public void setColorUpdateCallback(C175397eP r1) {
        this.A02 = r1;
    }

    public GridPatternView(Context context) {
        super(context);
        A01();
    }

    public GridPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public GridPatternView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
