package com.google.firebase.messaging;

import java.util.regex.Pattern;

public final class FirebaseMessaging {
    public static final Pattern A00 = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
}
