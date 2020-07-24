package com.facebook.cameracore.mediapipeline.arclass.common;

public interface ARClassPersistentStore {
    ARClass getPersistedARClass();

    void persistARClass(ARClass aRClass);
}
