package org.example.lab9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {
    static StudentSystem studentSystem;
    @BeforeEach
    void init() {
        try {
            studentSystem = new StudentSystem("students.csv");
        } catch (IOException e) {
            fail("Failed to initialize studentSystem " + e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    public void testIfStudentIsPresent() {
        assertTrue(studentSystem.students.size() > 0);
    }

    @org.junit.jupiter.api.Test
    public void testStudentWithID100() {
            assertFalse(studentSystem.getStudentByID(100).isPresent());
    }

    @Test
    public void testStudentNull() {
        Student student = null;
        assertNull(student);
    }

    @org.junit.jupiter.api.Test
    public void testHighestGPAStudent() {
        assertNotNull(studentSystem.getHighestGPAStudent());
    }

    @Test
    public void testExceptionForEmptyStudentList() throws IOException {
        StudentSystem emptySystem = new StudentSystem("empty.txt");

        assertThrows(EmptyStudentListException.class, () -> emptySystem.getHighestGPAStudent());
    }

    @org.junit.jupiter.api.Test
    public void testNamesArray() {
        String[] expectedNames = {
                "Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"
        };
        String[] actualNames = studentSystem.students.stream()
                .map(Student::getName)
                .limit(5)
                .toArray(String[]::new);

        assertArrayEquals(expectedNames, actualNames);
    }
    @Test
    void testSize() {
        int actualSize = studentSystem.students.size();

        assertEquals(70, actualSize);
    }

    @Test
    void testLargestName() {
        Student student = studentSystem.getLongestNameStudent();
        assertNotEquals("Ava White", student);
    }

    @Test
    void testStudents() {
        Student student1 = studentSystem.getHighestGPAStudent();
        Student student2 = studentSystem.getLongestNameStudent();
        assertNotSame(student1, student2);
    }

    @Test
    void assertNotSameExample() {
        Student student1 = studentSystem.getStudentByID(12).orElse(null);
        Student student2 = studentSystem.getHighestGPAStudent();

        assertSame(student1, student2);
    }
    @Test
    void assertAllExample() {
        assertAll("students",
                () -> assertEquals("Camila Wood", studentSystem.students.get(0).getName()),
                () -> assertEquals("Alexander Thompson", studentSystem.students.get(1).getName())
        );
    }
}