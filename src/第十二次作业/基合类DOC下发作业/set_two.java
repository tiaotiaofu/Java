package 第十二次作业.基合类DOC下发作业;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class set_two {
    static class Student implements Comparable{
        private String index;
        private String name;
        private int age;
        public String getIndex() {
            return index;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void setIndex(String index) {
            this.index = index;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int compareTo(Object o){
            if (!(o instanceof Student))
                throw new RuntimeException("不是Student对象");
            Student p =(Student) o;
            if (this.age>p.age)
                return 1;
            if (this.age==p.age){
                return this.name.compareTo(p.name);
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Student> students = new TreeSet<>();
        String index,name;
        int age;
        System.out.println("输入学号，姓名，年龄信息，输入exit退出");
        while (true){
            index = input.next();
            if (index.equals("exit"))
                break;
            name = input.next();
            age = input.nextInt();
            Student a = new Student();
            a.setIndex(index);
            a.setName(name);
            a.setAge(age);
            students.add(a);
        }
        System.out.println("按照年龄从小到大排序");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            Student student = (Student)it.next();
            System.out.println("学号："+student.getIndex()+" 名字："+student.getName());
        }
    }
}
