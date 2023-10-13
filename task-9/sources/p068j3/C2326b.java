package p068j3;

import java.util.NoSuchElementException;
import p133u2.C3277y;

/* renamed from: j3.b */
public final class C2326b extends C3277y {

    /* renamed from: d */
    private final int f8046d;

    /* renamed from: e */
    private final int f8047e;

    /* renamed from: f */
    private boolean f8048f;

    /* renamed from: g */
    private int f8049g;

    public C2326b(int i, int i2, int i3) {
        this.f8046d = i3;
        this.f8047e = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f8048f = z;
        this.f8049g = !z ? i2 : i;
    }

    /* renamed from: a */
    public int mo8654a() {
        int i = this.f8049g;
        if (i != this.f8047e) {
            this.f8049g = this.f8046d + i;
        } else if (this.f8048f) {
            this.f8048f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f8048f;
    }
}
