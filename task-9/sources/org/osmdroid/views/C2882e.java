package org.osmdroid.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Set;
import p015b5.C1266a;
import p015b5.C1268b;
import p015b5.C1269c;
import p117r4.C3090a;
import p117r4.C3091b;

/* renamed from: org.osmdroid.views.e */
public class C2882e {

    /* renamed from: a */
    private C2875d f9530a;

    /* renamed from: b */
    private C1269c f9531b;

    /* renamed from: c */
    private C1266a f9532c;

    /* renamed from: d */
    private C1266a f9533d;

    /* renamed from: e */
    private Drawable f9534e;

    /* renamed from: f */
    private final Set<C1268b> f9535f = new HashSet();

    public C2882e(C2875d dVar) {
        this.f9530a = dVar;
    }

    /* renamed from: a */
    public void mo9982a(C1268b bVar) {
        this.f9535f.add(bVar);
    }

    /* renamed from: b */
    public Drawable mo9983b() {
        C2875d dVar;
        Context context;
        if (!(this.f9534e != null || (dVar = this.f9530a) == null || (context = dVar.getContext()) == null)) {
            this.f9534e = context.getResources().getDrawable(C3090a.f10015a);
        }
        return this.f9534e;
    }

    /* renamed from: c */
    public C1269c mo9984c() {
        if (this.f9531b == null) {
            this.f9531b = new C1269c(C3091b.bonuspack_bubble, this.f9530a);
        }
        return this.f9531b;
    }

    /* renamed from: d */
    public C1266a mo9985d() {
        if (this.f9532c == null) {
            this.f9532c = new C1266a(C3091b.bonuspack_bubble, this.f9530a);
        }
        return this.f9532c;
    }

    /* renamed from: e */
    public void mo9986e() {
        synchronized (this.f9535f) {
            for (C1268b f : this.f9535f) {
                f.mo5104f();
            }
            this.f9535f.clear();
        }
        this.f9530a = null;
        this.f9531b = null;
        this.f9532c = null;
        this.f9533d = null;
        this.f9534e = null;
    }
}
