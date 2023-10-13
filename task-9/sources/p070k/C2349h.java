package p070k;

/* renamed from: k.h */
public class C2349h<E> implements Cloneable {

    /* renamed from: h */
    private static final Object f8105h = new Object();

    /* renamed from: d */
    private boolean f8106d;

    /* renamed from: e */
    private int[] f8107e;

    /* renamed from: f */
    private Object[] f8108f;

    /* renamed from: g */
    private int f8109g;

    public C2349h() {
        this(10);
    }

    public C2349h(int i) {
        this.f8106d = false;
        if (i == 0) {
            this.f8107e = C2339c.f8067a;
            this.f8108f = C2339c.f8069c;
            return;
        }
        int e = C2339c.m10869e(i);
        this.f8107e = new int[e];
        this.f8108f = new Object[e];
    }

    /* renamed from: g */
    private void m10924g() {
        int i = this.f8109g;
        int[] iArr = this.f8107e;
        Object[] objArr = this.f8108f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f8105h) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8106d = false;
        this.f8109g = i2;
    }

    /* renamed from: b */
    public void mo8803b(int i, E e) {
        int i2 = this.f8109g;
        if (i2 == 0 || i > this.f8107e[i2 - 1]) {
            if (this.f8106d && i2 >= this.f8107e.length) {
                m10924g();
            }
            int i3 = this.f8109g;
            if (i3 >= this.f8107e.length) {
                int e2 = C2339c.m10869e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f8107e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f8108f;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8107e = iArr;
                this.f8108f = objArr;
            }
            this.f8107e[i3] = i;
            this.f8108f[i3] = e;
            this.f8109g = i3 + 1;
            return;
        }
        mo8811m(i, e);
    }

    /* renamed from: d */
    public void mo8805d() {
        int i = this.f8109g;
        Object[] objArr = this.f8108f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f8109g = 0;
        this.f8106d = false;
    }

    /* renamed from: e */
    public C2349h<E> clone() {
        try {
            C2349h<E> hVar = (C2349h) super.clone();
            hVar.f8107e = (int[]) this.f8107e.clone();
            hVar.f8108f = (Object[]) this.f8108f.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public E mo8807i(int i) {
        return mo8808j(i, (Object) null);
    }

    /* renamed from: j */
    public E mo8808j(int i, E e) {
        int a = C2339c.m10865a(this.f8107e, this.f8109g, i);
        if (a >= 0) {
            E[] eArr = this.f8108f;
            if (eArr[a] != f8105h) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: k */
    public int mo8809k(E e) {
        if (this.f8106d) {
            m10924g();
        }
        for (int i = 0; i < this.f8109g; i++) {
            if (this.f8108f[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public int mo8810l(int i) {
        if (this.f8106d) {
            m10924g();
        }
        return this.f8107e[i];
    }

    /* renamed from: m */
    public void mo8811m(int i, E e) {
        int a = C2339c.m10865a(this.f8107e, this.f8109g, i);
        if (a >= 0) {
            this.f8108f[a] = e;
            return;
        }
        int i2 = a ^ -1;
        int i3 = this.f8109g;
        if (i2 < i3) {
            Object[] objArr = this.f8108f;
            if (objArr[i2] == f8105h) {
                this.f8107e[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f8106d && i3 >= this.f8107e.length) {
            m10924g();
            i2 = C2339c.m10865a(this.f8107e, this.f8109g, i) ^ -1;
        }
        int i4 = this.f8109g;
        if (i4 >= this.f8107e.length) {
            int e2 = C2339c.m10869e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f8107e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8108f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8107e = iArr;
            this.f8108f = objArr2;
        }
        int i5 = this.f8109g;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f8107e;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f8108f;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f8109g - i2);
        }
        this.f8107e[i2] = i;
        this.f8108f[i2] = e;
        this.f8109g++;
    }

    /* renamed from: o */
    public int mo8812o() {
        if (this.f8106d) {
            m10924g();
        }
        return this.f8109g;
    }

    /* renamed from: p */
    public E mo8813p(int i) {
        if (this.f8106d) {
            m10924g();
        }
        return this.f8108f[i];
    }

    public String toString() {
        if (mo8812o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8109g * 28);
        sb.append('{');
        for (int i = 0; i < this.f8109g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo8810l(i));
            sb.append('=');
            Object p = mo8813p(i);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
