package ec.com.galactic.market.commons;

/**
 * Manage resource properties
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public final class GalacticMarketResources {
	
	/**
	 * Returns sentences conditional
	 */
	public final static String CONDITIONAL = GalacticMarketMessage.getInstance()
			.getMessageForKey("ec.com.galactic.market.conditional");
	
	/**
	 * Returns initial question
	 */
	public final static String QUESTION = GalacticMarketMessage.getInstance()
			.getMessageForKey("ec.com.galactic.market.sentence.question");

	/**
	 * Returns question by type of unit
	 */
	public final static String QUESTION_TYPE = GalacticMarketMessage.getInstance()
			.getMessageForKey("ec.com.galactic.market.sentence.question.type");
	
	/**
	 * Return currency
	 */
	public final static String CURRENCY = GalacticMarketMessage.getInstance()
			.getMessageForKey("ec.com.galactic.market.currency");
	
	/**
	 * Returns error message value
	 */
	public final static String ERROR_MESSAGE = GalacticMarketMessage.getInstance()
			.getMessageForKey("ec.com.galactic.market.message.error");
}
