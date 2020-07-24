package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import p000X.AnonymousClass0Z0;

public final class ObjectWrapper extends IObjectWrapper.Stub {
    public final Object A00;

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field field = null;
        int i = 0;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(r4);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }

    public ObjectWrapper(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-212057726);
        this.A00 = obj;
        AnonymousClass0Z0.A0A(-1921809681, A03);
    }
}
