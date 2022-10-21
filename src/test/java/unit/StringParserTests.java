package unit;

import jw.StringParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringParserTests
{

    @Test
    public void ShouldParse() throws Exception {
        //Arrange
        var args = new String[2];
        args[0] = "Hello";
        args[1] = "World";
        var parser  = new StringParser();

        //Act
        var result = parser.parse(args);

        //Assert
        Assertions.assertEquals(2,result.length);
    }

    @Test
    public void ShouldThrowException() {
        //Arrange
        var args = new String[0];
        var parser  = new StringParser();

        //Act
        var exception = assertThrows(Exception.class, () -> {
            parser.parse(args);
        });


        //Assert
        Assertions.assertNotNull(exception);
    }
}
