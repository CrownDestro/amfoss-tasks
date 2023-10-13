package p059i1;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0520c;
import p072k1.C2359g;
import p072k1.C2366k;
import p072k1.C2382n;

/* renamed from: i1.a */
public class C2090a extends Drawable implements C2382n, C0520c {

    /* renamed from: d */
    private C2092b f7319d;

    /* renamed from: i1.a$b */
    static final class C2092b extends Drawable.ConstantState {

        /* renamed from: a */
        C2359g f7320a;

        /* renamed from: b */
        boolean f7321b;

        public C2092b(C2092b bVar) {
            this.f7320a = (C2359g) bVar.f7320a.getConstantState().newDrawable();
            this.f7321b = bVar.f7321b;
        }

        public C2092b(C2359g gVar) {
            this.f7320a = gVar;
            this.f7321b = false;
        }

        /* renamed from: a */
        public C2090a newDrawable() {
            return new C2090a(new C2092b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }

    private C2090a(C2092b bVar) {
        this.f7319d = bVar;
    }

    public C2090a(C2366k kVar) {
        this(new C2092b(new C2359g(kVar)));
    }

    /* renamed from: a */
    public C2090a mutate() {
        this.f7319d = new C2092b(this.f7319d);
        return this;
    }

    public void draw(Canvas canvas) {
        C2092b bVar = this.f7319d;
        if (bVar.f7321b) {
            bVar.f7320a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f7319d;
    }

    public int getOpacity() {
        return this.f7319d.f7320a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7319d.f7320a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f7319d.f7320a.setState(iArr)) {
            onStateChange = true;
        }
        boolean c = C2093b.m9619c(iArr);
        C2092b bVar = this.f7319d;
        if (bVar.f7321b == c) {
            return onStateChange;
        }
        bVar.f7321b = c;
        return true;
    }

    public void setAlpha(int i) {
        this.f7319d.f7320a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7319d.f7320a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C2366k kVar) {
        this.f7319d.f7320a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f7319d.f7320a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f7319d.f7320a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f7319d.f7320a.setTintMode(mode);
    }
}
