package p085m2;

import java.util.ArrayList;
import p003a2.C0008a;
import p091n2.C2688h;
import p091n2.C2689i;
import p091n2.C2703q;
import p162z1.C3627b;

/* renamed from: m2.n */
public class C2614n {

    /* renamed from: a */
    public final C2689i f8796a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2616b f8797b;

    /* renamed from: c */
    public final C2689i.C2693c f8798c;

    /* renamed from: m2.n$a */
    class C2615a implements C2689i.C2693c {
        C2615a() {
        }

        /* renamed from: l */
        public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
            if (C2614n.this.f8797b == null) {
                C3627b.m16092f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = hVar.f9001a;
            Object obj = hVar.f9002b;
            C3627b.m16092f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.mo9292c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                C2614n.this.f8797b.mo8435a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e) {
                dVar.mo9290a("error", e.getMessage(), (Object) null);
            }
        }
    }

    /* renamed from: m2.n$b */
    public interface C2616b {
        /* renamed from: a */
        void mo8435a(String str, String str2, C2689i.C2694d dVar);
    }

    public C2614n(C0008a aVar) {
        C2615a aVar2 = new C2615a();
        this.f8798c = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/spellcheck", C2703q.f9016b);
        this.f8796a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* renamed from: b */
    public void mo9300b(C2616b bVar) {
        this.f8797b = bVar;
    }
}
