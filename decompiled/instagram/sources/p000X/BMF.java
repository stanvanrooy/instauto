package p000X;

import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.BMF */
public final class BMF implements BMG {
    public final /* synthetic */ C25460BLl A00;
    public final /* synthetic */ Set A01;

    public final void Bol(Map map, C26061Bev bev) {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            try {
                for (String str : this.A01) {
                    String A002 = this.A00.A00(str);
                    C25460BLl bLl = this.A00;
                    Object obj = map.get(A002);
                    AnonymousClass11J.A00(obj);
                    hashMap.put(A002, bLl.A03(str, (byte[]) obj));
                }
                bev.A00(hashMap, (Throwable) null);
            } catch (NullPointerException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | SignatureException | UnrecoverableKeyException e) {
                e = e;
                bev.A00(hashMap, e);
            } catch (Throwable th) {
                th = th;
                bev.A00(hashMap, (Throwable) null);
                throw th;
            }
        } catch (NullPointerException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | SignatureException | UnrecoverableKeyException e2) {
            e = e2;
            hashMap = null;
            bev.A00(hashMap, e);
        } catch (Throwable th2) {
            th = th2;
            hashMap = null;
            bev.A00(hashMap, (Throwable) null);
            throw th;
        }
    }

    public BMF(Set set, C25460BLl bLl) {
        this.A01 = set;
        this.A00 = bLl;
    }
}
