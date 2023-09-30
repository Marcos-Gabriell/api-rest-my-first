package dio.web.api.model;

public class Usuario {

    private Integer id;
    private String login;
    private String passoword;

    public Usuario() {}
    public Usuario (String login, String passoword) {
        this.login = login;
        this.passoword = passoword;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passoword= ' " + passoword + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }
}
