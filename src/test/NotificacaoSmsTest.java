package test;

import main.INotificacao;
import main.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificacaoSmsTest {
    @Test
    void deveEnviarNotificacao() {
        INotificacao notificacao = NotificacaoFactory.obterServico("Sms");
        assertEquals("Notificação por SMS",notificacao.enviar());
    }
}
