public class Users implements UsersInterface {
    private String data;

    public Users(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}
