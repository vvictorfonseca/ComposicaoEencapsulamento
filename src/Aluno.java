public class Aluno {
  private String name;
  private int age;
  private String birth;
  private String city;
  private String college;
  private Curso curso = new Curso();

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getBirth() {
    return this.birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCollege() {
    return this.college;
  }

  public void setCollege(String college) {
    this.college = college;
  }

  public Curso getCurso() {
    return this.curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }
}