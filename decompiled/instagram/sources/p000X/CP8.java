package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CP8 */
public final class CP8 extends AnonymousClass1PH {
    public static final String A06 = CNO.A01(Constants.A0C);
    public static final String A07 = CNO.A01(Constants.ZERO);
    public static final String A08 = CNO.A01(Constants.ONE);
    public Integer A00 = Constants.ZERO;
    public String A01 = "";
    public final CNC A02;
    public final List A03 = new ArrayList();
    public final CS4 A04 = new CN8(this);
    public final CS3 A05 = new CN9(this);

    public final void onBindViewHolder(AnonymousClass1ZK r13, int i) {
        C27702CNw cNw;
        AnonymousClass1ZK r4 = r13;
        int i2 = r13.mItemViewType;
        C27781CQz cQz = null;
        if (i2 == 0 || i2 == 2 || i2 == 1) {
            cNw = (C27702CNw) this.A03.get(i);
            cQz = cNw.A00;
        } else {
            cNw = null;
        }
        if (i2 == 0) {
            String str = cQz.A03.A00;
            AnonymousClass0a4.A06(str);
            ((CPC) r4).A00.setText(str);
        } else if (i2 == 1) {
            C27791CRj.A00((C27793CRl) r4, cNw, this.A04, this.A01, (AnonymousClass96E) null, (C27796CRo) null, true);
        } else if (i2 == 2) {
            C27790CRi.A00((C27792CRk) r4, cNw, this.A05, this.A01, true, (AnonymousClass96E) null, (C27796CRo) null, true);
        } else if (i2 == 3) {
            CP9.A01((CPA) r4, this.A01);
        }
    }

    public CP8(CNC cnc) {
        this.A02 = cnc;
    }

    public final int getItemCount() {
        int i;
        int i2;
        int A032 = AnonymousClass0Z0.A03(-1477272400);
        switch (this.A00.intValue()) {
            case 0:
            case 2:
            case 3:
                AnonymousClass0Z0.A0A(-863317656, A032);
                return 1;
            case 1:
                i = this.A03.size();
                i2 = -1570332015;
                break;
            case 4:
                i = this.A03.size() + 1;
                i2 = 60519372;
                break;
            default:
                IllegalStateException illegalStateException = new IllegalStateException("Unknown State while determining item count.");
                AnonymousClass0Z0.A0A(2136951173, A032);
                throw illegalStateException;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        p000X.AnonymousClass0Z0.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        p000X.AnonymousClass0Z0.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        p000X.AnonymousClass0Z0.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        throw r1;
     */
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int i4;
        IllegalStateException illegalStateException;
        int i5;
        int A032 = AnonymousClass0Z0.A03(803620213);
        Integer num = this.A00;
        int i6 = 2;
        switch (num.intValue()) {
            case 0:
                i3 = 3;
                i4 = 1832142071;
                break;
            case 1:
            case 4:
                boolean z = true;
                if (!(num == Constants.A0Y && i == getItemCount() - 1)) {
                    z = false;
                }
                if (!z) {
                    String str = ((C27702CNw) this.A03.get(i)).A03;
                    if (!str.equals(A07)) {
                        if (!str.equals(A06)) {
                            if (!str.equals(A08)) {
                                illegalStateException = new IllegalStateException("LayoutContent has no recognized content available for the adapter to display.");
                                i5 = 739982663;
                                break;
                            } else {
                                i2 = -1472374193;
                                break;
                            }
                        } else {
                            AnonymousClass0Z0.A0A(115083760, A032);
                            return 1;
                        }
                    } else {
                        i3 = 0;
                        i4 = -287657130;
                        break;
                    }
                } else {
                    i3 = 6;
                    i4 = 1344160019;
                    break;
                }
            case 2:
                i6 = 4;
                i2 = -642121449;
                break;
            case 3:
                i3 = 5;
                i4 = -272083038;
                break;
            default:
                illegalStateException = new IllegalStateException("Could not determine item view type for current state.");
                i5 = -325499675;
                break;
        }
    }

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new CPC(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.publishing_title_row, viewGroup, false));
            case 1:
                return new C27793CRl(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.publishing_product_row, viewGroup, false));
            case 2:
                return new C27792CRk(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.publishing_product_row, viewGroup, false));
            case 3:
                return CP9.A00(viewGroup);
            case 4:
                return new CPF(AnonymousClass70D.A00(viewGroup));
            case 5:
                CPD cpd = new CPD(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.product_picker_spinner_and_message_row, viewGroup, false));
                cpd.A00.setText(C0003R.string.product_picker_network_failure_message);
                return cpd;
            case 6:
                return CPB.A00(viewGroup);
            default:
                throw new IllegalStateException("ViewType was not Recognized while creating a row.");
        }
    }
}
