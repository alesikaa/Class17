package Class17;

public class Student {
    String name;
    String id;
    String schoolName;
    int age;
    double weight;
    Student ( String studentName, String studentId, String StudentSchoolName, int StudentAge, double StudentWeight){
        name=studentName;
        id=studentId;
        schoolName=StudentSchoolName;
        age=StudentAge;
        weight=StudentWeight;
    }
    void printInfo(){
        System.out.println("Name: "+name+"  Student ID: "+id+"  Student School name: "+schoolName+"  Student Age: "+age+"  Student Weight: "+weight);
    }
    }

