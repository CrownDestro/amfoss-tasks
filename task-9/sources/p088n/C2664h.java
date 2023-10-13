package p088n;

import java.util.Arrays;
import java.util.Comparator;
import p088n.C2655b;

/* renamed from: n.h */
public class C2664h extends C2655b {

    /* renamed from: g */
    private int f8942g = 128;

    /* renamed from: h */
    private C2667i[] f8943h = new C2667i[128];

    /* renamed from: i */
    private C2667i[] f8944i = new C2667i[128];

    /* renamed from: j */
    private int f8945j = 0;

    /* renamed from: k */
    C2666b f8946k = new C2666b(this);

    /* renamed from: l */
    C2657c f8947l;

    /* renamed from: n.h$a */
    class C2665a implements Comparator<C2667i> {
        C2665a() {
        }

        /* renamed from: a */
        public int compare(C2667i iVar, C2667i iVar2) {
            return iVar.f8955c - iVar2.f8955c;
        }
    }

    /* renamed from: n.h$b */
    class C2666b implements Comparable {

        /* renamed from: d */
        C2667i f8949d;

        /* renamed from: e */
        C2664h f8950e;

        public C2666b(C2664h hVar) {
            this.f8950e = hVar;
        }

        /* renamed from: a */
        public boolean mo9403a(C2667i iVar, float f) {
            boolean z = true;
            if (this.f8949d.f8953a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f8949d.f8961i;
                    fArr[i] = fArr[i] + (iVar.f8961i[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f8949d.f8961i[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C2664h.this.m12148G(this.f8949d);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = iVar.f8961i[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f8949d.f8961i[i2] = f3;
                } else {
                    this.f8949d.f8961i[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo9404b(C2667i iVar) {
            this.f8949d = iVar;
        }

        /* renamed from: c */
        public final boolean mo9405c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f8949d.f8961i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public int compareTo(Object obj) {
            return this.f8949d.f8955c - ((C2667i) obj).f8955c;
        }

        /* renamed from: d */
        public final boolean mo9407d(C2667i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f8961i[i];
                float f2 = this.f8949d.f8961i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo9408e() {
            Arrays.fill(this.f8949d.f8961i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f8949d != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f8949d.f8961i[i] + " ";
                }
            }
            return str + "] " + this.f8949d;
        }
    }

    public C2664h(C2657c cVar) {
        super(cVar);
        this.f8947l = cVar;
    }

    /* renamed from: F */
    private final void m12147F(C2667i iVar) {
        int i;
        int i2 = this.f8945j + 1;
        C2667i[] iVarArr = this.f8943h;
        if (i2 > iVarArr.length) {
            C2667i[] iVarArr2 = (C2667i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f8943h = iVarArr2;
            this.f8944i = (C2667i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C2667i[] iVarArr3 = this.f8943h;
        int i3 = this.f8945j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f8945j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f8955c > iVar.f8955c) {
            int i5 = 0;
            while (true) {
                i = this.f8945j;
                if (i5 >= i) {
                    break;
                }
                this.f8944i[i5] = this.f8943h[i5];
                i5++;
            }
            Arrays.sort(this.f8944i, 0, i, new C2665a());
            for (int i6 = 0; i6 < this.f8945j; i6++) {
                this.f8943h[i6] = this.f8944i[i6];
            }
        }
        iVar.f8953a = true;
        iVar.mo9410a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m12148G(C2667i iVar) {
        int i = 0;
        while (i < this.f8945j) {
            if (this.f8943h[i] == iVar) {
                while (true) {
                    int i2 = this.f8945j;
                    if (i < i2 - 1) {
                        C2667i[] iVarArr = this.f8943h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f8945j = i2 - 1;
                        iVar.f8953a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: C */
    public void mo9348C(C2655b bVar, boolean z) {
        C2667i iVar = bVar.f8909a;
        if (iVar != null) {
            C2655b.C2656a aVar = bVar.f8913e;
            int k = aVar.mo9344k();
            for (int i = 0; i < k; i++) {
                C2667i f = aVar.mo9339f(i);
                float a = aVar.mo9333a(i);
                this.f8946k.mo9404b(f);
                if (this.f8946k.mo9403a(iVar, a)) {
                    m12147F(f);
                }
                this.f8910b += bVar.f8910b * a;
            }
            m12148G(iVar);
        }
    }

    /* renamed from: a */
    public C2667i mo9350a(C2658d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f8945j; i2++) {
            C2667i iVar = this.f8943h[i2];
            if (!zArr[iVar.f8955c]) {
                this.f8946k.mo9404b(iVar);
                C2666b bVar = this.f8946k;
                if (i == -1) {
                    if (!bVar.mo9405c()) {
                    }
                } else if (!bVar.mo9407d(this.f8943h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8943h[i];
    }

    /* renamed from: b */
    public void mo9351b(C2667i iVar) {
        this.f8946k.mo9404b(iVar);
        this.f8946k.mo9408e();
        iVar.f8961i[iVar.f8957e] = 1.0f;
        m12147F(iVar);
    }

    public void clear() {
        this.f8945j = 0;
        this.f8910b = 0.0f;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f8910b + ") : ";
        for (int i = 0; i < this.f8945j; i++) {
            this.f8946k.mo9404b(this.f8943h[i]);
            str = str + this.f8946k + " ";
        }
        return str;
    }
}
