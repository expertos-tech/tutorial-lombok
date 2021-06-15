package expertostech.tutorial.lombok;

import lombok.extern.java.Log;

@Log
public class ClienteApp {

    public static void main(String[] args) {

        ClienteModel cliente = new ClienteModel();
        cliente.setId(10);
        cliente.setNome("Maria José");
        cliente.setDoc("123.456.789-10");

        log.info("Cliente criado com sucesso!");
        log.info(cliente.toString());
    }

}
