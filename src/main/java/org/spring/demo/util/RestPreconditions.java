package org.spring.demo.util;

import org.spring.demo.exception.MyResourceNotFoundException;

public class RestPreconditions {

    public static <T> T checkFound(T resource) {
        if (resource == null) {
            throw new MyResourceNotFoundException();
        }
        return resource;
    }

    public static void checkNotNull(Object resource) {
        if (resource == null) {
            throw new MyResourceNotFoundException();
        }
    }
}
