package me.hh.java8to11;

@FunctionalInterface
public interface RunSomething {
    /*
        # 함수형 인터페이스 ( Functional Interface )란?
        추상 메소드가 반드시 1개인 것. (2개 이상 안됨)
        그 외 다른 형태의 메소드들은 있어도 됨.
        SAM (Single Abstract Method ) Interface
        @FunctionalInterface 애노테이션을 가지고 있는 Interface

        # 인터페이스
        abstract 생략 가능.
        Java 8 부터 static 메소드나 public 키워드도 생략이 가능해짐.
        인터페이스 안에 static이나 default 메소드 등 다양하게 정의가 가능해짐.
     */
//    void doIt();
//
//    void doItAgain();
//
//    abstract void doIt();
//
//    static void printName() {
//        System.out.println("Hyeonho");
//    }
//
//    default void printAge() {
//        System.out.println("29");
//    }

    int doIt(int number);
}
