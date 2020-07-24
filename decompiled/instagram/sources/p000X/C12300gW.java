package p000X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0gW  reason: invalid class name and case insensitive filesystem */
public final class C12300gW {
    public static volatile Integer A00;

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a7, code lost:
        if (p000X.C12310gX.A00() < 1800000) goto L_0x01a9;
     */
    public static int A00(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        if (A00 == null) {
            synchronized (C12300gW.class) {
                if (A00 == null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    long j = memoryInfo.totalMem;
                    if (j == -1) {
                        ArrayList arrayList = new ArrayList();
                        int A01 = C12310gX.A01();
                        if (A01 < 1) {
                            i2 = -1;
                        } else if (A01 == 1) {
                            i2 = 2008;
                        } else {
                            i2 = 2012;
                            if (A01 <= 3) {
                                i2 = 2011;
                            }
                        }
                        if (i2 != -1) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                        long A002 = (long) C12310gX.A00();
                        if (A002 == -1) {
                            i3 = -1;
                        } else if (A002 <= 528000) {
                            i3 = 2008;
                        } else if (A002 <= 620000) {
                            i3 = 2009;
                        } else if (A002 <= 1020000) {
                            i3 = 2010;
                        } else if (A002 <= 1220000) {
                            i3 = 2011;
                        } else if (A002 <= 1520000) {
                            i3 = 2012;
                        } else {
                            i3 = 2014;
                            if (A002 <= 2020000) {
                                i3 = 2013;
                            }
                        }
                        if (i3 != -1) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                        long j2 = memoryInfo2.totalMem;
                        if (j2 <= 0) {
                            i4 = -1;
                        } else if (j2 <= 201326592) {
                            i4 = 2008;
                        } else if (j2 <= 304087040) {
                            i4 = 2009;
                        } else if (j2 <= 536870912) {
                            i4 = 2010;
                        } else if (j2 <= 1073741824) {
                            i4 = 2011;
                        } else if (j2 <= 1610612736) {
                            i4 = 2012;
                        } else {
                            i4 = 2014;
                            if (j2 <= 2147483648L) {
                                i4 = 2013;
                            }
                        }
                        if (i4 != -1) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                        if (arrayList.isEmpty()) {
                            i = -1;
                        } else {
                            Collections.sort(arrayList);
                            if ((arrayList.size() & 1) == 1) {
                                i = ((Integer) arrayList.get(arrayList.size() >> 1)).intValue();
                            } else {
                                int size = (arrayList.size() >> 1) - 1;
                                i = ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) >> 1);
                            }
                        }
                    } else if (j <= 805306368) {
                        i = 2010;
                        if (C12310gX.A01() <= 1) {
                            i = 2009;
                        }
                    } else {
                        i = 2012;
                        if (j > 1073741824) {
                            if (j > 1610612736) {
                                if (j > 2147483648L) {
                                    if (j <= 3221225472L) {
                                        i = 2014;
                                    } else {
                                        i = 2016;
                                        if (j <= 5368709120L) {
                                            i = 2015;
                                        }
                                    }
                                }
                            }
                            i = 2013;
                        } else if (C12310gX.A00() < 1300000) {
                            i = 2011;
                        }
                    }
                    A00 = Integer.valueOf(i);
                }
            }
        }
        return A00.intValue();
    }
}
