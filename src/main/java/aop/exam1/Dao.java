package aop.exam1;

import java.util.List;

public interface Dao {
	public String insert(); //C
	public List<Object> select(); //R
	public String update(); //U
	public String delete(); //D
}
