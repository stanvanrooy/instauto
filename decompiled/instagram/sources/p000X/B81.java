package p000X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;

/* renamed from: X.B81 */
public final class B81 extends B86 {
    public static final B81 A06 = new B81();
    public int A00;
    public C30179DUa A01;
    public B80 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public static int A00(Context context) {
        ServiceInfo[] serviceInfoArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i == 0 && ((serviceInfoArr = packageInfo.services) == null || serviceInfoArr.length == 0)) {
                return -1;
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void A01(Context context) {
        B84 b84;
        if (!this.A04) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("com.google.ar.core")) {
                    this.A05 = bundle.getString("com.google.ar.core").equals("required");
                    if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                        this.A00 = bundle.getInt("com.google.ar.core.min_apk_version");
                        this.A04 = true;
                    } else {
                        b84 = new B84("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                    }
                } else {
                    b84 = new B84("Application manifest must contain meta-data com.google.ar.core");
                }
                throw b84;
            } catch (PackageManager.NameNotFoundException e) {
                throw new B84((Throwable) e);
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ef A[SYNTHETIC, Splitter:B:62:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f2 A[Catch:{ B9h -> 0x00f8, B9f | RuntimeException -> 0x00f5 }] */
    public final p000X.C30179DUa A02(android.content.Context r9) {
        /*
            r8 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 1
            r1 = 24
            r0 = 0
            if (r2 < r1) goto L_0x0009
            r0 = 1
        L_0x0009:
            if (r0 != 0) goto L_0x000e
            X.DUa r0 = p000X.C30179DUa.A07
            return r0
        L_0x000e:
            r8.A01(r9)     // Catch:{ B84 -> 0x01ee }
            int r0 = A00(r9)     // Catch:{ B84 -> 0x01ee }
            if (r0 == 0) goto L_0x0020
            int r2 = A00(r9)     // Catch:{ B84 -> 0x01ee }
            int r1 = r8.A00     // Catch:{ B84 -> 0x01ee }
            r0 = 0
            if (r2 < r1) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r0 == 0) goto L_0x00fe
            r4 = r8
            monitor-enter(r4)     // Catch:{ B84 -> 0x01ee }
            X.B80 r3 = r8.A02     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x004c
            monitor-enter(r3)     // Catch:{ all -> 0x00fb }
            int r1 = r3.A04     // Catch:{ all -> 0x0049 }
            int r1 = r1 - r6
            if (r1 == 0) goto L_0x0044
            if (r1 == r6) goto L_0x0035
            r0 = 2
            if (r1 == r0) goto L_0x0035
            goto L_0x0044
        L_0x0035:
            android.content.Context r2 = r3.A00     // Catch:{ all -> 0x0049 }
            android.content.ServiceConnection r1 = r3.A02     // Catch:{ all -> 0x0049 }
            r0 = 2005787372(0x778de2ec, float:5.755597E33)
            p000X.AnonymousClass0ZI.A01(r2, r1, r0)     // Catch:{ all -> 0x0049 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0049 }
            r3.A04 = r6     // Catch:{ all -> 0x0049 }
        L_0x0044:
            monitor-exit(r3)     // Catch:{ all -> 0x00fb }
            r0 = 0
            r8.A02 = r0     // Catch:{ all -> 0x00fb }
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x004c:
            monitor-exit(r4)     // Catch:{ B84 -> 0x01ee }
            java.lang.String r3 = ""
            r4 = 0
            android.content.ContentResolver r5 = r9.getContentResolver()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            r1.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r1 = r1.scheme(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.String r0 = "com.google.ar.core.services.arcorecontentprovider"
            android.net.Uri$Builder r0 = r1.authority(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            android.net.Uri r2 = r0.build()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.String r1 = "getSetupIntent"
            java.lang.String r0 = r9.getPackageName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            android.os.Bundle r2 = r5.call(r2, r1, r0, r4)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            if (r2 == 0) goto L_0x00ec
            java.lang.String r0 = "intent"
            android.os.Parcelable r0 = r2.getParcelable(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "exceptionType"
            java.lang.String r1 = r2.getString(r0, r3)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            boolean r0 = r1.isEmpty()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            if (r0 != 0) goto L_0x00ec
            java.lang.Class<X.B9h> r0 = p000X.C25235B9h.class
            java.lang.String r0 = r0.getName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            boolean r0 = r1.equals(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            if (r0 != 0) goto L_0x00e4
            java.lang.Class<X.B9f> r0 = p000X.C25234B9f.class
            java.lang.String r0 = r0.getName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            boolean r0 = r1.equals(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            if (r0 != 0) goto L_0x00de
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            java.lang.Class r5 = r1.asSubclass(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.String r0 = "exceptionText"
            java.lang.String r3 = r2.getString(r0, r4)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            r2 = 0
            if (r3 == 0) goto L_0x00cf
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r2] = r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.reflect.Constructor r1 = r5.getConstructor(r1)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            r0[r2] = r3     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            goto L_0x00dd
        L_0x00cf:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.reflect.Constructor r1 = r5.getConstructor(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
        L_0x00dd:
            throw r0     // Catch:{ B9h -> 0x00f8, B9f | RuntimeException -> 0x00f5 }
        L_0x00de:
            X.B9f r0 = new X.B9f     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            r0.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            throw r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
        L_0x00e4:
            X.B9h r0 = new X.B9h     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            r0.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
            throw r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x00ea, B9f | RuntimeException -> 0x00f5 }
        L_0x00ea:
            r0 = r4
            goto L_0x00ed
        L_0x00ec:
            r0 = r4
        L_0x00ed:
            if (r0 == 0) goto L_0x00f2
            X.DUa r0 = p000X.C30179DUa.A02     // Catch:{ B9h -> 0x00f8, B9f | RuntimeException -> 0x00f5 }
            return r0
        L_0x00f2:
            X.DUa r0 = p000X.C30179DUa.A03     // Catch:{ B9h -> 0x00f8, B9f | RuntimeException -> 0x00f5 }
            return r0
        L_0x00f5:
            X.DUa r0 = p000X.C30179DUa.A06     // Catch:{ B84 -> 0x01ee }
            return r0
        L_0x00f8:
            X.DUa r0 = p000X.C30179DUa.A07     // Catch:{ B84 -> 0x01ee }
            return r0
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ B84 -> 0x01ee }
            throw r0     // Catch:{ B84 -> 0x01ee }
        L_0x00fe:
            monitor-enter(r8)
            X.DUa r0 = r8.A01     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0109
            boolean r0 = r0.A00()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x013b
        L_0x0109:
            boolean r0 = r8.A03     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x013b
            r8.A03 = r6     // Catch:{ all -> 0x01eb }
            X.B85 r5 = new X.B85     // Catch:{ all -> 0x01eb }
            r5.<init>(r8)     // Catch:{ all -> 0x01eb }
            r8.A01(r9)     // Catch:{ all -> 0x01eb }
            int r0 = A00(r9)     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0126
            int r2 = A00(r9)     // Catch:{ all -> 0x01eb }
            int r1 = r8.A00     // Catch:{ all -> 0x01eb }
            r0 = 0
            if (r2 < r1) goto L_0x0127
        L_0x0126:
            r0 = 1
        L_0x0127:
            if (r0 == 0) goto L_0x012f
            X.DUa r0 = p000X.C30179DUa.A03     // Catch:{ all -> 0x01eb }
            r5.A00(r0)     // Catch:{ all -> 0x01eb }
            goto L_0x013b
        L_0x012f:
            int r1 = A00(r9)     // Catch:{ all -> 0x01eb }
            r0 = -1
            if (r1 == r0) goto L_0x0142
            X.DUa r0 = p000X.C30179DUa.A02     // Catch:{ all -> 0x01eb }
            r5.A00(r0)     // Catch:{ all -> 0x01eb }
        L_0x013b:
            X.DUa r0 = r8.A01     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01cf
            monitor-exit(r8)     // Catch:{ all -> 0x01eb }
            goto L_0x01ce
        L_0x0142:
            r8.A01(r9)     // Catch:{ all -> 0x01eb }
            boolean r0 = r8.A05     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x014f
            X.DUa r0 = p000X.C30179DUa.A04     // Catch:{ all -> 0x01eb }
            r5.A00(r0)     // Catch:{ all -> 0x01eb }
            goto L_0x013b
        L_0x014f:
            r7 = r8
            monitor-enter(r7)     // Catch:{ all -> 0x01eb }
            X.B80 r0 = r8.A02     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x0195
            X.B80 r3 = new X.B80     // Catch:{ all -> 0x01e5 }
            r3.<init>()     // Catch:{ all -> 0x01e5 }
            android.content.Context r6 = r9.getApplicationContext()     // Catch:{ all -> 0x01e5 }
            monitor-enter(r3)     // Catch:{ all -> 0x01e5 }
            r3.A00 = r6     // Catch:{ all -> 0x01e2 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "com.google.android.play.core.install.BIND_INSTALL_SERVICE"
            r1.<init>(r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "com.android.vending"
            android.content.Intent r4 = r1.setPackage(r0)     // Catch:{ all -> 0x01e2 }
            android.content.ServiceConnection r2 = r3.A02     // Catch:{ all -> 0x01e2 }
            r1 = 1
            r0 = 1511237679(0x5a13a82f, float:1.03904353E16)
            boolean r0 = p000X.AnonymousClass0ZI.A02(r6, r4, r2, r1, r0)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x017e
            r0 = 2
            r3.A04 = r0     // Catch:{ all -> 0x01e2 }
            goto L_0x0192
        L_0x017e:
            r3.A04 = r1     // Catch:{ all -> 0x01e2 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x01e2 }
            java.lang.String r1 = "ARCore-InstallService"
            java.lang.String r0 = "bindService returned false."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x01e2 }
            android.content.ServiceConnection r1 = r3.A02     // Catch:{ all -> 0x01e2 }
            r0 = -1484867019(0xffffffffa77eba35, float:-3.5350524E-15)
            p000X.AnonymousClass0ZI.A01(r6, r1, r0)     // Catch:{ all -> 0x01e2 }
        L_0x0192:
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            r8.A02 = r3     // Catch:{ all -> 0x01e5 }
        L_0x0195:
            X.B80 r4 = r8.A02     // Catch:{ all -> 0x01e5 }
            monitor-exit(r7)     // Catch:{ all -> 0x01eb }
            monitor-enter(r4)     // Catch:{ all -> 0x01eb }
            X.B82 r3 = new X.B82     // Catch:{ B87 -> 0x01bf }
            r3.<init>(r4, r9, r5)     // Catch:{ B87 -> 0x01bf }
            r2 = r4
            monitor-enter(r2)     // Catch:{ B87 -> 0x01bf }
            int r1 = r4.A04     // Catch:{ all -> 0x01bc }
            r0 = 1
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x01b6
            if (r1 == r0) goto L_0x01af
            r0 = 2
            if (r1 != r0) goto L_0x01b4
            r3.run()     // Catch:{ all -> 0x01bc }
            goto L_0x01b4
        L_0x01af:
            java.util.Queue r0 = r4.A03     // Catch:{ all -> 0x01bc }
            r0.offer(r3)     // Catch:{ all -> 0x01bc }
        L_0x01b4:
            monitor-exit(r2)     // Catch:{ B87 -> 0x01bf }
            goto L_0x01cb
        L_0x01b6:
            X.B87 r0 = new X.B87     // Catch:{ all -> 0x01bc }
            r0.<init>()     // Catch:{ all -> 0x01bc }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ B87 -> 0x01bf }
            throw r0     // Catch:{ B87 -> 0x01bf }
        L_0x01bf:
            java.lang.String r1 = "ARCore-InstallService"
            java.lang.String r0 = "Play Store install service could not be bound."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x01e8 }
            X.DUa r0 = p000X.C30179DUa.A06     // Catch:{ all -> 0x01e8 }
            r5.A00(r0)     // Catch:{ all -> 0x01e8 }
        L_0x01cb:
            monitor-exit(r4)     // Catch:{ all -> 0x01eb }
            goto L_0x013b
        L_0x01ce:
            return r0
        L_0x01cf:
            boolean r0 = r8.A03     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01d7
            X.DUa r0 = p000X.C30179DUa.A05     // Catch:{ all -> 0x01eb }
            monitor-exit(r8)     // Catch:{ all -> 0x01eb }
            return r0
        L_0x01d7:
            java.lang.String r1 = "ARCore-ArCoreApk"
            java.lang.String r0 = "request not running but result is null?"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x01eb }
            X.DUa r0 = p000X.C30179DUa.A06     // Catch:{ all -> 0x01eb }
            monitor-exit(r8)     // Catch:{ all -> 0x01eb }
            return r0
        L_0x01e2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            throw r0     // Catch:{ all -> 0x01e5 }
        L_0x01e5:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01eb }
            goto L_0x01ea
        L_0x01e8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01eb }
        L_0x01ea:
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01eb }
            throw r0
        L_0x01ee:
            r2 = move-exception
            java.lang.String r1 = "ARCore-ArCoreApk"
            java.lang.String r0 = "Error while checking app details and ARCore status"
            android.util.Log.e(r1, r0, r2)
            X.DUa r0 = p000X.C30179DUa.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.B81.A02(android.content.Context):X.DUa");
    }
}
