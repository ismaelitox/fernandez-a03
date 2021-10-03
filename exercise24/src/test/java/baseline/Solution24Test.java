package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagramTest(){

        assertTrue(Solution24.isAnagram("kid","idk"));
        assertFalse(Solution24.isAnagram("dog","cat"));
        assertTrue(Solution24.isAnagram("yo man","man yo"));
        assertFalse(Solution24.isAnagram("yo girl","yo boy"));

    }



}