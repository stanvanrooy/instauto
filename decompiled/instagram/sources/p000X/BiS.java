package p000X;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.BiS */
public final class BiS implements Bj4 {
    public final C26305BjB A00;
    public final C26310BjG A01;
    public final C26294Biy A02 = C26294Biy.A00;
    public final C26266BiU A03;
    public final C26252BiF A04;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (p000X.C26266BiU.A00(r2, r4, r7) != false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    public final boolean A00(Field field, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List list;
        C26266BiU biU = this.A03;
        Class<?> type = field.getType();
        Class<Enum> cls = Enum.class;
        if (cls.isAssignableFrom(type) || (!type.isAnonymousClass() && !type.isLocalClass())) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z6 = false;
        if (z2) {
            z6 = true;
        }
        if (!z6) {
            z3 = false;
        }
        z3 = true;
        if (!z3) {
            if ((136 & field.getModifiers()) == 0 && !field.isSynthetic()) {
                Class<?> type2 = field.getType();
                if (cls.isAssignableFrom(type2) || (!type2.isAnonymousClass() && !type2.isLocalClass())) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    if (z) {
                        list = biU.A01;
                    } else {
                        list = biU.A00;
                    }
                    if (!list.isEmpty()) {
                        C26304BjA bjA = new C26304BjA(field);
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C26297Bj1) it.next()).shouldSkipField(bjA)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z4 = false;
                    if (!z4) {
                        return false;
                    }
                    return true;
                }
            }
            z4 = true;
            if (!z4) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0106 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0045 A[SYNTHETIC] */
    public final C26293Bix AA6(C26240Bhw bhw, C26267BiV biV) {
        String value;
        List arrayList;
        C26290Bis bis;
        int size;
        int i;
        C26293Bix bix;
        C26267BiV biV2 = biV;
        Class<Object> cls = biV2.A01;
        Class<Object> cls2 = Object.class;
        if (!cls2.isAssignableFrom(cls)) {
            return null;
        }
        C26306BjC A002 = this.A01.A00(biV2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            Type type = biV2.A02;
            while (cls != cls2) {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                boolean z = false;
                int i2 = 0;
                while (i2 < length) {
                    Field field = declaredFields[i2];
                    boolean A003 = A00(field, true);
                    boolean A004 = A00(field, z);
                    if (A003 || A004) {
                        this.A02.A00(field);
                        Type A05 = C26269BiX.A05(biV2.A02, cls, field.getGenericType(), new HashSet());
                        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                        if (serializedName == null) {
                            value = this.A00.Brh(field);
                        } else {
                            value = serializedName.value();
                            if (r2 != 0) {
                                arrayList = new ArrayList(r2 + 1);
                                arrayList.add(value);
                                for (String add : serializedName.alternate()) {
                                    arrayList.add(add);
                                }
                                bis = null;
                                size = arrayList.size();
                                i = 0;
                                while (i < size) {
                                    String str = (String) arrayList.get(i);
                                    if (i != 0) {
                                        A003 = false;
                                    }
                                    C26267BiV biV3 = new C26267BiV(A05);
                                    Field field2 = field;
                                    C26240Bhw bhw2 = bhw;
                                    C26240Bhw bhw3 = bhw2;
                                    boolean containsKey = A5O.A00.containsKey(biV3.A01);
                                    Field field3 = field;
                                    JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
                                    if (jsonAdapter != null) {
                                        bix = C26252BiF.A00(this.A01, bhw2, biV3, jsonAdapter);
                                    } else {
                                        bix = null;
                                    }
                                    boolean z2 = false;
                                    if (bix != null) {
                                        z2 = true;
                                    }
                                    if (bix == null) {
                                        bix = bhw2.A02(biV3);
                                    }
                                    C26290Bis bis2 = (C26290Bis) linkedHashMap.put(str, new C26263BiQ(this, str, A003, A004, field3, z2, bix, bhw3, biV3, containsKey));
                                    if (bis == null) {
                                        bis = bis2;
                                    }
                                    i++;
                                    field = field2;
                                }
                                if (bis == null) {
                                    throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bis.A00);
                                }
                            }
                        }
                        arrayList = Collections.singletonList(value);
                        bis = null;
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                        }
                        if (bis == null) {
                        }
                    }
                    i2++;
                    z = false;
                }
                biV2 = new C26267BiV(C26269BiX.A05(biV2.A02, cls, cls.getGenericSuperclass(), new HashSet()));
                cls = biV2.A01;
            }
        }
        return new C26246Bi8(A002, linkedHashMap);
    }

    public BiS(C26310BjG bjG, C26305BjB bjB, C26266BiU biU, C26252BiF biF) {
        this.A01 = bjG;
        this.A00 = bjB;
        this.A03 = biU;
        this.A04 = biF;
    }
}
