package p088n;

import java.util.Arrays;
import p088n.C2655b;

/* renamed from: n.j */
public class C2669j implements C2655b.C2656a {

    /* renamed from: n */
    private static float f8973n = 0.001f;

    /* renamed from: a */
    private final int f8974a = -1;

    /* renamed from: b */
    private int f8975b = 16;

    /* renamed from: c */
    private int f8976c = 16;

    /* renamed from: d */
    int[] f8977d = new int[16];

    /* renamed from: e */
    int[] f8978e = new int[16];

    /* renamed from: f */
    int[] f8979f = new int[16];

    /* renamed from: g */
    float[] f8980g = new float[16];

    /* renamed from: h */
    int[] f8981h = new int[16];

    /* renamed from: i */
    int[] f8982i = new int[16];

    /* renamed from: j */
    int f8983j = 0;

    /* renamed from: k */
    int f8984k = -1;

    /* renamed from: l */
    private final C2655b f8985l;

    /* renamed from: m */
    protected final C2657c f8986m;

    C2669j(C2655b bVar, C2657c cVar) {
        this.f8985l = bVar;
        this.f8986m = cVar;
        clear();
    }

    /* renamed from: l */
    private void m12165l(C2667i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f8955c % this.f8976c;
        int[] iArr2 = this.f8977d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f8978e;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f8978e[i] = -1;
    }

    /* renamed from: m */
    private void m12166m(int i, C2667i iVar, float f) {
        this.f8979f[i] = iVar.f8955c;
        this.f8980g[i] = f;
        this.f8981h[i] = -1;
        this.f8982i[i] = -1;
        iVar.mo9410a(this.f8985l);
        iVar.f8965m++;
        this.f8983j++;
    }

