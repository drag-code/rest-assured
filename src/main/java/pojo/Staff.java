package pojo;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

public class Staff implements Jsonable {
	private String name;
	private int age;
	private String[] position;
	private List<String> skills;
	private Map<String, BigDecimal> salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getPosition() {
		return position;
	}

	public void setPosition(String[] position) {
		this.position = position;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Map<String, BigDecimal> getSalary() {
		return salary;
	}

	public void setSalary(Map<String, BigDecimal> salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", position=" + Arrays.toString(position) + ", skills=" + skills
				+ ", salary=" + salary + "]";
	}

	public String toJson() {
		final StringWriter writable = new StringWriter();
		try {
			this.toJson(writable);
		} catch (final IOException e) {
		}
		return writable.toString();
	}

	public void toJson(Writer writable) throws IOException {
		final JsonObject json = new JsonObject();
		json.put("name", this.getName());
		json.put("age", this.getAge());
		json.put("position", this.getPosition());
		json.put("skills", this.getSkills());
		json.put("salary", this.getSalary());
		json.toJson(writable);
	}

	

}
