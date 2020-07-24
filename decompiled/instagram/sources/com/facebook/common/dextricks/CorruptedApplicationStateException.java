package com.facebook.common.dextricks;

public class CorruptedApplicationStateException extends RuntimeException {
    public final Remedy mRemedy;

    public enum Remedy {
        REINSTALL,
        REBOOT,
        UNKNOWN
    }

    /* renamed from: com.facebook.common.dextricks.CorruptedApplicationStateException$1 */
    public /* synthetic */ class C00081 {

        /* renamed from: $SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy */
        public static final /* synthetic */ int[] f143x830aeb77;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[Remedy.values().length];
            f143x830aeb77 = iArr;
            iArr[Remedy.REBOOT.ordinal()] = 1;
            iArr[Remedy.REINSTALL.ordinal()] = 2;
        }
    }

    public String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder("Application is in corrupt state. ");
        Remedy remedy = this.mRemedy;
        switch (remedy.ordinal()) {
            case 0:
                str = "Reinstall application.";
                break;
            case 1:
                str = "Reboot device. ";
                break;
            default:
                sb.append("[ mRemedy = ");
                sb.append(remedy);
                sb.append(" ]");
                return sb.toString();
        }
        sb.append(str);
        sb.append("[ mRemedy = ");
        sb.append(remedy);
        sb.append(" ]");
        return sb.toString();
    }

    public Remedy getRemedy() {
        return this.mRemedy;
    }

    public CorruptedApplicationStateException(Throwable th) {
        this(th, Remedy.UNKNOWN);
    }

    public CorruptedApplicationStateException(Throwable th, Remedy remedy) {
        super(th);
        this.mRemedy = remedy;
    }
}
