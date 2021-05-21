package models;

public class Director {

  private String name;
  private String job;

  public Director( String name, String job) {
    this.name = name;
    this.job = job;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }
}
