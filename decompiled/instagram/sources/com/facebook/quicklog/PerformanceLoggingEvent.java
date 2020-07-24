package com.facebook.quicklog;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0Hh;
import p000X.AnonymousClass0I4;
import p000X.AnonymousClass0ID;
import p000X.AnonymousClass0OB;
import p000X.AnonymousClass0OG;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RN;
import p000X.C05070Hx;
import p000X.C06160Nz;
import p000X.C06170Oa;
import p000X.C06270Ok;
import p000X.C10550dU;

public class PerformanceLoggingEvent implements Runnable {
    public AnonymousClass0I4 A00;
    public C10550dU A01;
    public AnonymousClass0ID A02;
    public C06160Nz A03;
    public short A04 = 2;
    public short A05;

    public final void A01(String str) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass0I4();
        }
        AnonymousClass0I4.A00(this.A00, str, false);
    }

    public final String A00() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = this.A02.A0R;
        int size = arrayList.size();
        for (String append : arrayList) {
            sb.append(append);
            if (size > 1) {
                sb.append(",");
            }
            size--;
        }
        return sb.toString();
    }

    public final void A02(String str) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass0I4();
        }
        AnonymousClass0I4 r2 = this.A00;
        int size = r2.A01.size() - 1;
        if (size >= 0 && r2.A01.get(size) != null) {
            r2.A01.remove(size);
        }
        r2.A01.add(str);
    }

    public final void A03(String str, int i) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass0I4();
        }
        AnonymousClass0I4.A00(this.A00, str, Integer.valueOf(i));
    }

    public final void A04(String str, long j) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass0I4();
        }
        AnonymousClass0I4.A00(this.A00, str, Long.valueOf(j));
    }

    public final void A05(String str, String str2) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass0I4();
        }
        AnonymousClass0I4.A00(this.A00, str, str2);
    }

    public final boolean A06(long j) {
        if ((j & this.A02.A0D) != 0) {
            return true;
        }
        return false;
    }

    public short getActionId() {
        return this.A04;
    }

    public final void run() {
        String str;
        String str2;
        C06270Ok A002;
        String str3;
        C06170Oa r12;
        C06160Nz r3 = this.A03;
        StringBuilder sb = null;
        AnonymousClass0P4 A003 = AnonymousClass0P4.A00("perf", (AnonymousClass0RN) null);
        A003.A0E("marker_id", Integer.valueOf(this.A02.A04));
        A003.A0E("instance_id", Integer.valueOf(this.A02.A0A));
        A003.A0E("sample_rate", Integer.valueOf(this.A02.A08));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        A003.A0F("time_since_boot_ms", Long.valueOf(timeUnit.toMillis(this.A02.A0F)));
        A003.A0E("duration_ms", Integer.valueOf(this.A02.A01()));
        A003.A0E("action_id", Integer.valueOf(this.A04));
        A003.A0E("duration_since_prev_action_ms", Integer.valueOf((int) timeUnit.toMillis(this.A02.A0C)));
        A003.A0E("prev_action_id", Integer.valueOf(this.A05));
        AnonymousClass0ID r0 = this.A02;
        boolean z = r0.A0O;
        boolean z2 = r0.A0N;
        if (z) {
            str = "missing_config";
        } else if (z2) {
            str = "always_on";
        } else {
            str = "random_sampling";
        }
        A003.A0G("method", str);
        C05070Hx r6 = this.A02.A0H;
        if (r6 != null) {
            C06170Oa A004 = C06170Oa.A00();
            r6.A00(new AnonymousClass0OB(A004));
            A003.A09("points", A004);
        }
        AnonymousClass0I4 r62 = this.A00;
        if (r62 != null && !r62.A00.isEmpty()) {
            C06270Ok A005 = C06270Ok.A00();
            r62.A01(new AnonymousClass0OG(A005));
            A003.A08("metadata", A005);
        }
        List A032 = this.A02.A03();
        AnonymousClass0Hh r9 = this.A02.A0Q;
        List list = r9.A07;
        ArrayList arrayList = list;
        if (list == null) {
            int i = r9.A03;
            if (i == 0) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList2.add(Integer.valueOf(r9.A09[i2]));
                }
                r9.A07 = arrayList2;
                arrayList = arrayList2;
            }
        }
        SparseArray sparseArray = new SparseArray();
        int i3 = 0;
        int i4 = 0;
        while (i3 < A032.size()) {
            int i5 = i3 + 1;
            String str4 = (String) A032.get(i3);
            i3 = i5 + 1;
            String str5 = (String) A032.get(i5);
            int i6 = i4 + 1;
            int intValue = ((Integer) arrayList.get(i4)).intValue();
            if (sparseArray.indexOfKey(intValue) >= 0) {
                A002 = (C06270Ok) sparseArray.get(intValue);
            } else {
                A002 = C06270Ok.A00();
                sparseArray.put(intValue, A002);
                switch (intValue) {
                    case 1:
                        str3 = "annotations";
                        break;
                    case 2:
                    case 3:
                        str3 = "annotations_int";
                        break;
                    case 4:
                        str3 = "annotations_string_array";
                        break;
                    case 5:
                    case 10:
                        str3 = "annotations_int_array";
                        break;
                    case 6:
                        str3 = "annotations_double";
                        break;
                    case 7:
                        str3 = "annotations_double_array";
                        break;
                    case 8:
                        str3 = "annotations_bool";
                        break;
                    case 9:
                        str3 = "annotations_bool_array";
                        break;
                }
                A003.A08(str3, A002);
            }
            switch (intValue) {
                case 1:
                    A002.A09(str4, str5);
                    continue;
                case 2:
                case 3:
                    A002.A08(str4, Long.valueOf(Long.parseLong(str5)));
                    continue;
                case 4:
                    r12 = C06170Oa.A00();
                    for (String A042 : str5.split(",,,")) {
                        r12.A04(A042);
                    }
                    break;
                case 5:
                case 10:
                    r12 = C06170Oa.A00();
                    for (String str6 : str5.split(",,,")) {
                        if (!str6.isEmpty()) {
                            r12.A03(Long.parseLong(str6));
                        }
                    }
                    break;
                case 6:
                    A002.A00.A03(str4, Double.valueOf(Double.parseDouble(str5)));
                    continue;
                case 7:
                    r12 = C06170Oa.A00();
                    for (String str7 : str5.split(",,,")) {
                        if (!str7.isEmpty()) {
                            r12.A01(Double.parseDouble(str7));
                        }
                    }
                    break;
                case 8:
                    A002.A05(str4, Boolean.valueOf(Boolean.parseBoolean(str5)));
                    continue;
                case 9:
                    r12 = C06170Oa.A00();
                    for (String str8 : str5.split(",,,")) {
                        if (!str8.isEmpty()) {
                            r12.A06(Boolean.valueOf(str8).booleanValue());
                        }
                    }
                    break;
            }
            A002.A04(str4, r12);
            i4 = i6;
        }
        A003.A0G("trace_tags", A00());
        short s = this.A04;
        if (s == 3) {
            str2 = "client_fail";
        } else if (s == 4) {
            str2 = "client_cancel";
        } else {
            str2 = "client_tti";
        }
        A003.A0G("marker", str2);
        A003.A0E("value", Integer.valueOf(this.A02.A01()));
        String str9 = null;
        if (this.A02.A07 != 0) {
            sb = new StringBuilder("markerStart called multiple times without end or cancel");
        }
        if (sb != null) {
            str9 = sb.toString();
        }
        if (str9 != null) {
            A003.A0G("error", str9);
        }
        r3.A00.BcG(A003);
    }

    public PerformanceLoggingEvent(AnonymousClass0ID r2) {
        this.A02 = r2;
    }
}
