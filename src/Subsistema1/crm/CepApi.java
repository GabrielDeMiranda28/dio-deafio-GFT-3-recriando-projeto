package Subsistema1.crm;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep) {
        return "Salvador";

    }
    public String recuperarEstado(String estado) {
        return "Bahia";
    }

}