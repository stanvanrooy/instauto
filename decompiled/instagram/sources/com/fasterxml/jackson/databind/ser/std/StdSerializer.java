package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ext.DOMSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.sql.Time;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import p000X.AnonymousClass000;
import p000X.AnonymousClass29Z;
import p000X.C06;
import p000X.C0L;
import p000X.C12960hf;
import p000X.C13460iZ;
import p000X.C13480ib;
import p000X.C15;
import p000X.C200288hn;
import p000X.C27107By8;
import p000X.C27125Bya;
import p000X.C27148BzD;
import p000X.C27179Bzx;
import p000X.C27224C3n;
import p000X.C3m;
import p000X.C59402hW;

public abstract class StdSerializer extends JsonSerializer implements C3m, C27224C3n {
    public final Class A00;

    public void A0B(Object obj, C13460iZ r6, C06 c06) {
        String str;
        long j;
        int i;
        boolean z;
        String obj2;
        if (!(this instanceof TokenBufferSerializer)) {
            if (this instanceof ToStringSerializer) {
                str = obj.toString();
            } else if (this instanceof StdKeySerializers$StringKeySerializer) {
                r6.A0d((String) obj);
                return;
            } else if (this instanceof StdKeySerializers$DateKeySerializer) {
                c06.A0E((Date) obj, r6);
                return;
            } else if (this instanceof StdKeySerializers$CalendarKeySerializer) {
                long timeInMillis = ((Calendar) obj).getTimeInMillis();
                r6.A0d(c06.A05.A06(C15.WRITE_DATE_KEYS_AS_TIMESTAMPS) ? String.valueOf(timeInMillis) : c06.A0C().format(new Date(timeInMillis)));
                return;
            } else if (!(this instanceof StdKeySerializer)) {
                if (this instanceof StdJdkSerializers$AtomicReferenceSerializer) {
                    Object obj3 = ((AtomicReference) obj).get();
                    if (obj3 == null) {
                        c06.A02.A0B((Object) null, r6, c06);
                        return;
                    } else {
                        c06.A09(obj3.getClass(), (C27148BzD) null).A0B(obj3, r6, c06);
                        return;
                    }
                } else if (!(this instanceof StdDelegatingSerializer)) {
                    if (this instanceof StdArraySerializers$CharArraySerializer) {
                        char[] cArr = (char[]) obj;
                        if (c06.A05.A06(C15.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                            r6.A0S();
                            int length = cArr.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                r6.A0m(cArr, i2, 1);
                            }
                        } else {
                            r6.A0m(cArr, 0, cArr.length);
                            return;
                        }
                    } else if (this instanceof StdArraySerializers$ByteArraySerializer) {
                        byte[] bArr = (byte[]) obj;
                        r6.A0Z(c06.A05.A00.A00, bArr, 0, bArr.length);
                        return;
                    } else if (this instanceof SerializableSerializer) {
                        ((C59402hW) obj).BfQ(r6, c06);
                        return;
                    } else if (this instanceof RawSerializer) {
                        r6.A0N(obj.toString());
                        return;
                    } else if (this instanceof NullSerializer) {
                        r6.A0R();
                        return;
                    } else if (this instanceof JsonValueSerializer) {
                        JsonValueSerializer jsonValueSerializer = (JsonValueSerializer) this;
                        try {
                            Object invoke = jsonValueSerializer.A02.invoke(obj, new Object[0]);
                            if (invoke == null) {
                                c06.A0D(r6);
                                return;
                            }
                            JsonSerializer jsonSerializer = jsonValueSerializer.A01;
                            if (jsonSerializer == null) {
                                jsonSerializer = c06.A09(invoke.getClass(), jsonValueSerializer.A00);
                            }
                            jsonSerializer.A0B(invoke, r6, c06);
                            return;
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
                    } else if (this instanceof TimeZoneSerializer) {
                        str = ((TimeZone) obj).getID();
                    } else if (this instanceof StdJdkSerializers$FileSerializer) {
                        str = ((File) obj).getAbsolutePath();
                    } else if (!(this instanceof StdJdkSerializers$ClassSerializer)) {
                        if (!(this instanceof StdJdkSerializers$AtomicLongSerializer)) {
                            if (!(this instanceof StdJdkSerializers$AtomicIntegerSerializer)) {
                                if (this instanceof StdJdkSerializers$AtomicBooleanSerializer) {
                                    z = ((AtomicBoolean) obj).get();
                                } else if (this instanceof SqlTimeSerializer) {
                                    str = ((Time) obj).toString();
                                } else if (this instanceof SqlDateSerializer) {
                                    str = ((java.sql.Date) obj).toString();
                                } else if (this instanceof NumberSerializers$ShortSerializer) {
                                    r6.A0j(((Short) obj).shortValue());
                                    return;
                                } else if (this instanceof NumberSerializers$NumberSerializer) {
                                    Number number = (Number) obj;
                                    if (number instanceof BigDecimal) {
                                        if (!c06.A05.A06(C15.WRITE_BIGDECIMAL_AS_PLAIN) || (r6 instanceof C13480ib)) {
                                            r6.A0h((BigDecimal) number);
                                            return;
                                        }
                                        obj2 = ((BigDecimal) number).toPlainString();
                                    } else if (number instanceof BigInteger) {
                                        r6.A0i((BigInteger) number);
                                        return;
                                    } else {
                                        if (!(number instanceof Integer)) {
                                            if (number instanceof Long) {
                                                r6.A0Y(number.longValue());
                                                return;
                                            } else if (number instanceof Double) {
                                                r6.A0V(number.doubleValue());
                                                return;
                                            } else if (number instanceof Float) {
                                                r6.A0W(number.floatValue());
                                                return;
                                            } else if (!(number instanceof Byte) && !(number instanceof Short)) {
                                                obj2 = number.toString();
                                            }
                                        }
                                        r6.A0X(number.intValue());
                                        return;
                                    }
                                    r6.A0e(obj2);
                                    return;
                                } else if (this instanceof NumberSerializers$LongSerializer) {
                                    j = ((Long) obj).longValue();
                                } else if (this instanceof NumberSerializers$IntLikeSerializer) {
                                    i = ((Number) obj).intValue();
                                } else if (this instanceof NumberSerializers$FloatSerializer) {
                                    r6.A0W(((Float) obj).floatValue());
                                    return;
                                } else if (this instanceof InetAddressSerializer) {
                                    InetAddressSerializer.A00((InetAddress) obj, r6);
                                    return;
                                } else if (this instanceof EnumSerializer) {
                                    EnumSerializer enumSerializer = (EnumSerializer) this;
                                    Enum enumR = (Enum) obj;
                                    Boolean bool = enumSerializer.A01;
                                    if (bool != null ? bool.booleanValue() : c06.A05.A06(C15.WRITE_ENUMS_USING_INDEX)) {
                                        r6.A0X(enumR.ordinal());
                                        return;
                                    } else {
                                        r6.A0c((C12960hf) enumSerializer.A00.A00.get(enumR));
                                        return;
                                    }
                                } else if (this instanceof StringSerializer) {
                                    r6.A0g((String) obj);
                                    return;
                                } else if (this instanceof NumberSerializers$IntegerSerializer) {
                                    i = ((Integer) obj).intValue();
                                } else if (this instanceof NumberSerializers$DoubleSerializer) {
                                    r6.A0V(((Double) obj).doubleValue());
                                    return;
                                } else if (!(this instanceof BooleanSerializer)) {
                                    if (this instanceof MapSerializer) {
                                        MapSerializer mapSerializer = (MapSerializer) this;
                                        Map map = (Map) obj;
                                        r6.A0T();
                                        if (!map.isEmpty()) {
                                            if (c06.A05.A06(C15.ORDER_MAP_ENTRIES_BY_KEYS) && !(map instanceof SortedMap)) {
                                                map = new TreeMap(map);
                                            }
                                            JsonSerializer jsonSerializer2 = mapSerializer.A01;
                                            if (jsonSerializer2 != null) {
                                                mapSerializer.A0G(map, r6, c06, jsonSerializer2);
                                            } else {
                                                mapSerializer.A0F(map, r6, c06);
                                            }
                                        }
                                    } else if (this instanceof EnumMapSerializer) {
                                        EnumMapSerializer enumMapSerializer = (EnumMapSerializer) this;
                                        EnumMap enumMap = (EnumMap) obj;
                                        r6.A0T();
                                        if (!enumMap.isEmpty()) {
                                            enumMapSerializer.A0F(enumMap, r6, c06);
                                        }
                                    } else if (this instanceof AsArraySerializerBase) {
                                        AsArraySerializerBase asArraySerializerBase = (AsArraySerializerBase) this;
                                        if (!c06.A05.A06(C15.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || !asArraySerializerBase.A0E(obj)) {
                                            r6.A0S();
                                            asArraySerializerBase.A0I(obj, r6, c06);
                                            r6.A0P();
                                            return;
                                        }
                                        asArraySerializerBase.A0I(obj, r6, c06);
                                        return;
                                    } else if (this instanceof ArraySerializerBase) {
                                        ArraySerializerBase arraySerializerBase = (ArraySerializerBase) this;
                                        if (!c06.A05.A06(C15.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || !arraySerializerBase.A0E(obj)) {
                                            r6.A0S();
                                            arraySerializerBase.A0F(obj, r6, c06);
                                            r6.A0P();
                                            return;
                                        }
                                        arraySerializerBase.A0F(obj, r6, c06);
                                        return;
                                    } else if (this instanceof UnknownSerializer) {
                                        if (c06.A05.A06(C15.FAIL_ON_EMPTY_BEANS)) {
                                            throw new C27125Bya(AnonymousClass000.A0J("No serializer found for class ", obj.getClass().getName(), " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) )"));
                                        }
                                        r6.A0T();
                                    } else if (this instanceof StringCollectionSerializer) {
                                        StringCollectionSerializer stringCollectionSerializer = (StringCollectionSerializer) this;
                                        Collection collection = (Collection) obj;
                                        if (collection.size() == 1) {
                                            if (c06.A05.A06(C15.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
                                                if (stringCollectionSerializer.A00 == null) {
                                                    StringCollectionSerializer.A05(stringCollectionSerializer, collection, r6, c06);
                                                    return;
                                                } else {
                                                    StringCollectionSerializer.A00(stringCollectionSerializer, collection, r6, c06);
                                                    return;
                                                }
                                            }
                                        }
                                        r6.A0S();
                                        if (stringCollectionSerializer.A00 == null) {
                                            StringCollectionSerializer.A05(stringCollectionSerializer, collection, r6, c06);
                                        } else {
                                            StringCollectionSerializer.A00(stringCollectionSerializer, collection, r6, c06);
                                        }
                                    } else if (this instanceof IndexedStringListSerializer) {
                                        IndexedStringListSerializer indexedStringListSerializer = (IndexedStringListSerializer) this;
                                        List list = (List) obj;
                                        int size = list.size();
                                        if (size == 1) {
                                            if (c06.A05.A06(C15.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
                                                if (indexedStringListSerializer.A00 == null) {
                                                    IndexedStringListSerializer.A05(list, r6, c06, 1);
                                                    return;
                                                } else {
                                                    IndexedStringListSerializer.A00(indexedStringListSerializer, list, r6, c06, 1);
                                                    return;
                                                }
                                            }
                                        }
                                        r6.A0S();
                                        if (indexedStringListSerializer.A00 == null) {
                                            IndexedStringListSerializer.A05(list, r6, c06, size);
                                        } else {
                                            IndexedStringListSerializer.A00(indexedStringListSerializer, list, r6, c06, size);
                                        }
                                    } else if (this instanceof FailingSerializer) {
                                        throw new AnonymousClass29Z(((FailingSerializer) this).A00);
                                    } else if (!(this instanceof DOMSerializer)) {
                                        CalendarSerializer.A00.A0F(((XMLGregorianCalendar) obj).toGregorianCalendar(), r6, c06);
                                        return;
                                    } else {
                                        Node node = (Node) obj;
                                        DOMImplementationLS dOMImplementationLS = ((DOMSerializer) this).A00;
                                        if (dOMImplementationLS != null) {
                                            str = dOMImplementationLS.createLSSerializer().writeToString(node);
                                        } else {
                                            throw new IllegalStateException("Could not find DOM LS");
                                        }
                                    }
                                    r6.A0Q();
                                    return;
                                } else {
                                    z = ((Boolean) obj).booleanValue();
                                }
                                r6.A0k(z);
                                return;
                            }
                            i = ((AtomicInteger) obj).get();
                            r6.A0X(i);
                            return;
                        }
                        j = ((AtomicLong) obj).get();
                        r6.A0Y(j);
                        return;
                    } else {
                        str = ((Class) obj).getName();
                    }
                    r6.A0P();
                    return;
                } else {
                    StdDelegatingSerializer stdDelegatingSerializer = (StdDelegatingSerializer) this;
                    Object A9o = stdDelegatingSerializer.A01.A9o(obj);
                    if (A9o == null) {
                        c06.A0D(r6);
                        return;
                    } else {
                        stdDelegatingSerializer.A00.A0B(A9o, r6, c06);
                        return;
                    }
                }
            } else if (obj instanceof Date) {
                c06.A0E((Date) obj, r6);
                return;
            } else {
                r6.A0d(obj.toString());
                return;
            }
            r6.A0g(str);
            return;
        }
        TokenBufferSerializer.A00((C13480ib) obj, r6);
    }

    public static final JsonSerializer A01(C06 c06, C27148BzD bzD, JsonSerializer jsonSerializer) {
        Object A0f;
        C27179Bzx A01 = c06.A05.A01();
        if (A01 == null || bzD == null || (A0f = A01.A0f(bzD.APy())) == null) {
            return jsonSerializer;
        }
        C27107By8 A06 = c06.A06(A0f);
        C0L ARO = A06.ARO(c06.A05());
        if (jsonSerializer == null) {
            jsonSerializer = c06.A07(ARO, bzD);
        }
        return new StdDelegatingSerializer(A06, ARO, jsonSerializer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r2.A05.A06(p000X.C15.WRAP_EXCEPTIONS) != false) goto L_0x0020;
     */
    public static final void A02(C06 c06, Throwable th, Object obj, int i) {
        boolean z;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (!(th instanceof Error)) {
            if (c06 != null) {
                z = false;
            }
            z = true;
            if (th instanceof IOException) {
                if (!z || !(th instanceof C27125Bya)) {
                    throw ((IOException) th);
                }
            } else if (!z && (th instanceof RuntimeException)) {
                throw ((RuntimeException) th);
            }
            throw C27125Bya.A01(th, new C200288hn(obj, i));
        }
        throw ((Error) th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r2.A05.A06(p000X.C15.WRAP_EXCEPTIONS) != false) goto L_0x0020;
     */
    public static final void A03(C06 c06, Throwable th, Object obj, String str) {
        boolean z;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (!(th instanceof Error)) {
            if (c06 != null) {
                z = false;
            }
            z = true;
            if (th instanceof IOException) {
                if (!z || !(th instanceof C27125Bya)) {
                    throw ((IOException) th);
                }
            } else if (!z && (th instanceof RuntimeException)) {
                throw ((RuntimeException) th);
            }
            throw C27125Bya.A01(th, new C200288hn(obj, str));
        }
        throw ((Error) th);
    }

    public static final boolean A04(JsonSerializer jsonSerializer) {
        if (jsonSerializer == null || jsonSerializer.getClass().getAnnotation(JacksonStdImpl.class) == null) {
            return false;
        }
        return true;
    }

    public StdSerializer(C0L c0l) {
        this.A00 = c0l.A00;
    }

    public StdSerializer(Class cls) {
        this.A00 = cls;
    }

    public StdSerializer(Class cls, boolean z) {
        this.A00 = cls;
    }
}
