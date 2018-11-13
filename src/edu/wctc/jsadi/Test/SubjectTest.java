package edu.wctc.jsadi.Test;

import edu.wctc.jsadi.Subject;
import org.junit.*;

public class SubjectTest extends junit.framework.TestCase {
    public SubjectTest() {}

    private Subject testSubject;

    @Before
    public void setUp() throws Exception {
        testSubject = new Subject();
        testSubject.setState(100);
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetState() {
        assertEquals(100, testSubject.getState());
        assertNotSame(101, testSubject.getState());
    }
}
