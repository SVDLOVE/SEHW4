package test;
import org.junit.*;

import static main.letterGrade.letterGrade;
import static org.junit.Assert.*;

public class LetterGradeTest
{
    @Before
    public  void setUp(){

    }

    @After
    public void  tearDowm(){

    }

    @Test
    public void testEquivalencePartitioning()
    {
        assertEquals(letterGrade(-10), "X".charAt(0));
        assertEquals(letterGrade(44), "F".charAt(0));
        assertEquals(letterGrade(63), "D".charAt(0));
        assertEquals(letterGrade(77), "C".charAt(0));
        assertEquals(letterGrade(88), "B".charAt(0));
        assertEquals(letterGrade(93), "A".charAt(0));
    }

    @Test
    public void testBoundaryValueAnalysis()
    {
        assertEquals(letterGrade(-1), "X".charAt(0));
        assertEquals(letterGrade(101), "X".charAt(0));
        assertEquals(letterGrade(0), "F".charAt(0));
        assertEquals(letterGrade(59), "F".charAt(0));
        assertEquals(letterGrade(60), "D".charAt(0));
        assertEquals(letterGrade(69), "D".charAt(0));
        assertEquals(letterGrade(70), "C".charAt(0));
        assertEquals(letterGrade(79), "C".charAt(0));
        assertEquals(letterGrade(89), "B".charAt(0));
        assertEquals(letterGrade(80), "B".charAt(0));
        assertEquals(letterGrade(90), "A".charAt(0));
        assertEquals(letterGrade(100), "A".charAt(0));
    }

}
