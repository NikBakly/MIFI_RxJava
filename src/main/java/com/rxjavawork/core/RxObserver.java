package com.rxjavawork.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Интерфейс наблюдателя реактивного потока.
 *
 * @param <T> тип данных в потоке
 */
public interface RxObserver<T> {
    /**
     * Вызывается при поступлении нового элемента.
     *
     * @param item элемент потока
     */
    void onNext(T item);

    /**
     * Вызывается при ошибке в потоке.
     *
     * @param t возникшая ошибка
     */
    void onError(Throwable t);

    /**
     * Вызывается при завершении потока.
     */
    void onComplete();
}

