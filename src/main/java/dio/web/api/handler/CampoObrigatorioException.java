package dio.web.api.handler;

public class CampoObrigatorioException extends BusinessException {
    public CampoObrigatorioException(String campo) {
        super("o campo é obrigatoriop", campo);
    }

}
