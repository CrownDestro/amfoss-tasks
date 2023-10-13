package p029d5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p147w4.C3492u;

/* renamed from: d5.a */
public class C1741a implements C1743c, LocationListener {

    /* renamed from: a */
    private LocationManager f6501a;

    /* renamed from: b */
    private Location f6502b;

    /* renamed from: c */
    private C1742b f6503c;

    /* renamed from: d */
    private long f6504d = 0;

    /* renamed from: e */
    private float f6505e = 0.0f;

    /* renamed from: f */
    private C3492u f6506f = new C3492u();

    /* renamed from: g */
    private final Set<String> f6507g;

    public C1741a(Context context) {
        HashSet hashSet = new HashSet();
        this.f6507g = hashSet;
        this.f6501a = (LocationManager) context.getSystemService("location");
        hashSet.add("gps");
        hashSet.add("network");
    }

    /* renamed from: a */
    public void mo7294a() {
        mo7297d();
        this.f6502b = null;
        this.f6501a = null;
        this.f6503c = null;
        this.f6506f = null;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public boolean mo7295b(C1742b bVar) {
        this.f6503c = bVar;
        boolean z = false;
        for (String next : this.f6501a.getProviders(true)) {
            if (this.f6507g.contains(next)) {
                try {
                    this.f6501a.requestLocationUpdates(next, this.f6504d, this.f6505e, this);
                    z = true;
                } catch (Throwable th) {
                    Log.e("OsmDroid", "Unable to attach listener for location provider " + next + " check permissions?", th);
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public Location mo7296c() {
        return this.f6502b;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public void mo7297d() {
        this.f6503c = null;
        LocationManager locationManager = this.f6501a;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this);
            } catch (Throwable th) {
                Log.w("OsmDroid", "Unable to deattach location listener", th);
            }
        }
    }

    public void onLocationChanged(Location location) {
        if (this.f6506f == null) {
            Log.w("OsmDroid", "GpsMyLocation provider, mIgnore is null, unexpected. Location update will be ignored");
        } else if (location != null && location.getProvider() != null && !this.f6506f.mo11479a(location.getProvider(), System.currentTimeMillis())) {
            this.f6502b = location;
            C1742b bVar = this.f6503c;
            if (bVar != null) {
                bVar.mo7302a(location, this);
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
