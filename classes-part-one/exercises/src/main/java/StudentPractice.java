public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student jim = new Student();
        jim.setName("Jim Humphrey");
        jim.setStudentId(235456);
        jim.setGpa(4.62);
        jim.setNumberOfCredits(32);

        System.out.println("Jim: " + jim.getName());
    }
}
