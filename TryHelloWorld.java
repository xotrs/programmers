import java.util.Arrays;

class TryHelloWorld {

    public int[] gcdlcm(int a, int b) {
        int[] resultArray = {0, 0};

        int bigger = (a > b)? a: b;

        for(int i = bigger; i > 0; i--){
            if (a % i == 0 && b % i == 0) {
                 resultArray[0] = i;
                 break;
            }
        }

        while(true){
            if (bigger % a == 0 && bigger % b == 0) {
                resultArray[1] = bigger;
                break;
            }
            bigger ++;
        }

        return resultArray;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
