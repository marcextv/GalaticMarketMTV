package ec.com.galactic.market.entities;

import ec.com.galactic.market.enums.ResponseType;

/**
 * Class which contains values of input
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class RomanValue {

	/**
	 * Identifier of data, i.e. glob
	 */
	private String name;

	/**
	 * Value of data, i.e. I
	 */
	private String value;

	/**
	 * Type of data, i.e. Silver. Can be null
	 */
	private String type;

	/**
	 * Unit which data, i.e. credits. Can be null
	 */
	private String unit;

	/**
	 * Value in Arabic values, i.e. 50. Can be null
	 */
	private Integer arabicValue;

	/**
	 * Response type output, i.e. question or input data. Cannot be null
	 */
	private ResponseType responseType;
	
	/**
	 * Defines if information contains error
	 */
	private boolean isError;

	/**
	 * Constructor of empty class
	 */
	public RomanValue() {
		this.isError = false;
	}

	/**
	 * Constructor of class
	 * 
	 * @param responseType must be a ResponseType
	 */
	public RomanValue(ResponseType responseType) {
		this();
		this.responseType = responseType;
	}

	/**
	 * Constructor of class
	 * 
	 * @param name         must be unique
	 * @param value        must be a valid Roman symbol
	 * @param responseType must be a ResponseType
	 */
	public RomanValue(String name, String value, ResponseType responseType) {
		this(responseType);
		this.name = name;
		this.value = value;
	}

	/**
	 * Constructor of class
	 * 
	 * @param name         must be unique
	 * @param value        must be a valid Roman symbol
	 * @param responseType must be a ResponeType
	 * @param type         can be null
	 * @param unit         can be null
	 * @param arabicValue  can be null
	 */
	public RomanValue(String name, String value, ResponseType responseType, String type, String unit,
			Integer arabicValue) {
		this(name, value, responseType);
		this.type = type;
		this.unit = unit;
		this.arabicValue = arabicValue;
	}

	/**
	 * Get name value
	 * 
	 * @return name value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name value
	 * 
	 * @param name must be unique
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get data value
	 * 
	 * @return value data
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set data value
	 * 
	 * @param value must be a valid Roman symbol
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Get data type
	 * 
	 * @return data type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set type of data
	 * 
	 * @param type could be null
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get data unit
	 * 
	 * @return unit type
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Set data unit
	 * 
	 * @param unit could be null
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Get Arabic value
	 * 
	 * @return Arabic value
	 */
	public Integer getArabicValue() {
		return arabicValue;
	}

	/**
	 * Set Arabic value
	 * 
	 * @param arabicValue can be null
	 */
	public void setArabicValue(Integer arabicValue) {
		this.arabicValue = arabicValue;
	}

	/**
	 * Get response type
	 * 
	 * @return response type
	 */
	public ResponseType getResponseType() {
		return responseType;
	}

	/**
	 * Set response type
	 * 
	 * @param responseType cannot be null
	 */
	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}

	/**
	 * Get if data has error
	 * 
	 * @return true if it is error
	 */
	public boolean isError() {
		return isError;
	}

	/**
	 * Set error data
	 * 
	 * @param isError true if data contains error
	 */
	public void setError(boolean isError) {
		this.isError = isError;
	}
	
}
