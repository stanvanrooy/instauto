package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.HashMap;
import java.util.Iterator;
import p000X.A1Q;
import p000X.A1T;
import p000X.A1e;
import p000X.A1k;
import p000X.A3K;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass1Q7;
import p000X.C23043A0y;

public class ReadableNativeMap extends NativeMap implements C23043A0y {
    public static int mJniCallCounter;
    public String[] mKeys;
    public HashMap mLocalMap;
    public HashMap mLocalTypeMap;

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    private void checkInstance(String str, Object obj, Class cls) {
        if (obj != null && !cls.isInstance(obj)) {
            throw new UnexpectedNativeTypeException(AnonymousClass000.A0P("Value for ", str, " cannot be cast from ", obj.getClass().getSimpleName(), " to ", cls.getSimpleName()));
        }
    }

    public static HashMap getLocalMap(ReadableNativeMap readableNativeMap) {
        HashMap hashMap = readableNativeMap.mLocalMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (readableNativeMap) {
            if (readableNativeMap.mKeys == null) {
                String[] importKeys = readableNativeMap.importKeys();
                AnonymousClass0FY.A00(importKeys);
                readableNativeMap.mKeys = importKeys;
                mJniCallCounter++;
            }
            if (readableNativeMap.mLocalMap == null) {
                Object[] importValues = readableNativeMap.importValues();
                AnonymousClass0FY.A00(importValues);
                mJniCallCounter++;
                int length = readableNativeMap.mKeys.length;
                readableNativeMap.mLocalMap = new HashMap(length);
                for (int i = 0; i < length; i++) {
                    readableNativeMap.mLocalMap.put(readableNativeMap.mKeys[i], importValues[i]);
                }
            }
        }
        return readableNativeMap.mLocalMap;
    }

    private HashMap getLocalTypeMap() {
        HashMap hashMap = this.mLocalTypeMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                String[] importKeys = importKeys();
                AnonymousClass0FY.A00(importKeys);
                this.mKeys = importKeys;
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] importTypes = importTypes();
                AnonymousClass0FY.A00(importTypes);
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalTypeMap = new HashMap(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) importTypes[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeMap)) {
            return false;
        }
        return getLocalMap(this).equals(getLocalMap((ReadableNativeMap) obj));
    }

    public A1e getArray(String str) {
        return (A1e) getNullableValue(str, A1e.class);
    }

    public boolean getBoolean(String str) {
        return ((Boolean) getValue(str, Boolean.class)).booleanValue();
    }

    public double getDouble(String str) {
        return ((Double) getValue(str, Double.class)).doubleValue();
    }

    public A1k getDynamic(String str) {
        A1Q a1q = (A1Q) ((AnonymousClass1Q7) A1Q.A02.get()).A2N();
        if (a1q == null) {
            a1q = new A1Q();
        }
        a1q.A00 = this;
        a1q.A01 = str;
        return a1q;
    }

    public int getInt(String str) {
        return ((Double) getValue(str, Double.class)).intValue();
    }

    public String getString(String str) {
        return (String) getNullableValue(str, String.class);
    }

    public ReadableMapKeySetIterator keySetIterator() {
        return new A1T(this);
    }

    public HashMap toHashMap() {
        HashMap hashMap = new HashMap(getLocalMap(this));
        for (String str : hashMap.keySet()) {
            switch (getType(str).ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                    ReadableNativeMap readableNativeMap = (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
                    AnonymousClass0FY.A00(readableNativeMap);
                    hashMap.put(str, readableNativeMap.toHashMap());
                    break;
                case 5:
                    A1e array = getArray(str);
                    AnonymousClass0FY.A00(array);
                    hashMap.put(str, array.toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException(AnonymousClass000.A0J("Could not convert object with key: ", str, "."));
            }
        }
        return hashMap;
    }

    static {
        A3K.A00();
    }

    private Object getNullableValue(String str, Class cls) {
        if (hasKey(str)) {
            Object obj = getLocalMap(this).get(str);
            checkInstance(str, obj, cls);
            return obj;
        }
        throw new NoSuchKeyException(str);
    }

    private Object getValue(String str, Class cls) {
        if (!hasKey(str) || isNull(str)) {
            throw new NoSuchKeyException(str);
        }
        Object obj = getLocalMap(this).get(str);
        AnonymousClass0FY.A00(obj);
        checkInstance(str, obj, cls);
        return obj;
    }

    public Iterator getEntryIterator() {
        return getLocalMap(this).entrySet().iterator();
    }

    public ReadableType getType(String str) {
        if (getLocalTypeMap().containsKey(str)) {
            Object obj = getLocalTypeMap().get(str);
            AnonymousClass0FY.A00(obj);
            return (ReadableType) obj;
        }
        throw new NoSuchKeyException(str);
    }

    public boolean hasKey(String str) {
        return getLocalMap(this).containsKey(str);
    }

    public int hashCode() {
        return getLocalMap(this).hashCode();
    }

    public boolean isNull(String str) {
        if (!getLocalMap(this).containsKey(str)) {
            throw new NoSuchKeyException(str);
        } else if (getLocalMap(this).get(str) == null) {
            return true;
        } else {
            return false;
        }
    }

    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    public ReadableNativeMap getMap(String str) {
        return (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
    }
}
