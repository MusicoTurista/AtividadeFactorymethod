package main;

public class NotificacaoFactory {
    public static INotificacao obterServico(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("main.Notificacao" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof INotificacao)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (INotificacao) objeto;
    }
}
