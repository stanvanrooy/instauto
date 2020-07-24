package p000X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Ea  reason: invalid class name and case insensitive filesystem */
public final class C04450Ea<K, V> extends AnonymousClass00N<K, V> implements Map<K, V> {
    public AnonymousClass00M A00;

    public final Set entrySet() {
        if (this.A00 == null) {
            this.A00 = new C04460Eb(this);
        }
        AnonymousClass00M r1 = this.A00;
        if (r1.A00 == null) {
            r1.A00 = new AnonymousClass00I(r1);
        }
        return r1.A00;
    }

    public final Set keySet() {
        if (this.A00 == null) {
            this.A00 = new C04460Eb(this);
        }
        AnonymousClass00M r1 = this.A00;
        if (r1.A01 == null) {
            r1.A01 = new AnonymousClass00J(r1);
        }
        return r1.A01;
    }

    public final void putAll(Map map) {
        A09(this.A00 + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        if (this.A00 == null) {
            this.A00 = new C04460Eb(this);
        }
        AnonymousClass00M r1 = this.A00;
        if (r1.A02 == null) {
            r1.A02 = new AnonymousClass00L(r1);
        }
        return r1.A02;
    }

    public C04450Ea() {
    }

    public C04450Ea(int i) {
        super(i);
    }

    public C04450Ea(AnonymousClass00N r1) {
        if (r1 != null) {
            A0A(r1);
        }
    }
}
