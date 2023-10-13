package p083m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: m0.a */
class C2496a {
    /* renamed from: a */
    static void m11496a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    static void m11497b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    static void m11498c(Animator animator) {
        animator.resume();
    }
}
