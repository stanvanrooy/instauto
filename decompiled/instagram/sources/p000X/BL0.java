package p000X;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.BL0 */
public final class BL0 implements BLM {
    public final int APA(Context context, String str) {
        String str2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                str2 = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", str2);
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final int Bv5(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            java.lang.Class<X.BKz> r7 = p000X.C25454BKz.class
            monitor-enter(r7)     // Catch:{ all -> 0x0121 }
            java.lang.Boolean r0 = p000X.C25454BKz.A03     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x00aa
            android.content.Context r0 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0085 }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0085 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r0 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0085 }
            java.lang.Class r5 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0085 }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r6 = r5.getDeclaredField(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0085 }
            monitor-enter(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0085 }
            r4 = 0
            java.lang.Object r1 = r6.get(r4)     // Catch:{ all -> 0x0082 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0039
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0082 }
            if (r1 != r0) goto L_0x0033
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0082 }
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            goto L_0x00a8
        L_0x0033:
            p000X.C25454BKz.A03(r1)     // Catch:{ BKS -> 0x0036 }
        L_0x0036:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0082 }
            goto L_0x0031
        L_0x0039:
            java.lang.String r1 = "com.google.android.gms"
            android.content.Context r0 = r9.getApplicationContext()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0082 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0053
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0082 }
            r6.set(r4, r0)     // Catch:{ all -> 0x0082 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0082 }
            goto L_0x0031
        L_0x0053:
            int r0 = p000X.C25454BKz.A00(r9, r10, r11)     // Catch:{ BKS -> 0x0075 }
            java.lang.String r3 = p000X.C25454BKz.A04     // Catch:{ BKS -> 0x0075 }
            if (r3 == 0) goto L_0x007f
            boolean r1 = r3.isEmpty()     // Catch:{ BKS -> 0x0075 }
            if (r1 != 0) goto L_0x007f
            X.9aa r2 = new X.9aa     // Catch:{ BKS -> 0x0075 }
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ BKS -> 0x0075 }
            r2.<init>(r3, r1)     // Catch:{ BKS -> 0x0075 }
            p000X.C25454BKz.A03(r2)     // Catch:{ BKS -> 0x0075 }
            r6.set(r4, r2)     // Catch:{ BKS -> 0x0075 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ BKS -> 0x0075 }
            p000X.C25454BKz.A03 = r1     // Catch:{ BKS -> 0x0075 }
            goto L_0x007f
        L_0x0075:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0082 }
            r6.set(r4, r0)     // Catch:{ all -> 0x0082 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0082 }
            goto L_0x0031
        L_0x007f:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            monitor-exit(r7)     // Catch:{ all -> 0x011e }
            return r0
        L_0x0082:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x011e }
            int r0 = r2.length()     // Catch:{ all -> 0x011e }
            int r0 = r0 + 30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011e }
            r1.<init>(r0)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "Failed to load module via V2: "
            r1.append(r0)     // Catch:{ all -> 0x011e }
            r1.append(r2)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x011e }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x011e }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x011e }
        L_0x00a8:
            p000X.C25454BKz.A03 = r0     // Catch:{ all -> 0x011e }
        L_0x00aa:
            monitor-exit(r7)     // Catch:{ all -> 0x011e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00b8
            int r0 = p000X.C25454BKz.A00(r9, r10, r11)     // Catch:{ BKS -> 0x00b6 }
            return r0
        L_0x00b6:
            r0 = move-exception
            goto L_0x00fc
        L_0x00b8:
            java.lang.String r3 = "DynamiteModule"
            com.google.android.gms.dynamite.zzi r2 = p000X.C25454BKz.A02(r9)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x011c
            int r1 = r2.BvS()     // Catch:{ RemoteException -> 0x00e0 }
            r0 = 2
            if (r1 < r0) goto L_0x00d1
            com.google.android.gms.dynamic.ObjectWrapper r0 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x00e0 }
            r0.<init>(r9)     // Catch:{ RemoteException -> 0x00e0 }
            int r0 = r2.BvT(r0, r10, r11)     // Catch:{ RemoteException -> 0x00e0 }
            return r0
        L_0x00d1:
            java.lang.String r0 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r3, r0)     // Catch:{ RemoteException -> 0x00e0 }
            com.google.android.gms.dynamic.ObjectWrapper r0 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x00e0 }
            r0.<init>(r9)     // Catch:{ RemoteException -> 0x00e0 }
            int r0 = r2.Bv6(r0, r10, r11)     // Catch:{ RemoteException -> 0x00e0 }
            return r0
        L_0x00e0:
            r0 = move-exception
            java.lang.String r2 = "Failed to retrieve remote module version: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0121 }
            int r0 = r1.length()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = r2.concat(r1)     // Catch:{ all -> 0x0121 }
            goto L_0x0112
        L_0x00f6:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0121 }
            r0.<init>(r2)     // Catch:{ all -> 0x0121 }
            goto L_0x0112
        L_0x00fc:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = "Failed to retrieve remote module version: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0121 }
            int r0 = r1.length()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r2.concat(r1)     // Catch:{ all -> 0x0121 }
        L_0x0112:
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x011c
        L_0x0116:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0121 }
            r0.<init>(r2)     // Catch:{ all -> 0x0121 }
            goto L_0x0112
        L_0x011c:
            r0 = 0
            return r0
        L_0x011e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r3 = move-exception
            p000X.AnonymousClass0a2.A02(r9)     // Catch:{ Exception -> 0x0129 }
            p000X.AnonymousClass0a2.A02(r3)     // Catch:{ Exception -> 0x0129 }
            goto L_0x0131
        L_0x0129:
            r2 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r2)
        L_0x0131:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.BL0.Bv5(android.content.Context, java.lang.String, boolean):int");
    }
}
