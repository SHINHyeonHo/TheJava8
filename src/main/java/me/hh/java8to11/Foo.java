package me.hh.java8to11;

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
        // pure 한 함수라고 볼 수 없다 / 상태 값을 가지고 있다/ 상태값을 의존한다.
        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10; // 함수의 밖
            @Override
            public int doIt(int number) {
//                baseNumber++; // 익명 내부 클래스에서는 이루어질 수 없는 형태이다.
                return number + baseNumber;
            }
        };
    }

}
