package com.Vitaliy.task3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class ListSafe<E> extends ArrayList implements List{
    private static final Semaphore semaphore = new Semaphore(1);

    @Override
    public boolean add(Object o) {
        try {
            semaphore.acquire();
            boolean bool = super.add(o);
            semaphore.release();
            return bool;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return false;
    }

    @Override
    public boolean remove(Object o) {
        try {
            semaphore.acquire();
            boolean bool = super.remove(o);
            semaphore.release();
            return bool;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        try {
            semaphore.acquire();
            boolean bool = super.addAll(c);
            semaphore.release();
            return bool;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        try {
            semaphore.acquire();
            boolean bool = super.addAll(index, c);
            semaphore.release();
            return bool;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return false;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            super.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Object get(int index) {
        try {
            semaphore.acquire();
            Object o = super.get(index);
            semaphore.release();
            return o;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return null;
    }

    @Override
    public Object set(int index, Object element) {
        try {
            semaphore.acquire();
            Object o = super.set(index, element);
            semaphore.release();
            return o;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return null;
    }

    @Override
    public void add(int index, Object element) {
        try {
            semaphore.acquire();
            super.add(index, element);
            semaphore.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Object remove(int index) {
        try {
            semaphore.acquire();
            Object o = super.remove(index);
            semaphore.release();
            return o;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        try {
            semaphore.acquire();
            boolean bool = super.retainAll(c);
            semaphore.release();
            return bool;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        try {
            semaphore.acquire();
            boolean bool = super.removeAll(c);
            semaphore.release();
            return bool;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return false;
    }
}
