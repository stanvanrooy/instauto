package com.instagram.p009ui.widget.mediapicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass3TW;
import p000X.C182097q1;
import p000X.C182107q2;
import p000X.C182517qp;
import p000X.C53642Tq;
import p000X.C71723Bx;
import p000X.C84653m5;
import p000X.C84823mM;

/* renamed from: com.instagram.ui.widget.mediapicker.MediaPickerItemView */
public class MediaPickerItemView extends CheckBox implements View.OnClickListener, AnonymousClass3TW, C182517qp, View.OnLongClickListener {
    public static final Paint A0K;
    public static final Paint A0L = new Paint(2);
    public Bitmap A00;
    public CancellationSignal A01;
    public GalleryItem A02;
    public C84653m5 A03;
    public C182097q1 A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final Bitmap A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final RectF A0H;
    public final C71723Bx A0I;
    public final C182107q2 A0J;

    public final void A04(GalleryItem galleryItem, C182097q1 r8, boolean z, boolean z2, C84823mM r11) {
        Medium medium = galleryItem.A01;
        A02(this, galleryItem, r8, z, z2, medium);
        this.A01 = r11.A03(medium, this.A01, this);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        float width;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.A00 != null) {
            if (this.A07) {
                this.A0H.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) canvas.getWidth(), (float) canvas.getHeight());
            } else {
                float max = Math.max(((float) canvas.getWidth()) / ((float) this.A00.getWidth()), ((float) canvas.getHeight()) / ((float) this.A00.getHeight()));
                float width2 = ((float) this.A00.getWidth()) * max;
                float height = max * ((float) this.A00.getHeight());
                float width3 = (((float) canvas.getWidth()) - width2) / 2.0f;
                float height2 = (((float) canvas.getHeight()) - height) / 2.0f;
                this.A0H.set(width3, height2, width2 + width3, height + height2);
            }
            AnonymousClass11J.A01(this.A04, "State is null. Make sure bind() has been called.");
            C182097q1 r5 = this.A04;
            if (r5.A03 || r5.A02) {
                int AUk = this.A03.AUk();
                Bitmap bitmap = this.A00;
                RectF rectF = this.A0H;
                if (r5.A02) {
                    paint = this.A0E;
                } else {
                    paint = A0L;
                }
                A01(canvas, AUk, bitmap, rectF, paint);
                this.A0F.setColor(-1);
                canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) canvas.getWidth(), (float) canvas.getHeight(), this.A0F);
            } else {
                A01(canvas, this.A03.AUk(), this.A00, this.A0H, A0L);
            }
            if (this.A03.Ae6()) {
                canvas.drawBitmap(this.A0B, (float) (canvas.getWidth() - this.A0B.getWidth()), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0C);
            } else if (this.A09) {
                C71723Bx r3 = this.A0I;
                r3.setBounds(0, 0, r3.getIntrinsicWidth(), r3.getIntrinsicHeight());
                canvas.save();
                float f = (float) this.A0I.A02;
                if (this.A08) {
                    width = f;
                } else {
                    width = ((float) (canvas.getWidth() - this.A0I.getIntrinsicWidth())) - f;
                }
                canvas.translate(width, f);
                this.A0I.draw(canvas);
                canvas.restore();
            }
            C84653m5 r1 = this.A03;
            if (r1.AiO() && r1.getDuration() > 0) {
                canvas.drawText(r1.AMI(), (float) (canvas.getWidth() - (this.A0A >> 1)), (float) (canvas.getHeight() - (this.A0A >> 1)), this.A0G);
            }
        } else {
            canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) canvas.getWidth(), (float) canvas.getHeight(), this.A0D);
        }
        if (this.A06) {
            canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) canvas.getWidth(), (float) canvas.getHeight(), A0K);
        }
    }

    static {
        Paint paint = new Paint();
        A0K = paint;
        paint.setStyle(Paint.Style.FILL);
        A0K.setColor(Color.argb(204, 255, 255, 255));
    }

    public static void A02(MediaPickerItemView mediaPickerItemView, GalleryItem galleryItem, C182097q1 r4, boolean z, boolean z2, C84653m5 r7) {
        int i;
        mediaPickerItemView.A09 = z;
        mediaPickerItemView.A08 = z2;
        C71723Bx r1 = mediaPickerItemView.A0I;
        r1.A00 = r4.A01 + 1;
        r1.invalidateSelf();
        r1.A01 = r4.A03;
        r1.invalidateSelf();
        if (!r7.AOA().equals(mediaPickerItemView.A05) || mediaPickerItemView.A04 != r4) {
            mediaPickerItemView.A04 = r4;
            mediaPickerItemView.A02 = galleryItem;
            mediaPickerItemView.A00 = null;
            mediaPickerItemView.A05 = r7.AOA();
            mediaPickerItemView.A03 = r7;
            if (galleryItem.A01()) {
                i = C0003R.string.gallery_album_thumbnail;
            } else {
                boolean A042 = galleryItem.A04();
                i = C0003R.string.gallery_photo_thumbnail;
                if (A042) {
                    i = C0003R.string.gallery_video_thumbnail;
                }
            }
            mediaPickerItemView.setContentDescription(mediaPickerItemView.getContext().getString(i));
            mediaPickerItemView.setChecked(r4.A03);
            mediaPickerItemView.invalidate();
        }
    }

    public final void A03() {
        AnonymousClass11J.A01(this.A04, "State is null. Make sure bind() has been called.");
        C71723Bx r0 = this.A0I;
        r0.A01 = false;
        r0.invalidateSelf();
        C182097q1 r1 = this.A04;
        if (r1.A03) {
            r1.A03 = false;
            invalidate();
        }
    }

    public final boolean AgE(Draft draft) {
        C84653m5 r0 = this.A03;
        if (r0 == null || !draft.AOA().equals(r0.AOA())) {
            return false;
        }
        return true;
    }

    public final boolean AgF(Medium medium) {
        C84653m5 r0 = this.A03;
        if (r0 == null || !medium.AOA().equals(r0.AOA())) {
            return false;
        }
        return true;
    }

    public final boolean onLongClick(View view) {
        if (this.A0J == null || this.A09) {
            return false;
        }
        if (this.A03.isValid()) {
            return this.A0J.B8A(this.A02, this.A04);
        }
        A00();
        return false;
    }

    public void setIsDisabled(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            invalidate();
        }
    }

    public void setSelectedIndex(int i) {
        AnonymousClass11J.A01(this.A04, "State is null. Make sure bind() has been called.");
        C71723Bx r1 = this.A0I;
        r1.A01 = true;
        r1.invalidateSelf();
        r1.A00 = i + 1;
        r1.invalidateSelf();
        C182097q1 r12 = this.A04;
        if (!r12.A03 || r12.A01 != i) {
            r12.A03 = true;
            r12.A01 = i;
            invalidate();
        }
    }

    private void A00() {
        Resources resources = getResources();
        boolean AiO = this.A03.AiO();
        int i = C0003R.string.failed_to_load_photo_toast;
        if (AiO) {
            i = C0003R.string.failed_to_load_video_toast;
        }
        C53642Tq.A01(getContext(), resources.getString(i), 0).show();
    }

    public static void A01(Canvas canvas, int i, Bitmap bitmap, RectF rectF, Paint paint) {
        canvas.save();
        canvas.rotate((float) i, ((float) canvas.getWidth()) / 2.0f, ((float) canvas.getHeight()) / 2.0f);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        canvas.restore();
    }

    public final void B7t(Medium medium) {
        if (medium.AOA().equals(this.A05)) {
            this.A00 = null;
            invalidate();
        }
    }

    public final void BRR(Draft draft, Bitmap bitmap) {
        if (draft.AOA().equals(this.A05)) {
            this.A00 = bitmap;
            invalidate();
        }
    }

    public final void BRS(Medium medium, boolean z, boolean z2, Bitmap bitmap) {
        if (medium.AOA().equals(this.A05)) {
            this.A07 = z2;
            this.A00 = bitmap;
            invalidate();
        }
    }

    public final void onClick(View view) {
        int i;
        int A052 = AnonymousClass0Z0.A05(-1685060739);
        if (this.A0J == null) {
            i = -1206123546;
        } else {
            AnonymousClass11J.A01(this.A04, "State is null. Make sure bind() has been called.");
            if (!this.A09 && this.A04.A03) {
                i = -2029384731;
            } else if (!this.A03.isValid()) {
                A00();
                i = 2133390154;
            } else {
                this.A0J.B83(this.A02, this.A04);
                i = -94286192;
            }
        }
        AnonymousClass0Z0.A0C(i, A052);
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0Z0.A06(1222199543);
        super.onMeasure(i, i);
        AnonymousClass0Z0.A0D(-556041658, A062);
    }

    public MediaPickerItemView(Context context, C182107q2 r3) {
        this(context, (AttributeSet) null, r3);
    }

    public MediaPickerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (C182107q2) null);
    }

    public MediaPickerItemView(Context context, AttributeSet attributeSet, C182107q2 r11) {
        super(context, attributeSet, C0003R.attr.mediaPickerItemStyle);
        this.A0J = r11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2n, C0003R.attr.mediaPickerItemStyle, 0);
        int color = obtainStyledAttributes.getColor(0, -12303292);
        int color2 = obtainStyledAttributes.getColor(2, Color.argb(200, 0, 0, 0));
        Resources resources = getResources();
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, resources.getDimensionPixelSize(C0003R.dimen.selection_stroke_width));
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        getResources();
        Paint paint = new Paint();
        this.A0D = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A0D.setColor(color);
        this.A0E = new Paint(2);
        this.A0E.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_ATOP));
        Paint paint2 = new Paint();
        this.A0F = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.A0F.setStrokeWidth((float) dimensionPixelOffset);
        Paint paint3 = new Paint(1);
        this.A0G = paint3;
        paint3.setColor(-1);
        this.A0G.setTextAlign(Paint.Align.RIGHT);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.duration_text_size);
        this.A0A = dimensionPixelSize;
        this.A0G.setTextSize((float) dimensionPixelSize);
        this.A0B = BitmapFactory.decodeResource(resources, C0003R.C0004drawable.filled_grid_album_icon);
        this.A0C = new Paint(2);
        this.A0I = new C71723Bx(context);
        this.A0H = new RectF();
        setOnClickListener(this);
        setOnLongClickListener(this);
    }
}