    /* renamed from: n */
    private int m12167n() {
        for (int i = 0; i < this.f8975b; i++) {
            if (this.f8979f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m12168o() {
        int i = this.f8975b * 2;
        this.f8979f = Arrays.copyOf(this.f8979f, i);
        this.f8980g = Arrays.copyOf(this.f8980g, i);
        this.f8981h = Arrays.copyOf(this.f8981h, i);
        this.f8982i = Arrays.copyOf(this.f8982i, i);
        this.f8978e = Arrays.copyOf(this.f8978e, i);
        for (int i2 = this.f8975b; i2 < i; i2++) {
            this.f8979f[i2] = -1;
            this.f8978e[i2] = -1;
        }
        this.f8975b = i;
    }

    /* renamed from: q */
    private void m12169q(int i, C2667i iVar, float f) {
        int n = m12167n();
        m12166m(n, iVar, f);
        if (i != -1) {
            this.f8981h[n] = i;
            int[] iArr = this.f8982i;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f8981h[n] = -1;
            if (this.f8983j > 0) {
                this.f8982i[n] = this.f8984k;
                this.f8984k = n;
            } else {
                this.f8982i[n] = -1;
            }
        }
        int[] iArr2 = this.f8982i;
        if (iArr2[n] != -1) {
            this.f8981h[iArr2[n]] = n;
        }
        m12165l(iVar, n);
    }

    /* renamed from: r */
    private void m12170r(C2667i iVar) {
        int[] iArr;
        int i = iVar.f8955c;
        int i2 = i % this.f8976c;
        int[] iArr2 = this.f8977d;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f8979f[i3] == i) {
                int[] iArr3 = this.f8978e;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
                return;
            }
            while (true) {
                iArr = this.f8978e;
                if (iArr[i3] == -1 || this.f8979f[iArr[i3]] == i) {
                    int i4 = iArr[i3];
                } else {
                    i3 = iArr[i3];
                }
            }
            int i42 = iArr[i3];
            if (i42 != -1 && this.f8979f[i42] == i) {
                iArr[i3] = iArr[i42];
                iArr[i42] = -1;
            }
        }
    }

    /* renamed from: a */
    public float mo9333a(int i) {
        int i2 = this.f8983j;
        int i3 = this.f8984k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f8980g[i3];
            }
            i3 = this.f8982i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: b */
    public float mo9334b(C2667i iVar) {
        int p = mo9417p(iVar);
        if (p != -1) {
            return this.f8980g[p];
        }
        return 0.0f;
    }

    /* renamed from: c */
    public void mo9335c(C2667i iVar, float f, boolean z) {
        float f2 = f8973n;
        if (f <= (-f2) || f >= f2) {
            int p = mo9417p(iVar);
            if (p == -1) {
                mo9340g(iVar, f);
                return;
            }
            float[] fArr = this.f8980g;
            fArr[p] = fArr[p] + f;
            float f3 = fArr[p];
            float f4 = f8973n;
            if (f3 > (-f4) && fArr[p] < f4) {
                fArr[p] = 0.0f;
                mo9342i(iVar, z);
            }
        }
    }

    public void clear() {
        int i = this.f8983j;
        for (int i2 = 0; i2 < i; i2++) {
            C2667i f = mo9339f(i2);
            if (f != null) {
                f.mo9411c(this.f8985l);
            }
        }
        for (int i3 = 0; i3 < this.f8975b; i3++) {
            this.f8979f[i3] = -1;
            this.f8978e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f8976c; i4++) {
            this.f8977d[i4] = -1;
        }
        this.f8983j = 0;
        this.f8984k = -1;
    }

    /* renamed from: d */
    public float mo9337d(C2655b bVar, boolean z) {
        float b = mo9334b(bVar.f8909a);
        mo9342i(bVar.f8909a, z);
        C2669j jVar = (C2669j) bVar.f8913e;
        int k = jVar.mo9344k();
        int i = 0;
        int i2 = 0;
        while (i < k) {
            int[] iArr = jVar.f8979f;
            if (iArr[i2] != -1) {
                mo9335c(this.f8986m.f8918d[iArr[i2]], jVar.f8980g[i2] * b, z);
                i++;
            }
            i2++;
        }
        return b;
    }

    /* renamed from: e */
    public boolean mo9338e(C2667i iVar) {
        return mo9417p(iVar) != -1;
    }

    /* renamed from: f */
    public C2667i mo9339f(int i) {
        int i2 = this.f8983j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f8984k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f8986m.f8918d[this.f8979f[i3]];
            }
            i3 = this.f8982i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo9340g(C2667i iVar, float f) {
        float f2 = f8973n;
        if (f <= (-f2) || f >= f2) {
            if (this.f8983j == 0) {
                m12166m(0, iVar, f);
                m12165l(iVar, 0);
                this.f8984k = 0;
                return;
            }
            int p = mo9417p(iVar);
            if (p != -1) {
                this.f8980g[p] = f;
                return;
            }
            if (this.f8983j + 1 >= this.f8975b) {
                m12168o();
            }
            int i = this.f8983j;
            int i2 = this.f8984k;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int[] iArr = this.f8979f;
                int i5 = iArr[i2];
                int i6 = iVar.f8955c;
                if (i5 == i6) {
                    this.f8980g[i2] = f;
                    return;
                }
                if (iArr[i2] < i6) {
                    i3 = i2;
                }
                i2 = this.f8982i[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m12169q(i3, iVar, f);
            return;
        }
        mo9342i(iVar, true);
    }

    /* renamed from: h */
    public void mo9341h(float f) {
        int i = this.f8983j;
        int i2 = this.f8984k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f8980g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f8982i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public float mo9342i(C2667i iVar, boolean z) {
        int p = mo9417p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        m12170r(iVar);
        float f = this.f8980g[p];
        if (this.f8984k == p) {
            this.f8984k = this.f8982i[p];
        }
        this.f8979f[p] = -1;
        int[] iArr = this.f8981h;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f8982i;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f8982i;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.f8983j--;
        iVar.f8965m--;
        if (z) {
            iVar.mo9411c(this.f8985l);
        }
        return f;
    }

    /* renamed from: j */
    public void mo9343j() {
        int i = this.f8983j;
        int i2 = this.f8984k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f8980g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f8982i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public int mo9344k() {
        return this.f8983j;
    }

    /* renamed from: p */
    public int mo9417p(C2667i iVar) {
        int[] iArr;
        if (this.f8983j == 0) {
            return -1;
        }
        int i = iVar.f8955c;
        int i2 = this.f8977d[i % this.f8976c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f8979f[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.f8978e;
            if (iArr[i2] != -1 && this.f8979f[iArr[i2]] != i) {
                i2 = iArr[i2];
            }
        }
        if (iArr[i2] != -1 && this.f8979f[iArr[i2]] == i) {
            return iArr[i2];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = hashCode() + " { ";
        int i = this.f8983j;
        for (int i2 = 0; i2 < i; i2++) {
            C2667i f = mo9339f(i2);
            if (f != null) {
                String str3 = str2 + f + " = " + mo9333a(i2) + " ";
                int p = mo9417p(f);
                String str4 = str3 + "[p: ";
                if (this.f8981h[p] != -1) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(this.f8986m.f8918d[this.f8979f[this.f8981h[p]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("none");
                }
                String str5 = sb.toString() + ", n: ";
                if (this.f8982i[p] != -1) {
                    str = str5 + this.f8986m.f8918d[this.f8979f[this.f8982i[p]]];
                } else {
                    str = str5 + "none";
                }
                str2 = str + "]";
            }
        }
        return str2 + " }";
    }
}
