package p000X;

/* renamed from: X.15i  reason: invalid class name and case insensitive filesystem */
public final class C246115i implements C245715e {
    public static final C17120pi A02 = new C246215j();
    public int A00;
    public String A01;

    public final String getTypeName() {
        return "EnumAttachment";
    }

    public final Enum A00(Class cls) {
        int i;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == null || (i = this.A00) < 0 || i > enumArr.length - 1) {
            throw new UnsupportedOperationException("Cannot restore a " + cls.getName() + " from ordinal " + this.A00 + ". Is this the right enum class for value " + this.A01 + "?");
        }
        Enum enumR = enumArr[i];
        String name = enumR.name();
        String str = this.A01;
        if (name.equals(str)) {
            return enumR;
        }
        throw new UnsupportedOperationException(AnonymousClass000.A0R("Restored ", cls.getName(), " value has name ", name, ", but saved value is ", str, ". Is this the right enum class for value ", str, "?"));
    }

    public C246115i() {
    }

    public C246115i(Enum enumR) {
        this.A00 = enumR.ordinal();
        this.A01 = enumR.name();
    }
}
