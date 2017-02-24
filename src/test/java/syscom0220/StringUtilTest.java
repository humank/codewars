package syscom0220;

import org.junit.Test;
import solid.humank.codewars.regexp.StringUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by kim on 2017/2/20.
 */
public class StringUtilTest {

    @Test
    public void testSolutions(){
        assertFalse(SyscomStringUtils.isDigit(""));
        assertTrue(SyscomStringUtils.isDigit("7"));
        assertFalse(SyscomStringUtils.isDigit(" "));
        assertFalse(SyscomStringUtils.isDigit("a"));
        assertFalse(SyscomStringUtils.isDigit("a5"));
        assertFalse(SyscomStringUtils.isDigit("14"));
    }

    @Test
    public void test_isdigit_when_string_is_empty_should_return_false(){

        //Arrange
        String input = "";
        boolean expected = false;
        //Action
        expected = SyscomStringUtils.isDigit(input);
        //Assert
        assertFalse(expected);

    }

    @Test
    public void test_isdigit_wehn_string_is_not_empty_and_has_character_should_return_false(){

        //Arrange
        String input = "abc";
        boolean expected = false;
        //Action
        expected = SyscomStringUtils.isDigit(input);
        //Assert
        assertFalse(expected);
    }

    @Test
    public void test_isdigit_wehn_string_is_1_should_return_true(){

        //Arrange
        String input = "1";
        boolean expected = false;
        //Action
        expected = SyscomStringUtils.isDigit(input);
        //Assert
        assertTrue(expected);
    }

    @Test
    public void test_isdigit_when_input_2chars_should_return_false(){
        //Arrange
        String input = "12";
        boolean expected = false;
        //Action
        expected = SyscomStringUtils.isDigit(input);
        //Assert
        assertFalse(expected);
    }
}
