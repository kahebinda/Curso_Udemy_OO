package Exercicio_StringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date momente;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post(){}


	public Post(Date momente, String title, String content, int likes) {
		this.momente = momente;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}


	public Date getMomente() {
		return momente;
	}


	public void setMomente(Date momente) {
		this.momente = momente;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title +"\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momente)+ "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for(Comment c : comments) {
			sb.append(c.getText()+"\n");
		}
		
		return sb.toString();
		
	}
	
	
	
	
}
