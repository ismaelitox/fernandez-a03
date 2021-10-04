package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void hasLetterTest(){
        boolean hasLetter = Solution25.hasLetter("as123ew");
        assertTrue(hasLetter);
        boolean noLetter = Solution25.hasLetter("122232");
        assertFalse(noLetter);
    }
    
    @Test
    void hasSpecialCharTest(){
        boolean hasSymbol = Solution25.hasSymbol("yeabud@yy");
        assertTrue(hasSymbol);
        boolean noSymbol = Solution25.hasSymbol("yeabuddy");
        assertFalse(noSymbol);
    }
   
    @Test
    void hasNumberTest(){
        boolean hasNumber = Solution25.hasNumber("YEAAAH@1");
        assertTrue(hasNumber);
        boolean noNumber = Solution25.hasNumber("YEAAAHHHAHAHAHAH");
        assertFalse(noNumber);
    }
    
    @Test
    void has8Chars(){
        boolean has8 = Solution25.has8("12345678");
        assertTrue(has8);
        boolean no8 = Solution25.has8("1234");
        assertFalse(no8);
    }

    @Test
    void passwordValidationTest(){
        String vStrongPassword = "YEahDog@16";
        assertEquals(4,Solution25.passwordValidator(vStrongPassword));
        String strongPassword = "yeahdog16";
        assertEquals(3,Solution25.passwordValidator(strongPassword));
        String weakPassword = "yeadog";
        assertEquals(2, Solution25.passwordValidator(weakPassword));
        String veryWeakPassword = "1616";
        assertEquals(1, Solution25.passwordValidator(veryWeakPassword));
    }

}