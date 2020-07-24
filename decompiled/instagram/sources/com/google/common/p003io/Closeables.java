package com.google.common.p003io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.io.Closeables */
public final class Closeables {
    public static final Logger logger = Logger.getLogger(Closeables.class.getName());

    public static void A01(InputStream inputStream) {
        try {
            A00(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void A00(Closeable closeable, boolean z) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    logger.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                    return;
                }
                throw e;
            }
        }
    }
}
