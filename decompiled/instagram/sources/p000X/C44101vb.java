package p000X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1vb  reason: invalid class name and case insensitive filesystem */
public final class C44101vb {
    public static AnonymousClass2TJ A00;
    public static final ReadWriteLock A01 = new ReentrantReadWriteLock();
    public static volatile boolean A02;

    public static void A07(LocationManager locationManager, String str, LocationListener locationListener) {
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1.A01 && C89603uX.A01()) {
                C89603uX.A00(C89603uX.A03);
            }
            if (!r1.A00 || !C89603uX.A02()) {
                locationManager.requestSingleUpdate(str, locationListener, (Looper) null);
            }
        } finally {
            A01.readLock().unlock();
        }
    }

    public static Location A00(LocationManager locationManager, String str) {
        Location location;
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1.A01 && C89603uX.A01()) {
                C89603uX.A00(C89603uX.A00);
            }
            if (!r1.A00 || !C89603uX.A02()) {
                location = locationManager.getLastKnownLocation(str);
            } else {
                location = null;
            }
            return location;
        } finally {
            A01.readLock().unlock();
        }
    }

    public static WifiInfo A01(WifiManager wifiManager) {
        WifiInfo wifiInfo;
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1 != null) {
                if (r1.A01 && C89603uX.A01()) {
                    C89603uX.A00(C89603uX.A06);
                }
                if (!r1.A00 || !C89603uX.A02()) {
                    wifiInfo = wifiManager.getConnectionInfo();
                    return wifiInfo;
                }
            }
            wifiInfo = null;
            return wifiInfo;
        } finally {
            A01.readLock().unlock();
        }
    }

    public static CellLocation A02(TelephonyManager telephonyManager) {
        CellLocation cellLocation;
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1.A01 && C89603uX.A01()) {
                C89603uX.A00(C89603uX.A05);
            }
            if (!r1.A00 || !C89603uX.A02()) {
                cellLocation = telephonyManager.getCellLocation();
            } else {
                cellLocation = null;
            }
            return cellLocation;
        } finally {
            A01.readLock().unlock();
        }
    }

    public static List A03(WifiManager wifiManager) {
        List list;
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1 != null) {
                if (r1.A01 && C89603uX.A01()) {
                    C89603uX.A00(C89603uX.A07);
                }
                if (!r1.A00 || !C89603uX.A02()) {
                    list = wifiManager.getScanResults();
                } else {
                    list = new ArrayList();
                }
            } else {
                list = null;
            }
            return list;
        } finally {
            A01.readLock().unlock();
        }
    }

    public static List A04(TelephonyManager telephonyManager) {
        List list;
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1.A01 && C89603uX.A01()) {
                C89603uX.A00(C89603uX.A04);
            }
            if (!r1.A00 || !C89603uX.A02()) {
                list = telephonyManager.getAllCellInfo();
            } else {
                list = new ArrayList();
            }
            return list;
        } finally {
            A01.readLock().unlock();
        }
    }

    public static void A05(LocationManager locationManager, LocationListener locationListener) {
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r0 = A00;
            if (r0 != null) {
                if (r0.A01 && C89603uX.A01()) {
                    C89603uX.A00(C89603uX.A01);
                }
                locationManager.removeUpdates(locationListener);
            }
        } finally {
            A01.readLock().unlock();
        }
    }

    public static void A06(LocationManager locationManager, String str, long j, float f, LocationListener locationListener) {
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1 != null) {
                if (r1.A01 && C89603uX.A01()) {
                    C89603uX.A00(C89603uX.A02);
                }
                if (!r1.A00 || !C89603uX.A02()) {
                    locationManager.requestLocationUpdates(str, j, f, locationListener);
                }
            }
        } finally {
            A01.readLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (A00 == null) goto L_0x0012;
     */
    public static boolean A08() {
        boolean z;
        try {
            A01.readLock().lock();
            if (A02) {
                z = true;
            }
            z = false;
            return z;
        } finally {
            A01.readLock().unlock();
        }
    }

    public static boolean A09(WifiManager wifiManager) {
        boolean z;
        try {
            A01.readLock().lock();
            AnonymousClass2TJ r1 = A00;
            if (r1 != null) {
                if (r1.A01 && C89603uX.A01()) {
                    C89603uX.A00(C89603uX.A08);
                }
                if (!r1.A00 || !C89603uX.A02()) {
                    z = wifiManager.startScan();
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            A01.readLock().unlock();
        }
    }
}
