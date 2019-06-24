package model;

public class Student {
  private String name;
  private int age;
  private String gender;
  private String num;

  public Student(String name, int age, String gender, String num) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.num = num;
  }

  public Student() {
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", num='" + num + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }
}
