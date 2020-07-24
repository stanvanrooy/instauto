package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumMapSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.C06;
import p000X.C27148BzD;
import p000X.C27179Bzx;
import p000X.C27204C1t;

public abstract class ContainerSerializer extends StdSerializer {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0043 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public boolean A0C(Object obj) {
        if (this instanceof MapSerializer) {
            Map map = (Map) obj;
            if (map != null && !map.isEmpty()) {
                return false;
            }
        } else if (this instanceof EnumMapSerializer) {
            EnumMap enumMap = (EnumMap) obj;
            if (enumMap != null && !enumMap.isEmpty()) {
                return false;
            }
        } else if (this instanceof StdArraySerializers$IntArraySerializer) {
            int[] iArr = (int[]) obj;
            if (iArr != null && iArr.length != 0) {
                return false;
            }
        } else if (this instanceof StdArraySerializers$ShortArraySerializer) {
            short[] sArr = (short[]) obj;
            if (sArr != null && sArr.length != 0) {
                return false;
            }
        } else if (this instanceof StdArraySerializers$LongArraySerializer) {
            long[] jArr = (long[]) obj;
            if (jArr != null && jArr.length != 0) {
                return false;
            }
        } else if (this instanceof StdArraySerializers$FloatArraySerializer) {
            float[] fArr = (float[]) obj;
            if (fArr != null && fArr.length != 0) {
                return false;
            }
        } else if (this instanceof StdArraySerializers$DoubleArraySerializer) {
            double[] dArr = (double[]) obj;
            if (dArr != null && dArr.length != 0) {
                return false;
            }
        } else if (this instanceof StdArraySerializers$BooleanArraySerializer) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr != null && zArr.length != 0) {
                return false;
            }
        } else if (this instanceof ObjectArraySerializer) {
            Object[] objArr = (Object[]) obj;
            if (objArr != null && objArr.length != 0) {
                return false;
            }
        } else if (this instanceof StringArraySerializer) {
            String[] strArr = (String[]) obj;
            if (strArr != null && strArr.length != 0) {
                return false;
            }
        } else if (this instanceof IterableSerializer) {
            Iterable iterable = (Iterable) obj;
            if (iterable != null && iterable.iterator().hasNext()) {
                return false;
            }
        } else if (this instanceof EnumSetSerializer) {
            EnumSet enumSet = (EnumSet) obj;
            if (enumSet != null && !enumSet.isEmpty()) {
                return false;
            }
        } else if (this instanceof CollectionSerializer) {
            Collection collection = (Collection) obj;
            if (collection != null && !collection.isEmpty()) {
                return false;
            }
        } else if (!(this instanceof IteratorSerializer)) {
            List list = (List) obj;
            return list == null || list.isEmpty();
        } else {
            Iterator it = (Iterator) obj;
            if (it != null && it.hasNext()) {
                return false;
            }
        }
    }

    public ContainerSerializer A0D(C27204C1t c1t) {
        C27204C1t c1t2 = c1t;
        if (this instanceof MapSerializer) {
            return new MapSerializer((MapSerializer) this, c1t);
        }
        if (this instanceof EnumMapSerializer) {
            EnumMapSerializer enumMapSerializer = (EnumMapSerializer) this;
            return new EnumMapSerializer(enumMapSerializer.A01, enumMapSerializer.A05, enumMapSerializer.A04, c1t, enumMapSerializer.A02);
        } else if (this instanceof StdArraySerializers$IntArraySerializer) {
            return (StdArraySerializers$IntArraySerializer) this;
        } else {
            if (this instanceof StdArraySerializers$ShortArraySerializer) {
                StdArraySerializers$ShortArraySerializer stdArraySerializers$ShortArraySerializer = (StdArraySerializers$ShortArraySerializer) this;
                return new StdArraySerializers$ShortArraySerializer(stdArraySerializers$ShortArraySerializer, stdArraySerializers$ShortArraySerializer.A00, c1t);
            } else if (this instanceof StdArraySerializers$LongArraySerializer) {
                StdArraySerializers$LongArraySerializer stdArraySerializers$LongArraySerializer = (StdArraySerializers$LongArraySerializer) this;
                return new StdArraySerializers$LongArraySerializer(stdArraySerializers$LongArraySerializer, stdArraySerializers$LongArraySerializer.A00, c1t);
            } else if (this instanceof StdArraySerializers$FloatArraySerializer) {
                StdArraySerializers$FloatArraySerializer stdArraySerializers$FloatArraySerializer = (StdArraySerializers$FloatArraySerializer) this;
                return new StdArraySerializers$FloatArraySerializer(stdArraySerializers$FloatArraySerializer, stdArraySerializers$FloatArraySerializer.A00, c1t);
            } else if (this instanceof StdArraySerializers$DoubleArraySerializer) {
                return (StdArraySerializers$DoubleArraySerializer) this;
            } else {
                if (this instanceof StdArraySerializers$BooleanArraySerializer) {
                    return (StdArraySerializers$BooleanArraySerializer) this;
                }
                if (this instanceof ObjectArraySerializer) {
                    ObjectArraySerializer objectArraySerializer = (ObjectArraySerializer) this;
                    return new ObjectArraySerializer(objectArraySerializer.A02, objectArraySerializer.A04, c1t, objectArraySerializer.A00);
                } else if (this instanceof StringArraySerializer) {
                    return (StringArraySerializer) this;
                } else {
                    if (this instanceof IterableSerializer) {
                        IterableSerializer iterableSerializer = (IterableSerializer) this;
                        return new IterableSerializer(iterableSerializer.A02, iterableSerializer.A05, c1t, iterableSerializer.A01);
                    } else if (this instanceof EnumSetSerializer) {
                        return (EnumSetSerializer) this;
                    } else {
                        if (this instanceof CollectionSerializer) {
                            CollectionSerializer collectionSerializer = (CollectionSerializer) this;
                            return new CollectionSerializer(collectionSerializer.A02, collectionSerializer.A05, c1t2, collectionSerializer.A01, collectionSerializer.A03);
                        } else if (!(this instanceof IteratorSerializer)) {
                            IndexedListSerializer indexedListSerializer = (IndexedListSerializer) this;
                            return new IndexedListSerializer(indexedListSerializer.A02, indexedListSerializer.A05, c1t2, indexedListSerializer.A01, indexedListSerializer.A03);
                        } else {
                            IteratorSerializer iteratorSerializer = (IteratorSerializer) this;
                            return new IteratorSerializer(iteratorSerializer.A02, iteratorSerializer.A05, c1t, iteratorSerializer.A01);
                        }
                    }
                }
            }
        }
    }

    public boolean A0E(Object obj) {
        if (this instanceof MapSerializer) {
            return ((Map) obj).size() == 1;
        }
        if (this instanceof EnumMapSerializer) {
            return ((EnumMap) obj).size() == 1;
        }
        if (this instanceof StdArraySerializers$IntArraySerializer) {
            return ((int[]) obj).length == 1;
        }
        if (this instanceof StdArraySerializers$ShortArraySerializer) {
            return ((short[]) obj).length == 1;
        }
        if (this instanceof StdArraySerializers$LongArraySerializer) {
            return ((long[]) obj).length == 1;
        }
        if (this instanceof StdArraySerializers$FloatArraySerializer) {
            return ((float[]) obj).length == 1;
        }
        if (this instanceof StdArraySerializers$DoubleArraySerializer) {
            return ((double[]) obj).length == 1;
        }
        if (this instanceof StdArraySerializers$BooleanArraySerializer) {
            return ((boolean[]) obj).length == 1;
        }
        if (this instanceof ObjectArraySerializer) {
            return ((Object[]) obj).length == 1;
        }
        if (this instanceof StringArraySerializer) {
            return ((String[]) obj).length == 1;
        }
        if (this instanceof IterableSerializer) {
            return false;
        }
        if (this instanceof EnumSetSerializer) {
            return ((EnumSet) obj).size() == 1;
        }
        if (!(this instanceof CollectionSerializer)) {
            return !(this instanceof IteratorSerializer) && ((List) obj).size() == 1;
        }
        Iterator it = ((Collection) obj).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    public static final boolean A05(C06 c06, C27148BzD bzD) {
        C27179Bzx A01;
        if (bzD == null || (A01 = c06.A05.A01()) == null || A01.A0N(bzD.APy(), bzD.AZA()) == null) {
            return false;
        }
        return true;
    }

    public ContainerSerializer(ContainerSerializer containerSerializer) {
        super(containerSerializer.A00, false);
    }

    public ContainerSerializer(Class cls) {
        super(cls);
    }

    public ContainerSerializer(Class cls, boolean z) {
        super(cls, false);
    }
}
