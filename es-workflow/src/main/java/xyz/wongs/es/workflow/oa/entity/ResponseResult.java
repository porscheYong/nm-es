package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;

/**
 * 封装json数据
 * @author liuxiaodong
 */
public class ResponseResult<T> implements Serializable {

	public static final int STATE_OK = 1;
	public static final int STATE_ERROR = -1;
	private static final long serialVersionUID = 3007905603382119416L;

	private int state;
	private String message;
	private T data;

	public ResponseResult() {
		super();
	}

	public ResponseResult(int state, String message) {
		super();
		this.state = state;
		this.message = message;
	}

	public ResponseResult(int state, T data) {
		super();
		this.state = state;
		this.data = data;
	}

	public ResponseResult(int state, String message, T data) {
		super();
		this.state = state;
		this.message = message;
		this.data = data;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}

}
