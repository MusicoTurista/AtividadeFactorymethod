package test;

import main.INotificacao;
import main.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificacaoEmailTest {
    @Test
    void deveEnviarNotificacao() {
        INotificacao notificacao = NotificacaoFactory.obterServico("Email");
        assertEquals("Notificação por Email",notificacao.enviar());
    }
}
