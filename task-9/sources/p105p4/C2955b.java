package p105p4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p141v4.C3430e;

/* renamed from: p4.b */
public class C2955b implements C2956c {

    /* renamed from: A */
    protected long f9707A = 300000;

    /* renamed from: B */
    protected int f9708B = 20;

    /* renamed from: C */
    protected long f9709C = 500;

    /* renamed from: D */
    protected boolean f9710D = true;

    /* renamed from: E */
    private String f9711E;

    /* renamed from: a */
    protected long f9712a = 20000;

    /* renamed from: b */
    protected boolean f9713b = false;

    /* renamed from: c */
    protected boolean f9714c = false;

    /* renamed from: d */
    protected boolean f9715d = false;

    /* renamed from: e */
    protected boolean f9716e = false;

    /* renamed from: f */
    protected boolean f9717f = true;

    /* renamed from: g */
    protected String f9718g = "osmdroid";

    /* renamed from: h */
    protected String f9719h = "User-Agent";

    /* renamed from: i */
    private final Map<String, String> f9720i = new HashMap();

    /* renamed from: j */
    protected short f9721j = 9;

    /* renamed from: k */
    protected short f9722k = 2;

    /* renamed from: l */
    protected short f9723l = 8;

    /* renamed from: m */
    protected short f9724m = 40;

    /* renamed from: n */
    protected short f9725n = 40;

    /* renamed from: o */
    protected long f9726o = 629145600;

    /* renamed from: p */
    protected long f9727p = 524288000;

    /* renamed from: q */
    protected SimpleDateFormat f9728q = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    /* renamed from: r */
    protected File f9729r;

    /* renamed from: s */
    protected File f9730s;

    /* renamed from: t */
    protected long f9731t = 0;

    /* renamed from: u */
    protected Long f9732u = null;

    /* renamed from: v */
    protected Proxy f9733v = null;

    /* renamed from: w */
    protected int f9734w = 1000;

    /* renamed from: x */
    protected int f9735x = 500;

    /* renamed from: y */
    protected boolean f9736y = true;

    /* renamed from: z */
    protected short f9737z = 0;

    /* renamed from: H */
    private static void m13329H(SharedPreferences.Editor editor) {
        editor.apply();
    }

    /* renamed from: I */
    private String m13330I(Context context) {
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        try {
            int i = context.getPackageManager().getPackageInfo(packageName, 128).versionCode;
            return packageName + "/" + i;
        } catch (PackageManager.NameNotFoundException unused) {
            return packageName;
        }
    }

    /* renamed from: K */
    private static void m13331K(SharedPreferences sharedPreferences, Map<String, String> map, String str) {
        if (str != null && map != null) {
            map.clear();
            for (String next : sharedPreferences.getAll().keySet()) {
                if (next != null && next.startsWith(str)) {
                    map.put(next.substring(str.length()), sharedPreferences.getString(next, (String) null));
                }
            }
        }
    }

    /* renamed from: M */
    private static void m13332M(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, Map<String, String> map, String str) {
        for (String next : sharedPreferences.getAll().keySet()) {
            if (next.startsWith(str)) {
                editor.remove(next);
            }
        }
        for (Map.Entry next2 : map.entrySet()) {
            editor.putString(str + ((String) next2.getKey()), (String) next2.getValue());
        }
    }

    /* renamed from: A */
    public boolean mo10137A() {
        return this.f9716e;
    }

    /* renamed from: B */
    public int mo10138B() {
        return this.f9735x;
    }

    /* renamed from: C */
    public File mo10139C() {
        return mo10142F((Context) null);
    }

    /* renamed from: D */
    public String mo10140D() {
        return this.f9718g;
    }

    /* renamed from: E */
    public boolean mo10141E() {
        return this.f9717f;
    }

    /* renamed from: F */
    public File mo10142F(Context context) {
        if (this.f9730s == null) {
            this.f9730s = new File(mo10144J(context), "tiles");
        }
        try {
            this.f9730s.mkdirs();
        } catch (Exception e) {
            Log.d("OsmDroid", "Unable to create tile cache path at " + this.f9730s, e);
        }
        return this.f9730s;
    }

    /* renamed from: G */
    public long mo10143G() {
        return this.f9727p;
    }

