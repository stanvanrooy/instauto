package p000X;

import android.util.Log;
import com.facebook.common.dextricks.classid.ClassId;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Cy  reason: invalid class name and case insensitive filesystem */
public final class C04200Cy extends ClassLoader {
    public static C04200Cy A07;
    public ClassLoader A00;
    public ClassLoader A01;
    public Field A02;
    public AtomicReference A03 = new AtomicReference(new ArrayList());
    public boolean A04;
    public ThreadLocal A05 = new ThreadLocal();
    public Method A06;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|(1:18)(2:12|13)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060 A[SYNTHETIC, Splitter:B:12:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075 A[Catch:{ IllegalAccessException -> 0x006f }] */
    public final synchronized void A01(C04210Cz r6) {
        ArrayList arrayList = new ArrayList(((ArrayList) this.A03.get()).size() + 1);
        arrayList.addAll((Collection) this.A03.get());
        arrayList.add(r6);
        this.A03.set(arrayList);
        if (((ArrayList) this.A03.get()).size() == 1) {
            Class.forName(ClassId.class.getName());
            String obj = this.A00.toString();
            if (!this.A00.getParent().toString().startsWith("java.lang.BootClassLoader") || !obj.startsWith("dalvik.system.PathClassLoader")) {
                Log.w("PluginClassLoader", "Non-standard class loader chain. PluginClassLoader not installed");
            } else {
                try {
                    this.A02.set(this.A00, this);
                    this.A04 = true;
                    Log.w("PluginClassLoader", "Installed PluginClassLoader");
                } catch (IllegalAccessException unused) {
                    Log.w("PluginClassLoader", "Failed to install PluginClassLoader");
                }
            }
        }
    }

    public static C04200Cy A00() {
        if (A07 == null) {
            try {
                A07 = new C04200Cy(C04200Cy.class.getClassLoader());
            } catch (NoSuchFieldException | NoSuchMethodException e) {
                Log.w("PluginClassLoader", "PluginClassLoader.get: failed to create instance", e);
            }
        }
        return A07;
    }

    public final Class findClass(String str) {
        ArrayList arrayList;
        Boolean bool = (Boolean) this.A05.get();
        this.A05.set(Boolean.TRUE);
        Class cls = null;
        try {
            arrayList = (ArrayList) this.A03.get();
            if (bool == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C04210Cz) it.next()).A8W(str);
                }
            }
            cls = (Class) this.A06.invoke(this.A00, new Object[]{str});
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("PluginClassLoader", AnonymousClass000.A0E("PluginClassLoader failed: mChildClassLoader.findClass: ", e.getMessage()));
            e.printStackTrace();
        } catch (Throwable th) {
            if (bool == null) {
                this.A05.remove();
            }
            throw th;
        }
        if (cls != null) {
            if (bool == null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C04210Cz) it2.next()).A8U(str, cls);
                }
            }
            if (bool == null) {
                this.A05.remove();
            }
            return cls;
        }
        if (bool == null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((C04210Cz) it3.next()).A8V(str);
            }
        }
        throw new ClassNotFoundException(str);
    }

    public final String toString() {
        return "PluginClassLoader[" + this.A00 + "," + this.A01 + "]";
    }

    public C04200Cy(ClassLoader classLoader) {
        super(classLoader.getParent());
        this.A00 = classLoader;
        this.A01 = classLoader.getParent();
        Class<ClassLoader> cls = ClassLoader.class;
        Method declaredMethod = cls.getDeclaredMethod("findClass", new Class[]{String.class});
        this.A06 = declaredMethod;
        declaredMethod.setAccessible(true);
        Field declaredField = cls.getDeclaredField("parent");
        this.A02 = declaredField;
        declaredField.setAccessible(true);
    }
}
