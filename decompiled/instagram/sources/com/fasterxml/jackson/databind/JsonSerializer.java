package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;
import com.fasterxml.jackson.databind.ser.std.EnumMapSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ByteArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import p000X.AnonymousClass000;
import p000X.C06;
import p000X.C12960hf;
import p000X.C13460iZ;
import p000X.C13480ib;
import p000X.C15;
import p000X.C200288hn;
import p000X.C27;
import p000X.C27125Bya;
import p000X.C27200C1k;
import p000X.C27204C1t;
import p000X.C32;
import p000X.C3P;
import p000X.C3m;
import p000X.C59402hW;

public abstract class JsonSerializer implements C3m {

    public abstract class None extends JsonSerializer {
    }

    public JsonSerializer A06(C3P c3p) {
        return !(this instanceof UnwrappingBeanSerializer) ? !(this instanceof BeanAsArraySerializer) ? !(this instanceof BeanSerializer) ? this : new UnwrappingBeanSerializer((BeanSerializerBase) (BeanSerializer) this, c3p) : ((BeanAsArraySerializer) this).A00.A06(c3p) : new UnwrappingBeanSerializer((BeanSerializerBase) (UnwrappingBeanSerializer) this, c3p);
    }

    public Class A07() {
        if (this instanceof StdSerializer) {
            return ((StdSerializer) this).A00;
        }
        if (!(this instanceof TypeWrappedSerializer)) {
            return null;
        }
        return Object.class;
    }

    public boolean A09() {
        if (this instanceof UnwrappingBeanSerializer) {
            return true;
        }
        boolean z = this instanceof BeanAsArraySerializer;
        return false;
    }

    public boolean A0A() {
        return (this instanceof BeanSerializerBase) && ((BeanSerializerBase) this).A02 != null;
    }

