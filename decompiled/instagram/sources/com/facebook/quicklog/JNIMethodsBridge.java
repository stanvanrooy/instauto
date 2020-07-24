package com.facebook.quicklog;

import com.instagram.realtimeclient.RealtimeSubscription;
import p000X.AMD;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Hz;
import p000X.AnonymousClass0I8;

public class JNIMethodsBridge {
    public static void markerPoint(int i, int i2, String str, int i3, long j) {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            AnonymousClass0Hz withMarker = qPLInstance.withMarker(i, i2);
            withMarker.A02(i3);
            AnonymousClass0I8 A08 = withMarker.A08(str);
            A08.BXJ(j);
            A08.BXK().Aoj();
        }
    }

    public static void markerPoint(int i, int i2, String str, String str2, int i3, long j) {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            AnonymousClass0Hz withMarker = qPLInstance.withMarker(i, i2);
            withMarker.A02(i3);
            AnonymousClass0I8 A08 = withMarker.A08(str);
            A08.A3z("__key", str2);
            A08.BXJ(j);
            A08.BXK().Aoj();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        if (r3.equals(com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION) == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (r3.equals("2") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
        if (r3.equals("3") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        if (r3.equals("4") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f3, code lost:
        if (r3.equals("5") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        if (r3.equals("6") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        if (r3.equals("7") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r3.equals("8") == false) goto L_0x0031;
     */
    public static void markerPoint(int i, int i2, String str, String[] strArr, int i3, long j, boolean z) {
        char c;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            int length = strArr.length;
            if (length % 3 == 0) {
                AnonymousClass0Hz withMarker = qPLInstance.withMarker(i, i2);
                withMarker.A02(i3);
                AnonymousClass0I8 A08 = withMarker.A08(str);
                A08.BXJ(j);
                A08.BXL(z);
                for (int i4 = 0; i4 < length; i4 += 3) {
                    String str2 = strArr[i4];
                    String str3 = strArr[i4 + 1];
                    String str4 = strArr[i4 + 2];
                    switch (str4.hashCode()) {
                        case 49:
                            c = 0;
                            break;
                        case AMD.MAX_LIKES_PER_FETCH /*50*/:
                            c = 2;
                            break;
                        case 51:
                            c = 4;
                            break;
                        case 52:
                            c = 6;
                            break;
                        case 53:
                            c = 1;
                            break;
                        case 54:
                            c = 3;
                            break;
                        case 55:
                            c = 5;
                            break;
                        case 56:
                            c = 7;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            A08.A3z(str2, str3);
                            break;
                        case 1:
                            A08.A43(str2, str3.split(",,,"));
                            break;
                        case 2:
                            A08.A3y(str2, Integer.parseInt(str3));
                            break;
                        case 3:
                            String[] split = str3.split(",,,");
                            int length2 = split.length;
                            int[] iArr = new int[length2];
                            for (int i5 = 0; i5 < length2; i5++) {
                                iArr[i5] = Integer.parseInt(split[i5]);
                            }
                            A08.A42(str2, iArr);
                            break;
                        case 4:
                            A08.A3x(str2, Double.parseDouble(str3));
                            break;
                        case 5:
                            String[] split2 = str3.split(",,,");
                            int length3 = split2.length;
                            double[] dArr = new double[length3];
                            for (int i6 = 0; i6 < length3; i6++) {
                                dArr[i6] = Double.parseDouble(split2[i6]);
                            }
                            A08.A41(str2, dArr);
                            break;
                        case 6:
                            A08.A40(str2, !"0".equals(str3));
                            break;
                        case 7:
                            String[] split3 = str3.split(",,,");
                            int length4 = split3.length;
                            boolean[] zArr = new boolean[length4];
                            for (int i7 = 0; i7 < length4; i7++) {
                                boolean z2 = false;
                                if (split3[i7] == RealtimeSubscription.GRAPHQL_MQTT_VERSION) {
                                    z2 = true;
                                }
                                zArr[i7] = z2;
                            }
                            A08.A44(str2, zArr);
                            break;
                        default:
                            throw new IllegalArgumentException(AnonymousClass000.A0E("Type entry is not supported: ", str4));
                    }
                }
                A08.BXK().Aoj();
            }
        }
    }
}
