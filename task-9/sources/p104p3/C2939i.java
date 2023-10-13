package p104p3;

import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: p3.i */
public final class C2939i<T> {

    /* renamed from: a */
    public static final C2941b f9700a = new C2941b((C1920g) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2942c f9701b = new C2942c();

    /* renamed from: p3.i$a */
    public static final class C2940a extends C2942c {

        /* renamed from: a */
        public final Throwable f9702a;

        public C2940a(Throwable th) {
            this.f9702a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2940a) && C1924k.m9136b(this.f9702a, ((C2940a) obj).f9702a);
        }

        public int hashCode() {
            Throwable th = this.f9702a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f9702a + ')';
        }
    }

    /* renamed from: p3.i$b */
    public static final class C2941b {
        private C2941b() {
        }

        public /* synthetic */ C2941b(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final <E> Object mo10127a(Throwable th) {
            return C2939i.m13291b(new C2940a(th));
        }

        /* renamed from: b */
        public final <E> Object mo10128b() {
            return C2939i.m13291b(C2939i.f9701b);
        }

        /* renamed from: c */
        public final <E> Object mo10129c(E e) {
            return C2939i.m13291b(e);
        }
    }

    /* renamed from: p3.i$c */
    public static class C2942c {
        public String toString() {
            return "Failed";
        }
    }

    /* renamed from: b */
    public static <T> Object m13291b(Object obj) {
        return obj;
    }
}
