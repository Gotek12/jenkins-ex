package pl.wgojtek.jenkinsex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsExApplicationTest {

    @Test
    void added() {
        JenkinsExApplication jenkinsExApplication = new JenkinsExApplication();
        assertEquals(10, jenkinsExApplication.added(5, 5));
    }
}