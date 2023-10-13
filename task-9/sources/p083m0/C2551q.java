package p083m0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p083m0.C2539m;

/* renamed from: m0.q */
public class C2551q extends C2539m {

    /* renamed from: L */
    private ArrayList<C2539m> f8639L = new ArrayList<>();

    /* renamed from: M */
    private boolean f8640M = true;

    /* renamed from: N */
    int f8641N;

    /* renamed from: O */
    boolean f8642O = false;

    /* renamed from: P */
    private int f8643P = 0;

    /* renamed from: m0.q$a */
    class C2552a extends C2546n {

        /* renamed from: a */
        final /* synthetic */ C2539m f8644a;

        C2552a(C2539m mVar) {
            this.f8644a = mVar;
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            this.f8644a.mo9195Y();
            mVar.mo9192U(this);
        }
    }

    /* renamed from: m0.q$b */
    static class C2553b extends C2546n {

        /* renamed from: a */
        C2551q f8646a;

        C2553b(C2551q qVar) {
            this.f8646a = qVar;
        }

        /* renamed from: a */
        public void mo9160a(C2539m mVar) {
            C2551q qVar = this.f8646a;
            if (!qVar.f8642O) {
                qVar.mo9206f0();
                this.f8646a.f8642O = true;
            }
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            C2551q qVar = this.f8646a;
            int i = qVar.f8641N - 1;
            qVar.f8641N = i;
            if (i == 0) {
                qVar.f8642O = false;
                qVar.mo9215u();
            }
            mVar.mo9192U(this);
        }
    }

    /* renamed from: k0 */
    private void m11684k0(C2539m mVar) {
        this.f8639L.add(mVar);
        mVar.f8618u = this;
    }

    /* renamed from: t0 */
    private void m11685t0() {
        C2553b bVar = new C2553b(this);
        Iterator<C2539m> it = this.f8639L.iterator();
        while (it.hasNext()) {
            it.next().mo9198b(bVar);
        }
        this.f8641N = this.f8639L.size();
    }

