package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class JobTest extends Job {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job instanceof Job);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }
@Test
    public void testJobsForEquality(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(job == job2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Employer launchCode = new Employer("launchCode");
        Location stl = new Location("stl");
        PositionType BackendDeveloper = new PositionType("Back-end developer");
        CoreCompetency Java = new CoreCompetency("Java");
        Job job = new Job("Web Developer", launchCode, stl, BackendDeveloper, Java);
//        Job job = new Job();
        String expectedOutput = "\n" +
                "ID: _______\n" +
                "Name: _______\n" +
                "Employer: _______\n" +
                "Location: _______\n" +
                "Position Type: _______\n" +
                "Core Competency: _______\n" +
                "\n";
        char firstChar = job.toString().charAt(0);
        char lastChar = job.toString().charAt(job.toString().length()-1);

        String actualOutput = job.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
        Assert.assertEquals('\n', '\n');
        Assert.assertEquals('\n', '\n');
        Assert.assertEquals( '\n',firstChar);
        Assert.assertEquals('\n', lastChar);

        String jobToString = job.toString();
        assertTrue(jobToString.startsWith("\n"));
        assertTrue(jobToString.endsWith("\n"));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine2() {
        Employer launchCode = new Employer("LaunchCode");
        Location stl = new Location("StL");
        PositionType backendDeveloper = new PositionType("Back-end developer");
        CoreCompetency java = new CoreCompetency("Java");
        Job job = new Job("Web Developer", launchCode, stl, backendDeveloper, java);

        String jobToString = job.toString();
        Assert.assertTrue(jobToString.startsWith("\n"));
        Assert.assertTrue(jobToString.endsWith("\n"));
    }

}
