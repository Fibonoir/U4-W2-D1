package esercizioTre.Exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BancaException extends Exception {

  private static final Logger LOGGER = LoggerFactory.getLogger(BancaException.class);

  public BancaException(String message) {
    super(message);
      LOGGER.error("BancaException: {}", message);
  }
}
