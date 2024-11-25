package esercizioTre;

import esercizioTre.Exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoOnline extends ContoCorrente {
    public static final Logger LOGGER = LoggerFactory.getLogger(ContoOnline.class);
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
        LOGGER.info("Conto online creato per {}, con saldo iniziale di {}, massimo prelevabile: {}", titolare, saldo, maxPrelievo);
    }

    @Override
    public void preleva(double importo) throws BancaException {
        if(importo > maxPrelievo) {
            LOGGER.warn("Prelevamento online per {} Importo da prelevare: {}, Saldo attuale: {}", getTitolare(), importo, getSaldo());
            throw new BancaException("Importo superiore al massimo prelevabile");
        }
        super.preleva(importo);
    }
}
