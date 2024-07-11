abstract class College {
  private String name;
  private String location;

  public College(String name, String location) {
    this.name = name;
    this.location = location;
  }

  public abstract void displayInfo();
}

class Teacher extends College {
  private String subject;

  public Teacher(String name, String location, String subject) 
  {
    super(name, location);
    this.subject = subject;
  }

  
  public void displayInfo() 
  {
    System.out.println("Teacher Name: "+getName());
    System.out.println("College: "+getLocation());
    System.out.println("Subject: "+subject);
  }
}

class Student extends College {
  private String major;

  public Student(String name, String location, String major) 
  {
    super(name, location);
    this.major = major;
  }

  
  public void displayInfo() 
  {
    System.out.println("Student Name: " +getName());
    System.out.println("College: " +getLocation());
    System.out.println("Major: " +major);
  }
}

public class CollegeInfo 
{
  public static void main(String[] args) 
  {
    Teacher teacher = new Teacher("John Doe", "New York", "Computer Science");
    Student student = new Student("Jane Doe", "California", "Mathematics");

    teacher.displayInfo();
    student.displayInfo();
  }
}
