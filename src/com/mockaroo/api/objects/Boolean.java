package com.mockaroo.api.objects;

import org.json.JSONObject;

import com.mockaroo.api.enums.MockarooType;
import com.mockaroo.api.exceptions.MockarooExceptionName;
import com.mockaroo.api.interfaces.IMockarooObject;

/**
 * Boolean mockaroo object
 * @author Dennis Hern�ndez Vargas
 * @version 2.0.0 - 25/July/2014
 * @since 2.0.0
 */
public class Boolean implements IMockarooObject {

	private static Boolean instance = null;
	private String columnName;
	
	/**
	 * Constructor
	 * @param columnName Column name
	 */
	private Boolean(String columnName)
	{
		this.setColumnName(columnName);
	}
	
	/**
	 * Get the instance
	 * Applying singleton
	 * @param columnName Column name
	 * @return {@link Boolean}
	 * @throws MockarooExceptionName
	 */
	public static Boolean getInstance(String columnName) throws MockarooExceptionName
	{
		VALIDATOR.validateColumnName(columnName, messageExceptionName);
		if(instance == null)
		{
			instance = new Boolean(columnName);
		}
		
		return instance;
	}
	

	/**
	 * Get the column name
	 * @return the columnName
	 */
	private String getColumnName() {
		return columnName;
	}

	/**
	 * Set the column name
	 * @param columnName the columnName to set
	 */
	private void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public JSONObject getJSONObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(NAME, this.getColumnName());
		jsonObject.put(TYPE, this.getType());

		return jsonObject;

	}

	@Override
	public String getType() {
		return MockarooType.Boolean.toString();
	}
}