package p088n;

/* renamed from: n.g */
class C2663g<T> implements C2662f<T> {

    /* renamed from: a */
    private final Object[] f8940a;

    /* renamed from: b */
    private int f8941b;

    C2663g(int i) {
        if (i > 0) {
            this.f8940a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo9398a(T t) {
        int i = this.f8941b;
        Object[] objArr = this.f8940a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f8941b = i + 1;
        return true;
    }

    /* renamed from: b */
    public T mo9399b() {
        int i = this.f8941b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f8940a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f8941b = i - 1;
        return t;
    }

    /* renamed from: c */
    public void mo9400c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f8941b;
            Object[] objArr = this.f8940a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f8941b = i3 + 1;
            }
        }
    }
}
