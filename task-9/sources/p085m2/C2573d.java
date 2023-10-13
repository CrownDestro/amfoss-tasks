package p085m2;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p091n2.C2672a;
import p091n2.C2679b;
import p091n2.C2684d;
import p162z1.C3627b;

/* renamed from: m2.d */
public class C2573d {

    /* renamed from: a */
    public final C2672a<Object> f8675a;

    /* renamed from: m2.d$a */
    public interface C2574a {
        /* renamed from: a */
        void mo8224a(boolean z);
    }

    /* renamed from: m2.d$b */
    public static class C2575b {

        /* renamed from: a */
        public final KeyEvent f8676a;

        /* renamed from: b */
        public final Character f8677b;

        public C2575b(KeyEvent keyEvent, Character ch) {
            this.f8676a = keyEvent;
            this.f8677b = ch;
        }
    }

    public C2573d(C2679b bVar) {
        this.f8675a = new C2672a<>(bVar, "flutter/keyevent", C2684d.f8999a);
    }

    /* renamed from: b */
    private static C2672a.C2678e<Object> m11770b(C2574a aVar) {
        return new C2572c(aVar);
    }

    /* renamed from: c */
    private Map<String, Object> m11771c(C2575b bVar, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f8676a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f8676a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f8676a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f8676a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f8676a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f8676a.getMetaState()));
        Character ch = bVar.f8677b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f8676a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f8676a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f8676a.getRepeatCount()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m11772d(C2574a aVar, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                C3627b.m16088b("KeyEventChannel", "Unable to unpack JSON message: " + e);
            }
        }
        aVar.mo8224a(z);
    }

    /* renamed from: e */
    public void mo9269e(C2575b bVar, boolean z, C2574a aVar) {
        this.f8675a.mo9420d(m11771c(bVar, z), m11770b(aVar));
    }
}
