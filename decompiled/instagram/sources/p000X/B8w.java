package p000X;

/* renamed from: X.B8w */
public final class B8w extends C25232B8y {
    public C25217B8f A00;
    public C25217B8f A01;

    public final String toString() {
        Long valueOf;
        String str;
        String str2;
        String str3;
        C25217B8f b8f = this.A01;
        C25217B8f b8f2 = this.A00;
        StringBuilder sb = new StringBuilder("{src_pkg=");
        sb.append(this.A02);
        sb.append(", status=");
        sb.append(A02());
        sb.append(", duration=");
        sb.append(A00());
        sb.append(", creation_time=");
        String str4 = null;
        if (b8f == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(b8f.A00);
        }
        sb.append(valueOf);
        sb.append(", generator_pkg=");
        if (b8f == null) {
            str = null;
        } else {
            str = b8f.A02;
        }
        sb.append(str);
        sb.append(", generator_action=");
        if (b8f == null) {
            str2 = null;
        } else {
            str2 = b8f.A01;
        }
        sb.append(str2);
        sb.append(", prev_generator_pkg=");
        if (b8f2 == null) {
            str3 = null;
        } else {
            str3 = b8f2.A02;
        }
        sb.append(str3);
        sb.append(", prev_generator_action=");
        if (b8f2 != null) {
            str4 = b8f2.A01;
        }
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }

    public B8w(String str, C25217B8f b8f) {
        super(str);
        this.A00 = b8f;
    }
}
