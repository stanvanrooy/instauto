package com.instagram.common.analytics.intf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p000X.C06170Oa;
import p000X.C06270Ok;
import p000X.C06970Rg;

public class AnalyticsEventDebugInfo implements Parcelable {
    public static final Parcelable.Creator A04 = new C06970Rg();
    public String A00;
    public String A01;
    public List A02;
    public final int A03;

    public final int describeContents() {
        return 0;
    }

    public static C06170Oa A00(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        if (analyticsEventDebugInfo == null) {
            return null;
        }
        C06170Oa A002 = C06170Oa.A00();
        for (int i = 0; i < analyticsEventDebugInfo.A02.size(); i++) {
            AnalyticsEventEntry A022 = analyticsEventDebugInfo.A02(i);
            Object obj = A022.A01;
            AnalyticsEventDebugInfo analyticsEventDebugInfo2 = A022.A00;
            if (analyticsEventDebugInfo2 != null) {
                int i2 = analyticsEventDebugInfo2.A03;
                if (i2 == 2) {
                    C06270Ok A003 = C06270Ok.A00();
                    A01(A003, analyticsEventDebugInfo2);
                    A002.A00.add(A003);
                } else if (i2 == 3) {
                    A002.A00.add(A00(analyticsEventDebugInfo2));
                }
            } else if (obj instanceof Long) {
                A002.A03(((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                A002.A02(((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                A002.A06(((Boolean) obj).booleanValue());
            } else if (obj instanceof C06270Ok) {
                A002.A00.add((C06270Ok) obj);
            } else if (obj instanceof C06170Oa) {
                A002.A00.add((C06170Oa) obj);
            } else if (obj instanceof Double) {
                A002.A01(((Double) obj).doubleValue());
            } else {
                A002.A04(String.valueOf(obj));
            }
        }
        return A002;
    }

    public static void A01(C06270Ok r7, AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        C06170Oa A002;
        if (analyticsEventDebugInfo != null) {
            for (int i = 0; i < analyticsEventDebugInfo.A02.size(); i++) {
                AnalyticsEventEntry A022 = analyticsEventDebugInfo.A02(i);
                String str = A022.A02;
                Object obj = A022.A01;
                if (str != null) {
                    AnalyticsEventDebugInfo analyticsEventDebugInfo2 = A022.A00;
                    if (analyticsEventDebugInfo2 != null) {
                        int i2 = analyticsEventDebugInfo2.A03;
                        if (i2 == 2) {
                            C06270Ok A003 = C06270Ok.A00();
                            A01(A003, analyticsEventDebugInfo2);
                            r7.A03(str, A003);
                        } else if (i2 == 3 && (A002 = A00(analyticsEventDebugInfo2)) != null) {
                            r7.A04(str, A002);
                        }
                    } else if (obj instanceof Long) {
                        Long valueOf = Long.valueOf(((Long) obj).longValue());
                        if (valueOf != null) {
                            r7.A08(str, valueOf);
                        }
                    } else if (obj instanceof Integer) {
                        Integer valueOf2 = Integer.valueOf(((Integer) obj).intValue());
                        if (valueOf2 != null) {
                            r7.A07(str, valueOf2);
                        }
                    } else if (obj instanceof Boolean) {
                        Boolean valueOf3 = Boolean.valueOf(((Boolean) obj).booleanValue());
                        if (valueOf3 != null) {
                            r7.A05(str, valueOf3);
                        }
                    } else if (obj instanceof C06270Ok) {
                        r7.A03(str, (C06270Ok) obj);
                    } else if (obj instanceof C06170Oa) {
                        C06170Oa r6 = (C06170Oa) obj;
                        if (r6 != null) {
                            r7.A04(str, r6);
                        }
                    } else if (obj instanceof List) {
                        r7.A0A(str, (List) obj);
                    } else if (obj instanceof String[]) {
                        C06170Oa A004 = C06170Oa.A00();
                        for (String A042 : (String[]) obj) {
                            A004.A04(A042);
                        }
                        r7.A00.A03(str, A004);
                    } else if (obj instanceof Double) {
                        Double valueOf4 = Double.valueOf(((Double) obj).doubleValue());
                        if (valueOf4 != null) {
                            r7.A00.A03(str, valueOf4);
                        }
                    } else {
                        String valueOf5 = String.valueOf(obj);
                        if (valueOf5 != null) {
                            r7.A09(str, valueOf5);
                        }
                    }
                }
            }
        }
    }

    public final AnalyticsEventEntry A02(int i) {
        return (AnalyticsEventEntry) this.A02.get(i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public AnalyticsEventDebugInfo(int i) {
        this.A02 = new ArrayList();
        this.A03 = i;
    }

    public AnalyticsEventDebugInfo(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        parcel.readTypedList(arrayList, AnalyticsEventEntry.CREATOR);
        this.A03 = parcel.readInt();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
