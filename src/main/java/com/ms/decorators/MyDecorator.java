package com.ms.decorators;

interface MyInterface {
    void myMethod();
}

@Decorator
class MyDecorator implements MyInterface {
    private MyInterface objetoDecorado;

    public MyDecorator(MyInterface objetoDecorado) {
        this.objetoDecorado = objetoDecorado;
    }

    @Override
    public void myMethod() {
        // + adiciona funcionalidade extra aqui
        objetoDecorado.myMethod();
    }
}

@Decorated
class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        // implementação do método aqui
    }
}
