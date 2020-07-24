package p000X;

import android.util.Base64;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Vu  reason: invalid class name and case insensitive filesystem */
public final class C08140Vu {
    public int A00;
    public int A01;
    public String A02;
    public List A03;
    public List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C08140Vu r5 = (C08140Vu) obj;
            if (!A00().equals(r5.A00()) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public final List A00() {
        if (this.A03 == null) {
            ArrayList arrayList = new ArrayList();
            for (String decode : this.A04) {
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getByAddress(Base64.decode(decode, 0));
                } catch (IllegalArgumentException | UnknownHostException unused) {
                }
                if (inetAddress != null) {
                    arrayList.add(inetAddress);
                }
            }
            this.A03 = arrayList;
        }
        return this.A03;
    }

    public final int hashCode() {
        return (this.A02.hashCode() * 31) + A00().hashCode();
    }

    public final String toString() {
        return "AE{'" + this.A02 + '\'' + ", " + A00().toString() + ", " + this.A01 + ", " + this.A00 + '}';
    }

    public C08140Vu(String str, List list, int i, int i2) {
        this.A02 = str;
        this.A03 = list;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Base64.encodeToString(((InetAddress) it.next()).getAddress(), 0));
            }
            this.A04 = arrayList;
        }
        this.A01 = i;
        this.A00 = i2;
    }
}
