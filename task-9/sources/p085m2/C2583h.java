package p085m2;

import java.util.HashMap;
import p003a2.C0008a;
import p091n2.C2685e;
import p091n2.C2688h;
import p091n2.C2689i;
import p162z1.C3627b;

/* renamed from: m2.h */
public class C2583h {

    /* renamed from: a */
    public final C2689i f8687a;

    /* renamed from: b */
    private final C2689i.C2693c f8688b;

    /* renamed from: m2.h$a */
    class C2584a implements C2689i.C2693c {
        C2584a() {
        }

        /* renamed from: l */
        public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
            dVar.mo9291b((Object) null);
        }
    }

    public C2583h(C0008a aVar) {
        C2584a aVar2 = new C2584a();
        this.f8688b = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/navigation", C2685e.f9000a);
        this.f8687a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* renamed from: a */
    public void mo9279a() {
        C3627b.m16092f("NavigationChannel", "Sending message to pop route.");
        this.f8687a.mo9432c("popRoute", (Object) null);
    }

    /* renamed from: b */
    public void mo9280b(String str) {
        C3627b.m16092f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f8687a.mo9432c("pushRouteInformation", hashMap);
    }

    /* renamed from: c */
    public void mo9281c(String str) {
        C3627b.m16092f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f8687a.mo9432c("setInitialRoute", str);
    }
}
