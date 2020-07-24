package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.BQA */
public final class BQA implements C25581BQn {
    public int A00;
    public long A01;
    public BQK A02;
    public long A03;
    public long A04;
    public final Context A05;
    public final BQH A06;
    public final BQO A07;
    public final BQE A08;
    public final Set A09;
    public final AtomicBoolean A0A = new AtomicBoolean();
    public final AtomicBoolean A0B = new AtomicBoolean();

    public final synchronized void A02(Integer num) {
        String str;
        long j;
        String str2;
        C25584BQq bQq;
        C25521BOf bOf;
        BR8 br8;
        String packageName;
        BQO bqo = this.A07;
        SharedPreferences sharedPreferences = bqo.A00;
        if (num == Constants.ZERO) {
            str = "bd_pdc_let";
        } else {
            str = "bd_hb_let";
        }
        long j2 = sharedPreferences.getLong(AnonymousClass000.A0J(bqo.A01.A04(), "_", str), 0);
        if (num == Constants.ZERO) {
            j = this.A04;
        } else {
            j = this.A03;
        }
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j2 >= j) {
                A00(j, num);
                BQO bqo2 = this.A07;
                SharedPreferences.Editor edit = bqo2.A00.edit();
                if (num == Constants.ZERO) {
                    str2 = "bd_pdc_let";
                } else {
                    str2 = "bd_hb_let";
                }
                edit.putLong(AnonymousClass000.A0J(bqo2.A01.A04(), "_", str2), currentTimeMillis).apply();
                switch (num.intValue()) {
                    case 0:
                        if (this.A0A.get()) {
                            BQK bqk = this.A02;
                            if (!BQC.A06(bqk)) {
                                if (bqk == BQK.BENIGN) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        for (C25527BOl bOl : this.A09) {
                                            if (bOl.A02.contains(C25520BOe.BENIGN_TIER)) {
                                                bQq = bOl.A01;
                                            } else {
                                                bQq = null;
                                            }
                                            if (bQq == null) {
                                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                                if (this.A06.A08 == C25520BOe.OFFSITE) {
                                                    br8 = null;
                                                } else {
                                                    Context context = this.A05;
                                                    if (context == null) {
                                                        packageName = "";
                                                    } else {
                                                        packageName = context.getPackageName();
                                                    }
                                                    br8 = new BR8(packageName);
                                                }
                                                bOf = new C25523BOh(elapsedRealtime, br8, new C25522BOg(Constants.A0Y));
                                            } else {
                                                bOf = bQq.ADg();
                                            }
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.put(bOf.A02());
                                            jSONObject.put(Integer.toString(bOl.A00), jSONArray);
                                        }
                                        this.A08.A00(BQC.A02(), this.A00, jSONObject, this.A02.A00);
                                        break;
                                    } catch (Throwable th) {
                                        C54802Yz.A00(th);
                                        break;
                                    }
                                }
                            } else {
                                JSONObject jSONObject2 = new JSONObject();
                                Map map = BQL.A00().A00;
                                if (map != null && !map.isEmpty()) {
                                    try {
                                        for (Integer num2 : map.keySet()) {
                                            List<C25521BOf> A012 = ((BQM) map.get(num2)).A01();
                                            JSONArray jSONArray2 = new JSONArray();
                                            for (C25521BOf A022 : A012) {
                                                jSONArray2.put(A022.A02());
                                            }
                                            jSONObject2.put(num2.toString(), jSONArray2);
                                        }
                                    } catch (Throwable th2) {
                                        C54802Yz.A00(th2);
                                    }
                                    this.A08.A00(BQC.A02(), this.A00, jSONObject2, this.A02.A00);
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        if (!this.A0A.get() && currentTimeMillis - this.A01 >= j) {
                            break;
                        } else {
                            A01(this, this.A0A);
                            break;
                        }
                }
            } else {
                A00(Math.abs(currentTimeMillis - (j2 + j)), num);
            }
        }
    }

    private void A00(long j, Integer num) {
        try {
            this.A06.A0I.schedule(new C25572BQe(this, num), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C54802Yz.A00(th);
        }
    }

    public static void A01(BQA bqa, AtomicBoolean atomicBoolean) {
        BR8 br8;
        String packageName;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (bqa.A06.A08 == C25520BOe.OFFSITE) {
                br8 = null;
            } else {
                Context context = bqa.A05;
                if (context == null) {
                    packageName = "";
                } else {
                    packageName = context.getPackageName();
                }
                br8 = new BR8(packageName);
            }
            jSONArray.put(new BOQ(elapsedRealtime, br8, new C25361BFz(atomicBoolean.get())).A02());
            jSONObject.put(Integer.toString(38000), jSONArray);
            bqa.A08.A00(BQC.A02(), bqa.A00, jSONObject, bqa.A02.A00);
        } catch (Throwable th) {
            C54802Yz.A00(th);
        }
    }

    public final void Bt1(BQK bqk) {
        if (this.A02 != bqk) {
            this.A02 = bqk;
            int i = bqk.A00;
            if (i != 0) {
                if (!(i == 1024 || i == 2048 || i == 4096)) {
                    if (i != 262144) {
                        if (i != 524288) {
                            return;
                        }
                    }
                }
                this.A04 = this.A06.A07;
            }
            this.A04 = 0;
            this.A04 = this.A06.A06;
            this.A04 = this.A06.A07;
        }
    }

    public BQA(Context context, BQH bqh, BQK bqk) {
        long j;
        this.A06 = bqh;
        this.A05 = context;
        this.A09 = new HashSet();
        this.A07 = bqh.A0C;
        this.A08 = bqh.A0D;
        if (BQC.A06(bqk)) {
            j = bqh.A07;
        } else {
            j = bqh.A06;
        }
        this.A04 = j;
        this.A02 = bqk;
        this.A0A.set(true);
        this.A03 = bqh.A05;
        this.A01 = -1;
    }
}
