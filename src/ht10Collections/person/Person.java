package ht10Collections.person;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    public static Integer id = 1;
    private final Integer idPerson;
    private String name;
    private String lastName;
    private LocalDate birthday;
    private Integer salary;

    public Person(String name, String lastName, LocalDate birthday,Integer salary) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.idPerson = id ;
        this.salary = salary;
        id++;
    }

    public Integer getIdPerson() {
        return this.idPerson;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public Integer getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        final Person other = (Person) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$idPerson = this.getIdPerson();
        final Object other$idPerson = other.getIdPerson();
        if (this$idPerson == null ? other$idPerson != null : !this$idPerson.equals(other$idPerson)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$birthday = this.getBirthday();
        final Object other$birthday = other.getBirthday();
        if (this$birthday == null ? other$birthday != null : !this$birthday.equals(other$birthday)) return false;
        final Object this$salary = this.getSalary();
        final Object other$salary = other.getSalary();
        if (this$salary == null ? other$salary != null : !this$salary.equals(other$salary)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Person;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $idPerson = this.getIdPerson();
        result = result * PRIME + ($idPerson == null ? 43 : $idPerson.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $birthday = this.getBirthday();
        result = result * PRIME + ($birthday == null ? 43 : $birthday.hashCode());
        final Object $salary = this.getSalary();
        result = result * PRIME + ($salary == null ? 43 : $salary.hashCode());
        return result;
    }

    public String toString() {
        return "Person(idPerson=" + this.getIdPerson() + ", name=" + this.getName() + ", lastName=" + this.getLastName() + ", birthday=" + this.getBirthday() + ", salary=" + this.getSalary() +", id="+ this.getIdPerson()+ ")";
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
