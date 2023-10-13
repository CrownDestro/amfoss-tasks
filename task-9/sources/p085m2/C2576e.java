package p085m2;

import p003a2.C0008a;
import p091n2.C2672a;
import p091n2.C2704r;
import p162z1.C3627b;

/* renamed from: m2.e */
public class C2576e {

    /* renamed from: a */
    public final C2672a<String> f8678a;

    public C2576e(C0008a aVar) {
        this.f8678a = new C2672a<>(aVar, "flutter/lifecycle", C2704r.f9019b);
    }

    /* renamed from: a */
    public void mo9270a() {
        C3627b.m16092f("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f8678a.mo9419c("AppLifecycleState.detached");
    }

    /* renamed from: b */
    public void mo9271b() {
        C3627b.m16092f("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f8678a.mo9419c("AppLifecycleState.inactive");
    }

    /* renamed from: c */
    public void mo9272c() {
        C3627b.m16092f("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f8678a.mo9419c("AppLifecycleState.paused");
    }

    /* renamed from: d */
    public void mo9273d() {
        C3627b.m16092f("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f8678a.mo9419c("AppLifecycleState.resumed");
    }
}
