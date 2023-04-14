/**
 * @version v1.0
 * @Author zhy
 * Description 默认
 */
public class testEquals {
    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        Person person = new Person("小明","男");
        Person person1 = new Person("小明","女");
        if(person.equals(person1)) System.out.println("equals说同名字相等就算相等");
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
    }


}

class Person{
    String name;
    String sex;

    public Person(String name, String  sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if(name.equals(person.name)) return true;
        return false;
    }

//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + (sex != null ? sex.hashCode() : 0);
//        return result;
//    }
}
