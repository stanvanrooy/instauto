package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import p000X.C0L;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C27105Bxz;
import p000X.C27106By5;
import p000X.C27109ByB;
import p000X.C27123ByY;
import p000X.C27148BzD;
import p000X.C27183C0d;

@JacksonStdImpl
public class CollectionDeserializer extends ContainerDeserializerBase implements C27105Bxz {
    public final C0L A00;
    public final JsonDeserializer A01;
    public final JsonDeserializer A02;
    public final C27183C0d A03;
    public final C27106By5 A04;

    public CollectionDeserializer(C0L c0l, JsonDeserializer jsonDeserializer, C27106By5 by5, C27183C0d c0d, JsonDeserializer jsonDeserializer2) {
        super(c0l.A00);
        this.A00 = c0l;
        this.A02 = jsonDeserializer;
        this.A04 = by5;
        this.A03 = c0d;
        this.A01 = jsonDeserializer2;
    }

    public CollectionDeserializer A0M(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, C27106By5 by5) {
        JsonDeserializer jsonDeserializer3 = jsonDeserializer2;
        C27106By5 by52 = by5;
        JsonDeserializer jsonDeserializer4 = jsonDeserializer;
        if (this instanceof ArrayBlockingQueueDeserializer) {
            ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = (ArrayBlockingQueueDeserializer) this;
            if (jsonDeserializer == arrayBlockingQueueDeserializer.A01 && jsonDeserializer2 == arrayBlockingQueueDeserializer.A02 && by5 == arrayBlockingQueueDeserializer.A04) {
                return arrayBlockingQueueDeserializer;
            }
            return new ArrayBlockingQueueDeserializer(arrayBlockingQueueDeserializer.A00, jsonDeserializer2, by5, arrayBlockingQueueDeserializer.A03, jsonDeserializer);
        } else if (jsonDeserializer == this.A01 && jsonDeserializer2 == this.A02 && by5 == this.A04) {
            return this;
        } else {
            return new CollectionDeserializer(this.A00, jsonDeserializer3, by52, this.A03, jsonDeserializer4);
        }
    }

    public Collection A0N(C13080hr r4, C27123ByY byY) {
        Object A0A;
        Object A0A2;
        if (!(this instanceof ArrayBlockingQueueDeserializer)) {
            JsonDeserializer jsonDeserializer = this.A01;
            if (jsonDeserializer != null) {
                A0A2 = this.A03.A09(byY, jsonDeserializer.A06(r4, byY));
            } else {
                if (r4.A0g() == C13120hv.VALUE_STRING) {
                    String A0t = r4.A0t();
                    if (A0t.length() == 0) {
                        A0A2 = this.A03.A0A(byY, A0t);
                    }
                }
                return A0O(r4, byY, (Collection) this.A03.A05(byY));
            }
            return (Collection) A0A2;
        }
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = (ArrayBlockingQueueDeserializer) this;
        JsonDeserializer jsonDeserializer2 = arrayBlockingQueueDeserializer.A01;
        if (jsonDeserializer2 != null) {
            A0A = arrayBlockingQueueDeserializer.A03.A09(byY, jsonDeserializer2.A06(r4, byY));
        } else {
            if (r4.A0g() == C13120hv.VALUE_STRING) {
                String A0t2 = r4.A0t();
                if (A0t2.length() == 0) {
                    A0A = arrayBlockingQueueDeserializer.A03.A0A(byY, A0t2);
                }
            }
            return arrayBlockingQueueDeserializer.A0O(r4, byY, (Collection) null);
        }
        return (Collection) A0A;
    }

    public Collection A0O(C13080hr r6, C27123ByY byY, Collection collection) {
        Object A07;
        Object A072;
        if (this instanceof ArrayBlockingQueueDeserializer) {
            ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = (ArrayBlockingQueueDeserializer) this;
            if (!r6.A0P()) {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                arrayBlockingQueueDeserializer.A0P(r6, byY, arrayBlockingQueue);
                return arrayBlockingQueue;
            }
            ArrayList arrayList = new ArrayList();
            JsonDeserializer jsonDeserializer = arrayBlockingQueueDeserializer.A02;
            C27106By5 by5 = arrayBlockingQueueDeserializer.A04;
            while (true) {
                C13120hv A0p = r6.A0p();
                if (A0p == C13120hv.END_ARRAY) {
                    break;
                }
                if (A0p == C13120hv.VALUE_NULL) {
                    A07 = null;
                } else if (by5 == null) {
                    A07 = jsonDeserializer.A06(r6, byY);
                } else {
                    A07 = jsonDeserializer.A07(r6, byY, by5);
                }
                arrayList.add(A07);
            }
            if (collection == null) {
                return new ArrayBlockingQueue(arrayList.size(), false, arrayList);
            }
            collection.addAll(arrayList);
            return collection;
        } else if (!r6.A0P()) {
            A0P(r6, byY, collection);
            return collection;
        } else {
            JsonDeserializer jsonDeserializer2 = this.A02;
            C27106By5 by52 = this.A04;
            while (true) {
                C13120hv A0p2 = r6.A0p();
                if (A0p2 == C13120hv.END_ARRAY) {
                    return collection;
                }
                if (A0p2 == C13120hv.VALUE_NULL) {
                    A072 = null;
                } else if (by52 == null) {
                    A072 = jsonDeserializer2.A06(r6, byY);
                } else {
                    A072 = jsonDeserializer2.A07(r6, byY, by52);
                }
                collection.add(A072);
            }
        }
    }

    public final void A0P(C13080hr r5, C27123ByY byY, Collection collection) {
        Object A07;
        if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            JsonDeserializer jsonDeserializer = this.A02;
            C27106By5 by5 = this.A04;
            if (r5.A0g() == C13120hv.VALUE_NULL) {
                A07 = null;
            } else if (by5 == null) {
                A07 = jsonDeserializer.A06(r5, byY);
            } else {
                A07 = jsonDeserializer.A07(r5, byY, by5);
            }
            collection.add(A07);
            return;
        }
        throw byY.A0A(this.A00.A00);
    }

    public final /* bridge */ /* synthetic */ JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        JsonDeserializer jsonDeserializer;
        C27183C0d c0d = this.A03;
        if (c0d == null || !c0d.A0L()) {
            jsonDeserializer = null;
        } else {
            C0L A012 = c0d.A01(byY.A00);
            if (A012 != null) {
                jsonDeserializer = byY.A08(A012, bzD);
            } else {
                throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.A00 + ": value instantiator (" + this.A03.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            }
        }
        JsonDeserializer A013 = StdDeserializer.A01(byY, bzD, this.A02);
        if (A013 == null) {
            A013 = byY.A08(this.A00.A03(), bzD);
        } else if (A013 instanceof C27105Bxz) {
            A013 = ((C27105Bxz) A013).AAK(byY, bzD);
        }
        C27106By5 by5 = this.A04;
        if (by5 != null) {
            by5 = by5.A03(bzD);
        }
        return A0M(jsonDeserializer, A013, by5);
    }
}
