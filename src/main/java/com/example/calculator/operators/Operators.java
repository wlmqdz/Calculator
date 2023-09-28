package com.example.calculator.operators;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Operators {

    private static final Map<String, Operator> operators = new HashMap<>();

    static {
        Reflections reflections = new Reflections("com");
        Set<Class<? extends Operator>> subTypes = reflections.getSubTypesOf(Operator.class);
        for (Class<? extends Operator> operatorClass : subTypes) {
            try {
                Operator operator = operatorClass.getDeclaredConstructor().newInstance();
                operators.put(operator.code(), operator);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Operator of(String code) {
        return operators.get(code);
    }
}
