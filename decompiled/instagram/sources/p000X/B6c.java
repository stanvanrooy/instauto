package p000X;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.B6c */
public final class B6c extends RuntimeException {
    public Throwable A00;
    public final List A01;
    public final String A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|(1:(1:12)(1:(2:13|(1:16)(1:51))))(0)|17|(4:20|(2:22|53)(2:23|54)|52|18)|24|25|26|27|(1:47)(2:29|(2:31|48)(3:(2:32|(1:36)(1:35))|36|49))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0016 A[SYNTHETIC] */
    public final synchronized Throwable getCause() {
        if (this.A00 == null) {
            B6d b6d = new B6d();
            HashSet hashSet = new HashSet();
            B6d b6d2 = b6d;
            for (Throwable th : this.A01) {
                if (!hashSet.contains(th)) {
                    hashSet.add(th);
                    ArrayList<Throwable> arrayList = new ArrayList<>();
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        if (cause != th) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                    }
                    for (Throwable th2 : arrayList) {
                        if (hashSet.contains(th2)) {
                            th = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    b6d2.initCause(th);
                    Throwable cause3 = b6d2.getCause();
                    if (cause3 != null) {
                        if (this.A00 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    b6d2 = cause3;
                                } else {
                                    cause3 = cause4;
                                }
                            }
                            b6d2 = cause3;
                        }
                    }
                }
            }
            this.A00 = b6d;
        }
        return this.A00;
    }

    private void A00(C25197B6g b6g) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable A012 : this.A01) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            A01(sb, A012, "\t");
            i++;
        }
        b6g.A00(sb.toString());
    }

    public B6c(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof B6c) {
                    linkedHashSet.addAll(((B6c) th).A01);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            this.A01 = unmodifiableList;
            this.A02 = AnonymousClass000.A00(unmodifiableList.size(), " exceptions occurred. ");
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void A01(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            A01(sb, th.getCause(), "");
        }
    }

    public final String getMessage() {
        return this.A02;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        A00(new C25196B6f(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        A00(new B6e(printWriter));
    }
}
