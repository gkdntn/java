package test09;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Article> articles;
	private List<User> users;
	
	public Board() {
		articles = new ArrayList<>();
		users = new ArrayList<>();
	}
	
	public void addArticle(Article a) {
		articles.add(a);
	}
	
	public void addUser(User a) {
		users.add(a);
	}
	
	public List<Article> getArticles() {
		return articles;
	}
	public List<User> getUsers() {
		return users;
	}
	
}
