package p021c4;

import java.util.List;
import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2114h;

/* renamed from: c4.l */
public interface C1346l {

    /* renamed from: a */
    public static final C1346l f4872a = new C1347a.C1348a();

    /* renamed from: b */
    public static final C1347a f4873b = new C1347a((C1920g) null);

    /* renamed from: c4.l$a */
    public static final class C1347a {

        /* renamed from: c4.l$a$a */
        private static final class C1348a implements C1346l {
            /* renamed from: a */
            public boolean mo5287a(int i, List<C1306c> list) {
                C1924k.m9142h(list, "requestHeaders");
                return true;
            }

            /* renamed from: b */
            public boolean mo5288b(int i, List<C1306c> list, boolean z) {
                C1924k.m9142h(list, "responseHeaders");
                return true;
            }

            /* renamed from: c */
            public boolean mo5289c(int i, C2114h hVar, int i2, boolean z) {
                C1924k.m9142h(hVar, "source");
                hVar.mo7963v((long) i2);
                return true;
            }

            /* renamed from: d */
            public void mo5290d(int i, C1304b bVar) {
                C1924k.m9142h(bVar, "errorCode");
            }
        }

        private C1347a() {
        }

        public /* synthetic */ C1347a(C1920g gVar) {
            this();
        }
    }

    /* renamed from: a */
    boolean mo5287a(int i, List<C1306c> list);

    /* renamed from: b */
    boolean mo5288b(int i, List<C1306c> list, boolean z);

    /* renamed from: c */
    boolean mo5289c(int i, C2114h hVar, int i2, boolean z);

    /* renamed from: d */
    void mo5290d(int i, C1304b bVar);
}
