package org.spring.demo.service;

import org.spring.demo.bean.Foo;

import java.util.List;

public interface IFooService {
    Long create(Foo f);
    List<Foo> findAll();
    Foo findOne(Long id);
    Foo getById(Long id);
    void update(Foo f);
    void deleteById(Long id);
}
