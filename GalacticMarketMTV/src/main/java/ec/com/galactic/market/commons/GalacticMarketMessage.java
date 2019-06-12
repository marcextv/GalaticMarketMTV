package ec.com.galactic.market.commons;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Load Galactic Market properties file
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public final class GalacticMarketMessage {

	/**
	 * Instance of class
	 */
	private static final GalacticMarketMessage INSTANCE = new GalacticMarketMessage();
	
	/**
	 * Bundle property
	 */
	private final ResourceBundle resourceBundle;
	
	/**
	 * Bundle file name
	 */
	private static final String BUNDLE_NAME = "ec.com.galactic.market.resources.galacticmarket";

	/**
	 * Class constructor
	 */
	private GalacticMarketMessage() {
		resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
	}

	/**
	 * @return the instance
	 */
	public static GalacticMarketMessage getInstance() {
		return INSTANCE;
	}

	/**
	 * Returns a string message
	 * 
	 * @param key of parameter
	 * @param placeHolders additional arguments as location
	 * @return the message data
	 */
	public String getMessageForKey(String key, Object... placeHolders) {
		try {
			String value = resourceBundle.getString(key);
			if (placeHolders.length > 0) {
				return MessageFormat.format(value, placeHolders);
			}

			return value;

		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
