package p000X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1vM  reason: invalid class name and case insensitive filesystem */
public abstract class C43951vM<E> extends C43961vN implements Collection<E> {
    /* renamed from: A02 */
    public abstract Collection A01();

    public boolean add(Object obj) {
        return A01().add(obj);
    }

    public boolean addAll(Collection collection) {
        return A01().addAll(collection);
    }

    public final void clear() {
        A01().clear();
    }

    public boolean contains(Object obj) {
        return A01().contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return A01().containsAll(collection);
    }

    public final boolean isEmpty() {
        return A01().isEmpty();
    }

    public final Iterator iterator() {
        return A01().iterator();
    }

    public boolean remove(Object obj) {
        return A01().remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return A01().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return A01().retainAll(collection);
    }

    public final int size() {
        return A01().size();
    }

    public final Object[] toArray() {
        return A01().toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return A01().toArray(objArr);
    }
}
