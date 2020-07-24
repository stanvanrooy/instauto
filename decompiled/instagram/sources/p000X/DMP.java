package p000X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.DMP */
public final class DMP {
    public Integer A00 = null;
    public String A01;
    public String A02;
    public String A03;
    public final String A04;
    public final Set A05;
    public final Set A06;
    public final Set A07;

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.A07);
        ArrayList arrayList2 = new ArrayList(this.A05);
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        return TextUtils.join(";", new String[]{this.A04, this.A01, this.A02, this.A03, TextUtils.join(",", arrayList), TextUtils.join(",", arrayList2)});
    }

    public DMP(String str) {
        this.A04 = str;
        this.A05 = new HashSet();
        this.A07 = new HashSet();
        this.A06 = new HashSet();
    }
}
