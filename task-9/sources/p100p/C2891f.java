package p100p;

import java.util.ArrayList;
import java.util.List;

/* renamed from: p.f */
public class C2891f implements C2889d {

    /* renamed from: a */
    public C2889d f9580a = null;

    /* renamed from: b */
    public boolean f9581b = false;

    /* renamed from: c */
    public boolean f9582c = false;

    /* renamed from: d */
    C2901m f9583d;

    /* renamed from: e */
    C2892a f9584e = C2892a.UNKNOWN;

    /* renamed from: f */
    int f9585f;

    /* renamed from: g */
    public int f9586g;

    /* renamed from: h */
    int f9587h = 1;

    /* renamed from: i */
    C2893g f9588i = null;

    /* renamed from: j */
    public boolean f9589j = false;

    /* renamed from: k */
    List<C2889d> f9590k = new ArrayList();

    /* renamed from: l */
    List<C2891f> f9591l = new ArrayList();

    /* renamed from: p.f$a */
    enum C2892a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C2891f(C2901m mVar) {
        this.f9583d = mVar;
    }

    /* renamed from: a */
    public void mo10031a(C2889d dVar) {
        for (C2891f fVar : this.f9591l) {
            if (!fVar.f9589j) {
                return;
            }
        }
        this.f9582c = true;
        C2889d dVar2 = this.f9580a;
        if (dVar2 != null) {
            dVar2.mo10031a(this);
        }
        if (this.f9581b) {
            this.f9583d.mo10031a(this);
            return;
        }
        C2891f fVar2 = null;
        int i = 0;
        for (C2891f next : this.f9591l) {
            if (!(next instanceof C2893g)) {
                i++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f9589j) {
            C2893g gVar = this.f9588i;
            if (gVar != null) {
                if (gVar.f9589j) {
                    this.f9585f = this.f9587h * gVar.f9586g;
                } else {
                    return;
                }
            }
            mo10049d(fVar2.f9586g + this.f9585f);
        }
        C2889d dVar3 = this.f9580a;
        if (dVar3 != null) {
            dVar3.mo10031a(this);
        }
    }

    /* renamed from: b */
    public void mo10047b(C2889d dVar) {
        this.f9590k.add(dVar);
        if (this.f9589j) {
            dVar.mo10031a(dVar);
        }
    }

    /* renamed from: c */
    public void mo10048c() {
        this.f9591l.clear();
        this.f9590k.clear();
        this.f9589j = false;
        this.f9586g = 0;
        this.f9582c = false;
        this.f9581b = false;
    }

    /* renamed from: d */
    public void mo10049d(int i) {
        if (!this.f9589j) {
            this.f9589j = true;
            this.f9586g = i;
            for (C2889d next : this.f9590k) {
                next.mo10031a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9583d.f9616b.mo9719r());
        sb.append(":");
        sb.append(this.f9584e);
        sb.append("(");
        sb.append(this.f9589j ? Integer.valueOf(this.f9586g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9591l.size());
        sb.append(":d=");
        sb.append(this.f9590k.size());
        sb.append(">");
        return sb.toString();
    }
}
