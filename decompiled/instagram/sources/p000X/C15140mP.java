package p000X;

import android.content.res.Resources;
import com.facebook.common.dextricks.DalvikInternals;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0mP  reason: invalid class name and case insensitive filesystem */
public final class C15140mP {
    public final Resources A00;
    public final C15150mQ A01 = new C15150mQ(this);
    public final Constructor A02;
    public final Method A03;
    public final Method A04;
    public final ByteBuffer A05;

    public C15140mP(Resources resources, File file) {
        this.A00 = resources;
        FileChannel channel = new FileInputStream(file).getChannel();
        this.A05 = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
        DalvikInternals.madviseFile(file.getCanonicalPath());
        try {
            Class<?> cls = Class.forName("android.content.res.XmlBlock");
            this.A02 = cls.getDeclaredConstructor(new Class[]{byte[].class});
            this.A04 = cls.getDeclaredMethod("newParser", new Class[0]);
            this.A03 = cls.getDeclaredMethod("close", new Class[0]);
            this.A02.setAccessible(true);
            this.A04.setAccessible(true);
            this.A03.setAccessible(true);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("Unable to load XmlBlock methods by reflection", e);
        }
    }
}
