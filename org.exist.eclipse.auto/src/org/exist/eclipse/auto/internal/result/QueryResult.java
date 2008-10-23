/**
 * 
 */
package org.exist.eclipse.auto.internal.result;

import org.exist.eclipse.auto.query.IQuery;
import org.exist.eclipse.auto.query.IQueryResult;
import org.exist.eclipse.auto.query.State;

/**
 * This class represents an IQueryResult
 * 
 * @author Pascal Schmidiger
 */
public class QueryResult implements IQueryResult {

	private final IQuery _query;
	private long _compileTime;
	private long _exectime;
	private State _state;

	/**
	 * QueryResult Construtor
	 * 
	 * @param query
	 */
	public QueryResult(IQuery query) {
		_query = query;
	}

	public long getCompileTime() {
		return _compileTime;
	}

	public long getExecutionTime() {
		return _exectime;
	}

	public State getQueryState() {
		return _state;
	}

	public void setCompileTime(long time) {
		_compileTime = time;
	}

	public void setExecutionTime(long time) {
		_exectime = time;
	}

	public void setQueryState(State state) {
		_state = state;
	}

	public IQuery getQuery() {
		return _query;
	}

}
