import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SemicolonExpenseTrackerTest{

    @Test
    public void testThatDateIsValid(){

        assertTrue(SemicolonExpenseTracker.getDate("2003/04/05"));
    }

}

