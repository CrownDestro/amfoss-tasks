package p091n2;

import java.nio.ByteBuffer;
import p091n2.C2679b;
import p162z1.C3627b;

/* renamed from: n2.a */
public final class C2672a<T> {

    /* renamed from: a */
    private final C2679b f8987a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f8988b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2687g<T> f8989c;

    /* renamed from: d */
    private final C2679b.C2682c f8990d;

    /* renamed from: n2.a$b */
    private final class C2674b implements C2679b.C2680a {

        /* renamed from: a */
        private final C2677d<T> f8991a;

        /* renamed from: n2.a$b$a */
        class C2675a implements C2678e<T> {

            /* renamed from: a */
            final /* synthetic */ C2679b.C2681b f8993a;

            C2675a(C2679b.C2681b bVar) {
                this.f8993a = bVar;
            }

            /* renamed from: a */
            public void mo9268a(T t) {
                this.f8993a.mo56a(C2672a.this.f8989c.mo9423b(t));
            }
        }

        private C2674b(C2677d<T> dVar) {
            this.f8991a = dVar;
        }

        /* renamed from: a */
        public void mo47a(ByteBuffer byteBuffer, C2679b.C2681b bVar) {
            try {
                this.f8991a.mo9266a(C2672a.this.f8989c.mo9422a(byteBuffer), new C2675a(bVar));
            } catch (RuntimeException e) {
                C3627b.m16089c("BasicMessageChannel#" + C2672a.this.f8988b, "Failed to handle message", e);
                bVar.mo56a((ByteBuffer) null);
            }
        }
    }

    /* renamed from: n2.a$c */
    private final class C2676c implements C2679b.C2681b {

        /* renamed from: a */
        private final C2678e<T> f8995a;

        private C2676c(C2678e<T> eVar) {
            this.f8995a = eVar;
        }

        /* renamed from: a */
        public void mo56a(ByteBuffer byteBuffer) {
            try {
                this.f8995a.mo9268a(C2672a.this.f8989c.mo9422a(byteBuffer));
            } catch (RuntimeException e) {
                C3627b.m16089c("BasicMessageChannel#" + C2672a.this.f8988b, "Failed to handle message reply", e);
            }
        }
    }

    /* renamed from: n2.a$d */
    public interface C2677d<T> {
        /* renamed from: a */
        void mo9266a(T t, C2678e<T> eVar);
    }

    /* renamed from: n2.a$e */
    public interface C2678e<T> {
        /* renamed from: a */
        void mo9268a(T t);
    }

    public C2672a(C2679b bVar, String str, C2687g<T> gVar) {
        this(bVar, str, gVar, (C2679b.C2682c) null);
    }

    public C2672a(C2679b bVar, String str, C2687g<T> gVar, C2679b.C2682c cVar) {
        this.f8987a = bVar;
        this.f8988b = str;
        this.f8989c = gVar;
        this.f8990d = cVar;
    }

    /* renamed from: c */
    public void mo9419c(T t) {
        mo9420d(t, (C2678e) null);
    }

    /* renamed from: d */
    public void mo9420d(T t, C2678e<T> eVar) {
        C2679b bVar = this.f8987a;
        String str = this.f8988b;
        ByteBuffer b = this.f8989c.mo9423b(t);
        C2676c cVar = null;
        if (eVar != null) {
            cVar = new C2676c(eVar);
        }
        bVar.mo40d(str, b, cVar);
    }

    /* renamed from: e */
    public void mo9421e(C2677d<T> dVar) {
        C2674b bVar = null;
        if (this.f8990d != null) {
            C2679b bVar2 = this.f8987a;
            String str = this.f8988b;
            if (dVar != null) {
                bVar = new C2674b(dVar);
            }
            bVar2.mo39c(str, bVar, this.f8990d);
            return;
        }
        C2679b bVar3 = this.f8987a;
        String str2 = this.f8988b;
        if (dVar != null) {
            bVar = new C2674b(dVar);
        }
        bVar3.mo38a(str2, bVar);
    }
}
