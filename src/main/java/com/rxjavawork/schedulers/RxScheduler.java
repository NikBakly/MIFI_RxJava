package com.rxjavawork.schedulers;

/**
 * Интерфейс планировщика задач.
 */
public interface RxScheduler {
    /**
     * Запланировать выполнение задачи.
     *
     * @param task Runnable-задание
     */
    void schedule(Runnable task);
}

