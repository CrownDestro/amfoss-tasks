package p085m2;

import java.util.HashMap;
import p003a2.C0008a;
import p091n2.C2688h;
import p091n2.C2689i;
import p091n2.C2703q;
import p162z1.C3627b;

/* renamed from: m2.g */
public class C2580g {

    /* renamed from: a */
    public final C2689i f8683a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2582b f8684b;

    /* renamed from: c */
    private final C2689i.C2693c f8685c;

    /* renamed from: m2.g$a */
    class C2581a implements C2689i.C2693c {
        C2581a() {
        }

        /* renamed from: l */
        public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
            if (C2580g.this.f8684b != null) {
                String str = hVar.f9001a;
                C3627b.m16092f("MouseCursorChannel", "Received '" + str + "' message.");
                char c = 65535;
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            c = 0;
                        }
                    }
                    if (c == 0) {
                        try {
                            C2580g.this.f8684b.mo9278a((String) ((HashMap) hVar.f9002b).get("kind"));
                            dVar.mo9291b(Boolean.TRUE);
                        } catch (Exception e) {
                            dVar.mo9290a("error", "Error when setting cursors: " + e.getMessage(), (Object) null);
                        }
                    }
                } catch (Exception e2) {
                    dVar.mo9290a("error", "Unhandled error: " + e2.getMessage(), (Object) null);
                }
            }
        }
    }

    /* renamed from: m2.g$b */
    public interface C2582b {
        /* renamed from: a */
        void mo9278a(String str);
    }

    public C2580g(C0008a aVar) {
        C2581a aVar2 = new C2581a();
        this.f8685c = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/mousecursor", C2703q.f9016b);
        this.f8683a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* renamed from: b */
    public void mo9277b(C2582b bVar) {
        this.f8684b = bVar;
    }
}
