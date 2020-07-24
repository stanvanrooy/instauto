package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import com.facebook.C0003R;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.zip.CRC32;

/* renamed from: X.0lj  reason: invalid class name and case insensitive filesystem */
public final class C14790lj extends C14800ll {
    public static C14790lj A03;
    public final C11730fS A00;
    public final C14890lu A01;
    public final C14330kH A02;

    public final void A01(int i) {
        C11730fS r4 = this.A00;
        Locale locale = this.A00.getConfiguration().locale;
        synchronized (r4) {
            if (locale != r4.A02) {
                C11730fS.A00(r4);
                r4.A02 = locale;
            }
            synchronized (r4) {
                int i2 = r4.A00;
                r4.A00 = i2 + 1;
                if (i2 == 0) {
                    C254918z r1 = new C254918z(r4.A04.A02("android_string_impressions"));
                    if (!r1.A0B()) {
                        r4.A01 = null;
                        r4.A03 = null;
                    } else {
                        r4.A01 = r1;
                        r4.A03 = r4.A05;
                    }
                }
                Map map = r4.A03;
                if (map != null) {
                    Integer valueOf = Integer.valueOf(i);
                    Integer num = (Integer) map.get(valueOf);
                    int i3 = 1;
                    if (num != null) {
                        i3 = 1 + num.intValue();
                    }
                    map.put(valueOf, Integer.valueOf(i3));
                }
            }
            if (r4.A00 >= 50) {
                C11730fS.A00(r4);
            }
        }
    }

