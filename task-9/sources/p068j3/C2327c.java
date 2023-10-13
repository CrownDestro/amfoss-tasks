package p068j3;

import p041f3.C1920g;

/* renamed from: j3.c */
public final class C2327c extends C2324a {

    /* renamed from: h */
    public static final C2328a f8050h = new C2328a((C1920g) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C2327c f8051i = new C2327c(1, 0);

    /* renamed from: j3.c$a */
    public static final class C2328a {
        private C2328a() {
        }

        public /* synthetic */ C2328a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2327c mo8659a() {
            return C2327c.f8051i;
        }
    }

    public C2327c(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: B */
    public boolean mo8656B(int i) {
        return mo8648s() <= i && i <= mo8650x();
    }

    /* renamed from: C */
    public Integer mo8657C() {
        return Integer.valueOf(mo8650x());
    }

    /* renamed from: D */
    public Integer mo8658D() {
        return Integer.valueOf(mo8648s());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2327c) {
            if (!isEmpty() || !((C2327c) obj).isEmpty()) {
                C2327c cVar = (C2327c) obj;
                if (!(mo8648s() == cVar.mo8648s() && mo8650x() == cVar.mo8650x())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo8648s() * 31) + mo8650x();
    }

    public boolean isEmpty() {
        return mo8648s() > mo8650x();
    }

    public String toString() {
        return mo8648s() + ".." + mo8650x();
    }
}
