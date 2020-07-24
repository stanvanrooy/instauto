package com.instagram.p009ui.widget.nametag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Locale;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0N0;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass7MB;
import p000X.C06220Of;
import p000X.C06340Or;
import p000X.C13260iE;
import p000X.C13300iJ;
import p000X.C177247hb;
import p000X.C177257hc;
import p000X.C177267hd;
import p000X.C177277he;
import p000X.C177287hf;
import p000X.C177297hg;
import p000X.C26771Ff;
import p000X.C29878DEn;
import p000X.C72663Gk;

/* renamed from: com.instagram.ui.widget.nametag.NametagCardView */
public class NametagCardView extends View {
    public static final int[][] A0J = {new int[]{-6092870, -3790966, -160462}, new int[]{-3078039, -160462}, new int[]{-6092870, -14170891}, new int[]{-15502644, -11216897}, new int[]{-14170891, -9387952}};
    public float A00;
    public Bitmap A01;
    public ColorFilter A02;
    public C177247hb A03;
    public C177277he A04;
    public String A05;
    public float A06;
    public int A07;
    public int A08;
    public final Paint A09;
    public final Paint A0A;
    public final Rect A0B;
    public final RectF A0C;
    public final Drawable A0D;
    public final TextPaint A0E;
    public final UsernameTextView A0F;
    public final C29878DEn A0G;
    public final Runnable A0H;
    public final Drawable.Callback A0I;

    public void setUser(C13300iJ r2) {
        A02(r2, 0);
    }

