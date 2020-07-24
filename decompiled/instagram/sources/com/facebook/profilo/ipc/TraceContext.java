package com.facebook.profilo.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p000X.AnonymousClass0GC;
import p000X.C04930Gv;
import p000X.C04940Gw;

public final class TraceContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C04930Gv();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public AnonymousClass0GC A06;
    public TraceConfigExtras A07;
    public Object A08;
    public Object A09;
    public String A0A;

    public final class TraceConfigExtras implements Parcelable {
        public static final TraceConfigExtras A03 = new TraceConfigExtras((TreeMap) null, (TreeMap) null, (TreeMap) null);
        public static final Parcelable.Creator CREATOR = new C04940Gw();
        public final TreeMap A00;
        public final TreeMap A01;
        public final TreeMap A02;

        public final int describeContents() {
            return 0;
        }

        public final int A00(String str, int i) {
            Integer num;
            TreeMap treeMap = this.A02;
            if (treeMap == null || (num = (Integer) treeMap.get(str)) == null) {
                return i;
            }
            return num.intValue();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Bundle bundle = new Bundle();
            TreeMap treeMap = this.A02;
            if (treeMap != null) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    bundle.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            }
            parcel.writeBundle(bundle);
            Bundle bundle2 = new Bundle();
            TreeMap treeMap2 = this.A00;
            if (treeMap2 != null) {
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    bundle2.putBoolean((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
                }
            }
            parcel.writeBundle(bundle2);
            Bundle bundle3 = new Bundle();
            TreeMap treeMap3 = this.A01;
            if (treeMap3 != null) {
                for (Map.Entry entry3 : treeMap3.entrySet()) {
                    bundle3.putIntArray((String) entry3.getKey(), (int[]) entry3.getValue());
                }
            }
            parcel.writeBundle(bundle3);
        }

        public TraceConfigExtras(Parcel parcel) {
            Class<?> cls = getClass();
            Bundle readBundle = parcel.readBundle(cls.getClassLoader());
            Set<String> keySet = readBundle.keySet();
            if (!keySet.isEmpty()) {
                this.A02 = new TreeMap();
                for (String str : keySet) {
                    this.A02.put(str, Integer.valueOf(readBundle.getInt(str)));
                }
            } else {
                this.A02 = null;
            }
            Bundle readBundle2 = parcel.readBundle(cls.getClassLoader());
            Set<String> keySet2 = readBundle2.keySet();
            if (!keySet2.isEmpty()) {
                this.A00 = new TreeMap();
                for (String str2 : keySet2) {
                    this.A00.put(str2, Boolean.valueOf(readBundle2.getBoolean(str2)));
                }
            } else {
                this.A00 = null;
            }
            Bundle readBundle3 = parcel.readBundle(cls.getClassLoader());
            Set<String> keySet3 = readBundle3.keySet();
            if (!keySet3.isEmpty()) {
                this.A01 = new TreeMap();
                for (String str3 : keySet3) {
                    this.A01.put(str3, readBundle3.getIntArray(str3));
                }
                return;
            }
            this.A01 = null;
        }

        public TraceConfigExtras(TreeMap treeMap, TreeMap treeMap2, TreeMap treeMap3) {
            this.A02 = treeMap;
            this.A00 = treeMap2;
            this.A01 = treeMap3;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        this.A07.writeToParcel(parcel, i);
    }

    public TraceContext() {
    }

    public TraceContext(long j, String str, AnonymousClass0GC r7, int i, Object obj, long j2, int i2, int i3, TraceConfigExtras traceConfigExtras) {
        this.A05 = j;
        this.A0A = str;
        this.A06 = r7;
        this.A01 = i;
        this.A09 = obj;
        this.A08 = null;
        this.A04 = j2;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = 0;
        this.A07 = traceConfigExtras;
    }

    public TraceContext(Parcel parcel) {
        this.A05 = parcel.readLong();
        this.A0A = parcel.readString();
        this.A01 = parcel.readInt();
        this.A09 = null;
        this.A08 = null;
        this.A04 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (TraceConfigExtras) TraceConfigExtras.CREATOR.createFromParcel(parcel);
    }

    public TraceContext(TraceContext traceContext) {
        long j = traceContext.A05;
        String str = traceContext.A0A;
        AnonymousClass0GC r11 = traceContext.A06;
        int i = traceContext.A01;
        Object obj = traceContext.A09;
        Object obj2 = traceContext.A08;
        long j2 = traceContext.A04;
        int i2 = traceContext.A02;
        int i3 = traceContext.A03;
        int i4 = traceContext.A00;
        TraceConfigExtras traceConfigExtras = traceContext.A07;
        this.A05 = j;
        this.A0A = str;
        this.A06 = r11;
        this.A01 = i;
        this.A09 = obj;
        this.A08 = obj2;
        this.A04 = j2;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A07 = traceConfigExtras;
    }

    public TraceContext(TraceContext traceContext, int i) {
        long j = traceContext.A05;
        String str = traceContext.A0A;
        AnonymousClass0GC r10 = traceContext.A06;
        int i2 = traceContext.A01;
        Object obj = traceContext.A09;
        Object obj2 = traceContext.A08;
        long j2 = traceContext.A04;
        int i3 = traceContext.A02;
        int i4 = traceContext.A03;
        TraceConfigExtras traceConfigExtras = traceContext.A07;
        this.A05 = j;
        this.A0A = str;
        this.A06 = r10;
        this.A01 = i2;
        this.A09 = obj;
        this.A08 = obj2;
        this.A04 = j2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i;
        this.A07 = traceConfigExtras;
    }
}
