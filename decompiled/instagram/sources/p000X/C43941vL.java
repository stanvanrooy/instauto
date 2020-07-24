package p000X;

import java.util.Queue;

/* renamed from: X.1vL  reason: invalid class name and case insensitive filesystem */
public abstract class C43941vL<E> extends C43951vM<E> implements Queue<E> {
    /* renamed from: A03 */
    public abstract Queue A02();

    public final Object element() {
        return A02().element();
    }

    public boolean offer(Object obj) {
        return A02().offer(obj);
    }

    public final Object peek() {
        return A02().peek();
    }

    public final Object poll() {
        return A02().poll();
    }

    public final Object remove() {
        return A02().remove();
    }
}
