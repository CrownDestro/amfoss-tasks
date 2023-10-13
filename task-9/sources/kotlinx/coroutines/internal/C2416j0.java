package kotlinx.coroutines.internal;

import p041f3.C1924k;
import p092n3.C2751i2;
import p145w2.C3448g;

/* renamed from: kotlinx.coroutines.internal.j0 */
final class C2416j0 {

    /* renamed from: a */
    public final C3448g f8332a;

    /* renamed from: b */
    private final Object[] f8333b;

    /* renamed from: c */
    private final C2751i2<Object>[] f8334c;

    /* renamed from: d */
    private int f8335d;

    public C2416j0(C3448g gVar, int i) {
        this.f8332a = gVar;
        this.f8333b = new Object[i];
        this.f8334c = new C2751i2[i];
    }

    /* renamed from: a */
    public final void mo8986a(C2751i2<?> i2Var, Object obj) {
        Object[] objArr = this.f8333b;
        int i = this.f8335d;
        objArr[i] = obj;
        C2751i2<Object>[] i2VarArr = this.f8334c;
        this.f8335d = i + 1;
        i2VarArr[i] = i2Var;
    }

    /* renamed from: b */
    public final void mo8987b(C3448g gVar) {
        int length = this.f8334c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C2751i2<Object> i2Var = this.f8334c[length];
                C1924k.m9138d(i2Var);
                i2Var.mo9502k(gVar, this.f8333b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
