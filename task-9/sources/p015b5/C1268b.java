package p015b5;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.osmdroid.views.C2875d;
import p105p4.C2954a;
import p147w4.C3472f;
import p153x4.C3548a;

/* renamed from: b5.b */
public abstract class C1268b {

    /* renamed from: a */
    protected View f4323a;

    /* renamed from: b */
    protected boolean f4324b = false;

    /* renamed from: c */
    protected C2875d f4325c;

    /* renamed from: d */
    protected Object f4326d;

    /* renamed from: e */
    private C3472f f4327e;

    /* renamed from: f */
    private int f4328f;

    /* renamed from: g */
    private int f4329g;

    public C1268b(int i, C2875d dVar) {
        this.f4325c = dVar;
        dVar.getRepository().mo9982a(this);
        View inflate = ((LayoutInflater) dVar.getContext().getSystemService("layout_inflater")).inflate(i, (ViewGroup) dVar.getParent(), false);
        this.f4323a = inflate;
        inflate.setTag(this);
    }

    public C1268b(View view, C2875d dVar) {
        this.f4325c = dVar;
        this.f4323a = view;
        view.setTag(this);
    }

    /* renamed from: a */
    public void mo5100a() {
        if (this.f4324b) {
            this.f4324b = false;
            ((ViewGroup) this.f4323a.getParent()).removeView(this.f4323a);
            mo5097e();
        }
    }

    /* renamed from: b */
    public void mo5101b() {
        if (this.f4324b) {
            try {
                this.f4325c.updateViewLayout(this.f4323a, new C2875d.C2877b(-2, -2, this.f4327e, 8, this.f4328f, this.f4329g));
            } catch (Exception e) {
                if (C3548a.m15638a()) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: c */
    public Object mo5102c() {
        return this.f4326d;
    }

    /* renamed from: d */
    public boolean mo5103d() {
        return this.f4324b;
    }

    /* renamed from: e */
    public abstract void mo5097e();

    /* renamed from: f */
    public void mo5104f() {
        mo5100a();
        View view = this.f4323a;
        if (view != null) {
            view.setTag((Object) null);
        }
        this.f4323a = null;
        this.f4325c = null;
        if (C2954a.m13328a().mo10181o()) {
            Log.d("OsmDroid", "Marked detached");
        }
    }

    /* renamed from: g */
    public abstract void mo5098g(Object obj);

    /* renamed from: h */
    public void mo5105h(Object obj, C3472f fVar, int i, int i2) {
        View view;
        mo5100a();
        this.f4326d = obj;
        this.f4327e = fVar;
        this.f4328f = i;
        this.f4329g = i2;
        mo5098g(obj);
        C2875d.C2877b bVar = new C2875d.C2877b(-2, -2, this.f4327e, 8, this.f4328f, this.f4329g);
        C2875d dVar = this.f4325c;
        if (dVar == null || (view = this.f4323a) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error trapped, InfoWindow.open mMapView: ");
            String str = "null";
            sb.append(this.f4325c == null ? str : "ok");
            sb.append(" mView: ");
            if (this.f4323a != null) {
                str = "ok";
            }
            sb.append(str);
            Log.w("OsmDroid", sb.toString());
            return;
        }
        dVar.addView(view, bVar);
        this.f4324b = true;
    }

    /* renamed from: i */
    public void mo5106i(Object obj) {
        this.f4326d = obj;
    }
}
