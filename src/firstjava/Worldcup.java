package firstjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("NonAsciiCharaters")
class WorldcupTest {

    @Test
    void 월드컵50년이전() {
        assertFalse(new Worldcup().isWorldcupYear(1962), "1962년");
        assertFalse(new Worldcup().isWorldcupYear(1958), "1958년");
        assertFalse(new Worldcup().isWorldcupYear(1954), "1954년");
        //월드컵 첫회 개최
        assertTrue(new Worldcup().isWorldcupYear(1930), "1930년");
    }

    @Test
    void 월드컵4년주기개최년도() {
        int[] years = {1974, 1994, 2002, 2018, 2022};
        for (int year : years) {
            assertTrue(new Worldcup().isWorldcupYear(year), year + "년도");
        }
    }

    @Test
    void 월드컵4년주기벗어난개최년도() {
        int[] years = {1961, 1971, 1981, 1991, 2001};
        for (int year : years) {
            assertFalse(new Worldcup().isWorldcupYear(year), year + "년도");
        }
    }

    @Test
    void 전쟁또는유행병으로중단된해() {
        int[] years = {1916, 1940, 1944, 2020};
        for (int year : years) {
            assertFalse(new Worldcup().isWorldcupYear(year), year + "년도");
        }
    }
    @Test
    void 예외적인개최년도() {
     //코로나19 유행년도
        assertTrue(new Worldcup().isWorldcupYear(2021), "2021년도");
    }

    @Test
    void 경계치상한() {
        assertDoesNotThrow(() -> new Worldcup().isWorldcupYear(2029));
        assertDoesNotThrow(() -> new Worldcup().isWorldcupYear(2030));
        //개최가 결정된 2026년 이후에는 예외발생
        assertThrows(IllegalArgumentException.class,
                () -> new Worldcup().isWorldcupYear(2030));
        assertThrows(IllegalArgumentException.class,
                () -> new Worldcup().isWorldcupYear(2054));
    }
    @org.junit.jupiter.api.Test
    void isWorldcupYear() {
    }
}


public class Worldcup {
    public boolean isWorldcupYear(int year) throws
            IllegalArgumentException {
        if (year < 1930) {
            return false;
        }
        if (year == 1966 || year == 1978 || year == 1994 || year == 2018) {
            return false;
        }
        if (year == 2022) {
            return true;
        }
        if (2030 < year) {
            throw new IllegalArgumentException(
                    "2030년까지만 지원합니다. 입력년도 : " + year);
        }
        return year % 4 == 0;
    }
}
