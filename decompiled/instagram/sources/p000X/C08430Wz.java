package p000X;

/* renamed from: X.0Wz  reason: invalid class name and case insensitive filesystem */
public final class C08430Wz {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "REQUEST_SENT_SUCCESS";
            case 2:
                return "REQUEST_SENT_FAIL";
            case 3:
                return "RESPONSE_RECEIVED";
            case 4:
                return "FAILURE_CACHE_UPDATE";
            case 5:
                return "FAILURE_SERVICE_NOT_STARTED";
            case 6:
                return "FAILURE_MQTT_NOT_CONNECTED";
            case 7:
                return "FAILURE_UNKNOWN_CLIENT_ERROR";
            case 8:
                return "FAILURE_SERVER_RESPOND_WITH_ERROR";
            case 9:
                return "FAILURE_SERVER_RESPOND_WITH_INVALID_PACKAGE_NAME";
            case 10:
                return "FAILURE_SERVER_RESPOND_WITH_INVALID_TOKEN";
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return "FAILURE_PACKAGE_DOES_NOT_MATCH_INTENT";
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return "FAILURE_EMPTY_PACKAGE_NAME";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "UNREGISTER_CALLED";
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return "AUTHFAIL_AUTO_REGISTER";
            case 15:
                return "REGISTER";
            case 16:
                return "UNREGISTER_FAILURE_MQTT_NOT_CONNECTED";
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return "UNREGISTER_REQUEST_SENT_SUCCESS";
            case 18:
                return "UNREGISTER_REQUEST_SENT_FAIL";
            case 19:
                return "CREDENTIALS_UPDATED";
            default:
                return "CACHE_HIT";
        }
    }
}
