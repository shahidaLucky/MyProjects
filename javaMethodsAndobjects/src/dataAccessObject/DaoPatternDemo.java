package dataAccessObject;

//Driver Class
public class DaoPatternDemo {
 public static void main(String[] args) {

     StudentDao studentDao = new StudentDaoImpl();

     //get all students
     System.out.println("================Student Database================");
     for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
     }

     //update student
     System.out.println("================Business Need================");
     Scanner input = new Scanner(System.in);

     //get the student
     System.out.println("Please provide the student roll you want to retrieve?");
     int studentRoll = input.nextInt();
     Student retrieveStudent = studentDao.getStudent(studentRoll);
     System.out.println("Student: [RollNo : " + retrieveStudent.getRollNo() + ", Name : " + retrieveStudent.getName() + " ]");

     //update a student
     System.out.println("Please provide the student roll you want to update?");
     int roll = input.nextInt();
     Student student =studentDao.getAllStudents().get(roll);
     System.out.println("Please provide the new student name?");
     String name = input.next();
     studentDao.updateStudent(student, name);

     //delete a student
     System.out.println("Please provide the student roll you want to delete?");
     int deleteRoll = input.nextInt();
     studentDao.deleteStudent(deleteRoll);
     System.out.println("Student has been deleted from from database with roll: " + deleteRoll);

     //after operation
     System.out.println("================Updated Student Database================");
     for (Student elm : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + elm.getRollNo() + ", Name : " + elm.getName() + " ]");
     }
 }
}

