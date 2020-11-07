package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllFields(){
        String expectedName = "Pompy";
        int expectedAge = 26;
        boolean expectedIsFemale = true;
        String expectedEyeColor = "Green";
        String expectedHairColor = "Brown";
        String expectedEthnicity = "Caucasian";
        boolean expectedWearsGlasses = false;

        Person person = new Person(expectedName, expectedAge, expectedIsFemale, expectedEyeColor, expectedHairColor, expectedEthnicity, expectedWearsGlasses);

        String actualName = person.getName();
        int actualAge = person.getAge();
        boolean actualIsFemale = person.getIsFemale();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();
        String actualEthnicity = person.getEthnicity();
        boolean actualWearsGlasses = person.getWearsGlasses();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedIsFemale, actualIsFemale);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEthnicity, actualEthnicity);
        Assert.assertEquals(expectedWearsGlasses, actualWearsGlasses);


    }

    @Test
    public void testConstructorNameAgeIsFemaleHairColorWearsGlasses(){
        String expectedName = "Pompy";
        int expectedAge = 26;
        boolean expectedIsFemale = true;
        String expectedHairColor = "brown";
        boolean expectedWearsGlasses = false;

        Person person = new Person(expectedName, expectedAge, expectedIsFemale, expectedHairColor, expectedWearsGlasses);

        String actualName = person.getName();
        int actualAge = person.getAge();
        boolean actualIsFemale = person.getIsFemale();
        String actualHairColor = person.getHairColor();
        boolean actualWearsGlasses = person.getWearsGlasses();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedIsFemale, actualIsFemale);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedWearsGlasses, actualWearsGlasses);
    }

    @Test
    public void testConstructorNameAgeIsFemaleEyeColorHairColor(){
        String expectedName = "Pompy";
        int expectedAge = 26;
        boolean expectedIsFemale = true;
        String expectedEyeColor = "green";
        String expectedHairColor = "brown";

        Person person = new Person(expectedName, expectedAge, expectedIsFemale, expectedEyeColor, expectedHairColor);

        String actualName = person.getName();
        int actualAge = person.getAge();
        boolean actualIsFemale = person.getIsFemale();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedIsFemale, actualIsFemale);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIsFemale(){
        Person person = new Person();
        boolean expected = true;

        person.setIsFemale(expected);

        boolean actual = person.getIsFemale();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetEyeColor(){
        Person person = new Person();
        String expected = "blue";

        person.setEyeColor(expected);

        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor(){
        Person person = new Person();
        String expected = "brown";

        person.setHairColor(expected);

        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEthnicity(){
        Person person = new Person();
        String expected = "Caucasian";

        person.setEthnicity(expected);

        String actual = person.getEthnicity();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWearsGlasses(){
        Person person = new Person();
        Boolean expected = false;

        person.setWearsGlasses(expected);

        boolean actual = person.getWearsGlasses();
        Assert.assertEquals(expected, actual);
    }
}
