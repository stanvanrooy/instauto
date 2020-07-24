package p000X;

import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.0Ok  reason: invalid class name and case insensitive filesystem */
public final class C06270Ok implements C06950Re {
    public final AnonymousClass0RH A00 = new AnonymousClass0RH();

    public final void A0B(StringBuilder sb, String str) {
        String obj;
        int i = 0;
        while (true) {
            AnonymousClass0RH r1 = this.A00;
            if (i < r1.A00) {
                sb.append(str);
                sb.append(r1.A02(i));
                sb.append(" = ");
                Object A002 = this.A00.A00(i);
                if (A002 == null) {
                    obj = "null";
                } else if (A002 instanceof Long) {
                    obj = AnonymousClass0RA.A02(((Long) A002).longValue());
                } else if (A002 instanceof C06270Ok) {
                    sb.append("{\n");
                    ((C06270Ok) A002).A0B(sb, AnonymousClass000.A0E(str, "  "));
                    obj = "}";
                } else if (A002 instanceof C06170Oa) {
                    ((C06170Oa) A002).A05(sb, AnonymousClass000.A0E(str, "  "));
                    sb.append(10);
                    i++;
                } else {
                    obj = A002.toString();
                }
                sb.append(obj);
                sb.append(10);
                i++;
            } else {
                return;
            }
        }
    }

    public static C06270Ok A00() {
        return new C06270Ok();
    }

    public final String A01(String str) {
        if (this.A00.A01(str) instanceof String) {
            return (String) this.A00.A01(str);
        }
        return null;
    }

    public final void A03(String str, C06270Ok r3) {
        this.A00.A03(str, r3);
    }

    public final void A04(String str, C06170Oa r3) {
        this.A00.A03(str, r3);
    }

    public final void A05(String str, Boolean bool) {
        this.A00.A03(str, bool);
    }

    public final void A06(String str, Float f) {
        this.A00.A03(str, f);
    }

    public final void A07(String str, Integer num) {
        this.A00.A03(str, num);
    }

    public final void A08(String str, Long l) {
        this.A00.A03(str, l);
    }

    public final void A09(String str, String str2) {
        this.A00.A03(str, str2);
    }

    public final AnalyticsEventDebugInfo BrO() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(2);
        int i = 0;
        while (true) {
            AnonymousClass0RH r1 = this.A00;
            if (i < r1.A00) {
                AnonymousClass0RA.A06(analyticsEventDebugInfo, r1.A02(i), this.A00.A00(i));
                i++;
            } else {
                StringBuilder sb = new StringBuilder("{\n");
                A0B(sb, "| ");
                sb.append("}");
                analyticsEventDebugInfo.A00 = sb.toString();
                return analyticsEventDebugInfo;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06270Ok)) {
            return false;
        }
        return Objects.equals(this.A00, ((C06270Ok) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("{");
        int i = 0;
        while (true) {
            AnonymousClass0RH r1 = this.A00;
            if (i < r1.A00) {
                Object A002 = r1.A00(i);
                if (A002 != null) {
                    str = A002.toString();
                } else {
                    str = "";
                }
                StringWriter append = stringWriter.append(this.A00.A02(i)).append("=");
                if (str.isEmpty()) {
                    str = "null";
                }
                append.append(str);
                if (i < this.A00.A00 - 1) {
                    stringWriter.append(", ");
                }
                i++;
            } else {
                stringWriter.append("}");
                return stringWriter.toString();
            }
        }
    }

    public final void A02(C13460iZ r4) {
        r4.A0T();
        int i = 0;
        while (true) {
            AnonymousClass0RH r1 = this.A00;
            if (i < r1.A00) {
                r4.A0d(r1.A02(i));
                AnonymousClass0RA.A05(r4, this.A00.A00(i));
                i++;
            } else {
                r4.A0Q();
                return;
            }
        }
    }

    public final void A0A(String str, List list) {
        C06170Oa A002 = C06170Oa.A00();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A002.A04((String) it.next());
        }
        this.A00.A03(str, A002);
    }

    public final void A0C(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A09((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
