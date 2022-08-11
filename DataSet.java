public class DataSet implements Serializable {
    List<Person> pl;
    List<Club> cl;

    // Serializable methods
}

public class DTO {

    static final String filename = "data.txt";

    DataSet load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            DataSet ds = (DataSet) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ds;
    }

    void save(DataSet ds) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(ds);
        } catch (IOException e) {
            e.printStackTrace();        

    }
}