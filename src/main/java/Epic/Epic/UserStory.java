package Epic.Epic;

import java.util.List;

public class UserStory {
	String userStoryName;
	String daysNo;
	
	List<Task> taskList;

	public String getUserStoryName() {
		return userStoryName;
	}

	public void setUserStoryName(String userStoryName) {
		this.userStoryName = userStoryName;
	}

	public String getDaysNo() {
		return daysNo;
	}

	public void setDaysNo(String daysNo) {
		this.daysNo = daysNo;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

}
