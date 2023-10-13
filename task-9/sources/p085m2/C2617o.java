package p085m2;

import java.util.HashMap;
import p003a2.C0008a;
import p091n2.C2672a;
import p091n2.C2684d;
import p162z1.C3627b;

/* renamed from: m2.o */
public class C2617o {

    /* renamed from: a */
    public final C2672a<Object> f8800a;

    public C2617o(C0008a aVar) {
        this.f8800a = new C2672a<>(aVar, "flutter/system", C2684d.f8999a);
    }

    /* renamed from: a */
    public void mo9301a() {
        C3627b.m16092f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f8800a.mo9419c(hashMap);
    }
}
