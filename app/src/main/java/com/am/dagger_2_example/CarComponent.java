package com.am.dagger_2_example;

import dagger.Component;

/**
 * Directed Acyclic Graph (DAG_ger)
 * Directed means one direction
 * Acyclic means it does not have cycles, no Class have an instance of it self
 */
@Component
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
