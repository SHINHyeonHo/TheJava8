package me.hh.java8to11;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {

//        runsomething runsomething = new runsomething() {
//        // 익명 내부 클래스 ( anonymous innser class )
//            @override
//            public void doit() {
//                system.out.println("hello");
//            }
//        };

//        // alt + enter 를 통해 lambda 변환
//        runsomething runsomething = () -> system.out.println("hello");
        /*
            lambda expressions : 함수형 인터페이스를 인라인으로 구현한 인터페이스, 오브젝트

            자바에서 함수형 프로그래밍이란.
            함수를 first class object 로 사용할 수 있다.
            순수 합수 (pure function)
                - 사이드 이팩트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
                - 상태가 없다 (함수 밖에 있는 값을 사용하지 않는다.)
            고차 함수 (higher-order function)
                - 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.
            불변성
        */

//        runsomething runsomething = () -> {
//            system.out.println("hello");
//            system.out.println("lambda");
//        };

//        runsomething.doit();

//        RunSomething runSomething = (number) -> {
//          return number + 10;
//        };
//
//        System.out.println(runSomething.doIt(1));
//        System.out.println(runSomething.doIt(1));
//        System.out.println(runSomething.doIt(1));
//
//        System.out.println(runSomething.doIt(2));
//        System.out.println(runSomething.doIt(2));
//        System.out.println(runSomething.doIt(2));

//        RunSomething runSomething = (number) -> number + 10;

//        int baseNumber = 10; // 함수의 밖에 선언한 변수
//        // pure 한 함수라고 볼 수 없다 / 상태 값을 가지고 있다/ 상태값을 의존한다.
//        RunSomething runSomething = new RunSomething() {
//            int baseNumber = 10; // 함수의 밖
//            @Override
//            public int doIt(int number) {
////                baseNumber++; // 익명 내부 클래스에서는 이루어질 수 없는 형태이다.
//                return number + baseNumber;
//            }
//        };

//        // 클래스를 이용하여 구현
//        Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(1));

        // 클래스 없이 구현 (Lambda Expressions 사용)
        // # Function<T, R>
        // apply : 리턴
        // andThen : 조합할 때 사용
        // compose : 조합할 때 사용
        // static <T> Function<T, T> identity() : flxjs
        Function<Integer, Integer> plus10 = (i) -> i + 10;
//        System.out.println(plus10.apply(1)); // 11

        Function<Integer, Integer> multiply2 = (i) -> i * 2;
//        System.out.println(multiply2.apply(1)); // 2

        // 고차함수. 계산한 값을 compose 안의 메소드로 한 번 더. 잇는 역할.
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
//        System.out.println(multiply2AndPlus10.apply(2));

        // andThen 안에 값을 계산하고 앞에 것을.
//        System.out.println(plus10.andThen(multiply2).apply(2));

        // # BiFunction <T, U, R>

        // # Consumer <T>
        Consumer<Integer> printT = (i) -> System.out.println(i);
//        printT.accept(10);

        // # Supplier <T>
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        // # Predicate<T>
        Predicate<String> startsWithHH = (s) -> s.startsWith("HH");
        Predicate<Integer> isEven = (i) -> i%2 == 0;
//        startsWithHH.negate();
//        startsWithHH.and();

        // # UnaryOperator <T> : 입력값과 리턴값이 같은 경우 Function 대신 사용할 수 있음
        UnaryOperator<Integer> Plus20 = (i) -> i + 20;

        // # BinaryOperator <T> : 입력값 3가지가 같은 경우 BiFunction 대신 사용

    }

}
