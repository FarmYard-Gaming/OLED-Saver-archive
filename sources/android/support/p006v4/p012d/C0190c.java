package android.support.p006v4.p012d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: android.support.v4.d.c */
public class C0190c {

    /* renamed from: a */
    private final Object f613a = new Object();

    /* renamed from: b */
    private HandlerThread f614b;

    /* renamed from: c */
    private Handler f615c;

    /* renamed from: d */
    private int f616d;

    /* renamed from: e */
    private Handler.Callback f617e = new Handler.Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0190c.this.mo781a();
                    break;
                case 1:
                    C0190c.this.mo782a((Runnable) message.obj);
                    break;
            }
            return true;
        }
    };

    /* renamed from: f */
    private final int f618f;

    /* renamed from: g */
    private final int f619g;

    /* renamed from: h */
    private final String f620h;

    /* renamed from: android.support.v4.d.c$a */
    public interface C0195a<T> {
        /* renamed from: a */
        void mo769a(T t);
    }

    public C0190c(String str, int i, int i2) {
        this.f620h = str;
        this.f619g = i;
        this.f618f = i2;
        this.f616d = 0;
    }

    /* renamed from: b */
    private void m829b(Runnable runnable) {
        synchronized (this.f613a) {
            if (this.f614b == null) {
                this.f614b = new HandlerThread(this.f620h, this.f619g);
                this.f614b.start();
                this.f615c = new Handler(this.f614b.getLooper(), this.f617e);
                this.f616d++;
            }
            this.f615c.removeMessages(0);
            this.f615c.sendMessage(this.f615c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> T mo780a(Callable<T> callable, int i) {
        T t;
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final Callable<T> callable2 = callable;
        m829b(new Runnable() {
            public void run() {
                try {
                    atomicReference.set(callable2.call());
                } catch (Exception e) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                t = atomicReference.get();
            } else {
                long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                do {
                    try {
                        nanos = newCondition.awaitNanos(nanos);
                    } catch (InterruptedException e) {
                    }
                    if (!atomicBoolean.get()) {
                        t = atomicReference.get();
                        reentrantLock.unlock();
                    }
                } while (nanos > 0);
                throw new InterruptedException("timeout");
            }
            return t;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo781a() {
        synchronized (this.f613a) {
            if (!this.f615c.hasMessages(1)) {
                this.f614b.quit();
                this.f614b = null;
                this.f615c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo782a(Runnable runnable) {
        runnable.run();
        synchronized (this.f613a) {
            this.f615c.removeMessages(0);
            this.f615c.sendMessageDelayed(this.f615c.obtainMessage(0), (long) this.f618f);
        }
    }

    /* renamed from: a */
    public <T> void mo783a(final Callable<T> callable, final C0195a<T> aVar) {
        final Handler handler = new Handler();
        m829b(new Runnable() {
            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception e) {
                    obj = null;
                }
                handler.post(new Runnable() {
                    public void run() {
                        aVar.mo769a(obj);
                    }
                });
            }
        });
    }
}
