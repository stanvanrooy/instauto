package p000X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDoneException;

/* renamed from: X.BUS */
public final class BUS implements C28331Lh {
    public final BUf A00;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final boolean AhY(String str) {
        C25664BUa bUa;
        IllegalArgumentException illegalArgumentException;
        try {
            BUf bUf = this.A00;
            bUa = new C25664BUa(C25678BUs.A00, AnonymousClass000.A0E(BSF.A01.name(), " = ?"), A00(str));
            C25675BUp bUp = BSF.A00;
            String[] strArr = bUa.A02;
            String[] strArr2 = strArr;
            if (strArr.length > 1) {
                illegalArgumentException = new IllegalArgumentException("More than one select argument, not supported! args=" + strArr2);
            } else if (strArr[0] instanceof String) {
                AnonymousClass16T Aap = bUf.A01.Aap();
                C248316e r4 = new C248316e("media");
                r4.A03 = new String[]{bUp.name()};
                String str2 = bUa.A01;
                String[] strArr3 = bUa.A02;
                r4.A01 = str2;
                r4.A02 = strArr3;
                C249016l A98 = Aap.A98(r4.A01().AWU());
                A98.A6a(1, bUa.A02[0]);
                Long valueOf = Long.valueOf(A98.Bon());
                if (valueOf != null) {
                    return valueOf.longValue() > 0;
                }
                return false;
            } else {
                illegalArgumentException = new IllegalArgumentException("Only String arguments supported as select arg type, args=" + strArr2);
            }
            throw illegalArgumentException;
        } catch (SQLiteDoneException unused) {
        } catch (C25673BUn e) {
            AnonymousClass0QD.A06("DatabaseSeenStore", AnonymousClass000.A0E("SQLiteException in isSeen for key ", str), e);
            return false;
        } catch (Throwable th) {
            String str3 = "Exception while performing simpleSelect for " + bUa;
            AnonymousClass0DB.A0G("MediaDbStore", str3, th);
            throw new C25673BUn(str3, th);
        }
    }

    public final void BE0() {
    }

    public static String A00(String str) {
        String[] split = str.split("[_-]");
        int length = split.length;
        if (length == 3 || length == 2 || length == 1) {
            return split[0];
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Unfamiliar media ID format: ", str));
    }

    private void A01(String str) {
        ContentValues[] contentValuesArr;
        IllegalArgumentException illegalArgumentException;
        ContentValues contentValues = new ContentValues();
        C25675BUp bUp = BSF.A01;
        String str2 = str;
        bUp.BYe(contentValues, str2);
        BSF.A00.BYe(contentValues, true);
        try {
            BUf bUf = this.A00;
            contentValuesArr = new ContentValues[]{contentValues};
            if (contentValues.size() != 0) {
                AnonymousClass16T Aap = bUf.A01.Aap();
                Aap.A6O();
                int i = 0;
                while (i < 1) {
                    ContentValues contentValues2 = contentValuesArr[i];
                    String name = bUp.name();
                    if (!contentValues2.containsKey(name)) {
                        illegalArgumentException = new IllegalArgumentException("Trying to insert/update values without specifying primary column's value: " + contentValues2);
                    } else if (!contentValues2.containsKey(BSF.A02.name())) {
                        BSF.A02.BYe(contentValues2, Long.valueOf(System.currentTimeMillis() / 1000));
                        if (Aap.BsI("media", 2, contentValues2, AnonymousClass000.A0E(name, " = ?"), new String[]{contentValues2.getAsString(name)}) <= 0) {
                            Aap.Adh("media", 0, contentValues2);
                        }
                        i++;
                    } else {
                        illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0E("Trying to set a protected column's value: ", BSF.A02.name()));
                    }
                    throw illegalArgumentException;
                }
                Aap.BlP();
                Aap.ADF();
                return;
            }
            throw new IllegalArgumentException("Null or empty values provided.");
        } catch (C25673BUn e) {
            AnonymousClass0QD.A06("DatabaseSeenStore", AnonymousClass000.A0E("SQLiteException in updateImpression for key ", str2), e);
        } catch (Throwable th) {
            String str3 = "Exception while inserting " + contentValuesArr + " into " + "media";
            AnonymousClass0DB.A0G("MediaDbStore", str3, th);
            throw new C25673BUn(str3, th);
        }
    }

    public BUS(BUf bUf) {
        this.A00 = bUf;
    }

    public final boolean A2Y(String str) {
        String A002 = A00(str);
        if (AhY(str)) {
            A01(A002);
            return false;
        }
        A01(A002);
        return true;
    }
}
