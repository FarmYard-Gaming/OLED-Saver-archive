package android.support.p006v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.r */
class C0151r extends C0156s {
    C0151r() {
    }

    /* renamed from: a */
    private static boolean m696a(Transition transition) {
        return !m715a((List) transition.getTargetIds()) || !m715a((List) transition.getTargetNames()) || !m715a((List) transition.getTargetTypes());
    }

    /* renamed from: a */
    public Object mo654a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    public void mo655a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo656a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo657a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            mo683a(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo658a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m714a((List<View>) targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo660a((Object) transitionSet, arrayList);
    }

    /* renamed from: a */
    public void mo659a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                if (obj5 != null) {
                    C0151r.this.mo667b(obj5, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                if (obj6 != null) {
                    C0151r.this.mo667b(obj6, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                if (obj7 != null) {
                    C0151r.this.mo667b(obj7, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo660a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                for (int i = 0; i < transitionCount; i++) {
                    mo660a((Object) transitionSet.getTransitionAt(i), arrayList);
                }
            } else if (!m696a(transition) && m715a((List) transition.getTargets())) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    transition.addTarget(arrayList.get(i2));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo661a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo667b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public boolean mo662a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo663b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo664b(Object obj, Object obj2, Object obj3) {
        Transition transition = null;
        Transition transition2 = (Transition) obj;
        Transition transition3 = (Transition) obj2;
        Transition transition4 = (Transition) obj3;
        if (transition2 != null && transition3 != null) {
            transition = new TransitionSet().addTransition(transition2).addTransition(transition3).setOrdering(1);
        } else if (transition2 != null) {
            transition = transition2;
        } else if (transition3 != null) {
            transition = transition3;
        }
        if (transition4 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition4);
        return transitionSet;
    }

    /* renamed from: b */
    public void mo665b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo666b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }
        });
    }

    /* renamed from: b */
    public void mo667b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                mo667b((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
            }
        } else if (!m696a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                transition.addTarget(arrayList2.get(i2));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: c */
    public Object mo668c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: c */
    public void mo669c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }
}
