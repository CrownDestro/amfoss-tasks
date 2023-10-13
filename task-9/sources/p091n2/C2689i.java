package p091n2;

import java.nio.ByteBuffer;
import p091n2.C2679b;
import p162z1.C3627b;

/* renamed from: n2.i */
public class C2689i {

    /* renamed from: a */
    private final C2679b f9003a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f9004b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2695j f9005c;

    /* renamed from: d */
    private final C2679b.C2682c f9006d;

    /* renamed from: n2.i$a */
    private final class C2690a implements C2679b.C2680a {

        /* renamed from: a */
        private final C2693c f9007a;

        /* renamed from: n2.i$a$a */
        class C2691a implements C2694d {

            /* renamed from: a */
            final /* synthetic */ C2679b.C2681b f9009a;

            C2691a(C2679b.C2681b bVar) {
                this.f9009a = bVar;
            }

            /* renamed from: a */
            public void mo9290a(String str, String str2, Object obj) {
                this.f9009a.mo56a(C2689i.this.f9005c.mo9429f(str, str2, obj));
            }

            /* renamed from: b */
            public void mo9291b(Object obj) {
                this.f9009a.mo56a(C2689i.this.f9005c.mo9424a(obj));
            }

            /* renamed from: c */
            public void mo9292c() {
                this.f9009a.mo56a((ByteBuffer) null);
            }
        }

        C2690a(C2693c cVar) {
            this.f9007a = cVar;
        }

        /* renamed from: a */
        public void mo47a(ByteBuffer byteBuffer, C2679b.C2681b bVar) {
            try {
                this.f9007a.mo7778l(C2689i.this.f9005c.mo9425b(byteBuffer), new C2691a(bVar));
            } catch (RuntimeException e) {
                C3627b.m16089c("MethodChannel#" + C2689i.this.f9004b, "Failed to handle method call", e);
                bVar.mo56a(C2689i.this.f9005c.mo9427d("error", e.getMessage(), (Object) null, C3627b.m16090d(e)));
            }
        }
    }

    /* renamed from: n2.i$b */
    private final class C2692b implements C2679b.C2681b {

        /* renamed from: a */
        private final C2694d f9011a;

        C2692b(C2694d dVar) {
            this.f9011a = dVar;
        }

        /* renamed from: a */
        public void mo56a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f9011a.mo9292c();
                } catch (RuntimeException e) {
                    C3627b.m16089c("MethodChannel#" + C2689i.this.f9004b, "Failed to handle method call result", e);
                }
            } else {
                try {
                    this.f9011a.mo9291b(C2689i.this.f9005c.mo9426c(byteBuffer));
                } catch (C2683c e2) {
                    this.f9011a.mo9290a(e2.f8997d, e2.getMessage(), e2.f8998e);
                }
            }
        }
    }

    /* renamed from: n2.i$c */
    public interface C2693c {
        /* renamed from: l */
        void mo7778l(C2688h hVar, C2694d dVar);
    }

    /* renamed from: n2.i$d */
    public interface C2694d {
        /* renamed from: a */
        void mo9290a(String str, String str2, Object obj);

        /* renamed from: b */
        void mo9291b(Object obj);

        /* renamed from: c */
        void mo9292c();
    }

    public C2689i(C2679b bVar, String str) {
        this(bVar, str, C2703q.f9016b);
    }

    public C2689i(C2679b bVar, String str, C2695j jVar) {
        this(bVar, str, jVar, (C2679b.C2682c) null);
    }

    public C2689i(C2679b bVar, String str, C2695j jVar, C2679b.C2682c cVar) {
        this.f9003a = bVar;
        this.f9004b = str;
        this.f9005c = jVar;
        this.f9006d = cVar;
    }

    /* renamed from: c */
    public void mo9432c(String str, Object obj) {
        mo9433d(str, obj, (C2694d) null);
    }

    /* renamed from: d */
    public void mo9433d(String str, Object obj, C2694d dVar) {
        this.f9003a.mo40d(this.f9004b, this.f9005c.mo9428e(new C2688h(str, obj)), dVar == null ? null : new C2692b(dVar));
    }

    /* renamed from: e */
    public void mo9434e(C2693c cVar) {
        C2690a aVar = null;
        if (this.f9006d != null) {
            C2679b bVar = this.f9003a;
            String str = this.f9004b;
            if (cVar != null) {
                aVar = new C2690a(cVar);
            }
            bVar.mo39c(str, aVar, this.f9006d);
            return;
        }
        C2679b bVar2 = this.f9003a;
        String str2 = this.f9004b;
        if (cVar != null) {
            aVar = new C2690a(cVar);
        }
        bVar2.mo38a(str2, aVar);
    }
}
