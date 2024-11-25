package esercizioTre;

import esercizioTre.Exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        final Logger LOGGER = LoggerFactory.getLogger(Main.class);

        ContoCorrente conto = new ContoCorrente("Mario Rossi", 1000);
        ContoOnline contoOnline = new ContoOnline("Mario Bianchi", 1000, 200);

        try {
            conto.preleva(200);  //Prelievo normale
            contoOnline.preleva(300);  //Prelievo che lancia un errore
        } catch (BancaException e) {
            LOGGER.error("Errore: {}", e.getMessage());
        }

        LOGGER.info("Fine transazione");
    }
}
