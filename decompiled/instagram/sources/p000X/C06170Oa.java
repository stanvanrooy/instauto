package p000X;

import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Oa  reason: invalid class name and case insensitive filesystem */
public final class C06170Oa implements C06950Re {
    public ArrayList A00 = new ArrayList(16);

    public static C06170Oa A00() {
        return new C06170Oa();
    }

    public final void A01(double d) {
        this.A00.add(Double.valueOf(d));
    }

    public final void A02(int i) {
        this.A00.add(Integer.valueOf(i));
    }

    public final void A03(long j) {
        this.A00.add(Long.valueOf(j));
    }

    public final void A04(String str) {
        this.A00.add(str);
    }

    public final void A05(StringBuilder sb, String str) {
        sb.append("[\n");
        for (int i = 0; i < this.A00.size(); i++) {
            sb.append(AnonymousClass000.A0E(str, "  "));
            sb.append(AnonymousClass0RA.A03(AnonymousClass000.A0E(str, "  "), this.A00.get(i)));
            sb.append(10);
        }
        sb.append(str);
        sb.append("]");
        sb.toString();
    }

    public final void A06(boolean z) {
        this.A00.add(Boolean.valueOf(z));
    }

    public final AnalyticsEventDebugInfo BrO() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(3);
        for (int i = 0; i < this.A00.size(); i++) {
            AnonymousClass0RA.A06(analyticsEventDebugInfo, (String) null, this.A00.get(i));
        }
        StringBuilder sb = new StringBuilder("{\n");
        A05(sb, "| ");
        sb.append("\n}");
        analyticsEventDebugInfo.A00 = sb.toString();
        return analyticsEventDebugInfo;
    }

    public List getData() {
        return this.A00;
    }

    public final String toString() {
        String str;
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("[");
        List list = (List) this.A00.clone();
        int i = 0;
        while (i < list.size()) {
            try {
                Object obj = list.get(i);
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = "";
                }
                if (str.isEmpty()) {
                    str = "null";
                }
                stringWriter.append(str);
                if (i < list.size() - 1) {
                    stringWriter.append(", ");
                }
                i++;
            } catch (IndexOutOfBoundsException e) {
                AnonymousClass0DB.A0N(getClass().getSimpleName(), e, "The List has no items even though its size is greater than 0.");
            }
        }
        stringWriter.append("]");
        return stringWriter.toString();
    }
}
