package p015b5;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import org.osmdroid.views.C2875d;
import p159y4.C3590f;

/* renamed from: b5.c */
public class C1269c extends C1266a {

    /* renamed from: l */
    protected C3590f f4330l;

    public C1269c(int i, C2875d dVar) {
        super(i, dVar);
    }

    /* renamed from: e */
    public void mo5097e() {
        super.mo5097e();
        this.f4330l = null;
    }

    /* renamed from: g */
    public void mo5098g(Object obj) {
        int i;
        super.mo5098g(obj);
        this.f4330l = (C3590f) obj;
        View view = this.f4323a;
        if (view == null) {
            Log.w("OsmDroid", "Error trapped, MarkerInfoWindow.open, mView is null!");
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(C1266a.f4321k);
        Drawable M = this.f4330l.mo11785M();
        if (M != null) {
            imageView.setImageDrawable(M);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: k */
    public C3590f mo5107k() {
        return this.f4330l;
    }
}
