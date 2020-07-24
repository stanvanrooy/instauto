package p000X;

import android.util.Log;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import oauth.signpost.OAuth;

/* renamed from: X.D1E */
public final class D1E extends D1F {
    public C29595D1a A00 = null;
    public D19 A01;
    public Integer A02;
    public final String A03;

    public final boolean A02() {
        if (this.A01 != -1 || this.A04 == null) {
            return super.A02();
        }
        if (this.A02 == Constants.A0C) {
            return true;
        }
        return false;
    }

    public final long BWT(D1M d1m) {
        Map AUX;
        D19 d19 = this.A01;
        if (d19 != null) {
            d19.BSW(d1m, C43711ux.NOT_CACHED);
        }
        if (this.A03 != null && d1m.A04.getHost().equals("m-livestream-lookaside.facebook.com")) {
            this.A02.BkD(OAuth.HTTP_AUTHORIZATION_HEADER, AnonymousClass000.A0E("OAuth ", this.A03));
        }
        try {
            long BWT = this.A02.BWT(d1m);
            int i = (int) BWT;
            this.A01 = i;
            this.A00 = 0;
            if (i == -1) {
                this.A00 = new C29595D1a();
                this.A02 = Constants.ZERO;
            } else if (i <= 1048576) {
                this.A04 = new byte[i];
            }
            if (!(this.A01 == null || (AUX = this.A02.AUX()) == null)) {
                String uri = d1m.A04.toString();
                AUX.hashCode();
                List list = (List) AUX.get("x-fb-video-livetrace-parentsource");
                int i2 = 0;
                C40611ow r4 = null;
                if (list != null) {
                    C40611ow.A02.put(uri, (String) list.get(0));
                }
                List list2 = (List) AUX.get("x-fb-video-livetrace-ids");
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String split : ((String) list2.get(0)).split(",[\\s]*")) {
                        try {
                            String[] split2 = split.split(":");
                            Long.parseLong(split2[0]);
                            Long.parseLong(split2[1]);
                            arrayList.add(new C29610D1p());
                        } catch (NumberFormatException unused) {
                        }
                    }
                    C29610D1p[] d1pArr = (C29610D1p[]) arrayList.toArray(new C29610D1p[arrayList.size()]);
                    AbstractMap.SimpleEntry[] simpleEntryArr = C40611ow.A04;
                    int length = simpleEntryArr.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        AbstractMap.SimpleEntry simpleEntry = simpleEntryArr[i2];
                        if (AUX.get(simpleEntry.getKey()) != null) {
                            simpleEntry.getValue();
                            break;
                        }
                        i2++;
                    }
                    System.currentTimeMillis();
                    r4 = new C40611ow(d1pArr, (Map) null);
                }
                if (r4 != null) {
                    this.A01.BSU("live_trace", r4);
                }
                A01(this.A01);
            }
            return BWT;
        } catch (IOException e) {
            D19 d192 = this.A01;
            if (d192 != null) {
                d192.BSS(e);
            }
            throw e;
        }
    }

    public final void close() {
        C29595D1a d1a = this.A00;
        if (d1a != null) {
            this.A04 = d1a.A00();
            this.A00 = null;
            Integer num = this.A02;
            if (num == Constants.ZERO || num == Constants.ONE) {
                this.A02 = Constants.A0N;
            }
        }
        try {
            this.A02.close();
            this.A02 = null;
            this.A01 = null;
        } catch (IOException e) {
            D19 d19 = this.A01;
            if (d19 != null) {
                d19.BSS(e);
            }
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        String str;
        int i3 = this.A01;
        if (i3 != -1) {
            int i4 = i3 - this.A00;
            if (i4 == 0) {
                return -1;
            }
            if (i2 > i4) {
                i2 = i4;
            }
        }
        if (i2 > 0) {
            try {
                i2 = this.A02.read(bArr, i, i2);
                if (i2 > 0) {
                    byte[] bArr2 = this.A04;
                    if (bArr2 != null) {
                        System.arraycopy(bArr, i, bArr2, this.A00, i2);
                    } else if (this.A00 != null) {
                        Integer num = this.A02;
                        if (num != Constants.ONE) {
                            if (num != Constants.ZERO) {
                                if (num != null) {
                                    switch (num.intValue()) {
                                        case 1:
                                            str = "Partial";
                                            break;
                                        case 2:
                                            str = "Completed";
                                            break;
                                        case 3:
                                            str = "Canceled";
                                            break;
                                        default:
                                            str = "Started";
                                            break;
                                    }
                                } else {
                                    str = "null";
                                }
                                Log.e("NonPrefetchDataSource", AnonymousClass000.A0E("Unexpected state: ", str));
                            }
                            this.A02 = Constants.ONE;
                        }
                        this.A00.write(bArr, i, i2);
                    }
                    this.A00 += i2;
                    return i2;
                } else if (this.A01 == -1 && i2 == -1) {
                    this.A02 = Constants.A0C;
                    return i2;
                }
            } catch (IOException e) {
                D19 d19 = this.A01;
                if (d19 != null) {
                    d19.BSS(e);
                }
                throw e;
            }
        }
        return i2;
    }

    public D1E(C29262Cuo cuo, C29279Cv5 cv5, String str, int i, int i2, D19 d19, C29276Cv2 cv2, String str2) {
        this.A03 = cuo.A04;
        C29276Cv2 cv22 = cv2;
        C29279Cv5 cv52 = cv5;
        String str3 = str;
        int i3 = i;
        this.A02 = cv52.A00(str3, d19, cv22, i3, i2, cuo);
        this.A01 = d19;
        this.A04 = null;
        this.A03 = str2;
    }

    public final void A86() {
    }

    public final void cancel() {
    }
}
