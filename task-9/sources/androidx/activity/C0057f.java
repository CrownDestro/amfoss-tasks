package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C0998h0;
import androidx.lifecycle.C1005m;
import androidx.lifecycle.C1006n;
import p041f3.C1924k;

/* renamed from: androidx.activity.f */
public class C0057f extends Dialog implements C1005m, C0062k {

    /* renamed from: d */
    private C1006n f196d;

    /* renamed from: e */
    private final OnBackPressedDispatcher f197e = new OnBackPressedDispatcher(new C0056e(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0057f(Context context, int i) {
        super(context, i);
        C1924k.m9141g(context, "context");
    }

    /* renamed from: c */
    private final C1006n m195c() {
        C1006n nVar = this.f196d;
        if (nVar != null) {
            return nVar;
        }
        C1006n nVar2 = new C1006n(this);
        this.f196d = nVar2;
        return nVar2;
    }

    /* renamed from: d */
    private final void m196d() {
        Window window = getWindow();
        C1924k.m9138d(window);
        C0998h0.m4467a(window.getDecorView(), this);
        Window window2 = getWindow();
        C1924k.m9138d(window2);
        View decorView = window2.getDecorView();
        C1924k.m9140f(decorView, "window!!.decorView");
        C0064m.m208a(decorView, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m197e(C0057f fVar) {
        C1924k.m9141g(fVar, "this$0");
        super.onBackPressed();
    }

    /* renamed from: a */
    public final C0988f mo102a() {
        return m195c();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C1924k.m9141g(view, "view");
        m196d();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: k */
    public final OnBackPressedDispatcher mo110k() {
        return this.f197e;
    }

    public void onBackPressed() {
        this.f197e.mo149f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f197e.mo150g(getOnBackInvokedDispatcher());
        }
        m195c().mo3787i(C0988f.C0989a.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m195c().mo3787i(C0988f.C0989a.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m195c().mo3787i(C0988f.C0989a.ON_DESTROY);
        this.f196d = null;
        super.onStop();
    }

    public void setContentView(int i) {
        m196d();
        super.setContentView(i);
    }

    public void setContentView(View view) {
        C1924k.m9141g(view, "view");
        m196d();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C1924k.m9141g(view, "view");
        m196d();
        super.setContentView(view, layoutParams);
    }
}
