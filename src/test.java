public class test {
    public static void main(String[] args) {
        Student stu = new Student(18);
        stu.setID(2018108833);
        stu.setPassword("333");
        stu.setStuSex(1);


        System.out.println(stu.getAge());
        System.out.println(stu.getID());
        System.out.println(stu.getPassword());
        System.out.println(stu.getStuSex());
    }
}
