package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.User;

public interface UserService {
	
	Result add(User user);
	DataResult<User> findByEmail(String email);
	

}
