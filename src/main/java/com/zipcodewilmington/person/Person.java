package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isFemale;
    private String eyeColor;
    private String hairColor;
    private String ethnicity;
    private boolean wearsGlasses;

    public Person() {

String name = "";
Integer age = Integer.MAX_VALUE;

        this.name = name;
        this.age = age;

    }

    public Person(int age) {

        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean isFemale, String eyeColor, String hairColor, String ethnicity, boolean wearsGlasses){
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.ethnicity = ethnicity;
        this.wearsGlasses = wearsGlasses;
    }

    public Person(String name, int age, boolean isFemale, String hairColor, boolean wearsGlasses){
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.hairColor = hairColor;
        this.wearsGlasses = wearsGlasses;
    }

    public Person(String name, int age, boolean isFemale, String eyeColor, String hairColor){
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }


    public void setName(String name) {
        this.name= name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsFemale(boolean isFemale){
        this.isFemale = isFemale;

    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;

    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public void setEthnicity(String ethnicity){
        this.ethnicity = ethnicity;
    }

    public void setWearsGlasses(boolean wearsGlasses){
        this.wearsGlasses = wearsGlasses;
    }

    public boolean getWearsGlasses(){
        return wearsGlasses;
    }

    public String getEthnicity(){
        return ethnicity;
    }

    public String getHairColor(){
        return hairColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public boolean getIsFemale(){
        return isFemale;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