    public void A0B(Object obj, C13460iZ r4, C06 c06) {
        TypeWrappedSerializer typeWrappedSerializer = (TypeWrappedSerializer) this;
        typeWrappedSerializer.A00.A08(obj, r4, c06, typeWrappedSerializer.A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    public boolean A0C(Object obj) {
        String obj2;
        int i;
        if (this instanceof ToStringSerializer) {
            return obj == null || (obj2 = obj.toString()) == null || obj2.length() == 0;
        }
        if (!(this instanceof StdDelegatingSerializer)) {
            if (this instanceof StdArraySerializers$CharArraySerializer) {
                char[] cArr = (char[]) obj;
                if (cArr != null) {
                    i = cArr.length;
                    if (i != 0) {
                    }
                }
            } else if (this instanceof StdArraySerializers$ByteArraySerializer) {
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    i = bArr.length;
                    if (i != 0) {
                    }
                }
            } else if (this instanceof StaticListSerializerBase) {
                Collection collection = (Collection) obj;
                if (collection != null) {
                    i = collection.size();
                    if (i != 0) {
                    }
                }
            } else if (this instanceof StringSerializer) {
                String str = (String) obj;
                if (str != null) {
                    i = str.length();
                    if (i != 0) {
                    }
                }
            } else if (!(this instanceof DateTimeSerializerBase)) {
                return obj == null;
            } else {
                DateTimeSerializerBase dateTimeSerializerBase = (DateTimeSerializerBase) this;
                if (obj != null) {
                    i = (dateTimeSerializerBase.A0D(obj) > 0 ? 1 : (dateTimeSerializerBase.A0D(obj) == 0 ? 0 : -1));
                    if (i != 0) {
                        return false;
                    }
                }
            }
        }
        StdDelegatingSerializer stdDelegatingSerializer = (StdDelegatingSerializer) this;
        return stdDelegatingSerializer.A00.A0C(stdDelegatingSerializer.A01.A9o(obj));
    }

    public void A08(Object obj, C13460iZ r10, C06 c06, C27204C1t c1t) {
        EnumMap enumMap;
        String str;
        String obj2;
        boolean z;
        if (this instanceof TypeWrappedSerializer) {
            ((TypeWrappedSerializer) this).A00.A08(obj, r10, c06, c1t);
        } else if (this instanceof TokenBufferSerializer) {
            C13480ib r9 = (C13480ib) obj;
            c1t.A03(r9, r10);
            TokenBufferSerializer.A00(r9, r10);
            c1t.A06(r9, r10);
        } else if (this instanceof ToStringSerializer) {
            c1t.A03(obj, r10);
            ((ToStringSerializer) this).A0B(obj, r10, c06);
            c1t.A06(obj, r10);
        } else if (this instanceof StdDelegatingSerializer) {
            StdDelegatingSerializer stdDelegatingSerializer = (StdDelegatingSerializer) this;
            stdDelegatingSerializer.A00.A08(stdDelegatingSerializer.A01.A9o(obj), r10, c06, c1t);
        } else if (this instanceof StdArraySerializers$CharArraySerializer) {
            char[] cArr = (char[]) obj;
            if (c06.A05.A06(C15.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                c1t.A01(cArr, r10);
                int length = cArr.length;
                for (int i = 0; i < length; i++) {
                    r10.A0m(cArr, i, 1);
                }
                c1t.A04(cArr, r10);
                return;
            }
            c1t.A03(cArr, r10);
            r10.A0m(cArr, 0, cArr.length);
            c1t.A06(cArr, r10);
        } else if (this instanceof StdArraySerializers$ByteArraySerializer) {
            byte[] bArr = (byte[]) obj;
            c1t.A03(bArr, r10);
            r10.A0Z(c06.A05.A00.A00, bArr, 0, bArr.length);
            c1t.A06(bArr, r10);
        } else if (this instanceof SerializableSerializer) {
            ((C59402hW) obj).BfV(r10, c06, c1t);
        } else if (this instanceof RawSerializer) {
            c1t.A03(obj, r10);
            ((RawSerializer) this).A0B(obj, r10, c06);
            c1t.A06(obj, r10);
        } else if (this instanceof JsonValueSerializer) {
            JsonValueSerializer jsonValueSerializer = (JsonValueSerializer) this;
            try {
                Object invoke = jsonValueSerializer.A02.invoke(obj, new Object[0]);
                if (invoke == null) {
                    c06.A0D(r10);
                    return;
                }
                JsonSerializer jsonSerializer = jsonValueSerializer.A01;
                if (jsonSerializer == null) {
                    jsonSerializer = c06.A0A(invoke.getClass(), jsonValueSerializer.A00);
                } else if (jsonValueSerializer.A03) {
                    c1t.A03(obj, r10);
                    jsonSerializer.A0B(invoke, r10, c06);
                    c1t.A06(obj, r10);
                    return;
                }
                jsonSerializer.A08(invoke, r10, c06, c1t);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                e = e2;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                if (e instanceof Error) {
                    throw ((Error) e);
                }
                throw C27125Bya.A01(e, new C200288hn(obj, AnonymousClass000.A0E(jsonValueSerializer.A02.getName(), "()")));
            }
        } else if (!(this instanceof StdScalarSerializer)) {
            if (this instanceof MapSerializer) {
                MapSerializer mapSerializer = (MapSerializer) this;
                Map map = (Map) obj;
                c1t.A02(map, r10);
                boolean isEmpty = map.isEmpty();
                enumMap = map;
                if (!isEmpty) {
                    TreeMap treeMap = map;
                    if (c06.A05.A06(C15.ORDER_MAP_ENTRIES_BY_KEYS)) {
                        boolean z2 = map instanceof SortedMap;
                        treeMap = map;
                        if (!z2) {
                            treeMap = new TreeMap(map);
                        }
                    }
                    JsonSerializer jsonSerializer2 = mapSerializer.A01;
                    if (jsonSerializer2 != null) {
                        mapSerializer.A0G(treeMap, r10, c06, jsonSerializer2);
                        enumMap = treeMap;
                    } else {
                        mapSerializer.A0F(treeMap, r10, c06);
                        enumMap = treeMap;
                    }
                }
            } else if (this instanceof EnumMapSerializer) {
                EnumMapSerializer enumMapSerializer = (EnumMapSerializer) this;
                EnumMap enumMap2 = (EnumMap) obj;
                c1t.A02(enumMap2, r10);
                boolean isEmpty2 = enumMap2.isEmpty();
                enumMap = enumMap2;
                if (!isEmpty2) {
                    enumMapSerializer.A0F(enumMap2, r10, c06);
                    enumMap = enumMap2;
                }
            } else if (this instanceof AsArraySerializerBase) {
                c1t.A01(obj, r10);
                ((AsArraySerializerBase) this).A0I(obj, r10, c06);
                c1t.A04(obj, r10);
                return;
            } else if (this instanceof ArraySerializerBase) {
                c1t.A01(obj, r10);
                ((ArraySerializerBase) this).A0F(obj, r10, c06);
                c1t.A04(obj, r10);
                return;
            } else if (this instanceof UnknownSerializer) {
                if (c06.A05.A06(C15.FAIL_ON_EMPTY_BEANS)) {
                    throw new C27125Bya(AnonymousClass000.A0J("No serializer found for class ", obj.getClass().getName(), " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) )"));
                }
                c1t.A02(obj, r10);
                c1t.A05(obj, r10);
                return;
            } else if (this instanceof StringCollectionSerializer) {
                StringCollectionSerializer stringCollectionSerializer = (StringCollectionSerializer) this;
                Collection collection = (Collection) obj;
                c1t.A01(collection, r10);
                if (stringCollectionSerializer.A00 == null) {
                    StringCollectionSerializer.A05(stringCollectionSerializer, collection, r10, c06);
                } else {
                    StringCollectionSerializer.A00(stringCollectionSerializer, collection, r10, c06);
                }
                c1t.A04(collection, r10);
                return;
            } else if (this instanceof IndexedStringListSerializer) {
                IndexedStringListSerializer indexedStringListSerializer = (IndexedStringListSerializer) this;
                List list = (List) obj;
                int size = list.size();
                c1t.A01(list, r10);
                if (indexedStringListSerializer.A00 == null) {
                    IndexedStringListSerializer.A05(list, r10, c06, size);
                } else {
                    IndexedStringListSerializer.A00(indexedStringListSerializer, list, r10, c06, size);
                }
                c1t.A04(list, r10);
                return;
            } else if (!(this instanceof BeanSerializerBase)) {
                Class<?> A07 = A07();
                if (A07 == null) {
                    A07 = obj.getClass();
                }
                throw new UnsupportedOperationException(AnonymousClass000.A0E("Type id handling not implemented for type ", A07.getName()));
            } else {
                BeanSerializerBase beanSerializerBase = (BeanSerializerBase) this;
                if (!(beanSerializerBase instanceof BeanAsArraySerializer)) {
                    C27 c27 = beanSerializerBase.A02;
                    if (c27 != null) {
                        C32 A0B = c06.A0B(obj, c27.A00);
                        Object obj3 = A0B.A00;
                        if (obj3 == null || (!A0B.A01 && !c27.A04)) {
                            z = false;
                        } else {
                            c27.A03.A0B(obj3, r10, c06);
                            z = true;
                        }
                        if (!z) {
                            Object A03 = A0B.A02.A03(obj);
                            A0B.A00 = A03;
                            if (c27.A04) {
                                c27.A03.A0B(A03, r10, c06);
                                return;
                            }
                            C27200C1k c1k = beanSerializerBase.A00;
                            if (c1k == null) {
                                str = null;
                            } else {
                                Object A0H = c1k.A0H(obj);
                                if (A0H == null) {
                                    str = "";
                                } else if (A0H instanceof String) {
                                    str = (String) A0H;
                                } else {
                                    str = A0H.toString();
                                }
                            }
                            if (str == null) {
                                c1t.A02(obj, r10);
                            } else {
                                c1t.A08(obj, r10, str);
                            }
                            C12960hf r2 = c27.A01;
                            A0B.A01 = true;
                            if (r2 != null) {
                                r10.A0b(r2);
                                c27.A03.A0B(A0B.A00, r10, c06);
                            }
                        } else {
                            return;
                        }
                    } else {
                        C27200C1k c1k2 = beanSerializerBase.A00;
                        if (c1k2 == null) {
                            obj2 = null;
                        } else {
                            Object A0H2 = c1k2.A0H(obj);
                            if (A0H2 == null) {
                                obj2 = "";
                            } else if (A0H2 instanceof String) {
                                obj2 = (String) A0H2;
                            } else {
                                obj2 = A0H2.toString();
                            }
                        }
                        if (str == null) {
                            c1t.A02(obj, r10);
                        } else {
                            c1t.A08(obj, r10, str);
                        }
                    }
                    if (beanSerializerBase.A04 != null) {
                        beanSerializerBase.A0G();
                    } else {
                        beanSerializerBase.A0H(obj, r10, c06);
                    }
                    if (str == null) {
                        c1t.A05(obj, r10);
                        return;
                    } else {
                        c1t.A09(obj, r10, str);
                        return;
                    }
                } else {
                    ((BeanAsArraySerializer) beanSerializerBase).A00.A08(obj, r10, c06, c1t);
                    return;
                }
            }
            c1t.A05(enumMap, r10);
        } else {
            StdScalarSerializer stdScalarSerializer = (StdScalarSerializer) this;
            if (stdScalarSerializer instanceof TimeZoneSerializer) {
                TimeZone timeZone = (TimeZone) obj;
                c1t.A07(timeZone, r10, TimeZone.class);
                r10.A0g(timeZone.getID());
                c1t.A06(timeZone, r10);
            } else if (stdScalarSerializer instanceof NonTypedScalarSerializerBase) {
                ((NonTypedScalarSerializerBase) stdScalarSerializer).A0B(obj, r10, c06);
            } else if (!(stdScalarSerializer instanceof InetAddressSerializer)) {
                c1t.A03(obj, r10);
                stdScalarSerializer.A0B(obj, r10, c06);
                c1t.A06(obj, r10);
            } else {
                InetAddress inetAddress = (InetAddress) obj;
                c1t.A07(inetAddress, r10, InetAddress.class);
                InetAddressSerializer.A00(inetAddress, r10);
                c1t.A06(inetAddress, r10);
            }
        }
    }
}
