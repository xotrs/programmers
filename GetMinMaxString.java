import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by rok on 2018. 3. 18..
 */
public class GetMinMaxString {

    public String getMinMaxString(String str) {
        String[] splitStringArray;

        splitStringArray = str.split(" ");
        int[] integerArray = Arrays.stream(splitStringArray).mapToInt(Integer::parseInt).toArray();

        int max = IntStream.of(integerArray).max().getAsInt();
        int min = IntStream.of(integerArray).min().getAsInt();

        return min+" "+max;
    }

    public static void main(String[] args) {
        String str = "-1 -2 -3 -4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
