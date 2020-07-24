package p000X;

public final class DFO {
    public final int version;  // 1 is no error, 0 is error
    public final String base64EncodedPassword;
    public final String passwordType;  // #PWD_FB4A or #PWD_TALK or #PWD_INSTAGRAM or #PWD_WORKPLACE or #PWD_ENC
    public final PasswordEmptyException exception;

    public DFO(String passwordType, int errCode, String base64EncodedPassword, PasswordEmptyException exception) {
        this.version = errCode;
        this.passwordType = passwordType;
        this.base64EncodedPassword = base64EncodedPassword;
        this.exception = exception;
    }
}
