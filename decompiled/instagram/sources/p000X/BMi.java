package p000X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BMi */
public class BMi extends C25473BMj {
    public final Constructor A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Class A04;
    public final Method A05;
    public final Method A06;

    private boolean A01(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.A05.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface A0A(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A04, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A06.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A0B(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    private boolean A00() {
        if (this.A05 == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.A05 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
    public final Typeface A06(Context context, CancellationSignal cancellationSignal, C25477BMn[] bMnArr, int i) {
        Object obj;
        Object obj2;
        boolean z;
        Typeface A0A;
        boolean z2;
        C25477BMn[] bMnArr2 = bMnArr;
        int length = bMnArr2.length;
        if (length >= 1) {
            int i2 = i;
            CancellationSignal cancellationSignal2 = cancellationSignal;
            Context context2 = context;
            if (!A00()) {
                C25477BMn A09 = A09(bMnArr2, i2);
                ParcelFileDescriptor openFileDescriptor = context2.getContentResolver().openFileDescriptor(A09.A03, "r", cancellationSignal2);
                if (openFileDescriptor != null) {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(A09.A02).setItalic(A09.A04).build();
                    openFileDescriptor.close();
                    return build;
                }
            } else {
                HashMap hashMap = new HashMap();
                for (int i3 = 0; i3 < length; i3++) {
                    C25477BMn bMn = bMnArr[i3];
                    if (bMn.A00 == 0) {
                        Uri uri = bMn.A03;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, AnonymousClass94R.A01(context2, cancellationSignal2, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                try {
                    obj2 = this.A00.newInstance(new Object[0]);
                    obj = obj2;
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    obj2 = null;
                    obj = null;
                }
                if (obj2 != null) {
                    boolean z3 = false;
                    for (int i4 = 0; i4 < length; i4++) {
                        C25477BMn bMn2 = bMnArr[i4];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(bMn2.A03);
                        if (byteBuffer != null) {
                            try {
                                z2 = ((Boolean) this.A02.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(bMn2.A01), null, Integer.valueOf(bMn2.A02), Integer.valueOf(bMn2.A04 ? 1 : 0)})).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                                z2 = false;
                            }
                            if (!z2) {
                                try {
                                    this.A01.invoke(obj, new Object[0]);
                                    return null;
                                } catch (IOException unused3) {
                                }
                            } else {
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        this.A01.invoke(obj, new Object[0]);
                        return null;
                    }
                    try {
                        z = ((Boolean) this.A03.invoke(obj, new Object[0])).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                        z = false;
                    }
                    if (z && (A0A = A0A(obj)) != null) {
                        return Typeface.create(A0A, i2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    public BMi() {
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            Class cls3 = Integer.TYPE;
            Class cls4 = FontVariationAxis[].class;
            method = cls2.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, cls4});
            method2 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls3, cls4, cls3, cls3});
            method3 = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = A0B(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", AnonymousClass000.A0E("Unable to collect necessary methods for class ", e.getClass().getName()), e);
            method5 = cls;
            constructor = cls;
            method = cls;
            method2 = cls;
            method3 = cls;
            method4 = cls;
            cls = cls;
        }
        this.A04 = cls;
        this.A00 = constructor;
        this.A05 = method;
        this.A02 = method2;
        this.A03 = method3;
        this.A01 = method4;
        this.A06 = method5;
    }

    public final Typeface A05(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        boolean z;
        Context context2 = context;
        String str2 = str;
        if (!A00()) {
            return super.A05(context, resources, i, str, i2);
        }
        try {
            obj = this.A00.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!A01(context2, obj, str2, 0, -1, -1, (FontVariationAxis[]) null)) {
                try {
                    this.A01.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
            try {
                z = ((Boolean) this.A03.invoke(obj, new Object[0])).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused3) {
                z = false;
            }
            if (z) {
                return A0A(obj);
            }
        }
        return null;
    }

    public final Typeface A07(Context context, C25482BMs bMs, Resources resources, int i) {
        Object obj;
        boolean z;
        Context context2 = context;
        if (!A00()) {
            return super.A07(context, bMs, resources, i);
        }
        try {
            obj = this.A00.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C25480BMq bMq : bMs.A00) {
                if (!A01(context2, obj, bMq.A05, bMq.A01, bMq.A02, bMq.A04 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(bMq.A03))) {
                    try {
                        this.A01.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    return null;
                }
            }
            try {
                z = ((Boolean) this.A03.invoke(obj, new Object[0])).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused3) {
                z = false;
            }
            if (z) {
                return A0A(obj);
            }
        }
        return null;
    }
}
