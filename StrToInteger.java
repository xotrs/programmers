/**
 * Created by rok on 2018. 3. 18..
 */
public class StrToInteger {
    public int getStrToInt(String str) {
        return Integer.parseInt(str);
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInteger strToInt = new StrToInteger();
        System.out.println(strToInt.getStrToInt("1234"));
    }
}

