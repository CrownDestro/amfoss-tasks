package p101p0;

import p034e3.C1780l;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: p0.f */
public abstract class C2910f<T> {

    /* renamed from: a */
    public static final C2911a f9645a = new C2911a((C1920g) null);

    /* renamed from: p0.f$a */
    public static final class C2911a {
        private C2911a() {
        }

        public /* synthetic */ C2911a(C1920g gVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C2910f m13216b(C2911a aVar, Object obj, String str, C2912b bVar, C2909e eVar, int i, Object obj2) {
            if ((i & 2) != 0) {
                bVar = C2906c.f9636a.mo10076a();
            }
            if ((i & 4) != 0) {
                eVar = C2904a.f9631a;
            }
            return aVar.mo10080a(obj, str, bVar, eVar);
        }

        /* renamed from: a */
        public final <T> C2910f<T> mo10080a(T t, String str, C2912b bVar, C2909e eVar) {
            C1924k.m9141g(t, "<this>");
            C1924k.m9141g(str, "tag");
            C1924k.m9141g(bVar, "verificationMode");
            C1924k.m9141g(eVar, "logger");
            return new C2913g(t, str, bVar, eVar);
        }
    }

    /* renamed from: p0.f$b */
    public enum C2912b {
        STRICT,
        LOG,
        QUIET
    }

    /* renamed from: a */
    public abstract T mo10077a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10079b(Object obj, String str) {
        C1924k.m9141g(obj, "value");
        C1924k.m9141g(str, "message");
        return str + " value: " + obj;
    }

    /* renamed from: c */
    public abstract C2910f<T> mo10078c(String str, C1780l<? super T, Boolean> lVar);
}
