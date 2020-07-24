package com.facebook.graphservice.interfaces;

import com.facebook.graphservice.interfaces.GraphQLService;
import java.util.concurrent.Executor;
import p000X.C14490kj;
import p000X.C206218sE;

public interface GraphQLBaseConsistency {
    C14490kj lookup(Object obj);

    C14490kj publishBuilder(C206218sE r1);

    C14490kj publishBuilderWithFullConsistency(C206218sE r1);

    GraphQLService.Token subscribe(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    GraphQLService.Token subscribeWithFullConsistency(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);
}
