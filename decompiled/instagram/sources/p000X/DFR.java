package p000X;

/* renamed from: X.DFR */
public final class DFR {
    public String A00;
    public boolean A01;
    public double A02;
    public long A03;
    public String A04;

    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1838656495:
                if (str.equals("STRING")) {
                    c = 3;
                    break;
                }
                break;
            case 72655:
                if (str.equals("INT")) {
                    c = 1;
                    break;
                }
                break;
            case 2044650:
                if (str.equals("BOOL")) {
                    c = 0;
                    break;
                }
                break;
            case 66988604:
                if (str.equals("FLOAT")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            return str;
        }
        return null;
    }

    public final double A01() {
        String str = this.A00;
        if (str.equals("INT")) {
            return (double) this.A03;
        }
        if (str.equals("FLOAT")) {
            return this.A02;
        }
        throw new DFW("Invalid value type");
    }

    public final long A02() {
        String str = this.A00;
        if (str.equals("INT")) {
            return this.A03;
        }
        if (str.equals("FLOAT")) {
            return (long) this.A02;
        }
        throw new DFW("Invalid value type");
    }

    public final String toString() {
        String str;
        String str2 = this.A04;
        if (str2 != null) {
            return str2;
        }
        String str3 = this.A00;
        char c = 65535;
        int hashCode = str3.hashCode();
        if (hashCode != 72655) {
            if (hashCode != 2044650) {
                if (hashCode == 66988604 && str3.equals("FLOAT")) {
                    c = 2;
                }
            } else if (str3.equals("BOOL")) {
                c = 0;
            }
        } else if (str3.equals("INT")) {
            c = 1;
        }
        if (c != 0) {
            if (c == 1) {
                str = String.valueOf(this.A03);
            } else if (c != 2) {
                this.A04 = "n/a";
            } else {
                str = String.valueOf(this.A02);
            }
            this.A04 = str;
        } else {
            str = String.valueOf(this.A01);
            this.A04 = str;
        }
        return this.A04;
    }

    public DFR(double d) {
        this.A00 = "FLOAT";
        this.A02 = d;
    }

    public DFR(int i) {
        this.A00 = "INT";
        this.A03 = (long) i;
    }

    public DFR(String str) {
        if (str == null) {
            this.A00 = "NULL";
            this.A04 = "n/a";
            return;
        }
        this.A00 = "STRING";
        this.A04 = str;
    }

    public DFR(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                str = "NULL";
            } else {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1838656495:
                        if (str.equals("STRING")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 72655:
                        if (str.equals("INT")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 2044650:
                        if (str.equals("BOOL")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 66988604:
                        if (str.equals("FLOAT")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        try {
                            this.A03 = Long.parseLong(str2);
                        } catch (NumberFormatException unused) {
                            throw new DFW("Invalid integer", str2);
                        }
                    } else if (c == 2) {
                        try {
                            this.A02 = Double.parseDouble(str2);
                        } catch (NumberFormatException unused2) {
                            throw new DFW("Invalid float", str2);
                        }
                    } else if (c == 3) {
                        this.A04 = str2;
                    }
                } else if (str2.equals("true") || str2.equals("false")) {
                    this.A01 = Boolean.parseBoolean(str2);
                } else {
                    throw new DFW("Invalid boolean", str2);
                }
            }
            this.A00 = str;
            return;
        }
        throw new DFW("Invalid value type");
    }
}
