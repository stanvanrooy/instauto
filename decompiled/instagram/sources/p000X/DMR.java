package p000X;

import android.content.Context;
import android.database.StaleDataException;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.DMR */
public final class DMR {
    public static final DNF A0Y = new C30014DMq();
    public static final DNF A0Z = new C30017DMu();
    public static final Comparator A0a = new AnonymousClass4VA();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B = -1;
    public DMO A0C = null;
    public C30003DMe A0D = null;
    public C30001DMc A0E = null;
    public String A0F;
    public String A0G;
    public List A0H;
    public Queue A0I;
    public Set A0J;
    public boolean A0K;
    public boolean A0L;
    public final C30018DMv A0M;
    public final TelephonyManager A0N;
    public final DMX A0O;
    public final C30016DMt A0P;
    public final DMN A0Q;
    public final C30006DMi A0R;
    public final DMZ A0S;
    public final C30011DMn A0T;
    public final CN4 A0U;
    public final Context A0V;
    public final DMV A0W;
    public final DN7 A0X;

    public static void A02(DMR dmr, Bundle bundle) {
        bundle.putBoolean("full_upload", false);
        bundle.putLong("last_upload_success_time", dmr.A0U.A00());
        bundle.putLong("time_spent", System.currentTimeMillis() - dmr.A0B);
        bundle.putString("ccu_session_id", dmr.A0G);
        bundle.putString("source", dmr.A0F);
    }

    private void A00() {
        this.A0U.A01();
        String A002 = this.A0P.A00();
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", false);
        bundle.putInt("total_batch_count", this.A06);
        bundle.putInt("contacts_upload_count", this.A09);
        bundle.putInt("add_count", this.A05);
        bundle.putInt("remove_count", this.A07);
        bundle.putInt("update_count", this.A08);
        bundle.putInt("phonebook_size", this.A01);
        bundle.putLong("max_contacts_to_upload", (long) this.A0O.A02);
        bundle.putLong("time_spent", System.currentTimeMillis() - this.A0B);
        bundle.putInt("num_of_retries", this.A0O.A03);
        bundle.putString("ccu_session_id", this.A0G);
        bundle.putString("family_device_id", A002);
        for (C30007DMj BF8 : this.A0R.A01) {
            BF8.BF8(bundle);
        }
        if (this.A0P.A00() != null) {
            this.A0P.A00();
        }
        new DMU(this, A002).BPj(new DN9(this.A0X), (Bundle) null);
    }

