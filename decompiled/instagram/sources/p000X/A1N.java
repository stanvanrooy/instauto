package p000X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.A1N */
public final class A1N implements C23043A0y, C228259s1 {
    public final Map A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Map map = this.A00;
                Map map2 = ((A1N) obj).A00;
                if (map != null) {
                    if (!map.equals(map2)) {
                        return false;
                    }
                } else if (map2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static A1N A00(C23043A0y a0y) {
        A1N a1n = new A1N();
        ReadableMapKeySetIterator keySetIterator = a0y.keySetIterator();
        while (keySetIterator.Aby()) {
            String Aq1 = keySetIterator.Aq1();
            switch (a0y.getType(Aq1).ordinal()) {
                case 0:
                    a1n.putNull(Aq1);
                    break;
                case 1:
                    a1n.putBoolean(Aq1, a0y.getBoolean(Aq1));
                    break;
                case 2:
                    a1n.putDouble(Aq1, a0y.getDouble(Aq1));
                    break;
                case 3:
                    a1n.putString(Aq1, a0y.getString(Aq1));
                    break;
                case 4:
                    a1n.putMap(Aq1, A00(a0y.getMap(Aq1)));
                    break;
                case 5:
                    a1n.putArray(Aq1, A1L.A00(a0y.getArray(Aq1)));
                    break;
            }
        }
        return a1n;
    }

    public final C228259s1 copy() {
        A1N a1n = new A1N();
        a1n.A00.putAll(this.A00);
        return a1n;
    }

    public final A1e getArray(String str) {
        return (A1e) this.A00.get(str);
    }

    public final boolean getBoolean(String str) {
        return ((Boolean) this.A00.get(str)).booleanValue();
    }

    public final double getDouble(String str) {
        return ((Number) this.A00.get(str)).doubleValue();
    }

    public final A1k getDynamic(String str) {
        A1Q a1q = (A1Q) ((AnonymousClass1Q7) A1Q.A02.get()).A2N();
        if (a1q == null) {
            a1q = new A1Q();
        }
        a1q.A00 = this;
        a1q.A01 = str;
        return a1q;
    }

    public final Iterator getEntryIterator() {
        return this.A00.entrySet().iterator();
    }

    public final int getInt(String str) {
        return ((Number) this.A00.get(str)).intValue();
    }

    public final C23043A0y getMap(String str) {
        return (C23043A0y) this.A00.get(str);
    }

    public final String getString(String str) {
        return (String) this.A00.get(str);
    }

    public final ReadableType getType(String str) {
        Object obj = this.A00.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof C23043A0y) {
            return ReadableType.Map;
        }
        if (obj instanceof A1e) {
            return ReadableType.Array;
        }
        if (obj instanceof A1k) {
            return ((A1k) obj).AZ8();
        }
        throw new IllegalArgumentException(AnonymousClass000.A0O("Invalid value ", obj.toString(), " for key ", str, "contained in JavaOnlyMap"));
    }

    public final boolean hasKey(String str) {
        return this.A00.containsKey(str);
    }

    public final int hashCode() {
        Map map = this.A00;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final boolean isNull(String str) {
        if (this.A00.get(str) == null) {
            return true;
        }
        return false;
    }

    public final ReadableMapKeySetIterator keySetIterator() {
        return new A1S(this);
    }

    public final void putArray(String str, A1e a1e) {
        this.A00.put(str, a1e);
    }

    public final void putBoolean(String str, boolean z) {
        this.A00.put(str, Boolean.valueOf(z));
    }

    public final void putDouble(String str, double d) {
        this.A00.put(str, Double.valueOf(d));
    }

    public final void putInt(String str, int i) {
        this.A00.put(str, new Double((double) i));
    }

    public final void putMap(String str, C23043A0y a0y) {
        this.A00.put(str, a0y);
    }

    public final void putNull(String str) {
        this.A00.put(str, (Object) null);
    }

    public final void putString(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final HashMap toHashMap() {
        return new HashMap(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public A1N() {
        this.A00 = new HashMap();
    }

    public A1N(Object... objArr) {
        int length = objArr.length;
        if (length % 2 == 0) {
            this.A00 = new HashMap();
            for (int i = 0; i < length; i += 2) {
                Double d = objArr[i + 1];
                if (d instanceof Number) {
                    d = Double.valueOf(d.doubleValue());
                }
                this.A00.put(objArr[i], d);
            }
            return;
        }
        throw new IllegalArgumentException("You must provide the same number of keys and values");
    }
}
