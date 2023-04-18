public class Solution1 {
    public static void main(String[] args) {
        System.out.println("Hello World"); //Python : print
        // 자바는 '//'로 주석을 표시합니다.
        // 2줄 이상의 주석의 경우에는
        /**/
        // 위의 방식으로 2줄 이상의 코드를 표시합니다.

        // 자바는  {}(brace, 중괄호)를 통해서 코드의 블록(실행의 단계)을 정의합니다
        // 파이썬은 indent(들여쓰기) - 탭으로 들여쓰기.

        // 자바는 코드가 끝났다는 것을 ':'(세미콜론)으로 알림.

        // 변수와 자료형
        // age = 10; // 파이썬에서는 문제가 없는 코드

        // 변수의 정의
        int age; // int라는 자료형(타입)을 가지는 age라는 변수의 자리를 만들어주세요 (선언)
        // 변수의 대입
        age = 10; // int라는 자료형을 가지는 age라는 변수에. 10이라는 값을 대입하겠습니다.
        System.out.println(age);
        // 변수의 초기화 (선언 + 대입)
        int age2 = 20;
        System.out.println(age2);

        // java: variable age is already defined in method main(java.lang.String[])
        // 블록({}, brace)에서 한 번 선언된 변수는, 재선언할 수 없음
        // int age;
        age = 15; // 다시 대입
        System.out.println(age);
        // int age = 40; // 다시 대입은 가능한데, 선언과 초기화를 같은 변수명으로 진행하는 건 불가능


    }
}