package CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("This is the Save Method");
    }

    @Override
    public void findAll() {
        System.out.println("This is the FindAll Method");
    }

    @Override
    public void delete() {
        System.out.println("This is the Delete Method");
    }
}
