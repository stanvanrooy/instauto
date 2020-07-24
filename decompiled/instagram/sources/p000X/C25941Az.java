package p000X;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Az  reason: invalid class name and case insensitive filesystem */
public abstract class C25941Az {
    public final Map mBagOfTags = new HashMap();
    public volatile boolean mCleared = false;

    public final void clear() {
        this.mCleared = true;
        Map map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                for (Object closeWithRuntimeException : this.mBagOfTags.values()) {
                    closeWithRuntimeException(closeWithRuntimeException);
                }
            }
        }
        onCleared();
    }

    public void onCleared() {
    }

    public static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object getTag(String str) {
        Object obj;
        Map map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.mBagOfTags.get(str);
        }
        return obj;
    }

    public Object setTagIfAbsent(String str, Object obj) {
        Object obj2;
        synchronized (this.mBagOfTags) {
            obj2 = this.mBagOfTags.get(str);
            if (obj2 == null) {
                this.mBagOfTags.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.mCleared) {
            closeWithRuntimeException(obj);
        }
        return obj;
    }
}
