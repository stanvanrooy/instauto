package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Arrays;
import p000X.A1e;
import p000X.A3K;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0FY;
import p000X.C23043A0y;

public class ReadableNativeArray extends NativeArray implements A1e {
    public static int jniPassCounter;
    public Object[] mLocalArray;
    public ReadableType[] mLocalTypeArray;

    private native Object[] importArray();

    private native Object[] importTypeArray();

    public ReadableType getType(int i) {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr == null) {
            synchronized (this) {
                if (this.mLocalTypeArray == null) {
                    jniPassCounter++;
                    Object[] importTypeArray = importTypeArray();
                    AnonymousClass0FY.A00(importTypeArray);
                    this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(importTypeArray, importTypeArray.length, ReadableType[].class);
                }
            }
            readableTypeArr = this.mLocalTypeArray;
        }
        return readableTypeArr[i];
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                Object[] importArray = importArray();
                AnonymousClass0FY.A00(importArray);
                this.mLocalArray = importArray;
            }
        }
        return this.mLocalArray;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeArray)) {
            return false;
        }
        return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
    }

    public ArrayList toArrayList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size(); i++) {
            switch (getType(i).ordinal()) {
                case 0:
                    arrayList.add((Object) null);
                    break;
                case 1:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case 2:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case 3:
                    arrayList.add(getString(i));
                    break;
                case 4:
                    arrayList.add(((ReadableNativeMap) getLocalArray()[i]).toHashMap());
                    break;
                case 5:
                    arrayList.add(((ReadableNativeArray) getLocalArray()[i]).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException(AnonymousClass000.A06("Could not convert object at index: ", i, "."));
            }
        }
        return arrayList;
    }

    static {
        A3K.A00();
    }

    public /* bridge */ /* synthetic */ A1e getArray(int i) {
        return (ReadableNativeArray) getLocalArray()[i];
    }

    public boolean getBoolean(int i) {
        return ((Boolean) getLocalArray()[i]).booleanValue();
    }

    public double getDouble(int i) {
        return ((Double) getLocalArray()[i]).doubleValue();
    }

    public int getInt(int i) {
        return ((Double) getLocalArray()[i]).intValue();
    }

    public /* bridge */ /* synthetic */ C23043A0y getMap(int i) {
        return (ReadableNativeMap) getLocalArray()[i];
    }

    public String getString(int i) {
        return (String) getLocalArray()[i];
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    public boolean isNull(int i) {
        if (getLocalArray()[i] == null) {
            return true;
        }
        return false;
    }

    public int size() {
        return getLocalArray().length;
    }

    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }
}
