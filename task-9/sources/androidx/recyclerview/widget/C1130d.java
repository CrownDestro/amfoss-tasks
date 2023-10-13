package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C0735z;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.d */
class C1130d extends RecyclerView.C1083n implements RecyclerView.C1092s {

    /* renamed from: D */
    private static final int[] f3961D = {16842919};

    /* renamed from: E */
    private static final int[] f3962E = new int[0];

    /* renamed from: A */
    int f3963A;

    /* renamed from: B */
    private final Runnable f3964B;

    /* renamed from: C */
    private final RecyclerView.C1093t f3965C;

    /* renamed from: a */
    private final int f3966a;

    /* renamed from: b */
    private final int f3967b;

    /* renamed from: c */
    final StateListDrawable f3968c;

    /* renamed from: d */
    final Drawable f3969d;

    /* renamed from: e */
    private final int f3970e;

    /* renamed from: f */
    private final int f3971f;

    /* renamed from: g */
    private final StateListDrawable f3972g;

    /* renamed from: h */
    private final Drawable f3973h;

    /* renamed from: i */
    private final int f3974i;

    /* renamed from: j */
    private final int f3975j;

    /* renamed from: k */
    int f3976k;

    /* renamed from: l */
    int f3977l;

    /* renamed from: m */
    float f3978m;

    /* renamed from: n */
    int f3979n;

    /* renamed from: o */
    int f3980o;

    /* renamed from: p */
    float f3981p;

    /* renamed from: q */
    private int f3982q = 0;

    /* renamed from: r */
    private int f3983r = 0;

    /* renamed from: s */
    private RecyclerView f3984s;

    /* renamed from: t */
    private boolean f3985t = false;

    /* renamed from: u */
    private boolean f3986u = false;

    /* renamed from: v */
    private int f3987v = 0;

    /* renamed from: w */
    private int f3988w = 0;

    /* renamed from: x */
    private final int[] f3989x = new int[2];

    /* renamed from: y */
    private final int[] f3990y = new int[2];

    /* renamed from: z */
    final ValueAnimator f3991z;

    /* renamed from: androidx.recyclerview.widget.d$a */
    class C1131a implements Runnable {
        C1131a() {
        }

        public void run() {
            C1130d.this.mo4665q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    class C1132b extends RecyclerView.C1093t {
        C1132b() {
        }

        /* renamed from: b */
        public void mo4440b(RecyclerView recyclerView, int i, int i2) {
            C1130d.this.mo4663B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private class C1133c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3994a = false;

        C1133c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3994a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3994a) {
                this.f3994a = false;
            } else if (((Float) C1130d.this.f3991z.getAnimatedValue()).floatValue() == 0.0f) {
                C1130d dVar = C1130d.this;
                dVar.f3963A = 0;
                dVar.mo4669y(0);
            } else {
                C1130d dVar2 = C1130d.this;
                dVar2.f3963A = 2;
                dVar2.mo4668v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    private class C1134d implements ValueAnimator.AnimatorUpdateListener {
        C1134d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1130d.this.f3968c.setAlpha(floatValue);
            C1130d.this.f3969d.setAlpha(floatValue);
            C1130d.this.mo4668v();
        }
    }

    C1130d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3991z = ofFloat;
        this.f3963A = 0;
        this.f3964B = new C1131a();
        this.f3965C = new C1132b();
        this.f3968c = stateListDrawable;
        this.f3969d = drawable;
        this.f3972g = stateListDrawable2;
        this.f3973h = drawable2;
        this.f3970e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3971f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3974i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3975j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3966a = i2;
        this.f3967b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1133c());
        ofFloat.addUpdateListener(new C1134d());
        mo4664j(recyclerView);
    }

