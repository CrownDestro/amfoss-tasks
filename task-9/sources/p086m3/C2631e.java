package p086m3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p034e3.C1784p;
import p041f3.C1924k;
import p048g3.C1964a;
import p068j3.C2327c;
import p080l3.C2480d;
import p127t2.C3177k;

/* renamed from: m3.e */
final class C2631e implements C2480d<C2327c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f8857a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f8858b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f8859c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1784p<CharSequence, Integer, C3177k<Integer, Integer>> f8860d;

    /* renamed from: m3.e$a */
    public static final class C2632a implements Iterator<C2327c>, C1964a {

        /* renamed from: d */
        private int f8861d = -1;

        /* renamed from: e */
        private int f8862e;

        /* renamed from: f */
        private int f8863f;

        /* renamed from: g */
        private C2327c f8864g;

        /* renamed from: h */
        private int f8865h;

        /* renamed from: i */
        final /* synthetic */ C2631e f8866i;

        C2632a(C2631e eVar) {
            this.f8866i = eVar;
            int f = C2331f.m10820f(eVar.f8858b, 0, eVar.f8857a.length());
            this.f8862e = f;
            this.f8863f = f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p086m3.C2631e.m11927d(r6.f8866i)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m11929a() {
            /*
                r6 = this;
                int r0 = r6.f8863f
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f8861d = r1
                r0 = 0
                r6.f8864g = r0
                goto L_0x0099
            L_0x000c:
                m3.e r0 = r6.f8866i
                int r0 = r0.f8859c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f8865h
                int r0 = r0 + r3
                r6.f8865h = r0
                m3.e r4 = r6.f8866i
                int r4 = r4.f8859c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f8863f
                m3.e r4 = r6.f8866i
                java.lang.CharSequence r4 = r4.f8857a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                j3.c r0 = new j3.c
                int r1 = r6.f8862e
                m3.e r4 = r6.f8866i
                java.lang.CharSequence r4 = r4.f8857a
                int r4 = p086m3.C2647q.m12007L(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f8864g = r0
            L_0x0044:
                r6.f8863f = r2
                goto L_0x0097
            L_0x0047:
                m3.e r0 = r6.f8866i
                e3.p r0 = r0.f8860d
                m3.e r4 = r6.f8866i
                java.lang.CharSequence r4 = r4.f8857a
                int r5 = r6.f8863f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo3735l(r4, r5)
                t2.k r0 = (p127t2.C3177k) r0
                if (r0 != 0) goto L_0x0073
                j3.c r0 = new j3.c
                int r1 = r6.f8862e
                m3.e r4 = r6.f8866i
                java.lang.CharSequence r4 = r4.f8857a
                int r4 = p086m3.C2647q.m12007L(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.mo10540a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo10541b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f8862e
                j3.c r4 = p068j3.C2331f.m10823i(r4, r2)
                r6.f8864g = r4
                int r2 = r2 + r0
                r6.f8862e = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f8861d = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086m3.C2631e.C2632a.m11929a():void");
        }

        /* renamed from: b */
        public C2327c next() {
            if (this.f8861d == -1) {
                m11929a();
            }
            if (this.f8861d != 0) {
                C2327c cVar = this.f8864g;
                C1924k.m9139e(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f8864g = null;
                this.f8861d = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f8861d == -1) {
                m11929a();
            }
            return this.f8861d == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2631e(CharSequence charSequence, int i, int i2, C1784p<? super CharSequence, ? super Integer, C3177k<Integer, Integer>> pVar) {
        C1924k.m9141g(charSequence, "input");
        C1924k.m9141g(pVar, "getNextMatch");
        this.f8857a = charSequence;
        this.f8858b = i;
        this.f8859c = i2;
        this.f8860d = pVar;
    }

    public Iterator<C2327c> iterator() {
        return new C2632a(this);
    }
}
