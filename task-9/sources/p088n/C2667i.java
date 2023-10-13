package p088n;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: n.i */
public class C2667i {

    /* renamed from: o */
    private static int f8952o = 1;

    /* renamed from: a */
    public boolean f8953a;

    /* renamed from: b */
    private String f8954b;

    /* renamed from: c */
    public int f8955c = -1;

    /* renamed from: d */
    int f8956d = -1;

    /* renamed from: e */
    public int f8957e = 0;

    /* renamed from: f */
    public float f8958f;

    /* renamed from: g */
    public boolean f8959g = false;

    /* renamed from: h */
    float[] f8960h = new float[9];

    /* renamed from: i */
    float[] f8961i = new float[9];

    /* renamed from: j */
    C2668a f8962j;

    /* renamed from: k */
    C2655b[] f8963k = new C2655b[16];

    /* renamed from: l */
    int f8964l = 0;

    /* renamed from: m */
    public int f8965m = 0;

    /* renamed from: n */
    HashSet<C2655b> f8966n = null;

    /* renamed from: n.i$a */
    public enum C2668a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C2667i(C2668a aVar, String str) {
        this.f8962j = aVar;
    }

    /* renamed from: b */
    static void m12158b() {
        f8952o++;
    }

    /* renamed from: a */
    public final void mo9410a(C2655b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f8964l;
            if (i >= i2) {
                C2655b[] bVarArr = this.f8963k;
                if (i2 >= bVarArr.length) {
                    this.f8963k = (C2655b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C2655b[] bVarArr2 = this.f8963k;
                int i3 = this.f8964l;
                bVarArr2[i3] = bVar;
                this.f8964l = i3 + 1;
                return;
            } else if (this.f8963k[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo9411c(C2655b bVar) {
        int i = this.f8964l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f8963k[i2] == bVar) {
                while (i2 < i - 1) {
                    C2655b[] bVarArr = this.f8963k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f8964l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo9412d() {
        this.f8954b = null;
        this.f8962j = C2668a.UNKNOWN;
        this.f8957e = 0;
        this.f8955c = -1;
        this.f8956d = -1;
        this.f8958f = 0.0f;
        this.f8959g = false;
        int i = this.f8964l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8963k[i2] = null;
        }
        this.f8964l = 0;
        this.f8965m = 0;
        this.f8953a = false;
        Arrays.fill(this.f8961i, 0.0f);
    }

    /* renamed from: e */
    public void mo9413e(C2658d dVar, float f) {
        this.f8958f = f;
        this.f8959g = true;
        int i = this.f8964l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8963k[i2].mo9347B(dVar, this, false);
        }
        this.f8964l = 0;
    }

    /* renamed from: f */
    public void mo9414f(C2668a aVar, String str) {
        this.f8962j = aVar;
    }

    /* renamed from: g */
    public final void mo9415g(C2655b bVar) {
        int i = this.f8964l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8963k[i2].mo9348C(bVar, false);
        }
        this.f8964l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f8954b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f8954b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f8955c);
        }
        return sb.toString();
    }
}