    /* renamed from: J */
    public File mo10144J(Context context) {
        try {
            if (this.f9729r == null) {
                C3430e.C3431a b = C3430e.m15117b(context);
                if (b != null) {
                    File file = new File(b.f11258a, "osmdroid");
                    this.f9729r = file;
                    file.mkdirs();
                } else if (!new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "osmdroid").mkdirs()) {
                    Log.e("OsmDroid", "Directory not created");
                }
            }
        } catch (Exception e) {
            Log.d("OsmDroid", "Unable to create base path at " + this.f9729r, e);
        }
        return this.f9729r;
    }

    /* renamed from: L */
    public void mo10145L(Context context, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("osmdroid.basePath", mo10191y().getAbsolutePath());
        edit.putString("osmdroid.cachePath", mo10139C().getAbsolutePath());
        edit.putBoolean("osmdroid.DebugMode", mo10181o());
        edit.putBoolean("osmdroid.DebugDownloading", mo10137A());
        edit.putBoolean("osmdroid.DebugMapView", mo10188v());
        edit.putBoolean("osmdroid.DebugTileProvider", mo10165d());
        edit.putBoolean("osmdroid.HardwareAcceleration", mo10141E());
        edit.putBoolean("osmdroid.TileDownloaderFollowRedirects", mo10185s());
        edit.putString("osmdroid.userAgentValue", mo10140D());
        m13332M(sharedPreferences, edit, this.f9720i, "osmdroid.additionalHttpRequestProperty.");
        edit.putLong("osmdroid.gpsWaitTime", this.f9712a);
        edit.putInt("osmdroid.cacheMapTileCount", this.f9721j);
        edit.putInt("osmdroid.tileDownloadThreads", this.f9722k);
        edit.putInt("osmdroid.tileFileSystemThreads", this.f9723l);
        edit.putInt("osmdroid.tileDownloadMaxQueueSize", this.f9724m);
        edit.putInt("osmdroid.tileFileSystemMaxQueueSize", this.f9725n);
        edit.putLong("osmdroid.ExpirationExtendedDuration", this.f9731t);
        Long l = this.f9732u;
        if (l != null) {
            edit.putLong("osmdroid.ExpirationOverride", l.longValue());
        }
        edit.putInt("osmdroid.ZoomSpeedDefault", this.f9734w);
        edit.putInt("osmdroid.animationSpeedShort", this.f9735x);
        edit.putBoolean("osmdroid.mapViewRecycler", this.f9736y);
        edit.putInt("osmdroid.cacheTileOvershoot", this.f9737z);
        m13329H(edit);
    }

    /* renamed from: N */
    public void mo10146N(int i) {
        this.f9734w = i;
    }

    /* renamed from: O */
    public void mo10147O(int i) {
        this.f9735x = i;
    }

    /* renamed from: P */
    public void mo10148P(short s) {
        this.f9737z = s;
    }

    /* renamed from: Q */
    public void mo10149Q(boolean z) {
        this.f9716e = z;
    }

    /* renamed from: R */
    public void mo10150R(boolean z) {
        this.f9714c = z;
    }

    /* renamed from: S */
    public void mo10151S(boolean z) {
        this.f9713b = z;
    }

    /* renamed from: T */
    public void mo10152T(boolean z) {
        this.f9715d = z;
    }

    /* renamed from: U */
    public void mo10153U(long j) {
        if (j < 0) {
            this.f9731t = 0;
        } else {
            this.f9731t = j;
        }
    }

    /* renamed from: V */
    public void mo10154V(long j) {
        this.f9712a = j;
    }

    /* renamed from: W */
    public void mo10155W(boolean z) {
        this.f9710D = z;
    }

    /* renamed from: X */
    public void mo10156X(boolean z) {
        this.f9717f = z;
    }

    /* renamed from: Y */
    public void mo10157Y(boolean z) {
        this.f9736y = z;
    }

    /* renamed from: Z */
    public void mo10158Z(File file) {
        this.f9729r = file;
    }

    /* renamed from: a */
    public long mo10159a() {
        return this.f9709C;
    }

    /* renamed from: a0 */
    public void mo10160a0(File file) {
        this.f9730s = file;
    }

    /* renamed from: b */
    public long mo10161b() {
        return this.f9726o;
    }

    /* renamed from: b0 */
    public void mo10162b0(short s) {
        this.f9724m = s;
    }

    /* renamed from: c */
    public int mo10163c() {
        return this.f9708B;
    }

    /* renamed from: c0 */
    public void mo10164c0(short s) {
        this.f9722k = s;
    }

    /* renamed from: d */
    public boolean mo10165d() {
        return this.f9715d;
    }

    /* renamed from: d0 */
    public void mo10166d0(long j) {
        this.f9726o = j;
    }

    /* renamed from: e */
    public short mo10167e() {
        return this.f9721j;
    }

    /* renamed from: e0 */
    public void mo10168e0(long j) {
        this.f9727p = j;
    }

    /* renamed from: f */
    public long mo10169f() {
        return this.f9731t;
    }

    /* renamed from: f0 */
    public void mo10170f0(short s) {
        this.f9725n = s;
    }

    /* renamed from: g */
    public short mo10171g() {
        return this.f9723l;
    }

    /* renamed from: g0 */
    public void mo10172g0(short s) {
        this.f9723l = s;
    }

    /* renamed from: h */
    public Long mo10173h() {
        return this.f9732u;
    }

    /* renamed from: h0 */
    public void mo10174h0(String str) {
        this.f9718g = str;
    }

    /* renamed from: i */
    public boolean mo10175i() {
        return this.f9736y;
    }

    /* renamed from: j */
    public short mo10176j() {
        return this.f9722k;
    }

    /* renamed from: k */
    public Map<String, String> mo10177k() {
        return this.f9720i;
    }

    /* renamed from: l */
    public SimpleDateFormat mo10178l() {
        return this.f9728q;
    }

    /* renamed from: m */
    public long mo10179m() {
        return this.f9712a;
    }

    /* renamed from: n */
    public String mo10180n() {
        return this.f9719h;
    }

    /* renamed from: o */
    public boolean mo10181o() {
        return this.f9713b;
    }

    /* renamed from: p */
    public int mo10182p() {
        return this.f9734w;
    }

    /* renamed from: q */
    public short mo10183q() {
        return this.f9724m;
    }

    /* renamed from: r */
    public String mo10184r() {
        return this.f9711E;
    }

    /* renamed from: s */
    public boolean mo10185s() {
        return this.f9710D;
    }

    /* renamed from: t */
    public Proxy mo10186t() {
        return this.f9733v;
    }

    /* renamed from: u */
    public long mo10187u() {
        return this.f9707A;
    }

    /* renamed from: v */
    public boolean mo10188v() {
        return this.f9714c;
    }

    /* renamed from: w */
    public short mo10189w() {
        return this.f9737z;
    }

    /* renamed from: x */
    public void mo10190x(Context context, SharedPreferences sharedPreferences) {
        this.f9711E = m13330I(context);
        if (!sharedPreferences.contains("osmdroid.basePath")) {
            File J = mo10144J(context);
            File F = mo10142F(context);
            if (!J.exists() || !C3430e.m15123h(J)) {
                J = new File(context.getFilesDir(), "osmdroid");
                F = new File(J, "tiles");
                F.mkdirs();
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("osmdroid.basePath", J.getAbsolutePath());
            edit.putString("osmdroid.cachePath", F.getAbsolutePath());
            m13329H(edit);
            mo10158Z(J);
            mo10160a0(F);
            mo10174h0(context.getPackageName());
            mo10145L(context, sharedPreferences);
        } else {
            mo10158Z(new File(sharedPreferences.getString("osmdroid.basePath", mo10144J(context).getAbsolutePath())));
            mo10160a0(new File(sharedPreferences.getString("osmdroid.cachePath", mo10142F(context).getAbsolutePath())));
            mo10151S(sharedPreferences.getBoolean("osmdroid.DebugMode", this.f9713b));
            mo10149Q(sharedPreferences.getBoolean("osmdroid.DebugDownloading", this.f9716e));
            mo10150R(sharedPreferences.getBoolean("osmdroid.DebugMapView", this.f9714c));
            mo10152T(sharedPreferences.getBoolean("osmdroid.DebugTileProvider", this.f9715d));
            mo10156X(sharedPreferences.getBoolean("osmdroid.HardwareAcceleration", this.f9717f));
            mo10174h0(sharedPreferences.getString("osmdroid.userAgentValue", context.getPackageName()));
            m13331K(sharedPreferences, this.f9720i, "osmdroid.additionalHttpRequestProperty.");
            mo10154V(sharedPreferences.getLong("osmdroid.gpsWaitTime", this.f9712a));
            mo10164c0((short) sharedPreferences.getInt("osmdroid.tileDownloadThreads", this.f9722k));
            mo10172g0((short) sharedPreferences.getInt("osmdroid.tileFileSystemThreads", this.f9723l));
            mo10162b0((short) sharedPreferences.getInt("osmdroid.tileDownloadMaxQueueSize", this.f9724m));
            mo10170f0((short) sharedPreferences.getInt("osmdroid.tileFileSystemMaxQueueSize", this.f9725n));
            mo10153U(sharedPreferences.getLong("osmdroid.ExpirationExtendedDuration", this.f9731t));
            mo10157Y(sharedPreferences.getBoolean("osmdroid.mapViewRecycler", this.f9736y));
            mo10146N(sharedPreferences.getInt("osmdroid.ZoomSpeedDefault", this.f9734w));
            mo10147O(sharedPreferences.getInt("osmdroid.animationSpeedShort", this.f9735x));
            mo10148P((short) sharedPreferences.getInt("osmdroid.cacheTileOvershoot", this.f9737z));
            mo10155W(sharedPreferences.getBoolean("osmdroid.TileDownloaderFollowRedirects", this.f9710D));
            if (sharedPreferences.contains("osmdroid.ExpirationOverride")) {
                Long valueOf = Long.valueOf(sharedPreferences.getLong("osmdroid.ExpirationOverride", -1));
                this.f9732u = valueOf;
                if (valueOf != null && valueOf.longValue() == -1) {
                    this.f9732u = null;
                }
            }
        }
        long j = 0;
        File file = new File(mo10139C().getAbsolutePath() + File.separator + "cache.db");
        if (file.exists()) {
            j = file.length();
        }
        long freeSpace = mo10139C().getFreeSpace() + j;
        if (mo10161b() > freeSpace) {
            double d = (double) freeSpace;
            Double.isNaN(d);
            mo10166d0((long) (0.95d * d));
            Double.isNaN(d);
            mo10168e0((long) (d * 0.9d));
        }
    }

    /* renamed from: y */
    public File mo10191y() {
        return mo10144J((Context) null);
    }

    /* renamed from: z */
    public short mo10192z() {
        return this.f9725n;
    }
}