    private void A00() {
        LinearGradient linearGradient = new LinearGradient(this.A0C.width(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0C.height(), this.A08, this.A07, Shader.TileMode.CLAMP);
        this.A09.setShader(linearGradient);
        this.A09.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.A0G.A01(linearGradient);
        this.A0E.setShader(linearGradient);
    }

    public static void A01(NametagCardView nametagCardView) {
        if (nametagCardView.A06 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (nametagCardView.A04 != C177277he.NAMETAG_QR) {
                Bitmap A062 = C72663Gk.A06(nametagCardView.A01, (int) nametagCardView.A0C.width(), (int) nametagCardView.A0C.height());
                nametagCardView.A01 = A062;
                Canvas canvas = new Canvas(A062);
                nametagCardView.A0D.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                nametagCardView.A0D.draw(canvas);
                nametagCardView.A0F.setDrawingCacheEnabled(true);
                nametagCardView.A0F.buildDrawingCache();
                int measuredWidth = nametagCardView.A0F.getMeasuredWidth();
                int measuredHeight = (int) (((float) nametagCardView.A0F.getMeasuredHeight()) - nametagCardView.A0F.getPaint().getFontMetrics().descent);
                C177247hb r1 = nametagCardView.A03;
                if (r1 != null) {
                    r1.setColorFilter(nametagCardView.A02);
                    C177247hb r0 = nametagCardView.A03;
                    int intrinsicHeight = r0.getIntrinsicHeight();
                    int intrinsicWidth = r0.getIntrinsicWidth();
                    measuredHeight = (int) (((double) measuredHeight) + Math.ceil((double) (nametagCardView.A00 * 0.057f)) + ((double) intrinsicHeight));
                    canvas.save();
                    canvas.translate((float) ((int) ((nametagCardView.A0C.width() - ((float) intrinsicWidth)) / 2.0f)), (float) ((int) (((nametagCardView.A0C.height() + ((float) measuredHeight)) / 2.0f) - ((float) intrinsicHeight))));
                    nametagCardView.A03.draw(canvas);
                    canvas.restore();
                }
                canvas.drawBitmap(nametagCardView.A0F.getDrawingCache(), (nametagCardView.A0C.width() - ((float) measuredWidth)) / 2.0f, (nametagCardView.A0C.height() - ((float) measuredHeight)) / 2.0f, nametagCardView.A0A);
                nametagCardView.A0F.destroyDrawingCache();
                nametagCardView.A0F.setDrawingCacheEnabled(false);
                canvas.drawRect(new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) canvas.getWidth(), (float) canvas.getHeight()), nametagCardView.A09);
            }
            nametagCardView.invalidate();
        }
    }

    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        C177277he r1 = this.A04;
        if (r1 == C177277he.NAMETAG_QR) {
            canvas2.getClipBounds(this.A0B);
            float width = (float) this.A0B.width();
            float f = 0.032f * width;
            float f2 = 0.6f * width;
            String upperCase = this.A05.toUpperCase(Locale.US);
            Context context = getContext();
            float A032 = C06220Of.A03(context, 12);
            TextPaint textPaint = this.A0E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            getContext();
            float A012 = C06340Or.A01(upperCase, textPaint, alignment, Math.round(width - C06220Of.A03(context, 48)), 1, 0, Math.round(0.1f * width));
            float abs = Math.abs(this.A0E.getFontMetrics().ascent) / 2.0f;
            int round = Math.round((width / 2.0f) - (f2 / 2.0f));
            int round2 = Math.round((width - ((A032 + f2) + abs)) / 2.0f);
            int round3 = Math.round(((float) round) + f2);
            int round4 = Math.round(((float) round2) + f2);
            this.A0G.setBounds(round, round2, round3, round4);
            this.A0G.draw(canvas2);
            this.A0E.setTextSize(A012);
            this.A0E.setTextAlign(Paint.Align.CENTER);
            float f3 = (float) round4;
            canvas2.drawText(upperCase, ((float) this.A0B.width()) / 2.0f, f3 + (((((float) this.A0B.height()) - (f * 2.0f)) - f3) / 2.0f) + abs, this.A0E);
        } else if (r1 == C177277he.NAMETAG_CLASSIC && (bitmap = this.A01) != null) {
            canvas2.drawBitmap(bitmap, this.A06 * 0.085f, this.A00 * 0.085f, (Paint) null);
        }
    }

    public void setGradientTintColors(int i) {
        int[][] iArr = A0J;
        if (i >= iArr.length) {
            i = 0;
        }
        int[] iArr2 = iArr[i];
        this.A08 = iArr2[0];
        this.A07 = iArr2[iArr2.length - 1];
        A00();
        this.A0G.setColorFilter((ColorFilter) null);
        this.A0E.setColorFilter((ColorFilter) null);
        A01(this);
    }

    public void setName(String str, String str2) {
        this.A05 = str;
        this.A0F.setName(str, str2);
        C29878DEn dEn = this.A0G;
        if (!AnonymousClass17M.A00(dEn.A02, str)) {
            dEn.A01 = AnonymousClass000.A0J("http://instagram.com/", str, "?utm_source=qr");
            dEn.A02 = str;
            C29878DEn.A00(dEn);
        }
    }

    public void setNameWithCodeTest(String str, int i) {
        setName(str, "");
        setTintColor(-16777216);
        if (i > 0) {
            this.A03 = new C177247hb(i);
        }
        invalidate();
    }

    public final void A02(C13300iJ r6, int i) {
        int i2;
        int i3;
        setName(r6.AZn(), r6.AMN());
        C177297hg r0 = C177297hg.COLOR;
        C13260iE r1 = r6.A0O;
        if (r1 != null) {
            r0 = C177297hg.A00(r1.A02);
            i2 = r1.A01;
            i3 = r1.A00;
        } else {
            i2 = 0;
            i3 = -16777216;
        }
        int i4 = C177287hf.A00[r0.ordinal()];
        if (i4 == 1) {
            setGradientTintColors(i2);
        } else if (i4 == 2) {
            setTintColor(i3);
        } else if (i4 == 3) {
            setTintColor(-16777216);
        }
        if (i > 0) {
            this.A03 = new C177247hb(i);
        }
    }

    public C177277he getMode() {
        return this.A04;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(-1687045333);
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i;
        this.A06 = f;
        float f2 = (float) i2;
        this.A00 = f2;
        this.A0C.set(f * 0.085f, 0.085f * f2, f * 0.915f, 0.915f * f2);
        Rect rect = new Rect();
        this.A0F.getPaint().getTextBounds("NAMETAG", 0, 7, rect);
        this.A0F.setTextSize(0, ((this.A0F.getTextSize() * f2) * 0.09f) / ((float) rect.height()));
        Paint.FontMetrics fontMetrics = this.A0F.getPaint().getFontMetrics();
        this.A0F.getPaint().getTextBounds("NAMETAG", 0, 7, rect);
        UsernameTextView usernameTextView = this.A0F;
        int i5 = (int) (0.138f * f);
        int i6 = (int) (((0.057f * f2) + fontMetrics.ascent) - ((float) rect.top));
        usernameTextView.A00.setBounds(0, 0, i5, i5);
        usernameTextView.setCompoundDrawables((Drawable) null, usernameTextView.A00, (Drawable) null, (Drawable) null);
        usernameTextView.setCompoundDrawablePadding(i6);
        this.A0F.A02((0.038f * f2) + ((float) rect.height()), (int) (0.8f * f));
        C177247hb r6 = this.A03;
        if (r6 != null) {
            float f3 = f2 * 0.015f;
            r6.A02 = f3;
            float f4 = f3 / ((float) C177247hb.A08[0]);
            r6.A00 = f4;
            r6.A01 = 4.0f * f4;
            r6.A03 = f4 * 1.0f;
            r6.A04 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            for (Integer intValue : r6.A05) {
                r6.A04 += ((float) C177247hb.A08[intValue.intValue() - 1]) * r6.A00;
            }
            r6.A04 += ((float) (r6.A05.size() - 1)) * r6.A01;
        }
        if (getBackground() == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(0.06f * f);
            gradientDrawable.setColor(-1);
            setBackground(new InsetDrawable(gradientDrawable, (int) (f * 0.032f)));
        }
        A00();
        A01(this);
        AnonymousClass0Z0.A0D(-1271930356, A062);
    }

    public void setTintColor(int i) {
        ColorFilter A002 = C26771Ff.A00(i);
        this.A02 = A002;
        this.A0A.setColorFilter(A002);
        this.A08 = i;
        this.A07 = i;
        A00();
        this.A0G.setColorFilter((ColorFilter) null);
        this.A0E.setColorFilter((ColorFilter) null);
        A01(this);
    }

    public NametagCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NametagCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NametagCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = new RectF();
        this.A0B = new Rect();
        this.A09 = new Paint();
        this.A0A = new Paint();
        this.A0H = new C177267hd(this);
        this.A04 = C177277he.NAMETAG_CLASSIC;
        this.A0D = new AnonymousClass7MB();
        UsernameTextView usernameTextView = new UsernameTextView(getContext());
        this.A0F = usernameTextView;
        usernameTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        C29878DEn dEn = new C29878DEn();
        this.A0G = dEn;
        C177257hc r0 = new C177257hc(this);
        this.A0I = r0;
        dEn.setCallback(r0);
        TextPaint textPaint = new TextPaint(1);
        this.A0E = textPaint;
        textPaint.setTypeface(AnonymousClass0N0.A04(getResources()));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A0E.setLetterSpacing(0.03f);
        }
    }
}
