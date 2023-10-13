package p070k;

/* renamed from: k.d */
public class C2340d<E> implements Cloneable {

    /* renamed from: h */
    private static final Object f8070h = new Object();

    /* renamed from: d */
    private boolean f8071d;

    /* renamed from: e */
    private long[] f8072e;

    /* renamed from: f */
    private Object[] f8073f;

    /* renamed from: g */
    private int f8074g;

    public C2340d() {
        this(10);
    }

    public C2340d(int i) {
        this.f8071d = false;
        if (i == 0) {
            this.f8072e = C2339c.f8068b;
            this.f8073f = C2339c.f8069c;
            return;
        }
        int f = C2339c.m10870f(i);
        this.f8072e = new long[f];
        this.f8073f = new Object[f];
    }

    /* renamed from: g */
    private void m10871g() {
        int i = this.f8074g;
        long[] jArr = this.f8072e;
        Object[] objArr = this.f8073f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f8070h) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8071d = false;
        this.f8074g = i2;
    }

    /* renamed from: b */
    public void mo8694b(long j, E e) {
        int i = this.f8074g;
        if (i == 0 || j > this.f8072e[i - 1]) {
            if (this.f8071d && i >= this.f8072e.length) {
                m10871g();
            }
            int i2 = this.f8074g;
            if (i2 >= this.f8072e.length) {
                int f = C2339c.m10870f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f8072e;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f8073f;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8072e = jArr;
                this.f8073f = objArr;
            }
            this.f8072e[i2] = j;
            this.f8073f[i2] = e;
            this.f8074g = i2 + 1;
            return;
        }
        mo8702m(j, e);
    }

    /* renamed from: d */
    public void mo8696d() {
        int i = this.f8074g;
        Object[] objArr = this.f8073f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f8074g = 0;
        this.f8071d = false;
    }

    /* renamed from: e */
    public C2340d<E> clone() {
        try {
            C2340d<E> dVar = (C2340d) super.clone();
            dVar.f8072e = (long[]) this.f8072e.clone();
            dVar.f8073f = (Object[]) this.f8073f.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public E mo8698i(long j) {
        return mo8699j(j, (Object) null);
    }

    /* renamed from: j */
    public E mo8699j(long j, E e) {
        int b = C2339c.m10866b(this.f8072e, this.f8074g, j);
        if (b >= 0) {
            E[] eArr = this.f8073f;
            if (eArr[b] != f8070h) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: k */
    public int mo8700k(long j) {
        if (this.f8071d) {
            m10871g();
        }
        return C2339c.m10866b(this.f8072e, this.f8074g, j);
    }

    /* renamed from: l */
    public long mo8701l(int i) {
        if (this.f8071d) {
            m10871g();
        }
        return this.f8072e[i];
    }

    /* renamed from: m */
    public void mo8702m(long j, E e) {
        int b = C2339c.m10866b(this.f8072e, this.f8074g, j);
        if (b >= 0) {
            this.f8073f[b] = e;
            return;
        }
        int i = b ^ -1;
        int i2 = this.f8074g;
        if (i < i2) {
            Object[] objArr = this.f8073f;
            if (objArr[i] == f8070h) {
                this.f8072e[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f8071d && i2 >= this.f8072e.length) {
            m10871g();
            i = C2339c.m10866b(this.f8072e, this.f8074g, j) ^ -1;
        }
        int i3 = this.f8074g;
        if (i3 >= this.f8072e.length) {
            int f = C2339c.m10870f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f8072e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8073f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8072e = jArr;
            this.f8073f = objArr2;
        }
        int i4 = this.f8074g;
        if (i4 - i != 0) {
            long[] jArr3 = this.f8072e;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f8073f;
            System.arraycopy(objArr4, i, objArr4, i5, this.f8074g - i);
        }
        this.f8072e[i] = j;
        this.f8073f[i] = e;
        this.f8074g++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f8073f;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8703o(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f8072e
            int r1 = r2.f8074g
            int r3 = p070k.C2339c.m10866b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f8073f
            r0 = r4[r3]
            java.lang.Object r1 = f8070h
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f8071d = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p070k.C2340d.mo8703o(long):void");
    }

    /* renamed from: p */
    public void mo8704p(int i) {
        Object[] objArr = this.f8073f;
        Object obj = objArr[i];
        Object obj2 = f8070h;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f8071d = true;
        }
    }

    /* renamed from: q */
    public int mo8705q() {
        if (this.f8071d) {
            m10871g();
        }
        return this.f8074g;
    }

    /* renamed from: r */
    public E mo8706r(int i) {
        if (this.f8071d) {
            m10871g();
        }
        return this.f8073f[i];
    }

    public String toString() {
        if (mo8705q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8074g * 28);
        sb.append('{');
        for (int i = 0; i < this.f8074g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo8701l(i));
            sb.append('=');
            Object r = mo8706r(i);
            if (r != this) {
                sb.append(r);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
