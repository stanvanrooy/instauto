package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

/* renamed from: X.BRF */
public final class BRF {
    public Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (p000X.C35251g3.A07(r4.A00.A00, "android.permission.ACCESS_FINE_LOCATION") != false) goto L_0x0022;
     */
    public static CdmaCellLocation A00(Context context, BRL brl) {
        boolean z;
        AnonymousClass2IW A002 = AnonymousClass2IV.A00(context, (AnonymousClass26W) null);
        if (!C35251g3.A07(brl.A00.A00, AnonymousClass0C5.$const$string(25))) {
            z = false;
        }
        z = true;
        if (!z || A002 == null || A002.A00.getPhoneType() != 2 || A002.A02("DeviceFeatureHelper") == null) {
            return null;
        }
        Class<CdmaCellLocation> cls = CdmaCellLocation.class;
        if (cls.isAssignableFrom(A002.A02("DeviceFeatureHelper").getClass())) {
            return cls.cast(A002.A02("DeviceFeatureHelper"));
        }
        return null;
    }

    public static List A01(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        if (!(nextElement instanceof Inet6Address) || z) {
                            arrayList.add(hostAddress);
                        }
                    }
                }
            }
            return arrayList;
        } catch (SocketException unused) {
            return null;
        }
    }

    public static Locale A02() {
        if (Build.VERSION.SDK_INT >= 24) {
            return Resources.getSystem().getConfiguration().getLocales().get(0);
        }
        return Resources.getSystem().getConfiguration().locale;
    }

    public BRF(Context context) {
        this.A00 = context;
    }
}
