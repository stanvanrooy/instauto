package com.instagram.tagging.model;

import android.graphics.PointF;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.C12890hY;
import p000X.C13460iZ;

public final class TagSerializer {
    public static String A00(List list, List list2) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (list != null && !list.isEmpty()) {
            A05.A0B("in");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A02((Tag) it.next(), A05);
            }
            A05.A0P();
        }
        if (list2 != null && !list2.isEmpty()) {
            A05.A0B("untagged");
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                A02((Tag) it2.next(), A05);
            }
            A05.A0P();
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }

    public static String A01(List list, List list2) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        A05.A0B("in");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A02((Tag) it.next(), A05);
            }
        }
        A05.A0P();
        if (list2 != null && !list2.isEmpty()) {
            A05.A0d("removed");
            A05.A0S();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                A05.A0g(((Tag) it2.next()).A03());
            }
            A05.A0P();
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }

    public static void A02(Tag tag, C13460iZ r4) {
        r4.A0T();
        r4.A0G(tag.A04(), Long.parseLong(tag.A03()));
        PointF A00 = tag.A00();
        if (A00 != null) {
            r4.A0d("position");
            r4.A0S();
            r4.A0W(A00.x);
            r4.A0W(A00.y);
            r4.A0P();
        }
        for (Map.Entry entry : tag.A06().entrySet()) {
            r4.A0H((String) entry.getKey(), (String) entry.getValue());
        }
        r4.A0Q();
    }
}
