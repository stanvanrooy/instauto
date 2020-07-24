package com.instagram.filterkit.filter;

import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.math.Matrix4;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass47d;
import p000X.AnonymousClass4K6;
import p000X.AnonymousClass83K;
import p000X.AnonymousClass85B;
import p000X.C1892986r;
import p000X.C88683sp;
import p000X.C88963tH;
import p000X.C88973tI;
import p000X.C88983tJ;
import p000X.C89023tN;
import p000X.C89103tc;
import p000X.C89113td;
import p000X.C89133th;
import p000X.C89143ti;
import p000X.C89433uD;

public class IgFilterGroup implements IgFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(51);
    public Matrix4 A00;
    public Matrix4 A01;
    public C88683sp A02;
    public C88983tJ A03;
    public boolean A04;
    public final C88963tH A05;
    public final Integer A06;
    public final List A07;
    public final SortedMap A08;
    public final float[] A09;
    public final boolean A0A;

    private synchronized void A00(int i, IgFilter igFilter, int i2) {
        if (igFilter == null) {
            this.A08.remove(Integer.valueOf(i));
        } else {
            this.A08.put(Integer.valueOf(i), new C89023tN(igFilter, i2));
        }
    }

    private void A01(C89433uD r4) {
        for (int i = 0; i < this.A07.size(); i++) {
            r4.A05((C89143ti) this.A07.get(i), (C89103tc) null);
        }
        this.A07.clear();
    }

    public final synchronized IgFilter A03(int i) {
        C89023tN r0 = (C89023tN) this.A08.get(Integer.valueOf(i));
        if (r0 == null) {
            return null;
        }
        return r0.A02;
    }

    public final synchronized void A05(int i, IgFilter igFilter) {
        A00(i, igFilter, 0);
        if (igFilter != null) {
            igFilter.invalidate();
        }
    }

    public final synchronized void A06(int i, boolean z) {
        SortedMap sortedMap = this.A08;
        Integer valueOf = Integer.valueOf(i);
        if (sortedMap.containsKey(valueOf)) {
            ((C89023tN) this.A08.get(valueOf)).A00 = z;
            if (((C89023tN) this.A08.get(valueOf)).A02 != null) {
                ((C89023tN) this.A08.get(valueOf)).A02.invalidate();
            }
        }
    }

    public final synchronized boolean Ag0() {
        boolean z;
        Iterator it = this.A08.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((C89023tN) entry.getValue()).A00 && ((C89023tN) entry.getValue()).A02 != null && ((C89023tN) entry.getValue()).A02.Ag0()) {
                z = true;
                break;
            }
        }
        return z;
    }

    public final boolean Ags() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final synchronized void A07(IgFilter igFilter, IgFilter igFilter2) {
        int i = 1;
        if (igFilter == null || igFilter2 == null) {
            i = 0;
            A00(15, igFilter, 0);
        } else {
            A00(15, igFilter, -1);
        }
        A00(16, igFilter2, i);
        if (igFilter != null) {
            igFilter.invalidate();
        }
        if (igFilter2 != null) {
            igFilter2.invalidate();
        }
    }

    public final boolean A08(int i) {
        SortedMap sortedMap = this.A08;
        Integer valueOf = Integer.valueOf(i);
        if (!sortedMap.containsKey(valueOf) || !((C89023tN) this.A08.get(valueOf)).A00) {
            return false;
        }
        return true;
    }

    public final void A8Y(C89433uD r2) {
        this.A05.A8Y(r2);
    }

    public final void AoY() {
        for (Map.Entry entry : this.A08.entrySet()) {
            if (((C89023tN) entry.getValue()).A02 != null) {
                ((C89023tN) entry.getValue()).A02.AoY();
            }
        }
    }

    public final synchronized void Bbg(C89433uD r23, C89133th r24, AnonymousClass85B r25) {
        C89433uD r10;
        AnonymousClass83K r6;
        int i;
        int i2;
        AnonymousClass83K r1;
        int i3;
        int i4;
        synchronized (this) {
            C88683sp r5 = this.A02;
            if (r5 != null) {
                synchronized (r5.A0D) {
                    if (r5.A0F) {
                        r5.A0B.A03(8).invalidate();
                    }
                    PhotoFilter A002 = C88683sp.A00(r5, r5.A00);
                    PhotoFilter A003 = C88683sp.A00(r5, r5.A02);
                    int i5 = AnonymousClass47d.A00[r5.A05.intValue()];
                    if (i5 == 1) {
                        C88683sp.A01(r5, A002, A003, r5.A03);
                    } else if (i5 == 2) {
                        C88683sp.A01(r5, A003, A002, r5.A03);
                    } else if (i5 == 3 || i5 == 4) {
                        if (r5.A0F) {
                            r5.A0B.A07(A002, (IgFilter) null);
                        } else {
                            r5.A0B.A05(15, A002);
                            r5.A0B.A05(16, (IgFilter) null);
                        }
                        A002.A0M(0, Integer.MAX_VALUE, false);
                        A002.A0J(r5.A01);
                        A002.A0O(r5.A06);
                        A002.A0N(r5.A04);
                    }
                }
            }
            AnonymousClass85B r15 = r25;
            if (!this.A0A) {
                A02(r15, true);
            }
            int AU9 = r15.AU9();
            int AU6 = r15.AU6();
            int i6 = Process.WAIT_RESULT_TIMEOUT;
            for (Map.Entry entry : this.A08.entrySet()) {
                IgFilter igFilter = ((C89023tN) entry.getValue()).A02;
                if (((C89023tN) entry.getValue()).A00 && igFilter != null && !igFilter.Ags()) {
                    i6 = ((Integer) entry.getKey()).intValue();
                }
            }
            Iterator it = this.A08.entrySet().iterator();
            Map.Entry entry2 = null;
            int i7 = 0;
            AnonymousClass83K r20 = null;
            int i8 = 0;
            boolean z = false;
            while (true) {
                r10 = r23;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry3 = (Map.Entry) it.next();
                IgFilter igFilter2 = ((C89023tN) entry3.getValue()).A02;
                if (!((C89023tN) entry3.getValue()).A00 || igFilter2 == null) {
                    if (igFilter2 != null && igFilter2.Ag0()) {
                        igFilter2.AoY();
                        z = true;
                    }
                    this.A05.A02(igFilter2, r10);
                } else if (igFilter2.Ag0() || z || ((Integer) entry3.getKey()).intValue() == i6) {
                    if (z) {
                        igFilter2.invalidate();
                    }
                    this.A05.A02(igFilter2, r10);
                    z = true;
                } else {
                    AnonymousClass83K A012 = this.A05.A01(igFilter2, AU9, AU6, r10);
                    if (A012 != null) {
                        if (entry2 != null && (!this.A03.BmX(((Integer) entry2.getKey()).intValue()) || this.A04)) {
                            this.A05.A02(((C89023tN) entry2.getValue()).A02, r10);
                        }
                        entry2 = entry3;
                        r20 = A012;
                    } else {
                        i8 = i7;
                        i7 = ((Integer) entry3.getKey()).intValue();
                    }
                }
            }
            if (i7 == i6 && (entry2 == null || ((Integer) entry2.getKey()).intValue() < i8)) {
                i7 = i8;
            }
            if (this.A0A) {
                int width = r24.getWidth();
                int height = r24.getHeight();
                int AU92 = r15.AU9();
                int AU62 = r15.AU6();
                if (this.A04) {
                    r20 = null;
                }
                AnonymousClass83K r62 = null;
                boolean z2 = true;
                AnonymousClass83K r16 = null;
                Map.Entry entry4 = null;
                for (Map.Entry entry5 : this.A08.entrySet()) {
                    IgFilter igFilter3 = ((C89023tN) entry5.getValue()).A02;
                    if (((C89023tN) entry5.getValue()).A00 && igFilter3 != null) {
                        if (r20 == null || ((Integer) entry2.getKey()).intValue() < ((Integer) entry5.getKey()).intValue()) {
                            boolean z3 = false;
                            if (((Integer) entry5.getKey()).intValue() == 8 && (igFilter3 instanceof BaseFilter)) {
                                if (!((BaseFilter) igFilter3).A0B()) {
                                    z2 = false;
                                }
                            }
                            boolean z4 = true;
                            if (((C89023tN) entry5.getValue()).A01 != 1) {
                                if (r62 == null) {
                                    r16 = r20;
                                    if (r20 == null) {
                                        r16 = r24;
                                    }
                                } else if (igFilter3.Ags()) {
                                    r16 = null;
                                } else {
                                    r16 = r62;
                                }
                            }
                            boolean z5 = false;
                            if (width > height) {
                                z5 = true;
                            }
                            if (AU92 <= AU62) {
                                z4 = false;
                            }
                            boolean z6 = false;
                            if (z5 != z4) {
                                z6 = true;
                            }
                            if (z2 && ((Integer) entry5.getKey()).intValue() < 15) {
                                z3 = true;
                            }
                            if (!z3 || !z6) {
                                i3 = r15.getWidth();
                                i4 = r15.getHeight();
                            } else {
                                i3 = r15.getHeight();
                                i4 = r15.getWidth();
                            }
                            if (((C89023tN) entry5.getValue()).A01 != -1) {
                                if (((Integer) entry5.getKey()).intValue() >= i6) {
                                    r62 = r15;
                                } else if (((Integer) entry5.getKey()).intValue() == i7 || this.A03.BmX(((Integer) entry5.getKey()).intValue())) {
                                    r62 = this.A05.A00(igFilter3, i3, i4, r10);
                                } else {
                                    r62 = r10.A01(i3, i4);
                                    this.A07.add(r62);
                                }
                            }
                            if (((C89023tN) entry5.getValue()).A01 == 0) {
                                A02(r62, !igFilter3.Ags());
                                igFilter3.Bbg(r10, r16, r62);
                            } else if (((C89023tN) entry5.getValue()).A01 == 1 && entry4 != null) {
                                IgFilter igFilter4 = ((C89023tN) entry4.getValue()).A02;
                                A02(r62, !igFilter3.Ags());
                                AnonymousClass83K r0 = r16;
                                igFilter4.Bbg(r10, r0, r62);
                                igFilter3.Bbg(r10, r0, r62);
                            }
                            entry4 = entry5;
                        }
                    }
                }
            } else {
                int width2 = r24.getWidth();
                int height2 = r24.getHeight();
                int AU93 = r15.AU9();
                int AU63 = r15.AU6();
                if (this.A04) {
                    r20 = null;
                }
                AnonymousClass83K r63 = null;
                for (Map.Entry entry6 : this.A08.entrySet()) {
                    IgFilter igFilter5 = ((C89023tN) entry6.getValue()).A02;
                    if (((C89023tN) entry6.getValue()).A00 && igFilter5 != null) {
                        if (r20 == null || ((Integer) entry2.getKey()).intValue() < ((Integer) entry6.getKey()).intValue()) {
                            if (r63 == null) {
                                r6 = r20;
                                if (r20 == null) {
                                    r6 = r24;
                                }
                            } else if (igFilter5.Ags()) {
                                r6 = null;
                            } else {
                                r6 = r63;
                            }
                            boolean z7 = true;
                            boolean z8 = false;
                            if (width2 > height2) {
                                z8 = true;
                            }
                            boolean z9 = false;
                            if (AU93 > AU63) {
                                z9 = true;
                            }
                            boolean z10 = false;
                            if (z8 != z9) {
                                z10 = true;
                            }
                            if (((Integer) entry6.getKey()).intValue() >= 15) {
                                z7 = false;
                            }
                            if (!z7 || !z10) {
                                i = r15.getWidth();
                                i2 = r15.getHeight();
                            } else {
                                i = r15.getHeight();
                                i2 = r15.getWidth();
                            }
                            if (((Integer) entry6.getKey()).intValue() >= i6) {
                                r1 = r15;
                            } else if ((((Integer) entry6.getKey()).intValue() == i7 || this.A03.BmX(((Integer) entry6.getKey()).intValue())) && !this.A04) {
                                r1 = this.A05.A00(igFilter5, i, i2, r10);
                            } else {
                                r1 = r10.A01(i, i2);
                                this.A07.add(r1);
                            }
                            igFilter5.Bbg(r10, r6, r1);
                            entry6.getValue();
                            r63 = r1;
                        }
                    }
                }
            }
            A01(r10);
        }
    }

    public final void Bio(int i) {
        for (Map.Entry value : this.A08.entrySet()) {
            ((C89023tN) value.getValue()).A02.Bio(i);
        }
    }

    public final void invalidate() {
        for (Map.Entry entry : this.A08.entrySet()) {
            if (((C89023tN) entry.getValue()).A00 && ((C89023tN) entry.getValue()).A02 != null) {
                ((C89023tN) entry.getValue()).A02.invalidate();
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.A08.size());
        for (Map.Entry entry : this.A08.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeParcelable(((C89023tN) entry.getValue()).A02, i);
            parcel.writeInt(((C89023tN) entry.getValue()).A00 ? 1 : 0);
        }
        switch (this.A06.intValue()) {
            case 1:
                str = "REEL";
                break;
            case 2:
                str = "COVER_FRAME";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        parcel.writeString(str);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    private void A02(AnonymousClass85B r5, boolean z) {
        GLES20.glBindFramebuffer(36160, r5.AMH());
        C1892986r.A04("IgFilterGroup.clearFrameBuffer:glBindFramebuffer");
        if (z) {
            float[] fArr = this.A09;
            GLES20.glClearColor(fArr[0], fArr[1], fArr[2], 1.0f);
            GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        }
    }

    public final IgFilterGroup A04() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return new IgFilterGroup(obtain);
    }

    public IgFilterGroup(Parcel parcel) {
        this.A08 = new TreeMap();
        this.A05 = new C88963tH();
        this.A09 = new float[3];
        boolean z = false;
        this.A04 = false;
        this.A07 = new ArrayList();
        this.A03 = new C88973tI(this);
        int readInt = parcel.readInt();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= readInt) {
                break;
            }
            int readInt2 = parcel.readInt();
            C89023tN r2 = new C89023tN((IgFilter) parcel.readParcelable(getClass().getClassLoader()), 0);
            if (parcel.readInt() != 1) {
                z2 = false;
            }
            r2.A00 = z2;
            this.A08.put(Integer.valueOf(readInt2), r2);
            i++;
        }
        this.A06 = AnonymousClass4K6.A00(parcel.readString());
        this.A0A = parcel.readInt() == 1 ? true : z;
    }

    public IgFilterGroup(Integer num, AnonymousClass0C1 r3) {
        this.A08 = new TreeMap();
        this.A05 = new C88963tH();
        this.A09 = new float[3];
        this.A04 = false;
        this.A07 = new ArrayList();
        this.A03 = new C88973tI(this);
        this.A06 = num;
        this.A0A = C89113td.A00(r3);
    }
}
