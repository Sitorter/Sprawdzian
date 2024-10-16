class Employee{
    private String name;
    private String surname;
    private int workSpace;
    private int age;
    private String email;
    public Employee(String name, String surname, int workSpace, int age, String email){
        this.name = name;
        this.surname = surname;
        this.workSpace = workSpace;
        this.age = age;
        this.email = email;
    }
    public void Status(){
        System.out.println("loging to system");
        System.out.println("work in progres");
        System.out.println("work end");
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public int getWorkSpace() {
        return workSpace;
    }
    public String getEmail() {
        return email;
    }
}
class Manager extends Employee{
    private int dzial;
    private int liczbaPodwladnych;
    private boolean statusLogowania;
    public Manager(String name, String surname, int workSpace, int age, String email, int dzial, int liczbaPodwladnych, boolean statusLogowania) {
        super(name, surname, workSpace, age, email);
        this.dzial = dzial;
        this.liczbaPodwladnych = liczbaPodwladnych;
        this.statusLogowania = statusLogowania;

    }
    public int getDzial() {
        return dzial;
    }
    public int getLiczbaPodwladnych() {
        return liczbaPodwladnych;
    }
    public boolean getStatusLogowania() {
        return statusLogowania;
    }
    public void przydzielenieZadaniaPracownikowi(){
        System.out.println("Pracownik ma zadania");
    }
    public void pzegladanieRaportow(){
        System.out.println("Pracownik przeglada raporty");
    }
    public void daneMenedzera(){
        System.out.println("Dane menedzera");
    }
}

public class Main {
    public static void main(String[] args) {
    Manager Adam = new Manager("Adam", "Ziom", 3, 23, "email@gmail.com", 3, 24, true);
    System.out.println(Adam.getName());
    System.out.println(Adam.getSurname());
    System.out.println(Adam.getAge());
    System.out.println(Adam.getEmail());
    System.out.println(Adam.getWorkSpace());
    System.out.println(Adam.getDzial());
    System.out.println(Adam.getLiczbaPodwladnych());
    System.out.println("Status logowania = " + Adam.getStatusLogowania());
    Adam.Status();
    Adam.przydzielenieZadaniaPracownikowi();
    Adam.pzegladanieRaportow();
    Adam.daneMenedzera();
    }
}