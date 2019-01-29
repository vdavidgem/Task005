package SingletonClass;

public class Teacher {
	String name, teacher;

	public Teacher(String teachername) {
		this.name = teachername;
		School school = School.school;
		teacher = school.getTeacher();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			Teacher first = new Teacher("Singleton " + i);
			System.out.println(first.getName() + " has teacher: " + first.getTeacher());
		}
	}
}
