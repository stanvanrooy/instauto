package com.google.android.gms.common.stats;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public int A00() {
        return ((WakeLockEvent) this).A00;
    }

    public long A01() {
        return ((WakeLockEvent) this).A04;
    }

    public long A02() {
        return -1;
    }

    public String A03() {
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        String str = wakeLockEvent.A05;
        int i = wakeLockEvent.A03;
        List list = wakeLockEvent.A09;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i2 = wakeLockEvent.A01;
        String str3 = wakeLockEvent.A06;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = wakeLockEvent.A08;
        if (str4 == null) {
            str4 = str2;
        }
        float f = wakeLockEvent.A02;
        String str5 = wakeLockEvent.A07;
        if (str5 != null) {
            str2 = str5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str2);
        return sb.toString();
    }

    public final String toString() {
        long A01 = A01();
        int A00 = A00();
        long A02 = A02();
        String A03 = A03();
        StringBuilder sb = new StringBuilder(String.valueOf(A03).length() + 53);
        sb.append(A01);
        sb.append("\t");
        sb.append(A00);
        sb.append("\t");
        sb.append(A02);
        sb.append(A03);
        return sb.toString();
    }
}
