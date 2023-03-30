package android.support.p006v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p006v4.app.C0104e;
import android.support.p006v4.media.MediaMetadataCompat;
import android.support.p006v4.media.session.C0314a;
import android.support.p006v4.media.session.C0317b;
import android.support.p006v4.media.session.C0320c;
import android.support.p006v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 {

        /* renamed from: a */
        final Object f853a;

        /* renamed from: b */
        final MediaSessionCompat.Token f854b;

        /* renamed from: c */
        private final List<C0303a> f855c;

        /* renamed from: d */
        private HashMap<C0303a, C0302a> f856d;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f857a;

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f857a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f853a) {
                        mediaControllerImplApi21.f854b.mo1276a(C0317b.C0318a.m1423a(C0104e.m351a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f854b.mo1275a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.mo1224a();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0302a extends C0303a.C0306c {
            C0302a(C0303a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public void mo1226a() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1227a(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1228a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1229a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1230a(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1231a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1224a() {
            if (this.f854b.mo1274a() != null) {
                for (C0303a next : this.f855c) {
                    C0302a aVar = new C0302a(next);
                    this.f856d.put(next, aVar);
                    next.f860c = aVar;
                    try {
                        this.f854b.mo1274a().mo1316a((C0314a) aVar);
                        next.mo1234a(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f855c.clear();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0303a implements IBinder.DeathRecipient {

        /* renamed from: a */
        final Object f858a;

        /* renamed from: b */
        C0304a f859b;

        /* renamed from: c */
        C0314a f860c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0304a extends Handler {

            /* renamed from: a */
            boolean f861a;

            /* renamed from: b */
            final /* synthetic */ C0303a f862b;

            public void handleMessage(Message message) {
                if (this.f861a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m1327a(data);
                            this.f862b.mo1240a((String) message.obj, data);
                            return;
                        case 2:
                            this.f862b.mo1238a((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.f862b.mo1236a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.f862b.mo1237a((C0307b) message.obj);
                            return;
                        case 5:
                            this.f862b.mo1241a((List<MediaSessionCompat.QueueItem>) (List) message.obj);
                            return;
                        case 6:
                            this.f862b.mo1239a((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m1327a(bundle);
                            this.f862b.mo1235a(bundle);
                            return;
                        case 8:
                            this.f862b.mo1243b();
                            return;
                        case 9:
                            this.f862b.mo1233a(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            this.f862b.mo1242a(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            this.f862b.mo1244b(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            this.f862b.mo1232a();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0305b implements C0320c.C0321a {

            /* renamed from: a */
            private final WeakReference<C0303a> f863a;

            C0305b(C0303a aVar) {
                this.f863a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo1246a() {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar != null) {
                    aVar.mo1243b();
                }
            }

            /* renamed from: a */
            public void mo1247a(int i, int i2, int i3, int i4, int i5) {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar != null) {
                    aVar.mo1237a(new C0307b(i, i2, i3, i4, i5));
                }
            }

            /* renamed from: a */
            public void mo1248a(Bundle bundle) {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar != null) {
                    aVar.mo1235a(bundle);
                }
            }

            /* renamed from: a */
            public void mo1249a(CharSequence charSequence) {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar != null) {
                    aVar.mo1239a(charSequence);
                }
            }

            /* renamed from: a */
            public void mo1250a(Object obj) {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar != null && aVar.f860c == null) {
                    aVar.mo1238a(PlaybackStateCompat.m1341a(obj));
                }
            }

            /* renamed from: a */
            public void mo1251a(String str, Bundle bundle) {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f860c == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.mo1240a(str, bundle);
                }
            }

            /* renamed from: a */
            public void mo1252a(List<?> list) {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar != null) {
                    aVar.mo1241a(MediaSessionCompat.QueueItem.m1329a(list));
                }
            }

            /* renamed from: b */
            public void mo1253b(Object obj) {
                C0303a aVar = (C0303a) this.f863a.get();
                if (aVar != null) {
                    aVar.mo1236a(MediaMetadataCompat.m1256a(obj));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0306c extends C0314a.C0315a {

            /* renamed from: a */
            private final WeakReference<C0303a> f864a;

            C0306c(C0303a aVar) {
                this.f864a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo1226a() {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1254a(int i) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1227a(Bundle bundle) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1228a(MediaMetadataCompat mediaMetadataCompat) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1229a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(4, parcelableVolumeInfo != null ? new C0307b(parcelableVolumeInfo.f877a, parcelableVolumeInfo.f878b, parcelableVolumeInfo.f879c, parcelableVolumeInfo.f880d, parcelableVolumeInfo.f881e) : null, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1255a(PlaybackStateCompat playbackStateCompat) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1230a(CharSequence charSequence) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1256a(String str, Bundle bundle) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(1, str, bundle);
                }
            }

            /* renamed from: a */
            public void mo1231a(List<MediaSessionCompat.QueueItem> list) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(5, list, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo1257a(boolean z) {
            }

            /* renamed from: b */
            public void mo1258b() {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: b */
            public void mo1259b(int i) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: b */
            public void mo1260b(boolean z) {
                C0303a aVar = (C0303a) this.f864a.get();
                if (aVar != null) {
                    aVar.mo1234a(11, Boolean.valueOf(z), (Bundle) null);
                }
            }
        }

        public C0303a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f858a = C0320c.m1473a(new C0305b(this));
                return;
            }
            C0306c cVar = new C0306c(this);
            this.f860c = cVar;
            this.f858a = cVar;
        }

        /* renamed from: a */
        public void mo1232a() {
        }

        /* renamed from: a */
        public void mo1233a(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1234a(int i, Object obj, Bundle bundle) {
            if (this.f859b != null) {
                Message obtainMessage = this.f859b.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: a */
        public void mo1235a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1236a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo1237a(C0307b bVar) {
        }

        /* renamed from: a */
        public void mo1238a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo1239a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo1240a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1241a(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: a */
        public void mo1242a(boolean z) {
        }

        /* renamed from: b */
        public void mo1243b() {
        }

        /* renamed from: b */
        public void mo1244b(int i) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public static final class C0307b {

        /* renamed from: a */
        private final int f865a;

        /* renamed from: b */
        private final int f866b;

        /* renamed from: c */
        private final int f867c;

        /* renamed from: d */
        private final int f868d;

        /* renamed from: e */
        private final int f869e;

        C0307b(int i, int i2, int i3, int i4, int i5) {
            this.f865a = i;
            this.f866b = i2;
            this.f867c = i3;
            this.f868d = i4;
            this.f869e = i5;
        }
    }
}
