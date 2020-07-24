package com.facebook.forker;

import java.io.FileDescriptor;
import java.lang.reflect.Field;

/* renamed from: com.facebook.forker.Fd */
public final class C0024Fd {
    public static volatile Field mDescriptorField;

    public static int fileno(FileDescriptor fileDescriptor) {
        try {
            Field field = mDescriptorField;
            if (field == null) {
                field = FileDescriptor.class.getDeclaredField("descriptor");
                field.setAccessible(true);
                mDescriptorField = field;
            }
            return field.getInt(fileDescriptor);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: of */
    public static FileDescriptor m37of(int i) {
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            Field field = mDescriptorField;
            if (field == null) {
                field = FileDescriptor.class.getDeclaredField("descriptor");
                field.setAccessible(true);
                mDescriptorField = field;
            }
            field.setInt(fileDescriptor, i);
            return fileDescriptor;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
