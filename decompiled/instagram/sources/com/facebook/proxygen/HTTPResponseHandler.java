package com.facebook.proxygen;

import org.apache.http.Header;

public interface HTTPResponseHandler {
    void onBody();

    void onEOM();

    void onError(HTTPRequestError hTTPRequestError);

    void onResponse(int i, String str, Header[] headerArr);
}