    /* renamed from: S */
    public void mo9190S(View view) {
        super.mo9190S(view);
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            this.f8639L.get(i).mo9190S(view);
        }
    }

    /* renamed from: W */
    public void mo9194W(View view) {
        super.mo9194W(view);
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            this.f8639L.get(i).mo9194W(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo9195Y() {
        if (this.f8639L.isEmpty()) {
            mo9206f0();
            mo9215u();
            return;
        }
        m11685t0();
        if (!this.f8640M) {
            for (int i = 1; i < this.f8639L.size(); i++) {
                this.f8639L.get(i - 1).mo9198b(new C2552a(this.f8639L.get(i)));
            }
            C2539m mVar = this.f8639L.get(0);
            if (mVar != null) {
                mVar.mo9195Y();
                return;
            }
            return;
        }
        Iterator<C2539m> it = this.f8639L.iterator();
        while (it.hasNext()) {
            it.next().mo9195Y();
        }
    }

    /* renamed from: a0 */
    public void mo9197a0(C2539m.C2544e eVar) {
        super.mo9197a0(eVar);
        this.f8643P |= 8;
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            this.f8639L.get(i).mo9197a0(eVar);
        }
    }

    /* renamed from: c0 */
    public void mo9200c0(C2527g gVar) {
        super.mo9200c0(gVar);
        this.f8643P |= 4;
        if (this.f8639L != null) {
            for (int i = 0; i < this.f8639L.size(); i++) {
                this.f8639L.get(i).mo9200c0(gVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            this.f8639L.get(i).cancel();
        }
    }

    /* renamed from: d0 */
    public void mo9204d0(C2550p pVar) {
        super.mo9204d0(pVar);
        this.f8643P |= 2;
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            this.f8639L.get(i).mo9204d0(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public String mo9207g0(String str) {
        String g0 = super.mo9207g0(str);
        for (int i = 0; i < this.f8639L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(g0);
            sb.append("\n");
            sb.append(this.f8639L.get(i).mo9207g0(str + "  "));
            g0 = sb.toString();
        }
        return g0;
    }

    /* renamed from: h0 */
    public C2551q mo9198b(C2539m.C2545f fVar) {
        return (C2551q) super.mo9198b(fVar);
    }

    /* renamed from: i0 */
    public C2551q mo9203d(View view) {
        for (int i = 0; i < this.f8639L.size(); i++) {
            this.f8639L.get(i).mo9203d(view);
        }
        return (C2551q) super.mo9203d(view);
    }

    /* renamed from: j */
    public void mo9117j(C2555s sVar) {
        if (mo9189L(sVar.f8651b)) {
            Iterator<C2539m> it = this.f8639L.iterator();
            while (it.hasNext()) {
                C2539m next = it.next();
                if (next.mo9189L(sVar.f8651b)) {
                    next.mo9117j(sVar);
                    sVar.f8652c.add(next);
                }
            }
        }
    }

    /* renamed from: j0 */
    public C2551q mo9229j0(C2539m mVar) {
        m11684k0(mVar);
        long j = this.f8603f;
        if (j >= 0) {
            mVar.mo9196Z(j);
        }
        if ((this.f8643P & 1) != 0) {
            mVar.mo9199b0(mo9218x());
        }
        if ((this.f8643P & 2) != 0) {
            mo9182B();
            mVar.mo9204d0((C2550p) null);
        }
        if ((this.f8643P & 4) != 0) {
            mVar.mo9200c0(mo9181A());
        }
        if ((this.f8643P & 8) != 0) {
            mVar.mo9197a0(mo9217w());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9209l(C2555s sVar) {
        super.mo9209l(sVar);
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            this.f8639L.get(i).mo9209l(sVar);
        }
    }

    /* renamed from: l0 */
    public C2539m mo9230l0(int i) {
        if (i < 0 || i >= this.f8639L.size()) {
            return null;
        }
        return this.f8639L.get(i);
    }

    /* renamed from: m */
    public void mo9118m(C2555s sVar) {
        if (mo9189L(sVar.f8651b)) {
            Iterator<C2539m> it = this.f8639L.iterator();
            while (it.hasNext()) {
                C2539m next = it.next();
                if (next.mo9189L(sVar.f8651b)) {
                    next.mo9118m(sVar);
                    sVar.f8652c.add(next);
                }
            }
        }
    }

    /* renamed from: m0 */
    public int mo9231m0() {
        return this.f8639L.size();
    }

    /* renamed from: n0 */
    public C2551q mo9192U(C2539m.C2545f fVar) {
        return (C2551q) super.mo9192U(fVar);
    }

    /* renamed from: o0 */
    public C2551q mo9193V(View view) {
        for (int i = 0; i < this.f8639L.size(); i++) {
            this.f8639L.get(i).mo9193V(view);
        }
        return (C2551q) super.mo9193V(view);
    }

    /* renamed from: p0 */
    public C2551q mo9196Z(long j) {
        ArrayList<C2539m> arrayList;
        super.mo9196Z(j);
        if (this.f8603f >= 0 && (arrayList = this.f8639L) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f8639L.get(i).mo9196Z(j);
            }
        }
        return this;
    }

    /* renamed from: q */
    public C2539m clone() {
        C2551q qVar = (C2551q) super.clone();
        qVar.f8639L = new ArrayList<>();
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            qVar.m11684k0(this.f8639L.get(i).clone());
        }
        return qVar;
    }

    /* renamed from: q0 */
    public C2551q mo9199b0(TimeInterpolator timeInterpolator) {
        this.f8643P |= 1;
        ArrayList<C2539m> arrayList = this.f8639L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f8639L.get(i).mo9199b0(timeInterpolator);
            }
        }
        return (C2551q) super.mo9199b0(timeInterpolator);
    }

    /* renamed from: r0 */
    public C2551q mo9236r0(int i) {
        if (i == 0) {
            this.f8640M = true;
        } else if (i == 1) {
            this.f8640M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: s0 */
    public C2551q mo9205e0(long j) {
        return (C2551q) super.mo9205e0(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9213t(ViewGroup viewGroup, C2556t tVar, C2556t tVar2, ArrayList<C2555s> arrayList, ArrayList<C2555s> arrayList2) {
        long D = mo9183D();
        int size = this.f8639L.size();
        for (int i = 0; i < size; i++) {
            C2539m mVar = this.f8639L.get(i);
            if (D > 0 && (this.f8640M || i == 0)) {
                long D2 = mVar.mo9183D();
                if (D2 > 0) {
                    mVar.mo9205e0(D2 + D);
                } else {
                    mVar.mo9205e0(D);
                }
            }
            mVar.mo9213t(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
