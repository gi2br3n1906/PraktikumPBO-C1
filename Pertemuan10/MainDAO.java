package Pertemuan9;

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
