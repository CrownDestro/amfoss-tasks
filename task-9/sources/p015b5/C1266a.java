package p015b5;

import android.content.Context;
import android.text.Html;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.osmdroid.views.C2875d;
import p159y4.C3596i;

/* renamed from: b5.a */
public class C1266a extends C1268b {

    /* renamed from: h */
    static int f4318h;

    /* renamed from: i */
    static int f4319i;

    /* renamed from: j */
    static int f4320j;

    /* renamed from: k */
    static int f4321k;

    /* renamed from: b5.a$a */
    class C1267a implements View.OnTouchListener {
        C1267a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                C1266a.this.mo5100a();
            }
            return true;
        }
    }

    public C1266a(int i, C2875d dVar) {
        super(i, dVar);
        if (f4318h == 0) {
            m6135j(dVar.getContext());
        }
        this.f4323a.setOnTouchListener(new C1267a());
    }

    /* renamed from: j */
    private static void m6135j(Context context) {
        String packageName = context.getPackageName();
        f4318h = context.getResources().getIdentifier("id/bubble_title", (String) null, packageName);
        f4319i = context.getResources().getIdentifier("id/bubble_description", (String) null, packageName);
        f4320j = context.getResources().getIdentifier("id/bubble_subdescription", (String) null, packageName);
        int identifier = context.getResources().getIdentifier("id/bubble_image", (String) null, packageName);
        f4321k = identifier;
        if (f4318h == 0 || f4319i == 0 || f4320j == 0 || identifier == 0) {
            Log.e("OsmDroid", "BasicInfoWindow: unable to get res ids in " + packageName);
        }
    }

    /* renamed from: e */
    public void mo5097e() {
    }

    /* renamed from: g */
    public void mo5098g(Object obj) {
        int i;
        C3596i iVar = (C3596i) obj;
        String F = iVar.mo11814F();
        if (F == null) {
            F = "";
        }
        View view = this.f4323a;
        if (view == null) {
            Log.w("OsmDroid", "Error trapped, BasicInfoWindow.open, mView is null!");
            return;
        }
        TextView textView = (TextView) view.findViewById(f4318h);
        if (textView != null) {
            textView.setText(F);
        }
        String D = iVar.mo11812D();
        if (D == null) {
            D = "";
        }
        ((TextView) this.f4323a.findViewById(f4319i)).setText(Html.fromHtml(D));
        TextView textView2 = (TextView) this.f4323a.findViewById(f4320j);
        String E = iVar.mo11813E();
        if (E == null || "".equals(E)) {
            i = 8;
        } else {
            textView2.setText(Html.fromHtml(E));
            i = 0;
        }
        textView2.setVisibility(i);
    }
}
