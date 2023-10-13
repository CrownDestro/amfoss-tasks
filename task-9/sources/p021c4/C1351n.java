package p021c4;

import java.io.IOException;
import p041f3.C1924k;

/* renamed from: c4.n */
public final class C1351n extends IOException {

    /* renamed from: d */
    public final C1304b f4877d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1351n(C1304b bVar) {
        super("stream was reset: " + bVar);
        C1924k.m9142h(bVar, "errorCode");
        this.f4877d = bVar;
    }
}
