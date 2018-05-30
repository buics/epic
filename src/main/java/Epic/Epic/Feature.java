package Epic.Epic;

import java.util.List;

public class Feature {
	String featureName;
	String weekNo;
	
	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getWeekNo() {
		return weekNo;
	}

	public void setWeekNo(String weekNo) {
		this.weekNo = weekNo;
	}

	public List<UserStory> getStoryList() {
		return storyList;
	}

	public void setStoryList(List<UserStory> storyList) {
		this.storyList = storyList;
	}

	List<UserStory> storyList;
}
