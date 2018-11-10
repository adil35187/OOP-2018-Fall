public class Student {
    String name ;
    String id ;
    int year = 2;

    Student(String name, String id, int year ){
        this.name = name;
        this.id = id;
        this.year = year;
    }

    String get_data(){
        return name + " " + id + " " + year;
    }



    public static void main(String[] args) {
        Student s = new Student( "Adil", "18BD02003",  2);
        String d = s.get_data();
        System.out.println(d);

    }
}