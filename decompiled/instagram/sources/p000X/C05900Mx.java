package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.0Mx  reason: invalid class name and case insensitive filesystem */
public final class C05900Mx {
    public static C05900Mx A04;
    public static final C05920Mz A05 = new C05920Mz();
    public final Context A00;
    public final Resources A01;
    public final Map A02;
    public final Map A03;

    public C05900Mx(Context context) {
        C13150hy.A02(context, "context");
        this.A00 = context;
        this.A01 = context.getResources();
        Class<AnonymousClass0N4> cls = AnonymousClass0N4.class;
        Map synchronizedMap = Collections.synchronizedMap(new EnumMap(cls));
        C13150hy.A01(synchronizedMap, "synchronizedMap(EnumMap(FontFamily::class.java))");
        this.A03 = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new EnumMap(cls));
        C13150hy.A01(synchronizedMap2, "synchronizedMap(EnumMap(FontFamily::class.java))");
        this.A02 = synchronizedMap2;
    }

    private final Typeface A00(AnonymousClass0N4 r6) {
        File file;
        C204728pT r0 = (C204728pT) this.A02.get(r6);
        if (r0 == null || (file = (File) r0.A00()) == null) {
            AnonymousClass0DB.A0D("TypefaceRepository", AnonymousClass000.A0J("Requested font, ", r6.name(), ", is a remote typeface and is not available."));
            return null;
        }
        try {
            return Typeface.createFromFile(file);
        } catch (RuntimeException e) {
            this.A02.remove(r6);
            AnonymousClass0QD.A0A("TypefaceRepository", e);
            return null;
        }
    }

    public final Typeface A01(AnonymousClass0N4 r6) {
        C13150hy.A02(r6, "font");
        Typeface typeface = (Typeface) this.A03.get(r6);
        if (typeface == null) {
            String str = r6.A01;
            if (str != null) {
                int i = C05910My.A00[r6.ordinal()];
                int i2 = 2;
                if (i != 1) {
                    i2 = 1;
                    if (i != 2) {
                        i2 = 0;
                    }
                }
                typeface = Typeface.create(str, i2);
            } else if (r6.A00 != null) {
                Resources resources = this.A01;
                C13150hy.A01(resources, "resources");
                typeface = Typeface.createFromAsset(resources.getAssets(), r6.A00);
                if (typeface == null) {
                    AnonymousClass0QD.A01("TypefaceRepository", AnonymousClass000.A0J("Requested font, ", r6.name(), ", is a asset typeface and is not available."));
                    typeface = null;
                } else if (C13150hy.A05(typeface, Typeface.DEFAULT)) {
                    AnonymousClass0QD.A01("TypefaceRepository", AnonymousClass000.A0J("Requested font, ", r6.name(), ", is not supported by this device."));
                }
            } else if (r6.A00() != null) {
                typeface = A00(r6);
            } else {
                AnonymousClass0QD.A02("TypefaceRepository", AnonymousClass000.A0J("The requested font, ", r6.name(), ", does not have a backing source. You need to provide either a systemFontName, assetFontName, or a fileDescriptor."));
                return null;
            }
            if (typeface != null) {
                this.A03.put(r6, typeface);
            }
        }
        return typeface;
    }
}
