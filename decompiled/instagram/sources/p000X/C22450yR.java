package p000X;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0yR  reason: invalid class name and case insensitive filesystem */
public final class C22450yR {
    public final Map A00 = new HashMap(4);
    public volatile boolean A01 = false;
    public volatile boolean A02 = false;
    public final /* synthetic */ C14610lD A03;

    public final synchronized Map A03() {
        if (!this.A02) {
            this.A02 = true;
        } else {
            throw new RuntimeException("Trying to freeze an editor that is already frozen!");
        }
        return this.A00;
    }

    public final synchronized void A06() {
        this.A02 = false;
    }

    public C22450yR(C14610lD r3) {
        this.A03 = r3;
    }

    private Set A00(Map map) {
        C22460yS r5 = new C22460yS();
        synchronized (this.A03.A02) {
            if (this.A01) {
                r5.addAll(this.A03.A04.keySet());
                this.A03.A04.clear();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == C14610lD.A0A) {
                    this.A03.A04.remove(str);
                } else if (value == null) {
                    throw null;
                } else if (!value.equals(this.A03.A04.get(str))) {
                    this.A03.A04.put(str, value);
                }
                r5.add(str);
            }
            AtomicBoolean atomicBoolean = this.A03.A07;
            boolean z = false;
            if (!r5.isEmpty()) {
                z = true;
            }
            atomicBoolean.compareAndSet(false, z);
        }
        this.A01 = false;
        map.clear();
        return r5;
    }

    public static void A01(C22450yR r7) {
        HashMap hashMap;
        int i;
        if (r7.A03.A07.get()) {
            synchronized (r7.A03.A02) {
                r7.A03.A07.set(false);
                hashMap = new HashMap(r7.A03.A04);
            }
            try {
                C14620lE r5 = r7.A03.A01;
                File createTempFile = File.createTempFile(AnonymousClass000.A0E(r5.A00.getName(), "."), ".tmp", r5.A00.getParentFile());
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile), 512));
                try {
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeInt(hashMap.size());
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Boolean) {
                            i = 0;
                        } else if (value instanceof Integer) {
                            i = 1;
                        } else if (value instanceof Long) {
                            i = 2;
                        } else if (value instanceof Float) {
                            i = 3;
                        } else if (value instanceof Double) {
                            i = 4;
                        } else if (value instanceof String) {
                            i = 5;
                        } else if (value instanceof Set) {
                            i = 6;
                        } else {
                            throw new IllegalArgumentException("Unsupported type: " + value.getClass());
                        }
                        dataOutputStream.write(i);
                        dataOutputStream.writeUTF(str);
                        switch (i) {
                            case 0:
                                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                                break;
                            case 1:
                                dataOutputStream.writeInt(((Integer) value).intValue());
                                break;
                            case 2:
                                dataOutputStream.writeLong(((Long) value).longValue());
                                break;
                            case 3:
                                dataOutputStream.writeFloat(((Float) value).floatValue());
                                break;
                            case 4:
                                dataOutputStream.writeDouble(((Double) value).doubleValue());
                                break;
                            case 5:
                                dataOutputStream.writeUTF((String) value);
                                break;
                            case 6:
                                Set<String> set = (Set) value;
                                dataOutputStream.writeInt(set.size());
                                for (String writeUTF : set) {
                                    dataOutputStream.writeUTF(writeUTF);
                                }
                                break;
                            default:
                                throw new IllegalArgumentException(AnonymousClass000.A05("Unsupported type with ordinal: ", i));
                        }
                    }
                    dataOutputStream.close();
                    synchronized (r5.A01) {
                        try {
                            if (!createTempFile.renameTo(r5.A00)) {
                                createTempFile.delete();
                                throw new IOException("Failed to replace the current preference file!");
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                AnonymousClass0DB.A0H("LightSharedPreferencesImpl", "Commit to disk failed.", e);
            }
        }
    }

    public static void A02(C22450yR r1) {
        if (r1.A02) {
            throw new ConcurrentModificationException("Editors shouldn't be modified during commit!");
        }
    }

    public final void A04() {
        try {
            Set A002 = A00(A03());
            if (!A002.isEmpty()) {
                C14610lD.A02(this.A03, A002);
                AnonymousClass0Z9.A03(this.A03.A06, new C209328zu(this), 1446647426);
            }
        } finally {
            A06();
        }
    }

    public final void A05() {
        try {
            Set A002 = A00(A03());
            if (!A002.isEmpty()) {
                C14610lD.A02(this.A03, A002);
                A01(this);
            }
        } finally {
            A06();
        }
    }

    public final void A07(String str) {
        A02(this);
        Map map = this.A00;
        if (str != null) {
            map.put(str, C14610lD.A0A);
            return;
        }
        throw null;
    }

    public final void A08(String str, int i) {
        A02(this);
        Map map = this.A00;
        if (str != null) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw null;
    }

    public final void A09(String str, long j) {
        A02(this);
        Map map = this.A00;
        if (str != null) {
            map.put(str, Long.valueOf(j));
            return;
        }
        throw null;
    }

    public final void A0A(String str, String str2) {
        A02(this);
        if (str2 == null) {
            Map map = this.A00;
            if (str != null) {
                map.put(str, C14610lD.A0A);
                return;
            }
        } else {
            Map map2 = this.A00;
            if (str != null) {
                map2.put(str, str2);
                return;
            }
        }
        throw null;
    }

    public final void A0B(String str, boolean z) {
        A02(this);
        Map map = this.A00;
        if (str != null) {
            map.put(str, Boolean.valueOf(z));
            return;
        }
        throw null;
    }
}
