package com.google.p052vr.dynamite.client;

import android.os.IBinder;
import com.google.p052vr.dynamite.client.IObjectWrapper;
import java.lang.reflect.Field;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.vr.dynamite.client.ObjectWrapper */
public final class ObjectWrapper extends IObjectWrapper.C0128a {
    public final Object wrappedObject;

    public static Object unwrap(IObjectWrapper iObjectWrapper, Class cls) {
        if (iObjectWrapper != null) {
            if (iObjectWrapper instanceof ObjectWrapper) {
                return ((ObjectWrapper) iObjectWrapper).wrappedObject;
            }
            IBinder asBinder = iObjectWrapper.asBinder();
            Field[] declaredFields = asBinder.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            Field field = null;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field2 = declaredFields[i];
                if (!field2.isSynthetic()) {
                    Field field3 = field;
                    field = field2;
                    if (field3 != null) {
                        field = null;
                        break;
                    }
                }
                i++;
            }
            if (field == null) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
            } else if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    Object obj = field.get(asBinder);
                    if (obj != null) {
                        if (cls.isInstance(obj)) {
                            return cls.cast(obj);
                        }
                        throw new IllegalArgumentException("remoteBinder is the wrong class.");
                    }
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        }
        return null;
    }

    public ObjectWrapper(Object obj) {
        int A03 = AnonymousClass0Z0.A03(652179987);
        this.wrappedObject = obj;
        AnonymousClass0Z0.A0A(496130142, A03);
    }
}
