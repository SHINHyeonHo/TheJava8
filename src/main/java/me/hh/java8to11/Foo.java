package me.hh.java8to11;

public class Foo {

    public static void main(String[] args) {

//        RunSomething runSomething = new RunSomething() {
//        // 익명 내부 클래스 ( anonymous innser class )
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };

//        // Alt + Enter 를 통해 Lambda 변환
//        RunSomething runSomething = () -> System.out.println("Hello");
        RunSomething runSomething = () -> {
            System.out.println("Hello");
            System.out.println("Lambda");
        };

        runSomething.doIt();

    }

}
