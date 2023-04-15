package inheritanceConcepts;

public class CourseDetails extends Courses{
	
		private String courseTopics;
		private int courseHours;
		
		public String getCourseTopics() {
			return courseTopics;
		}
		public void setCourseTopics(String courseTopics) {
			this.courseTopics = courseTopics;
		}
		public int getCourseHours() {
			return courseHours;
		}
		public void setCourseHours(int courseHours) {
			this.courseHours = courseHours;
		}
		
}
