package com.instagram.model.direct;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass0a4;
import p000X.C13320iL;

public class DirectThreadKey implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(54);
    public String A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public static List A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((C13320iL) it.next()).getId());
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str;
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        String str2 = this.A00;
        if (str2 != null && (str = directThreadKey.A00) != null) {
            return str2.compareTo(str);
        }
        if (str2 == null && directThreadKey.A00 == null) {
            int size = this.A01.size();
            int size2 = directThreadKey.A01.size();
            if (size == size2) {
                for (int i = 0; i < size; i++) {
                    int compareTo = ((String) this.A01.get(i)).compareTo((String) directThreadKey.A01.get(i));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return 0;
            } else if (size < size2) {
                return -1;
            } else {
                return 1;
            }
        } else if (str2 == null) {
            return -1;
        } else {
            return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectThreadKey)) {
            return false;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        String str = this.A00;
        if (str != null) {
            return str.equals(directThreadKey.A00);
        }
        return this.A01.equals(directThreadKey.A01);
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }

    public DirectThreadKey() {
    }

    public DirectThreadKey(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.createStringArrayList();
    }

    public DirectThreadKey(String str) {
        this(str, (List) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public DirectThreadKey(String str, Collection collection) {
        this(str, (List) r2);
        ArrayList arrayList;
        if (collection == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((C13320iL) it.next()).getId());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r3 != null) goto L_0x0008;
     */
    public DirectThreadKey(String str, List list) {
        boolean z = str == null ? false : z;
        z = true;
        AnonymousClass0a4.A09(z);
        this.A00 = str;
        this.A01 = list;
        if (list != null) {
            Collections.sort(list);
        }
    }
}
