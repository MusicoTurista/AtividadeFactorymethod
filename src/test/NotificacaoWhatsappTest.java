package test;

import main.INotificacao;
import main.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificacaoWhatsappTest {
    @Test
    void deveEnviarNotificacao() {
        INotificacao notificacao = NotificacaoFactory.obterServico("Whatsapp");
        assertEquals("Notificação por Whatsapp",notificacao.enviar());
    }
}
