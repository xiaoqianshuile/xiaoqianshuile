package 第九次作业;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
//2、由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
//将输入的学生信息分别封装到一个Student对象中，
//再将每个Student对象加入到一个集合中，
//要求集合中的元素按照年龄大小正序排序；
//最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行
public class 二 {
    static class Student implements Comparable{
        String index;//学号
        String name;//姓名
        int age;//年龄信息
        public Student(String index,String name,int age){
            this.index = index;//编号
            this.name = name;//名称
            this.age = age;//年龄
        }
        public String getIndex(){
            return this.index;
        }
        public void setIndex(String index){
            this.index = index;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return this.age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int compareTo(Object o) {
            if(!(o instanceof Student)){
                throw new RuntimeException("不是Student对象");
            }
            Student p = (Student) o;
            if(this.age > p.age){
                return 1;
            }else if(this.age == p.age){
                return this.name.compareTo(p.name);
            }else{
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Student> students = new TreeSet<Student>();
        while(true){
            String index = input.next();
            if("exit".equals(index)){
                break;
            }
            String name = input.next();
            int age = input.nextInt();
            Student x = new Student(index,name,age);
            students.add(x);
        }
        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            Student student = (Student)it.next();
            System.out.println("name:" + student.getName());
        }
    }
}