    public final XmlResourceParser getLayout(int i) {
        RuntimeException runtimeException;
        XmlResourceParser xmlResourceParser;
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("DownloadedIgResources.getLayout", 1945279225);
        }
        try {
            C14890lu r5 = this.A01;
            C14440kc r2 = r5.A02;
            if (r2 == null) {
                AnonymousClass0DB.A0F("LayoutUnpacker", "init() was never called before getLayout()");
                r5.A00();
                r2 = r5.A02;
            } else if (!r2.isDone()) {
                AnonymousClass0DB.A0F("LayoutUnpacker", "mBundledLayoutLoaderFuture did not complete before getLayout() was called");
            }
            try {
                AnonymousClass0ZN.A01("waitForFuture", -1558540516);
                C15140mP r4 = (C15140mP) r2.get();
                AnonymousClass0ZN.A00(-2109555887);
                synchronized (r4) {
                    String string = r4.A00.getString(i);
                    if (!string.startsWith("L|")) {
                        xmlResourceParser = null;
                    } else {
                        String[] split = string.split("\\|");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[1], 16);
                            int parseInt2 = Integer.parseInt(split[2], 16);
                            Object obj = r4.A01.get(Long.valueOf(((long) parseInt2) | (((long) parseInt) << 32)));
                            if (obj == null) {
                                byte[] bArr = new byte[parseInt2];
                                int i2 = 0;
                                while (i2 < parseInt2) {
                                    try {
                                        bArr[i2] = r4.A05.get(parseInt + i2);
                                        i2++;
                                    } catch (IllegalAccessException | InvocationTargetException e) {
                                        throw new RuntimeException(AnonymousClass000.A0E("Could not create XmlResourceParser for bundled layout 0x", Integer.toHexString(i)), e);
                                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                                        throw new RuntimeException(AnonymousClass000.A0E("Could not create XmlBlock for bundled layout 0x", Integer.toHexString(i)), e2);
                                    } catch (IndexOutOfBoundsException e3) {
                                        throw new IOException(AnonymousClass000.A0E("Detected truncated layouts.bin loading 0x", Integer.toHexString(i)), e3);
                                    }
                                }
                                long parseLong = Long.parseLong(split[3], 16);
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr);
                                if (parseLong == (crc32.getValue() & 65535)) {
                                    obj = r4.A02.newInstance(new Object[]{bArr});
                                    r4.A01.put(Long.valueOf(((long) parseInt2) | (((long) parseInt) << 32)), obj);
                                } else {
                                    throw new IOException(AnonymousClass000.A0E("CRC mismatch loading layout 0x", Integer.toHexString(i)));
                                }
                            }
                            xmlResourceParser = (XmlResourceParser) r4.A04.invoke(obj, new Object[0]);
                        } else {
                            throw new RuntimeException(AnonymousClass000.A0N("Bad bundled layout token \"", string, "\" for resourceID 0x", Integer.toHexString(i)));
                        }
                    }
                }
                if (xmlResourceParser == null) {
                    xmlResourceParser = null;
                }
                if (xmlResourceParser == null) {
                    xmlResourceParser = super.getLayout(i);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-1817730479);
                        return xmlResourceParser;
                    }
                }
                return xmlResourceParser;
            } catch (IOException e4) {
                new File(r5.A00.getDir("restricks", 0), "layouts.bin.sha256").delete();
                runtimeException = new RuntimeException("Corruption detected in layout bundle", e4);
                throw runtimeException;
            } catch (InterruptedException | ExecutionException e5) {
                runtimeException = new RuntimeException("BundledLayoutLoader failed to initialize", e5);
                throw runtimeException;
            } catch (Throwable th) {
                AnonymousClass0ZN.A00(1265677733);
                throw th;
            }
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1226501588);
            }
        }
    }

    public final CharSequence getQuantityText(int i, int i2) {
        String A022;
        if (i != 0) {
            A01(i);
            int charAt = super.getQuantityText(C0003R.plurals.fake_plural, i2).charAt(0) - '0';
            if (charAt >= 0) {
                Integer[] numArr = C42901tR.A00;
                if (charAt < numArr.length) {
                    Integer num = numArr[charAt];
                    C14330kH r2 = this.A02;
                    if ((-65536 & i) == C0003R.plurals.add_call_to_action_description) {
                        Integer num2 = 0;
                        C15040mE A002 = C14330kH.A00(r2, i);
                        if (!(A002 == null || (A022 = A002.A02(i, num2.intValue(), num)) == null)) {
                            return A022;
                        }
                    }
                    return r2.A02.getQuantityString(i, i2);
                }
            }
            throw new RuntimeException("Requesting a PluralCategory that does not exists");
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    public final String[] getStringArray(int i) {
        String[] A032;
        if (i != 0) {
            A01(i);
            C14330kH r2 = this.A02;
            if ((-16777216 & i) == 2130706432) {
                Integer num = 0;
                C15040mE A002 = C14330kH.A00(r2, i);
                if (!(A002 == null || (A032 = A002.A03(i, num.intValue())) == null)) {
                    return A032;
                }
            }
            return r2.A02.getStringArray(i);
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    public C14790lj(Context context, C14330kH r4, C11730fS r5, int i) {
        super(context.getResources());
        this.A02 = r4;
        this.A00 = r5;
        C14890lu r1 = new C14890lu(context, context.getResources());
        this.A01 = r1;
        r1.A00();
        C15280md.A00().A00 = i;
    }

    public final void A00(Locale locale) {
        super.A00(locale);
        this.A02.A04();
    }

    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        C15280md.A00().A01(this, i);
        return super.getDrawableForDensity(i, i2, theme);
    }

    public final CharSequence[] getTextArray(int i) {
        return getStringArray(i);
    }

    public final String getQuantityString(int i, int i2) {
        return getQuantityText(i, i2).toString();
    }

    public final String getQuantityString(int i, int i2, Object... objArr) {
        return String.format(this.A02.A02(), getQuantityString(i, i2), objArr);
    }

    public final String getString(int i) {
        return getText(i).toString();
    }

    public final String getString(int i, Object... objArr) {
        return String.format(this.A02.A02(), getString(i), objArr);
    }

    public final CharSequence getText(int i) {
        if (i != 0) {
            A01(i);
            return this.A02.A01(i);
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    public final CharSequence getText(int i, CharSequence charSequence) {
        A01(i);
        CharSequence A012 = i != 0 ? this.A02.A01(i) : null;
        return A012 == null ? charSequence : A012;
    }
}