    /* renamed from: C */
    private void m5555C(float f) {
        int[] p = m5561p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f3977l) - max) >= 2.0f) {
            int x = m5565x(this.f3978m, max, p, this.f3984s.computeVerticalScrollRange(), this.f3984s.computeVerticalScrollOffset(), this.f3983r);
            if (x != 0) {
                this.f3984s.scrollBy(0, x);
            }
            this.f3978m = max;
        }
    }

    /* renamed from: k */
    private void m5556k() {
        this.f3984s.removeCallbacks(this.f3964B);
    }

    /* renamed from: l */
    private void m5557l() {
        this.f3984s.mo4055V0(this);
        this.f3984s.mo4056W0(this);
        this.f3984s.mo4058X0(this.f3965C);
        m5556k();
    }

    /* renamed from: m */
    private void m5558m(Canvas canvas) {
        int i = this.f3983r;
        int i2 = this.f3974i;
        int i3 = i - i2;
        int i4 = this.f3980o;
        int i5 = this.f3979n;
        int i6 = i4 - (i5 / 2);
        this.f3972g.setBounds(0, 0, i5, i2);
        this.f3973h.setBounds(0, 0, this.f3982q, this.f3975j);
        canvas.translate(0.0f, (float) i3);
        this.f3973h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3972g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m5559n(Canvas canvas) {
        int i = this.f3982q;
        int i2 = this.f3970e;
        int i3 = i - i2;
        int i4 = this.f3977l;
        int i5 = this.f3976k;
        int i6 = i4 - (i5 / 2);
        this.f3968c.setBounds(0, 0, i2, i5);
        this.f3969d.setBounds(0, 0, this.f3971f, this.f3983r);
        if (m5563s()) {
            this.f3969d.draw(canvas);
            canvas.translate((float) this.f3970e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3968c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f3970e;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f3969d.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f3968c.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m5560o() {
        int[] iArr = this.f3990y;
        int i = this.f3967b;
        iArr[0] = i;
        iArr[1] = this.f3982q - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m5561p() {
        int[] iArr = this.f3989x;
        int i = this.f3967b;
        iArr[0] = i;
        iArr[1] = this.f3983r - i;
        return iArr;
    }

    /* renamed from: r */
    private void m5562r(float f) {
        int[] o = m5560o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f3980o) - max) >= 2.0f) {
            int x = m5565x(this.f3981p, max, o, this.f3984s.computeHorizontalScrollRange(), this.f3984s.computeHorizontalScrollOffset(), this.f3982q);
            if (x != 0) {
                this.f3984s.scrollBy(x, 0);
            }
            this.f3981p = max;
        }
    }

    /* renamed from: s */
    private boolean m5563s() {
        return C0735z.m3160E(this.f3984s) == 1;
    }

    /* renamed from: w */
    private void m5564w(int i) {
        m5556k();
        this.f3984s.postDelayed(this.f3964B, (long) i);
    }

    /* renamed from: x */
    private int m5565x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m5566z() {
        this.f3984s.mo4110h(this);
        this.f3984s.mo4116j(this);
        this.f3984s.mo4119k(this.f3965C);
    }

    /* renamed from: A */
    public void mo4662A() {
        int i = this.f3963A;
        if (i != 0) {
            if (i == 3) {
                this.f3991z.cancel();
            } else {
                return;
            }
        }
        this.f3963A = 1;
        ValueAnimator valueAnimator = this.f3991z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3991z.setDuration(500);
        this.f3991z.setStartDelay(0);
        this.f3991z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4663B(int i, int i2) {
        int computeVerticalScrollRange = this.f3984s.computeVerticalScrollRange();
        int i3 = this.f3983r;
        this.f3985t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3966a;
        int computeHorizontalScrollRange = this.f3984s.computeHorizontalScrollRange();
        int i4 = this.f3982q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3966a;
        this.f3986u = z;
        boolean z2 = this.f3985t;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f3977l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3976k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3986u) {
                float f2 = (float) i4;
                this.f3980o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3979n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3987v;
            if (i5 == 0 || i5 == 1) {
                mo4669y(1);
            }
        } else if (this.f3987v != 0) {
            mo4669y(0);
        }
    }

    /* renamed from: a */
    public boolean mo4436a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3987v;
        if (i != 1) {
            return i == 2;
        }
        boolean u = mo4667u(motionEvent.getX(), motionEvent.getY());
        boolean t = mo4666t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!u && !t) {
            return false;
        }
        if (t) {
            this.f3988w = 1;
            this.f3981p = (float) ((int) motionEvent.getX());
        } else if (u) {
            this.f3988w = 2;
            this.f3978m = (float) ((int) motionEvent.getY());
        }
        mo4669y(2);
    }

    /* renamed from: b */
    public void mo4437b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3987v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo4667u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo4666t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f3988w = 1;
                        this.f3981p = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f3988w = 2;
                        this.f3978m = (float) ((int) motionEvent.getY());
                    }
                    mo4669y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3987v == 2) {
                this.f3978m = 0.0f;
                this.f3981p = 0.0f;
                mo4669y(1);
                this.f3988w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3987v == 2) {
                mo4662A();
                if (this.f3988w == 1) {
                    m5562r(motionEvent.getX());
                }
                if (this.f3988w == 2) {
                    m5555C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4438c(boolean z) {
    }

    /* renamed from: i */
    public void mo4327i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1064a0 a0Var) {
        if (this.f3982q != this.f3984s.getWidth() || this.f3983r != this.f3984s.getHeight()) {
            this.f3982q = this.f3984s.getWidth();
            this.f3983r = this.f3984s.getHeight();
            mo4669y(0);
        } else if (this.f3963A != 0) {
            if (this.f3985t) {
                m5559n(canvas);
            }
            if (this.f3986u) {
                m5558m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo4664j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3984s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5557l();
            }
            this.f3984s = recyclerView;
            if (recyclerView != null) {
                m5566z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4665q(int i) {
        int i2 = this.f3963A;
        if (i2 == 1) {
            this.f3991z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3963A = 3;
        ValueAnimator valueAnimator = this.f3991z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3991z.setDuration((long) i);
        this.f3991z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo4666t(float f, float f2) {
        if (f2 >= ((float) (this.f3983r - this.f3974i))) {
            int i = this.f3980o;
            int i2 = this.f3979n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo4667u(float f, float f2) {
        if (!m5563s() ? f >= ((float) (this.f3982q - this.f3970e)) : f <= ((float) (this.f3970e / 2))) {
            int i = this.f3977l;
            int i2 = this.f3976k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4668v() {
        this.f3984s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4669y(int i) {
        int i2;
        if (i == 2 && this.f3987v != 2) {
            this.f3968c.setState(f3961D);
            m5556k();
        }
        if (i == 0) {
            mo4668v();
        } else {
            mo4662A();
        }
        if (this.f3987v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f3987v = i;
        }
        this.f3968c.setState(f3962E);
        i2 = 1200;
        m5564w(i2);
        this.f3987v = i;
    }
}
