public class Solution2 {
    public static void main(String[] args) {
        // 자료형 다루기
        // 정수 자료형
        int i = 10; // i라는 변수는 int라는 자료형을 담을 수 있고, 그 i라는 변수에 10을 넣어주겠다.
        // int i2 = 9999999999; // int 타입은 일정 이상의 큰 숫자를 담을 수가 없음
        long i2 = 9999999999L; // 뒤에 L이 붙으면 Long 타입
        System.out.println(i2); // Shift + F10
        // 실수 자료형 (소숫점을 표함한)
        float f = 1.5f; // 상대적으로 짧은 소수점 표시
        float f2 = 1.5555555555f; // 일정 이상의 소수점 표현 X (끊어서 저장됨)
        System.out.println(f);
        System.out.println(f2);
        double d = 1.555555555; // 상대적으로 긴 소수점 표시 (default)
        System.out.println(d);
        // 타입별로 특징이 다 다름 -> Python처럼 몇 가지의 타입을 돌려쓰는 느낌 X

        // 사칙연산
        System.out.println("[사칙연산]");
        int n1 = 10;
        int n2 = 15;
        int n3 = n1 + n2;
        System.out.println(n3); // 25
        int n4 = n1 - n2;
        System.out.println(n4); // -5
        int n5 = n1 * n2;
        System.out.println(n5); // 150
        int n6 = n1 / n2;
        System.out.println(n6); // 0
        double f1 = 10;
        f2 = 15;
        double f3 = n1 / n2; // 정수끼리 연산해봤자 정수 기반 연산 (소수점을 계산해주지 못함)
        double f4 = f1 / f2; // 소수점 미만에 정확한 계산이 필요하면... double이나 float
        System.out.println(f3); // 0.0
        System.out.println(f4); // 0.666666666666
        int n7 = n1 % n2;
        System.out.println(n7); // 10
        // 증감연산자
        // 파이썬에서는 ++이나 --가 없다.
        // +=, -=
        // n1 = 10
        System.out.println("[증감 연산]");
        int n8 = n1++; // n1 = n1 + 1;
        // 일단 n1을 n8에 대입하고, n1에다가 1을 더해주고 그걸 다시 n1에 대입해주세요.
        // n1++ => n1에다가 1을 더해주고 그걸 다시 대입해주세요.

        System.out.println(n8); // 10
        // n1 = 11
        int n9 = n2--; // n2 = n2 - 1;
        // 일단 n1을 n9에 대입하고, n1에다가 1을 빼주고 그걸 다시 n1에 대입해주세요.
        System.out.println(n9); // 11
        int n10 = ++n1; // n1 = n1 + 1;
        System.out.println(n10); // 11
        int n11 = --n2; // n2 = n2 - 1;
        System.out.println(n11); // 14
        n1 *= 7; // 파이썬 때 했었던 산술 대입연산자들... (// <- 파이썬에서의 몫...)
        // n1 = n1 * 7;
        System.out.println(n1); // 87



    }
}
