package pl.piomin.services.beans;

public class ClientService {

    private String url;

    public ClientService(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connected: " + url);
    }
}
