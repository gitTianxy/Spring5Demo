package org.spring.demo.service.impl;

import org.spring.demo.bean.Foo;
import org.spring.demo.service.IFooService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FooService implements IFooService {

    @Override
    public Long create(Foo f) {
        return null;
    }

    @Override
    public List<Foo> findAll() {
        return null;
    }

    @Override
    public Foo findOne(Long id) {
        Foo foo = new Foo();
        foo.setId(id);
        return foo;
    }

    @Override
    public Foo getById(Long id) {
        Foo foo = new Foo();
        foo.setId(id);
        return foo;
    }

    @Override
    public void update(Foo f) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
