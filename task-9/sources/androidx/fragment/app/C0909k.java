package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.C0732w;
import p010b0.C1249a;
import p010b0.C1250b;

/* renamed from: androidx.fragment.app.k */
class C0909k {

    /* renamed from: androidx.fragment.app.k$a */
    static class C0910a {

        /* renamed from: a */
        public final Animation f3205a;

        /* renamed from: b */
        public final Animator f3206b;

        C0910a(Animator animator) {
            this.f3205a = null;
            this.f3206b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0910a(Animation animation) {
            this.f3205a = animation;
            this.f3206b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    static class C0911b extends AnimationSet implements Runnable {

        /* renamed from: d */
        private final ViewGroup f3207d;

        /* renamed from: e */
        private final View f3208e;

        /* renamed from: f */
        private boolean f3209f;

        /* renamed from: g */
        private boolean f3210g;

        /* renamed from: h */
        private boolean f3211h = true;

        C0911b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3207d = viewGroup;
            this.f3208e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3211h = true;
            if (this.f3209f) {
                return !this.f3210g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3209f = true;
                C0732w.m3149a(this.f3207d, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3211h = true;
            if (this.f3209f) {
                return !this.f3210g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3209f = true;
                C0732w.m3149a(this.f3207d, this);
            }
            return true;
        }

        public void run() {
            if (this.f3209f || !this.f3211h) {
                this.f3207d.endViewTransition(this.f3208e);
                this.f3210g = true;
                return;
            }
            this.f3211h = false;
            this.f3207d.post(this);
        }
    }

    /* renamed from: a */
    private static int m4119a(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.mo3211F() : fragment.mo3213G() : z ? fragment.mo3298r() : fragment.mo3308u();
    }

    /* renamed from: b */
    static C0910a m4120b(Context context, Fragment fragment, boolean z, boolean z2) {
        int B = fragment.mo3203B();
        int a = m4119a(fragment, z, z2);
        boolean z3 = false;
        fragment.mo3294p1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f2947K;
        if (viewGroup != null) {
            int i = C1250b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.f2947K.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.f2947K;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation k0 = fragment.mo3278k0(B, z, a);
        if (k0 != null) {
            return new C0910a(k0);
        }
        Animator l0 = fragment.mo3280l0(B, z, a);
        if (l0 != null) {
            return new C0910a(l0);
        }
        if (a == 0 && B != 0) {
            a = m4122d(context, B, z);
        }
        if (a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a);
                    if (loadAnimation != null) {
                        return new C0910a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a);
                    if (loadAnimator != null) {
                        return new C0910a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a);
                        if (loadAnimation2 != null) {
                            return new C0910a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m4121c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    private static int m4122d(Context context, int i, boolean z) {
        int i2;
        if (i == 4097) {
            return z ? C1249a.fragment_open_enter : C1249a.fragment_open_exit;
        }
        if (i == 8194) {
            return z ? C1249a.fragment_close_enter : C1249a.fragment_close_exit;
        }
        if (i == 8197) {
            i2 = z ? 16842938 : 16842939;
        } else if (i == 4099) {
            return z ? C1249a.fragment_fade_enter : C1249a.fragment_fade_exit;
        } else {
            if (i != 4100) {
                return -1;
            }
            i2 = z ? 16842936 : 16842937;
        }
        return m4121c(context, i2);
    }
}
