/**
 * 
 */
package org.exist.eclipse.auto.internal.model;

import java.util.ArrayList;

/**
 * The IAutomodel contains all the necessary information concerning an
 * automation. It administers the automation properties and the queries on the
 * automation.
 * 
 * @author Markus Tanner
 */
public interface IAutoModel {

	/**
	 * Add a new QueryEntity
	 * 
	 * @param query
	 */
	public void addQuery(QueryEntity query);

	/**
	 * Remove a given QueryEntity
	 * 
	 * @param query
	 */
	public void removeQuery(QueryEntity query);

	/**
	 * Set the automation thread count
	 * 
	 * @param threadCount
	 */
	public void setThreadCount(int threadCount);

	/**
	 * Returns the automation thread count
	 * 
	 * @return ThreadCount
	 */
	public int getThreadCount();

	/**
	 * Returns the of an automation queries that are placed on the model
	 * 
	 * @return The queries from the model
	 */
	public ArrayList<QueryEntity> getQueries();

	/**
	 * Returns the queries from the model as an array
	 * 
	 * @return The queries from the model
	 */
	public Object[] getContents();

}