    public static void A01(DMR dmr) {
        DMR dmr2 = dmr;
        dmr2.A0J = Collections.synchronizedSet(new HashSet(dmr2.A0O.A01));
        dmr2.A0I = new ConcurrentLinkedQueue();
        dmr2.A0K = false;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = dmr2.A0O.A00;
            int i2 = 0;
            int i3 = 0;
            while (dmr2.A0E.hasNext()) {
                try {
                    DN6 dn6 = (DN6) dmr2.A0E.next();
                    DMP dmp = (DMP) dn6.A00;
                    C30021DMy dMy = (C30021DMy) dn6.A01;
                    boolean z = true;
                    if (dmp == null) {
                        dmp = new DMP(AnonymousClass000.A0B("", dMy.A01));
                        dmp.A00 = Constants.ONE;
                        dMy.A00 = Constants.A0C;
                        dmr2.A03++;
                    } else {
                        if (dMy == null) {
                            int i4 = dmr2.A01 + 1;
                            dmr2.A01 = i4;
                            if (i4 <= dmr2.A0O.A02) {
                                dmp.A00 = Constants.ZERO;
                                dMy = new C30021DMy(Long.valueOf(Long.parseLong(dmp.A04)).longValue(), C157256nd.A00(dmp.toString()));
                                dMy.A00 = Constants.ZERO;
                                dmr2.A00++;
                            }
                        } else {
                            int i5 = dmr2.A01 + 1;
                            dmr2.A01 = i5;
                            if (i5 > dmr2.A0O.A02) {
                                dmp = new DMP(AnonymousClass000.A0B("", dMy.A01));
                                dmp.A00 = Constants.ONE;
                                dMy.A00 = Constants.A0C;
                                dmr2.A03++;
                            } else if (!C157256nd.A00(dmp.toString()).equals(dMy.A02)) {
                                dmp.A00 = Constants.A0C;
                                dMy = new C30021DMy(Long.valueOf(Long.parseLong(dmp.A04)).longValue(), C157256nd.A00(dmp.toString()));
                                dMy.A00 = Constants.ONE;
                                dmr2.A0A++;
                            }
                        }
                        dmr2.A02++;
                    }
                    if (!Constants.ONE.equals(dmp.A00)) {
                        dmr2.A0H.add(C157256nd.A00(dmp.toString()));
                    }
                    if (dmp.A00 != null) {
                        arrayList.add(dmp);
                        arrayList2.add(dMy);
                    } else {
                        z = false;
                    }
                    if (z && (i2 = i2 + 1) >= i) {
                        C30012DMo dMo = new C30012DMo(i3, Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), dmr2.A00, dmr2.A0A, dmr2.A03, dmr2.A02);
                        if (dmr2.A0J.size() < dmr2.A0O.A01) {
                            dmr2.A0J.add(Integer.valueOf(i3));
                            A04(dmr2, dMo);
                        } else {
                            dmr2.A0I.add(dMo);
                        }
                        i3++;
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        dmr2.A05 += dmr2.A00;
                        dmr2.A00 = 0;
                        dmr2.A07 += dmr2.A03;
                        dmr2.A03 = 0;
                        dmr2.A08 += dmr2.A0A;
                        dmr2.A0A = 0;
                        i2 = 0;
                    }
                } catch (StaleDataException | IllegalArgumentException | IllegalStateException unused) {
                }
            }
            if (i2 > 0) {
                C30012DMo dMo2 = new C30012DMo(i3, Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), dmr2.A00, dmr2.A0A, dmr2.A03, dmr2.A02);
                if (dmr2.A0J.size() < dmr2.A0O.A01) {
                    dmr2.A0J.add(Integer.valueOf(i3));
                    A04(dmr2, dMo2);
                } else {
                    dmr2.A0I.add(dMo2);
                }
                dmr2.A05 += dmr2.A00;
                dmr2.A07 += dmr2.A03;
                dmr2.A08 += dmr2.A0A;
                dmr2.A06 = i3 + 1;
            } else {
                dmr2.A06 = i3;
            }
            dmr2.A0K = true;
            dmr2.A09 = dmr2.A05 + dmr2.A07 + dmr2.A08;
            CN4 cn4 = dmr2.A0U;
            List list = dmr2.A0H;
            Collections.sort(list);
            String A002 = C157256nd.A00(TextUtils.join(":", list));
            String A042 = cn4.A02.A04();
            if (A042 != null) {
                cn4.A01.edit().putString(AnonymousClass000.A0E(A042, "last_upload_client_root_hash"), A002).apply();
            }
            if (i2 == 0 && i3 == 0) {
                dmr2.A00();
            }
        } finally {
            dmr2.A0C.close();
            dmr2.A0D.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if (r3.A0I.isEmpty() == false) goto L_0x004b;
     */
    public static void A03(DMR dmr, C30012DMo dMo) {
        boolean z;
        dmr.A0J.remove(Integer.valueOf(dMo.A02));
        if (dmr.A0J.size() >= dmr.A0O.A01 || dmr.A0I.isEmpty()) {
            if (dmr.A0K && dmr.A0J.isEmpty()) {
                z = true;
            }
            z = false;
            if (z) {
                dmr.A00();
                return;
            }
            return;
        }
        C30012DMo dMo2 = (C30012DMo) dmr.A0I.poll();
        dmr.A0J.add(Integer.valueOf(dMo2.A02));
        A04(dmr, dMo2);
    }

    public static void A04(DMR dmr, C30012DMo dMo) {
        String str;
        String str2;
        DN5 dn5 = new DN5();
        List<DMP> list = dMo.A06;
        ArrayList arrayList = new ArrayList(list.size());
        for (DMP dmp : list) {
            ArrayList arrayList2 = new ArrayList(dmp.A07.size());
            for (String str3 : dmp.A07) {
                DNB dnb = new DNB();
                dnb.A00 = str3;
                arrayList2.add(dnb);
            }
            ArrayList arrayList3 = new ArrayList(dmp.A05.size());
            for (String str4 : dmp.A05) {
                DNA dna = new DNA();
                dna.A00 = str4;
                arrayList3.add(dna);
            }
            String A002 = C157256nd.A00(dmp.toString());
            DMs dMs = new DMs();
            dMs.A04 = dmp.A04;
            switch (dmp.A00.intValue()) {
                case 1:
                    str2 = "REMOVE";
                    break;
                case 2:
                    str2 = "UPDATE";
                    break;
                default:
                    str2 = "ADD";
                    break;
            }
            dMs.A03 = str2;
            dMs.A00 = dmp.A02;
            dMs.A01 = dmp.A03;
            dMs.A06 = arrayList2;
            dMs.A05 = arrayList3;
            dMs.A02 = A002;
            arrayList.add(dMs);
        }
        dn5.A01 = arrayList;
        String str5 = dmr.A0G;
        if (str5 != null) {
            dn5.A00 = str5;
        } else {
            dmr.A0U.A01();
            dmr.A0P.A00();
            dmr.A0N.getSimCountryIso();
            dmr.A0N.getNetworkCountryIso();
        }
        int i = dMo.A01;
        int i2 = dMo.A05;
        int i3 = dMo.A04;
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", false);
        bundle.putInt("batch_index", dMo.A02);
        bundle.putInt("batch_size", dmr.A0O.A00);
        bundle.putInt("contacts_upload_count", i + i2 + i3);
        bundle.putInt("add_count", i);
        bundle.putInt("remove_count", i3);
        bundle.putInt("update_count", i2);
        bundle.putInt("processed_contact_count", dMo.A03);
        bundle.putLong("time_spent", System.currentTimeMillis() - dmr.A0B);
        bundle.putInt("num_of_retries", dMo.A00 ^ true ? 1 : 0);
        bundle.putString("ccu_session_id", dmr.A0G);
        bundle.putString("family_device_id", (String) null);
        for (C30007DMj BF7 : dmr.A0R.A01) {
            BF7.BF7(bundle);
        }
        DN7 dn7 = dmr.A0X;
        DMW dmw = new DMW(dmr, dMo, bundle);
        ArrayList<DMQ> arrayList4 = new ArrayList<>();
        for (DMs dmq : dn5.A01) {
            arrayList4.add(new DMQ(dmq));
        }
        Context context = dn7.A00;
        AnonymousClass0C1 r5 = dn7.A01;
        String str6 = dn5.A00;
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.ONE;
        r2.A0C = "address_book/merge_delta/";
        r2.A09("device_id", C05860Mt.A02.A05(context));
        r2.A09("session_id", str6);
        r2.A0A("source", "ccu");
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A052 = C12890hY.A00.A05(stringWriter);
            A052.A0S();
            for (DMQ dmq2 : arrayList4) {
                A052.A0T();
                String str7 = dmq2.A04;
                if (str7 != null) {
                    A052.A0H("record_id", str7);
                }
                String str8 = dmq2.A00;
                if (str8 != null) {
                    A052.A0H("first_name", str8);
                }
                String str9 = dmq2.A02;
                if (str9 != null) {
                    A052.A0H("last_name", str9);
                }
                if (dmq2.A05 != null) {
                    A052.A0d(AnonymousClass40t.$const$string(228));
                    A052.A0S();
                    for (String str10 : dmq2.A05) {
                        if (str10 != null) {
                            A052.A0g(str10);
                        }
                    }
                    A052.A0P();
                }
                if (dmq2.A06 != null) {
                    A052.A0d(AnonymousClass40t.$const$string(274));
                    A052.A0S();
                    for (String str11 : dmq2.A06) {
                        if (str11 != null) {
                            A052.A0g(str11);
                        }
                    }
                    A052.A0P();
                }
                String str12 = dmq2.A01;
                if (str12 != null) {
                    A052.A0H("hash", str12);
                }
                String str13 = dmq2.A03;
                if (str13 != null) {
                    A052.A0H("modifier", str13);
                }
                A052.A0Q();
            }
            A052.A0P();
            A052.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "";
        }
        r2.A09("contacts", str);
        r2.A0A("phone_id", AnonymousClass0OZ.A00(r5).AZO());
        r2.A06(AXD.class, false);
        r2.A0I = true;
        C17850qu A032 = r2.A03();
        A032.A00 = new C30009DMl(dn7, dn7.A01, dmw);
        C12810hQ.A02(A032);
    }

    public static void A05(DMR dmr, DNC dnc, List list, int i) {
        DN7 dn7 = dmr.A0X;
        DMT dmt = new DMT(dmr, list, i, dnc);
        Context context = dn7.A00;
        AnonymousClass0C1 r6 = dn7.A01;
        String str = dnc.A00;
        C15890nh r2 = new C15890nh(r6);
        r2.A09 = Constants.ONE;
        r2.A0C = "address_book/get_contact_hashes/";
        r2.A09("device_id", C05860Mt.A02.A05(context));
        r2.A09("address_book_hash", str);
        r2.A0A("phone_id", AnonymousClass0OZ.A00(r6).AZO());
        r2.A06(DMY.class, false);
        r2.A0I = true;
        C17850qu A032 = r2.A03();
        A032.A00 = new C30008DMk(dn7, dn7.A01, dmt);
        C12810hQ.A02(A032);
    }

    public DMR(C30016DMt dMt, Context context, CN4 cn4, DMX dmx, DN7 dn7, C30006DMi dMi, DMV dmv) {
        this.A0P = dMt;
        this.A0V = context;
        this.A0U = cn4;
        this.A0O = dmx;
        this.A0X = dn7;
        this.A0R = dMi;
        this.A0W = dmv;
        this.A0N = (TelephonyManager) context.getSystemService("phone");
        Context context2 = this.A0V;
        this.A0Q = new DMN(context2, this.A0R);
        C23195ACf aCf = new C23195ACf(context2);
        this.A0M = aCf;
        this.A0S = new DMZ(aCf);
        this.A0T = new C30011DMn(aCf, this.A0R);
    }
}
