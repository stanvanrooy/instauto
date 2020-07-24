package p000X;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Om  reason: invalid class name and case insensitive filesystem */
public final class C29071Om implements C29081On, C29091Oo {
    public C29771Re A00;
    public AnonymousClass1PE A01;
    public C28541Md A02;
    public boolean A03;
    public boolean A04;
    public final boolean A05;
    public final AnonymousClass1LV A06;
    public final boolean A07;
    public final boolean A08;

    public final void Aix() {
        C27321Hj.A1r = false;
        A00();
    }

    private void A00() {
        String str;
        int i;
        int i2;
        HashMap hashMap = new HashMap();
        C28541Md r1 = this.A02;
        if (r1.A06() || r1.A05.A04) {
            hashMap.put("cached_feed_item_ids", TextUtils.join(",", this.A01.A0N()));
        }
        if (this.A01.A0M() != null) {
            hashMap.put("pagination_source", this.A01.A0M());
        }
        if (this.A01.A0M() != null && this.A01.A0M().equals("feed_recs")) {
            List unmodifiableList = Collections.unmodifiableList(this.A01.A0T.A01);
            int i3 = 0;
            while (true) {
                if (i3 >= unmodifiableList.size() - 1) {
                    i = -1;
                    break;
                } else if (((AnonymousClass1NG) unmodifiableList.get(i3)).A0H == C29261Pf.GROUP_SET) {
                    i = i3 + 1;
                    break;
                } else {
                    i3++;
                }
            }
            if (i != -1) {
                StringWriter stringWriter = new StringWriter();
                try {
                    C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                    A052.A0T();
                    if (i == -1) {
                        i2 = 0;
                    } else {
                        i2 = unmodifiableList.size() - i;
                    }
                    A052.A0F("total_num_items", i2);
                    int size = unmodifiableList.size() - 1;
                    while (true) {
                        if (size >= i) {
                            if (((AnonymousClass1NG) unmodifiableList.get(size)).A0G.AZP() != Constants.ONE) {
                                break;
                            }
                            size--;
                        } else {
                            size = -1;
                            break;
                        }
                    }
                    if (size != -1) {
                        AnonymousClass1NG r9 = (AnonymousClass1NG) unmodifiableList.get(size);
                        int i4 = size - i;
                        if (r9 != null) {
                            A052.A0C("last_non_organic_item");
                            A052.A0H("id", r9.A0X);
                            A052.A0F("type", C150096bX.A00(r9.A0G.AZP()));
                            A052.A0F("index", i4);
                            A052.A0Q();
                        }
                    }
                    int size2 = unmodifiableList.size() - 1;
                    while (true) {
                        if (size2 < i) {
                            size2 = -1;
                            break;
                        }
                        AnonymousClass1NK r12 = ((AnonymousClass1NG) unmodifiableList.get(size2)).A0G;
                        if ((r12 instanceof AnonymousClass1NL) && r12.AZP() == Constants.ONE) {
                            break;
                        }
                        size2--;
                    }
                    if (size2 != -1) {
                        AnonymousClass1NG r13 = (AnonymousClass1NG) unmodifiableList.get(size2);
                        int i5 = size2 - i;
                        if (r13 != null) {
                            A052.A0C("last_organic_item");
                            A052.A0H("id", ((AnonymousClass1NL) r13.A0G).APe().getId());
                            A052.A0F("index", i5);
                            A052.A0Q();
                        }
                    }
                    A052.A0Q();
                    A052.close();
                    hashMap.put("recs_paging_token", stringWriter.toString());
                } catch (IOException e) {
                    AnonymousClass0DB.A0G("FeedRecsPaginationUtil", "Error writing pagination info to request", e);
                }
            }
        }
        AnonymousClass1LV r4 = this.A06;
        Integer num = Constants.A12;
        C29331Pm r0 = this.A01.A0T;
        synchronized (r0.A03) {
            C150786ce r02 = r0.A00;
            if (r02 != null) {
                str = r02.A00().A02;
            } else {
                str = null;
            }
        }
        r4.A03(num, hashMap, str);
    }

    public static void A01(C29071Om r3) {
        if (r3.A04 && !r3.A03) {
            if (!r3.A05 || r3.A00.A01 == Constants.ONE) {
                if (r3.A02()) {
                    r3.A00();
                }
                r3.A04 = false;
            }
        }
    }

    private boolean A02() {
        AnonymousClass1PE r1 = this.A01;
        if (r1.A0C) {
            boolean z = false;
            if (r1.A00 > 0) {
                z = true;
            }
            if (z || !this.A06.A08.A04()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A68() {
        if (!this.A07 && this.A08) {
            this.A04 = A02();
            A01(this);
        } else if (A02()) {
            A00();
        }
    }

    public final boolean Abq() {
        return this.A01.A0T.A0G();
    }

    public final boolean Abs() {
        return this.A06.A08.A03();
    }

    public final boolean AfR() {
        if (this.A06.A08.A00 == Constants.ONE) {
            return true;
        }
        return false;
    }

    public final boolean AgJ() {
        AnonymousClass1PE r1 = this.A01;
        if (!r1.A0C || r1.A0T() || !Abq()) {
            return false;
        }
        return true;
    }

    public final boolean AgL() {
        if (this.A06.A08.A00 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public C29071Om(C06590Pq r5, AnonymousClass1LV r6, C28541Md r7, C27321Hj r8) {
        this.A06 = r6;
        this.A02 = r7;
        AnonymousClass0L7 r2 = AnonymousClass0L7.LOAD_MORE_IDLE;
        this.A08 = ((Boolean) AnonymousClass0L6.A00(r5, r2, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A07 = ((Boolean) AnonymousClass0L6.A00(r5, r2, "paginate_on_idle_only", false, (AnonymousClass04H) null)).booleanValue();
        if (this.A08) {
            this.A05 = ((Boolean) AnonymousClass0L6.A00(r5, r2, "scroll_direction_check", false, (AnonymousClass04H) null)).booleanValue();
            r8.A0B(new C36181hd(this));
            if (this.A05) {
                this.A00 = new C29771Re(Constants.ONE);
            }
        }
    }
}
