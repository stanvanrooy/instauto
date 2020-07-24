package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.00p  reason: invalid class name and case insensitive filesystem */
public final class C020100p {
    public static final Set A00 = new HashSet();
    public static final boolean A01;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        A01 = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r2 = r2.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0172, code lost:
        if (r4.getLong(p000X.AnonymousClass000.A0E("", "crc"), -1) != r26) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0267, code lost:
        if (r0 == -1) goto L_0x0269;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x0339 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x03d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03c0 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ce A[SYNTHETIC, Splitter:B:126:0x03ce] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03e1 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02d7 A[SYNTHETIC, Splitter:B:91:0x02d7] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02f1 A[Catch:{ all -> 0x00e1 }] */
    public static void A01(Context context) {
        ApplicationInfo applicationInfo;
        FileChannel fileChannel;
        FileLock fileLock;
        boolean z;
        ArrayList arrayList;
        IOException[] iOExceptionArr;
        List list;
        long j;
        List list2;
        if (!A01) {
            try {
                applicationInfo = context.getApplicationInfo();
            } catch (RuntimeException e) {
                try {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                    applicationInfo = null;
                } catch (Exception e2) {
                    Log.e("MultiDex", "MultiDex installation failure", e2);
                    throw new RuntimeException(AnonymousClass000.A0J("MultiDex installation failed (", e2.getMessage(), ")."));
                }
            }
            if (applicationInfo != null) {
                File file = new File(applicationInfo.sourceDir);
                File file2 = new File(applicationInfo.dataDir);
                Set set = A00;
                synchronized (set) {
                    if (!set.contains(file)) {
                        set.add(file);
                        int i = Build.VERSION.SDK_INT;
                        if (i > 20) {
                            Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i + ": SDK version higher than " + 20 + " should be backed by " + "runtime with built-in multidex capabilty but it's not the " + "case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                        }
                        try {
                            ClassLoader classLoader = context.getClassLoader();
                            if (classLoader == null) {
                                Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                            } else {
                                try {
                                    File file3 = new File(context.getFilesDir(), "secondary-dexes");
                                    if (file3.isDirectory()) {
                                        file3.getPath();
                                        File[] listFiles = file3.listFiles();
                                        if (listFiles == null) {
                                            Log.w("MultiDex", AnonymousClass000.A0J("Failed to list secondary dex dir content (", file3.getPath(), ")."));
                                        } else {
                                            for (File file4 : listFiles) {
                                                file4.getPath();
                                                file4.length();
                                                if (!file4.delete()) {
                                                    Log.w("MultiDex", AnonymousClass000.A0E("Failed to delete old file ", file4.getPath()));
                                                } else {
                                                    file4.getPath();
                                                }
                                            }
                                            if (!file3.delete()) {
                                                Log.w("MultiDex", AnonymousClass000.A0E("Failed to delete secondary dex dir ", file3.getPath()));
                                            } else {
                                                file3.getPath();
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                                }
                                File file5 = new File(file2, "code_cache");
                                A02(file5);
                                file5 = new File(context.getFilesDir(), "code_cache");
                                A02(file5);
                                File file6 = new File(file5, "secondary-dexes");
                                A02(file6);
                                file.getPath();
                                long A002 = C020500t.A00(file);
                                File file7 = new File(file6, "MultiDex.lock");
                                File file8 = file7;
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file8, "rw");
                                IOException e3 = null;
                                try {
                                    fileChannel = randomAccessFile.getChannel();
                                    try {
                                        file8.getPath();
                                        fileLock = fileChannel.lock();
                                        if (fileLock != null) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException e4) {
                                                e3 = e4;
                                                Log.e("MultiDex", AnonymousClass000.A0E("Failed to release lock on ", file7.getPath()));
                                            }
                                        }
                                        C020500t.A02(fileChannel);
                                        C020500t.A02(randomAccessFile);
                                        if (e3 != null) {
                                            arrayList.size();
                                            if (!arrayList.isEmpty()) {
                                                ClassLoader classLoader2 = classLoader;
                                                Object obj = A00(classLoader2, "pathList").get(classLoader2);
                                                ArrayList arrayList2 = new ArrayList();
                                                Object arrayList3 = new ArrayList(arrayList);
                                                Class<ArrayList> cls = ArrayList.class;
                                                Class[] clsArr = {cls, File.class, cls};
                                                Class cls2 = obj.getClass();
                                                Class cls3 = cls2;
                                                while (cls2 != null) {
                                                    Method declaredMethod = cls2.getDeclaredMethod("makeDexElements", clsArr);
                                                    if (!declaredMethod.isAccessible()) {
                                                        declaredMethod.setAccessible(true);
                                                    }
                                                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, new Object[]{arrayList3, file6, arrayList2});
                                                    Field A003 = A00(obj, "dexElements");
                                                    Object[] objArr2 = (Object[]) A003.get(obj);
                                                    Class<?> componentType = objArr2.getClass().getComponentType();
                                                    int length = objArr2.length;
                                                    int length2 = objArr.length;
                                                    Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + length2);
                                                    System.arraycopy(objArr2, 0, objArr3, 0, length);
                                                    System.arraycopy(objArr, 0, objArr3, length, length2);
                                                    A003.set(obj, objArr3);
                                                    if (arrayList2.size() > 0) {
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                                                        }
                                                        Field A004 = A00(obj, "dexElementsSuppressedExceptions");
                                                        IOException[] iOExceptionArr2 = (IOException[]) A004.get(obj);
                                                        if (iOExceptionArr2 == null) {
                                                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                                                        } else {
                                                            int size = arrayList2.size();
                                                            int length3 = iOExceptionArr2.length;
                                                            iOExceptionArr = new IOException[(size + length3)];
                                                            arrayList2.toArray(iOExceptionArr);
                                                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr, arrayList2.size(), length3);
                                                        }
                                                        A004.set(obj, iOExceptionArr);
                                                    }
                                                }
                                                th = new NoSuchMethodException("Method " + "makeDexElements" + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls3);
                                                throw th;
                                            }
                                        } else {
                                            throw e3;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileLock = null;
                                        if (fileLock != null) {
                                            fileLock.release();
                                            Log.e("MultiDex", AnonymousClass000.A0E("Failed to release lock on ", file7.getPath()));
                                        }
                                        if (fileChannel != null) {
                                            C020500t.A02(fileChannel);
                                        }
                                        C020500t.A02(randomAccessFile);
                                        throw th;
                                    }
                                    try {
                                        file8.getPath();
                                        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                                        long j2 = sharedPreferences.getLong(AnonymousClass000.A0E("", "timestamp"), -1);
                                        long lastModified = file.lastModified();
                                        if (lastModified == -1) {
                                            lastModified--;
                                        }
                                        if (j2 == lastModified) {
                                            z = false;
                                        }
                                        z = true;
                                        if (!z) {
                                            String A0E = AnonymousClass000.A0E(file.getName(), ".classes");
                                            SharedPreferences sharedPreferences2 = context.getSharedPreferences("multidex.version", 4);
                                            int i2 = sharedPreferences2.getInt(AnonymousClass000.A0E("", "dex.number"), 1);
                                            ArrayList arrayList4 = new ArrayList(i2 - 1);
                                            int i3 = 2;
                                            while (i3 <= i2) {
                                                C020400s r8 = new C020400s(file6, AnonymousClass000.A06(A0E, i3, ".zip"));
                                                if (r8.isFile()) {
                                                    r8.A00 = C020500t.A00(r8);
                                                    String str = "";
                                                    SharedPreferences sharedPreferences3 = sharedPreferences2;
                                                    long j3 = sharedPreferences3.getLong(AnonymousClass000.A0G(str, "dex.crc.", i3), -1);
                                                    long j4 = sharedPreferences3.getLong(AnonymousClass000.A0G(str, "dex.time.", i3), -1);
                                                    long lastModified2 = r8.lastModified();
                                                    if (j4 == lastModified2 && j3 == r8.A00) {
                                                        arrayList4.add(r8);
                                                        i3++;
                                                    } else {
                                                        throw new IOException("Invalid extracted dex: " + r8 + " (key \"" + "" + "\"), expected modification time: " + j4 + ", modification time: " + lastModified2 + ", expected crc: " + j3 + ", file crc: " + r8.A00);
                                                    }
                                                } else {
                                                    throw new IOException(AnonymousClass000.A0J("Missing extracted secondary dex file '", r8.getPath(), "'"));
                                                }
                                            }
                                            arrayList = arrayList4;
                                        } else {
                                            List A012 = C020500t.A01(file, file6);
                                            j = file.lastModified();
                                            list2 = A012;
                                            list = A012;
                                        }
                                    } catch (IOException e5) {
                                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e5);
                                        List A013 = C020500t.A01(file, file6);
                                        j = file.lastModified();
                                        list = A013;
                                        if (j == -1) {
                                            list2 = A013;
                                            j--;
                                            list = list2;
                                        }
                                        List<C020400s> list3 = list;
                                        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
                                        String str2 = "";
                                        edit.putLong(AnonymousClass000.A0E(str2, "timestamp"), j);
                                        edit.putLong(AnonymousClass000.A0E(str2, "crc"), A002);
                                        edit.putInt(AnonymousClass000.A0E("", "dex.number"), list3.size() + 1);
                                        int i4 = 2;
                                        for (C020400s r4 : list3) {
                                            edit.putLong(AnonymousClass000.A0G("", "dex.crc.", i4), r4.A00);
                                            edit.putLong(AnonymousClass000.A0G("", "dex.time.", i4), r4.lastModified());
                                            i4++;
                                        }
                                        edit.commit();
                                        arrayList = list;
                                        if (fileLock != null) {
                                        }
                                        C020500t.A02(fileChannel);
                                        C020500t.A02(randomAccessFile);
                                        if (e3 != null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (fileLock != null) {
                                        }
                                        if (fileChannel != null) {
                                        }
                                        C020500t.A02(randomAccessFile);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileChannel = null;
                                    fileLock = null;
                                    if (fileLock != null) {
                                    }
                                    if (fileChannel != null) {
                                    }
                                    C020500t.A02(randomAccessFile);
                                    throw th;
                                }
                            }
                        } catch (RuntimeException e6) {
                            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e6);
                        }
                    }
                }
            }
        }
    }

    public static Field A00(Object obj, String str) {
        Class cls = obj.getClass();
        Class cls2 = cls;
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField.isAccessible()) {
                    return declaredField;
                }
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls2);
    }

    public static void A02(File file) {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                str = AnonymousClass000.A0J("Failed to create dir ", file.getPath(), ". Parent file is null.");
            } else {
                str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            Log.e("MultiDex", str);
            throw new IOException(AnonymousClass000.A0E("Failed to create directory ", file.getPath()));
        }
    }
}
