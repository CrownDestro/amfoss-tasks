package p088n;

import java.util.Arrays;
import p088n.C2655b;

/* renamed from: n.a */
public class C2654a implements C2655b.C2656a {

    /* renamed from: l */
    private static float f8897l = 0.001f;

    /* renamed from: a */
    int f8898a = 0;

    /* renamed from: b */
    private final C2655b f8899b;

    /* renamed from: c */
    protected final C2657c f8900c;

    /* renamed from: d */
    private int f8901d = 8;

    /* renamed from: e */
    private C2667i f8902e = null;

    /* renamed from: f */
    private int[] f8903f = new int[8];

    /* renamed from: g */
    private int[] f8904g = new int[8];

    /* renamed from: h */
    private float[] f8905h = new float[8];

    /* renamed from: i */
    private int f8906i = -1;

    /* renamed from: j */
    private int f8907j = -1;

    /* renamed from: k */
    private boolean f8908k = false;

    C2654a(C2655b bVar, C2657c cVar) {
        this.f8899b = bVar;
        this.f8900c = cVar;
    }

    /* renamed from: a */
    public float mo9333a(int i) {
        int i2 = this.f8906i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f8898a) {
            if (i3 == i) {
                return this.f8905h[i2];
            }
            i2 = this.f8904g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo9334b(C2667i iVar) {
        int i = this.f8906i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8898a) {
            if (this.f8903f[i] == iVar.f8955c) {
                return this.f8905h[i];
            }
            i = this.f8904g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public void mo9335c(C2667i iVar, float f, boolean z) {
        float f2 = f8897l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f8906i;
            if (i == -1) {
                this.f8906i = 0;
                this.f8905h[0] = f;
                this.f8903f[0] = iVar.f8955c;
                this.f8904g[0] = -1;
                iVar.f8965m++;
                iVar.mo9410a(this.f8899b);
                this.f8898a++;
                if (!this.f8908k) {
                    int i2 = this.f8907j + 1;
                    this.f8907j = i2;
                    int[] iArr = this.f8903f;
                    if (i2 >= iArr.length) {
                        this.f8908k = true;
                        this.f8907j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f8898a) {
                int[] iArr2 = this.f8903f;
                int i5 = iArr2[i];
                int i6 = iVar.f8955c;
                if (i5 == i6) {
                    float[] fArr = this.f8905h;
                    float f3 = fArr[i] + f;
                    float f4 = f8897l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f8906i) {
                            this.f8906i = this.f8904g[i];
                        } else {
                            int[] iArr3 = this.f8904g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo9411c(this.f8899b);
                        }
                        if (this.f8908k) {
                            this.f8907j = i;
                        }
                        iVar.f8965m--;
                        this.f8898a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f8904g[i];
                i3++;
            }
            int i7 = this.f8907j;
            int i8 = i7 + 1;
            if (this.f8908k) {
                int[] iArr4 = this.f8903f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f8903f;
            if (i7 >= iArr5.length && this.f8898a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f8903f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f8903f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f8901d * 2;
                this.f8901d = i10;
                this.f8908k = false;
                this.f8907j = i7 - 1;
                this.f8905h = Arrays.copyOf(this.f8905h, i10);
                this.f8903f = Arrays.copyOf(this.f8903f, this.f8901d);
                this.f8904g = Arrays.copyOf(this.f8904g, this.f8901d);
            }
            this.f8903f[i7] = iVar.f8955c;
            this.f8905h[i7] = f;
            int[] iArr8 = this.f8904g;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f8906i;
                this.f8906i = i7;
            }
            iVar.f8965m++;
            iVar.mo9410a(this.f8899b);
            this.f8898a++;
            if (!this.f8908k) {
                this.f8907j++;
            }
            int i11 = this.f8907j;
            int[] iArr9 = this.f8903f;
            if (i11 >= iArr9.length) {
                this.f8908k = true;
                this.f8907j = iArr9.length - 1;
            }
        }
    }

    public final void clear() {
        int i = this.f8906i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8898a) {
            C2667i iVar = this.f8900c.f8918d[this.f8903f[i]];
            if (iVar != null) {
                iVar.mo9411c(this.f8899b);
            }
            i = this.f8904g[i];
            i2++;
        }
        this.f8906i = -1;
        this.f8907j = -1;
        this.f8908k = false;
        this.f8898a = 0;
    }

    /* renamed from: d */
    public float mo9337d(C2655b bVar, boolean z) {
        float b = mo9334b(bVar.f8909a);
        mo9342i(bVar.f8909a, z);
        C2655b.C2656a aVar = bVar.f8913e;
        int k = aVar.mo9344k();
        for (int i = 0; i < k; i++) {
            C2667i f = aVar.mo9339f(i);
            mo9335c(f, aVar.mo9334b(f) * b, z);
        }
        return b;
    }

    /* renamed from: e */
    public boolean mo9338e(C2667i iVar) {
        int i = this.f8906i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f8898a) {
            if (this.f8903f[i] == iVar.f8955c) {
                return true;
            }
            i = this.f8904g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: f */
    public C2667i mo9339f(int i) {
        int i2 = this.f8906i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f8898a) {
            if (i3 == i) {
                return this.f8900c.f8918d[this.f8903f[i2]];
            }
            i2 = this.f8904g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: g */
    public final void mo9340g(C2667i iVar, float f) {
        if (f == 0.0f) {
            mo9342i(iVar, true);
            return;
        }
        int i = this.f8906i;
        if (i == -1) {
            this.f8906i = 0;
            this.f8905h[0] = f;
            this.f8903f[0] = iVar.f8955c;
            this.f8904g[0] = -1;
            iVar.f8965m++;
            iVar.mo9410a(this.f8899b);
            this.f8898a++;
            if (!this.f8908k) {
                int i2 = this.f8907j + 1;
                this.f8907j = i2;
                int[] iArr = this.f8903f;
                if (i2 >= iArr.length) {
                    this.f8908k = true;
                    this.f8907j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f8898a) {
            int[] iArr2 = this.f8903f;
            int i5 = iArr2[i];
            int i6 = iVar.f8955c;
            if (i5 == i6) {
                this.f8905h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f8904g[i];
            i3++;
        }
        int i7 = this.f8907j;
        int i8 = i7 + 1;
        if (this.f8908k) {
            int[] iArr3 = this.f8903f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f8903f;
        if (i7 >= iArr4.length && this.f8898a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f8903f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f8903f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f8901d * 2;
            this.f8901d = i10;
            this.f8908k = false;
            this.f8907j = i7 - 1;
            this.f8905h = Arrays.copyOf(this.f8905h, i10);
            this.f8903f = Arrays.copyOf(this.f8903f, this.f8901d);
            this.f8904g = Arrays.copyOf(this.f8904g, this.f8901d);
        }
        this.f8903f[i7] = iVar.f8955c;
        this.f8905h[i7] = f;
        int[] iArr7 = this.f8904g;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f8906i;
            this.f8906i = i7;
        }
        iVar.f8965m++;
        iVar.mo9410a(this.f8899b);
        int i11 = this.f8898a + 1;
        this.f8898a = i11;
        if (!this.f8908k) {
            this.f8907j++;
        }
        int[] iArr8 = this.f8903f;
        if (i11 >= iArr8.length) {
            this.f8908k = true;
        }
        if (this.f8907j >= iArr8.length) {
            this.f8908k = true;
            this.f8907j = iArr8.length - 1;
        }
    }

    /* renamed from: h */
    public void mo9341h(float f) {
        int i = this.f8906i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8898a) {
            float[] fArr = this.f8905h;
            fArr[i] = fArr[i] / f;
            i = this.f8904g[i];
            i2++;
        }
    }

    /* renamed from: i */
    public final float mo9342i(C2667i iVar, boolean z) {
        if (this.f8902e == iVar) {
            this.f8902e = null;
        }
        int i = this.f8906i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f8898a) {
            if (this.f8903f[i] == iVar.f8955c) {
                if (i == this.f8906i) {
                    this.f8906i = this.f8904g[i];
                } else {
                    int[] iArr = this.f8904g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo9411c(this.f8899b);
                }
                iVar.f8965m--;
                this.f8898a--;
                this.f8903f[i] = -1;
                if (this.f8908k) {
                    this.f8907j = i;
                }
                return this.f8905h[i];
            }
            i2++;
            i3 = i;
            i = this.f8904g[i];
        }
        return 0.0f;
    }

    /* renamed from: j */
    public void mo9343j() {
        int i = this.f8906i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8898a) {
            float[] fArr = this.f8905h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f8904g[i];
            i2++;
        }
    }

    /* renamed from: k */
    public int mo9344k() {
        return this.f8898a;
    }

    public String toString() {
        int i = this.f8906i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f8898a) {
            str = ((str + " -> ") + this.f8905h[i] + " : ") + this.f8900c.f8918d[this.f8903f[i]];
            i = this.f8904g[i];
            i2++;
        }
        return str;
    }
}
