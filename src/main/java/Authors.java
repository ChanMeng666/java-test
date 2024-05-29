public class Authors
{
    private long ID;
    private String Name;
    private int Age;

    //以下是鼠标右键generate自动生成的
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    //以下是鼠标右键generate自动生成的
    @Override
    public String toString() {
        return "Authors{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
