package SingletonClass;

import java.util.ArrayList;

public class School {
	public final static School school = new School();
	private ArrayList<String> teachers;

	public School() {
		teachers = new ArrayList<String>();
		teachers.add("BALA");
		teachers.add("RAJ");
		teachers.add("BALKIE");
		teachers.add("MANI");
		teachers.add("MATHU");
		teachers.add("KALAI");

	}

	public String getTeacher() {
		if (teachers.size() > 0)
			return teachers.remove(0);
		return "No Teachers";
	}
}
