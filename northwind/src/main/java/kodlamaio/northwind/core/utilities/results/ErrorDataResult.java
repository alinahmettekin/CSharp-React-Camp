package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data) {
		super(data,false );
	}
	
	public ErrorDataResult(String message, T data) {
		super(data, false, message);
	}
}
