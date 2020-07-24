package p000X;

/* renamed from: X.1Bq  reason: invalid class name and case insensitive filesystem */
public final class C26091Bq extends AnonymousClass14U {
    public C26091Bq() {
        super(2);
    }

    public final void A04(AnonymousClass16T r1, int i, int i2) {
    }

    public final void A02(AnonymousClass16T r2) {
        r2.ADV("create table if not exists file_registry (_id integer primary key autoincrement, file_path text not null, owner_json text not null)");
    }
}
