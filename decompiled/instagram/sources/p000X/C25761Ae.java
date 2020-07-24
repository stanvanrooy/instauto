package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.facebook.C0003R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1Ae  reason: invalid class name and case insensitive filesystem */
public final class C25761Ae {
    public static C25761Ae A07;
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public static final C25771Af A09 = new C25771Af();
    public TypedValue A00;
    public AnonymousClass1Ah A01;
    public AnonymousClass00N A02;
    public AnonymousClass00O A03;
    public WeakHashMap A04;
    public boolean A05;
    public final WeakHashMap A06 = new WeakHashMap(0);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return null;
     */
    private synchronized Drawable A01(Context context, long j) {
        WeakReference weakReference;
        AnonymousClass008 r3 = (AnonymousClass008) this.A06.get(context);
        if (!(r3 == null || (weakReference = (WeakReference) r3.A04(j, (Object) null)) == null)) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            r3.A06(j);
        }
    }

    private synchronized void A03(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            AnonymousClass008 r1 = (AnonymousClass008) this.A06.get(context);
            if (r1 == null) {
                r1 = new AnonymousClass008();
                this.A06.put(context, r1);
            }
            r1.A08(j, new WeakReference(constantState));
        }
    }

    public final synchronized ColorStateList A06(Context context, int i) {
        ColorStateList colorStateList;
        AnonymousClass00O r0;
        WeakHashMap weakHashMap = this.A04;
        ColorStateList colorStateList2 = null;
        if (!(weakHashMap == null || (r0 = (AnonymousClass00O) weakHashMap.get(context)) == null)) {
            colorStateList2 = (ColorStateList) r0.A03(i);
        }
        if (colorStateList == null) {
            AnonymousClass1Ah r02 = this.A01;
            if (r02 == null) {
                colorStateList = null;
            } else {
                colorStateList = r02.AYN(context, i);
            }
            if (colorStateList != null) {
                if (this.A04 == null) {
                    this.A04 = new WeakHashMap();
                }
                AnonymousClass00O r1 = (AnonymousClass00O) this.A04.get(context);
                if (r1 == null) {
                    r1 = new AnonymousClass00O(10);
                    this.A04.put(context, r1);
                }
                r1.A05(i, colorStateList);
            }
        }
        return colorStateList;
    }

    public final synchronized Drawable A07(Context context, int i) {
        return A08(context, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016b, code lost:
        if (r1 == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ("android.graphics.drawable.VectorDrawable".equals(r1.getClass().getName()) != false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ae A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4 A[Catch:{ Exception -> 0x00dc }] */
    public final synchronized Drawable A08(Context context, int i, boolean z) {
        Drawable drawable;
        boolean z2;
        PorterDuff.Mode mode;
        int next;
        boolean z3;
        if (!this.A05) {
            this.A05 = true;
            Drawable A072 = A07(context, C0003R.C0004drawable.abc_vector_test);
            if (A072 != null) {
                if (!(A072 instanceof C25851Ap)) {
                    z3 = false;
                }
                z3 = true;
                if (z3) {
                }
            }
            this.A05 = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        AnonymousClass00N r3 = this.A02;
        Drawable drawable2 = null;
        if (r3 != null && !r3.isEmpty()) {
            AnonymousClass00O r0 = this.A03;
            if (r0 != null) {
                String str = (String) r0.A03(i);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && r3.get(str) == null) {
                    }
                }
            } else {
                this.A03 = new AnonymousClass00O(10);
            }
            if (this.A00 == null) {
                this.A00 = new TypedValue();
            }
            TypedValue typedValue = this.A00;
            Resources resources = context.getResources();
            resources.getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            drawable2 = A01(context, j);
            if (drawable2 == null) {
                CharSequence charSequence = typedValue.string;
                if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i);
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        while (true) {
                            next = xml.next();
                            if (next == 2 || next == 1) {
                                if (next != 2) {
                                    String name = xml.getName();
                                    this.A03.A05(i, name);
                                    AnonymousClass213 r5 = (AnonymousClass213) this.A02.get(name);
                                    if (r5 != null) {
                                        drawable2 = r5.AAY(context, xml, asAttributeSet, context.getTheme());
                                    }
                                    if (drawable2 != null) {
                                        drawable2.setChangingConfigurations(typedValue.changingConfigurations);
                                        A03(context, j, drawable2);
                                    }
                                } else {
                                    throw new XmlPullParserException("No start tag found");
                                }
                            }
                        }
                        if (next != 2) {
                        }
                    } catch (Exception e) {
                        Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
                    }
                }
                if (drawable2 == null) {
                    this.A03.A05(i, "appcompat_skip_skip");
                }
            }
        }
        if (drawable == null) {
            if (this.A00 == null) {
                this.A00 = new TypedValue();
            }
            TypedValue typedValue2 = this.A00;
            context.getResources().getValue(i, typedValue2, true);
            long j2 = (((long) typedValue2.assetCookie) << 32) | ((long) typedValue2.data);
            drawable = A01(context, j2);
            if (drawable == null) {
                AnonymousClass1Ah r2 = this.A01;
                if (r2 == null) {
                    drawable = null;
                } else {
                    drawable = r2.AAR(this, context, i);
                }
                if (drawable != null) {
                    drawable.setChangingConfigurations(typedValue2.changingConfigurations);
                    A03(context, j2, drawable);
                }
            }
        }
        if (drawable == null) {
            drawable = C019000b.A03(context, i);
        }
        if (drawable != null) {
            ColorStateList A062 = A06(context, i);
            if (A062 != null) {
                if (C25841Ao.A03(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable = C55072a1.A02(drawable);
                C55072a1.A08(drawable, A062);
                AnonymousClass1Ah r02 = this.A01;
                if (r02 == null) {
                    mode = null;
                } else {
                    mode = r02.AYO(i);
                }
                if (mode != null) {
                    C55072a1.A0B(drawable, mode);
                }
            } else {
                AnonymousClass1Ah r03 = this.A01;
                if (r03 == null || !r03.BrL(context, i, drawable)) {
                    AnonymousClass1Ah r04 = this.A01;
                    if (r04 != null) {
                        boolean BrM = r04.BrM(context, i, drawable);
                        z2 = true;
                    }
                    z2 = false;
                    if (!z2 && z) {
                        drawable = null;
                    }
                }
            }
        }
        if (drawable != null) {
            C25841Ao.A02(drawable);
        }
        return drawable;
    }

    public static synchronized PorterDuffColorFilter A00(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C25761Ae.class) {
            C25771Af r3 = A09;
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) r3.A00(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                r3.A01(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized C25761Ae A02() {
        C25761Ae r0;
        synchronized (C25761Ae.class) {
            if (A07 == null) {
                C25761Ae r2 = new C25761Ae();
                A07 = r2;
                if (Build.VERSION.SDK_INT < 24) {
                    r2.A05("vector", new AnonymousClass212());
                    r2.A05("animated-vector", new AnonymousClass214());
                    r2.A05("animated-selector", new AnonymousClass215());
                }
            }
            r0 = A07;
        }
        return r0;
    }

    private void A05(String str, AnonymousClass213 r3) {
        if (this.A02 == null) {
            this.A02 = new AnonymousClass00N();
        }
        this.A02.put(str, r3);
    }

    public static void A04(Drawable drawable, C474123v r4, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuffColorFilter porterDuffColorFilter;
        if (!C25841Ao.A03(drawable) || drawable.mutate() == drawable) {
            boolean z = r4.A02;
            if (z || r4.A03) {
                if (z) {
                    colorStateList = r4.A00;
                } else {
                    colorStateList = null;
                }
                if (r4.A03) {
                    mode = r4.A01;
                } else {
                    mode = A08;
                }
                if (colorStateList == null || mode == null) {
                    porterDuffColorFilter = null;
                } else {
                    porterDuffColorFilter = A00(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
}
