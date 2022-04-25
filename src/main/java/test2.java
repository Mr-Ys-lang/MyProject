import java.util.List;

/**
 * @filename test2
 * @description
 * @author 杨声
 * @date 2021/5/8 13:57
 */
public class test2 {

	/**
	 * id
	 */
	private Integer id;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 类型
	 */
	private List<String> hobbyList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}
}
