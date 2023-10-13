package p085m2;

import java.util.HashMap;
import java.util.Map;
import p003a2.C0008a;
import p091n2.C2688h;
import p091n2.C2689i;
import p091n2.C2703q;
import p162z1.C3627b;

/* renamed from: m2.l */
public class C2608l {

    /* renamed from: a */
    public final boolean f8779a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public byte[] f8780b;

    /* renamed from: c */
    private C2689i f8781c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2689i.C2694d f8782d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f8783e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f8784f;

    /* renamed from: g */
    private final C2689i.C2693c f8785g;

    /* renamed from: m2.l$a */
    class C2609a implements C2689i.C2694d {

        /* renamed from: a */
        final /* synthetic */ byte[] f8786a;

        C2609a(byte[] bArr) {
            this.f8786a = bArr;
        }

        /* renamed from: a */
        public void mo9290a(String str, String str2, Object obj) {
            C3627b.m16088b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        /* renamed from: b */
        public void mo9291b(Object obj) {
            byte[] unused = C2608l.this.f8780b = this.f8786a;
        }

        /* renamed from: c */
        public void mo9292c() {
        }
    }

    /* renamed from: m2.l$b */
    class C2610b implements C2689i.C2693c {
        C2610b() {
        }

        /* renamed from: l */
        public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
            Map e;
            String str = hVar.f9001a;
            Object obj = hVar.f9002b;
            str.hashCode();
            if (str.equals("get")) {
                boolean unused = C2608l.this.f8784f = true;
                if (!C2608l.this.f8783e) {
                    C2608l lVar = C2608l.this;
                    if (lVar.f8779a) {
                        C2689i.C2694d unused2 = lVar.f8782d = dVar;
                        return;
                    }
                }
                C2608l lVar2 = C2608l.this;
                e = lVar2.m11859i(lVar2.f8780b);
            } else if (!str.equals("put")) {
                dVar.mo9292c();
                return;
            } else {
                byte[] unused3 = C2608l.this.f8780b = (byte[]) obj;
                e = null;
            }
            dVar.mo9291b(e);
        }
    }

    public C2608l(C0008a aVar, boolean z) {
        this(new C2689i(aVar, "flutter/restoration", C2703q.f9016b), z);
    }

    C2608l(C2689i iVar, boolean z) {
        this.f8783e = false;
        this.f8784f = false;
        C2610b bVar = new C2610b();
        this.f8785g = bVar;
        this.f8781c = iVar;
        this.f8779a = z;
        iVar.mo9434e(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public Map<String, Object> m11859i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    /* renamed from: g */
    public void mo9287g() {
        this.f8780b = null;
    }

    /* renamed from: h */
    public byte[] mo9288h() {
        return this.f8780b;
    }

    /* renamed from: j */
    public void mo9289j(byte[] bArr) {
        this.f8783e = true;
        C2689i.C2694d dVar = this.f8782d;
        if (dVar != null) {
            dVar.mo9291b(m11859i(bArr));
            this.f8782d = null;
        } else if (this.f8784f) {
            this.f8781c.mo9433d("push", m11859i(bArr), new C2609a(bArr));
            return;
        }
        this.f8780b = bArr;
    }
}
