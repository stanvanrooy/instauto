package p000X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1Ap  reason: invalid class name and case insensitive filesystem */
public final class C25851Ap extends C25861Aq {
    public static final PorterDuff.Mode A09 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass216 A00;
    public boolean A01;
    public ColorFilter A02;
    public PorterDuffColorFilter A03;
    public Drawable.ConstantState A04;
    public boolean A05;
    public final Matrix A06;
    public final Rect A07;
    public final float[] A08;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[Catch:{ IOException | XmlPullParserException -> 0x0047 }] */
    public static C25851Ap A00(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C25851Ap r2 = new C25851Ap();
            Drawable A012 = C176587gS.A01(resources, i, theme);
            r2.A00 = A012;
            r2.A04 = new C23101A7f(A012.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    if (next != 2) {
                        C25851Ap r0 = new C25851Ap();
                        r0.inflate(resources, xml, asAttributeSet, theme);
                        return r0;
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            }
            if (next != 2) {
            }
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    public final PorterDuffColorFilter A01(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        C55072a1.A0C(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        if (r6 != r2.A04.getHeight()) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (r0 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        if (r5.A00 != r5.A08.A04) goto L_0x013a;
     */
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint;
        boolean z2;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.A07);
        if (this.A07.width() > 0 && this.A07.height() > 0) {
            ColorFilter colorFilter = this.A02;
            if (colorFilter == null) {
                colorFilter = this.A03;
            }
            canvas.getMatrix(this.A06);
            this.A06.getValues(this.A08);
            float[] fArr = this.A08;
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && abs4 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.A07.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.A07.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.A07;
                canvas.translate((float) rect.left, (float) rect.top);
                boolean z3 = false;
                if (isAutoMirrored() && C55072a1.A00(this) == 1) {
                    z3 = true;
                }
                if (z3) {
                    canvas.translate((float) this.A07.width(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.A07.offsetTo(0, 0);
                AnonymousClass216 r2 = this.A00;
                Bitmap bitmap = r2.A04;
                if (bitmap != null) {
                    if (min == bitmap.getWidth()) {
                        z2 = true;
                    }
                    z2 = false;
                }
                r2.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                r2.A0A = true;
                if (!this.A01) {
                    this.A00.A00(min, min2);
                } else {
                    AnonymousClass216 r5 = this.A00;
                    if (!r5.A0A && r5.A02 == r5.A03 && r5.A06 == r5.A07 && r5.A0B == r5.A09) {
                        z = true;
                    }
                    z = false;
                    if (!z) {
                        r5.A00(min, min2);
                        AnonymousClass216 r1 = this.A00;
                        r1.A02 = r1.A03;
                        r1.A06 = r1.A07;
                        r1.A00 = r1.A08.A04;
                        r1.A0B = r1.A09;
                        r1.A0A = false;
                    }
                }
                AnonymousClass216 r6 = this.A00;
                Rect rect2 = this.A07;
                boolean z4 = false;
                if (r6.A08.A04 < 255) {
                    z4 = true;
                }
                if (z4 || colorFilter != null) {
                    if (r6.A05 == null) {
                        Paint paint2 = new Paint();
                        r6.A05 = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    r6.A05.setAlpha(r6.A08.A04);
                    r6.A05.setColorFilter(colorFilter);
                    paint = r6.A05;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(r6.A04, (Rect) null, rect2, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.A00.A08.A04;
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A00.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return C55072a1.A01(drawable);
        }
        return this.A02;
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C23101A7f(drawable.getConstantState());
        }
        this.A00.A01 = getChangingConfigurations();
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A00.A08.A00;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A00.A08.A01;
    }

    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void invalidateSelf() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.A00.A09;
    }

    public final boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        AnonymousClass216 r0 = this.A00;
        if (r0 == null) {
            return false;
        }
        AnonymousClass217 r1 = r0.A08;
        if (r1.A08 == null) {
            r1.A08 = Boolean.valueOf(r1.A0F.A01());
        }
        if (r1.A08.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A03;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.A05 && super.mutate() == this) {
            this.A00 = new AnonymousClass216(this.A00);
            this.A05 = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        AnonymousClass216 r2 = this.A00;
        ColorStateList colorStateList = r2.A03;
        if (!(colorStateList == null || (mode = r2.A07) == null)) {
            this.A03 = A01(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        AnonymousClass217 r1 = r2.A08;
        if (r1.A08 == null) {
            r1.A08 = Boolean.valueOf(r1.A0F.A01());
        }
        if (!r1.A08.booleanValue()) {
            return z;
        }
        boolean A022 = r2.A08.A0F.A02(iArr);
        r2.A0A |= A022;
        if (!A022) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        AnonymousClass217 r1 = this.A00.A08;
        if (r1.A04 != i) {
            r1.A04 = i;
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A00.A09 = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A02 = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A06(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A08(drawable, colorStateList);
            return;
        }
        AnonymousClass216 r1 = this.A00;
        if (r1.A03 != colorStateList) {
            r1.A03 = colorStateList;
            this.A03 = A01(colorStateList, r1.A07);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A0B(drawable, mode);
            return;
        }
        AnonymousClass216 r1 = this.A00;
        if (r1.A07 != mode) {
            r1.A07 = mode;
            this.A03 = A01(r1.A03, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public C25851Ap() {
        this.A01 = true;
        this.A08 = new float[9];
        this.A06 = new Matrix();
        this.A07 = new Rect();
        this.A00 = new AnonymousClass216();
    }

    public C25851Ap(AnonymousClass216 r3) {
        this.A01 = true;
        this.A08 = new float[9];
        this.A06 = new Matrix();
        this.A07 = new Rect();
        this.A00 = r3;
        this.A03 = A01(r3.A03, r3.A07);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        int i2;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        if (drawable != null) {
            C55072a1.A0A(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        AnonymousClass216 r10 = this.A00;
        r10.A08 = new AnonymousClass217();
        TypedArray A022 = AnonymousClass21B.A02(resources2, theme2, attributeSet2, AnonymousClass21A.A02);
        AnonymousClass216 r7 = this.A00;
        AnonymousClass217 r6 = r7.A08;
        int A012 = AnonymousClass21B.A01(A022, xmlPullParser2, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (A012 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (A012 != 5) {
            if (A012 != 9) {
                switch (A012) {
                    case C120125Dh.VIEW_TYPE_LINK /*14*/:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        r7.A07 = mode;
        if (AnonymousClass21B.A05(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            A022.getValue(1, typedValue);
            int i3 = typedValue.type;
            if (i3 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index " + 1 + ": " + typedValue);
            } else if (i3 < 28 || i3 > 31) {
                Resources resources3 = A022.getResources();
                try {
                    colorStateList = A7a.A00(resources3, resources3.getXml(A022.getResourceId(1, 0)), theme2);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    colorStateList = null;
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            r7.A03 = colorStateList;
        }
        boolean z = r7.A09;
        if (AnonymousClass21B.A05(xmlPullParser2, "autoMirrored")) {
            z = A022.getBoolean(5, z);
        }
        r7.A09 = z;
        r6.A03 = AnonymousClass21B.A00(A022, xmlPullParser2, "viewportWidth", 7, r6.A03);
        float A002 = AnonymousClass21B.A00(A022, xmlPullParser2, "viewportHeight", 8, r6.A02);
        r6.A02 = A002;
        if (r6.A03 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            throw new XmlPullParserException(AnonymousClass000.A0E(A022.getPositionDescription(), "<vector> tag requires viewportWidth > 0"));
        } else if (A002 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            r6.A01 = A022.getDimension(3, r6.A01);
            float dimension = A022.getDimension(2, r6.A00);
            r6.A00 = dimension;
            if (r6.A01 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                throw new XmlPullParserException(AnonymousClass000.A0E(A022.getPositionDescription(), "<vector> tag requires width > 0"));
            } else if (dimension > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                r6.setAlpha(AnonymousClass21B.A00(A022, xmlPullParser2, "alpha", 4, r6.getAlpha()));
                String string = A022.getString(0);
                if (string != null) {
                    r6.A09 = string;
                    r6.A0E.put(string, r6);
                }
                A022.recycle();
                r10.A01 = getChangingConfigurations();
                r10.A0A = true;
                AnonymousClass216 r9 = this.A00;
                AnonymousClass217 r8 = r9.A08;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(r8.A0F);
                int eventType = xmlPullParser2.getEventType();
                int depth = xmlPullParser2.getDepth() + 1;
                boolean z2 = true;
                while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser2.getName();
                        AnonymousClass218 r72 = (AnonymousClass218) arrayDeque.peek();
                        if ("path".equals(name)) {
                            AnonymousClass21C r5 = new AnonymousClass21C();
                            TypedArray A023 = AnonymousClass21B.A02(resources2, theme2, attributeSet2, AnonymousClass21A.A0B);
                            r5.A0B = null;
                            if (AnonymousClass21B.A05(xmlPullParser2, "pathData")) {
                                String string2 = A023.getString(0);
                                if (string2 != null) {
                                    r5.A02 = string2;
                                }
                                String string3 = A023.getString(2);
                                if (string3 != null) {
                                    r5.A03 = AnonymousClass21E.A03(string3);
                                }
                                r5.A09 = AnonymousClass21B.A03(A023, xmlPullParser2, theme2, "fillColor", 1);
                                r5.A00 = AnonymousClass21B.A00(A023, xmlPullParser2, "fillAlpha", 12, r5.A00);
                                int A013 = AnonymousClass21B.A01(A023, xmlPullParser2, "strokeLineCap", 8, -1);
                                Paint.Cap cap = r5.A07;
                                if (A013 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (A013 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (A013 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                r5.A07 = cap;
                                int A014 = AnonymousClass21B.A01(A023, xmlPullParser2, "strokeLineJoin", 9, -1);
                                Paint.Join join = r5.A08;
                                if (A014 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (A014 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (A014 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                r5.A08 = join;
                                r5.A02 = AnonymousClass21B.A00(A023, xmlPullParser2, "strokeMiterLimit", 10, r5.A02);
                                r5.A0A = AnonymousClass21B.A03(A023, xmlPullParser2, theme2, "strokeColor", 3);
                                r5.A01 = AnonymousClass21B.A00(A023, xmlPullParser2, "strokeAlpha", 11, r5.A01);
                                r5.A03 = AnonymousClass21B.A00(A023, xmlPullParser2, "strokeWidth", 4, r5.A03);
                                r5.A04 = AnonymousClass21B.A00(A023, xmlPullParser2, "trimPathEnd", 6, r5.A04);
                                r5.A05 = AnonymousClass21B.A00(A023, xmlPullParser2, "trimPathOffset", 7, r5.A05);
                                r5.A06 = AnonymousClass21B.A00(A023, xmlPullParser2, "trimPathStart", 5, r5.A06);
                                r5.A01 = AnonymousClass21B.A01(A023, xmlPullParser2, "fillType", 13, r5.A01);
                            }
                            A023.recycle();
                            r72.A0C.add(r5);
                            String str = r5.A02;
                            String str2 = str;
                            if (str != null) {
                                r8.A0E.put(str2, r5);
                            }
                            z2 = false;
                            i = r9.A01;
                            i2 = r5.A00;
                        } else if ("clip-path".equals(name)) {
                            C30747Diz diz = new C30747Diz();
                            if (AnonymousClass21B.A05(xmlPullParser2, "pathData")) {
                                TypedArray A024 = AnonymousClass21B.A02(resources2, theme2, attributeSet2, AnonymousClass21A.A09);
                                String string4 = A024.getString(0);
                                if (string4 != null) {
                                    diz.A02 = string4;
                                }
                                String string5 = A024.getString(1);
                                if (string5 != null) {
                                    diz.A03 = AnonymousClass21E.A03(string5);
                                }
                                diz.A01 = AnonymousClass21B.A01(A024, xmlPullParser2, "fillType", 2, 0);
                                A024.recycle();
                            }
                            r72.A0C.add(diz);
                            String str3 = diz.A02;
                            String str4 = str3;
                            if (str3 != null) {
                                r8.A0E.put(str4, diz);
                            }
                            i = r9.A01;
                            i2 = diz.A00;
                        } else if ("group".equals(name)) {
                            AnonymousClass218 r52 = new AnonymousClass218();
                            TypedArray A025 = AnonymousClass21B.A02(resources2, theme2, attributeSet2, AnonymousClass21A.A0A);
                            r52.A09 = null;
                            r52.A02 = AnonymousClass21B.A00(A025, xmlPullParser2, "rotation", 5, r52.A02);
                            r52.A00 = A025.getFloat(1, r52.A00);
                            r52.A01 = A025.getFloat(2, r52.A01);
                            r52.A03 = AnonymousClass21B.A00(A025, xmlPullParser2, "scaleX", 3, r52.A03);
                            r52.A04 = AnonymousClass21B.A00(A025, xmlPullParser2, "scaleY", 4, r52.A04);
                            r52.A05 = AnonymousClass21B.A00(A025, xmlPullParser2, "translateX", 6, r52.A05);
                            r52.A06 = AnonymousClass21B.A00(A025, xmlPullParser2, "translateY", 7, r52.A06);
                            String string6 = A025.getString(0);
                            if (string6 != null) {
                                r52.A08 = string6;
                            }
                            AnonymousClass218.A00(r52);
                            A025.recycle();
                            r72.A0C.add(r52);
                            arrayDeque.push(r52);
                            String str5 = r52.A08;
                            String str6 = str5;
                            if (str5 != null) {
                                r8.A0E.put(str6, r52);
                            }
                            i = r9.A01;
                            i2 = r52.A07;
                        }
                        r9.A01 = i2 | i;
                    } else if (eventType == 3 && "group".equals(xmlPullParser2.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser2.next();
                }
                if (!z2) {
                    this.A03 = A01(r10.A03, r10.A07);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(AnonymousClass000.A0E(A022.getPositionDescription(), "<vector> tag requires height > 0"));
            }
        } else {
            throw new XmlPullParserException(AnonymousClass000.A0E(A022.getPositionDescription(), "<vector> tag requires viewportHeight > 0"));
        }
    }
}
