package esercizioTre;

import esercizioTre.Exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoCorrente {
    public static final Logger LOGGER = LoggerFactory.getLogger(ContoCorrente.class);

    private String titolare;
    private int nMoivmenti;
    private final int maxMovimenti = 50;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMoivmenti = 0;
        LOGGER.info("Conto corrente creato per {}, con saldo iniziale di {}", titolare, saldo);
    }

    public void preleva(double importo) throws BancaException  {
        if(saldo - importo < 0) {
            LOGGER.warn("Prelevamento per {} Importo da prelevare: {}, Saldo attuale: {}", titolare, importo, saldo);
            throw new BancaException("Saldo insufficiente");
        }

        saldo -= importo;
        nMoivmenti++;
        LOGGER.info("Prelevamento riuscito per {} Importo prelevato: {}, Saldo attuale: {}", titolare, importo, saldo);
    }

    public double restituisciSaldo() {
        LOGGER.debug("Restituzione saldo per {}: {}", titolare, saldo);
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public double getSaldo() {
        return saldo;
    }


}
