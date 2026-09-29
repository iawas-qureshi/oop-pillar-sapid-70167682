// Encapsulation 2: setters that validate data
public class StudentGrades {
    private String name;
    private int marks;

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
    }

    public int getMarks() { return marks; }
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) this.marks = marks;
        else System.out.println("Marks must be between 0 and 100");
    }

    public char getGrade() {
        if (marks >= 80) return 'A';
        if (marks >= 65) return 'B';
        if (marks >= 50) return 'C';
        return 'F';
    }

    public static void main(String[] args) {
        StudentGrades s = new StudentGrades();
        s.setName("Sara");
        s.setMarks(150);   // rejected
        s.setMarks(85);
        System.out.println(s.getName() + " -> " + s.getMarks() + " Grade " + s.getGrade());
    }
}
