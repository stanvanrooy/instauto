package p000X;

import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A1L */
public final class A1L implements A1e, C206608tl {
    public final List A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                List list = this.A00;
                List list2 = ((A1L) obj).A00;
                if (list != null) {
                    if (!list.equals(list2)) {
                        return false;
                    }
                } else if (list2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static A1L A00(A1e a1e) {
        A1L a1l = new A1L();
        int size = a1e.size();
        for (int i = 0; i < size; i++) {
            switch (a1e.getType(i).ordinal()) {
                case 0:
                    a1l.pushNull();
                    break;
                case 1:
                    a1l.pushBoolean(a1e.getBoolean(i));
                    break;
                case 2:
                    a1l.pushDouble(a1e.getDouble(i));
                    break;
                case 3:
                    a1l.pushString(a1e.getString(i));
                    break;
                case 4:
                    a1l.pushMap(A1N.A00(a1e.getMap(i)));
                    break;
                case 5:
                    a1l.pushArray(A00(a1e.getArray(i)));
                    break;
            }
        }
        return a1l;
    }

    public final A1e getArray(int i) {
        return (A1e) this.A00.get(i);
    }

    public final boolean getBoolean(int i) {
        return ((Boolean) this.A00.get(i)).booleanValue();
    }

    public final double getDouble(int i) {
        return ((Number) this.A00.get(i)).doubleValue();
    }

    public final int getInt(int i) {
        return ((Number) this.A00.get(i)).intValue();
    }

    public final C23043A0y getMap(int i) {
        return (C23043A0y) this.A00.get(i);
    }

    public final String getString(int i) {
        return (String) this.A00.get(i);
    }

    public final ReadableType getType(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof A1e) {
            return ReadableType.Array;
        }
        if (obj instanceof C23043A0y) {
            return ReadableType.Map;
        }
        return null;
    }

    public final int hashCode() {
        List list = this.A00;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final boolean isNull(int i) {
        if (this.A00.get(i) == null) {
            return true;
        }
        return false;
    }

    public final void pushArray(A1e a1e) {
        this.A00.add(a1e);
    }

    public final void pushBoolean(boolean z) {
        this.A00.add(Boolean.valueOf(z));
    }

    public final void pushDouble(double d) {
        this.A00.add(Double.valueOf(d));
    }

    public final void pushInt(int i) {
        this.A00.add(new Double((double) i));
    }

    public final void pushMap(C23043A0y a0y) {
        this.A00.add(a0y);
    }

    public final void pushNull() {
        this.A00.add((Object) null);
    }

    public final void pushString(String str) {
        this.A00.add(str);
    }

    public final int size() {
        return this.A00.size();
    }

    public final ArrayList toArrayList() {
        return new ArrayList(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public A1L() {
        this.A00 = new ArrayList();
    }

    public A1L(List list) {
        this.A00 = new ArrayList(list);
    }
}
