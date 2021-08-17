package br.com.example.artemis.springartemissample.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Joel Rodrigues Moreira on 13/08/2021.
 * e-mail: <a href="mailto:joel.databox@gmail.com">joel.databox@gmail.com</a>
 * @project spring-artemis-sample
 */
@Component
public class Listener {
    public Listener() {
        System.out.println("Iniciou");
    }

    @JmsListener(destination = "test-1")
    public void receiveMessage(final String message) {
        System.out.println("recebi a mensagem " + message);
    }
}
