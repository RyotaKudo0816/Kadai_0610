package bean;

public class PostBean {

	private int id;
	private String name;
	private String mailadd;
	private String content;
	private String posttime;
	private String edittime;

	public PostBean(String name, String mailadd, String content, String posttime) {
		this.name = name;
		this.mailadd = mailadd;
		this.content = content;
		this.posttime = posttime;
	}

	public PostBean(int id, String name, String mailadd, String content, String posttime) {
		this.id = id;
		this.name = name;
		this.mailadd = mailadd;
		this.content = content;
		this.posttime = posttime;
	}

	public PostBean(int id, String name, String mailadd, String content, String posttime, String edittime) {
		this.id = id;
		this.name = name;
		this.mailadd = mailadd;
		this.content = content;
		this.posttime = posttime;
		this.edittime = edittime;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMailadd() {
		return mailadd;
	}


	public void setMailadd(String mailadd) {
		this.mailadd = mailadd;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getPosttime() {
		return posttime;
	}


	public void setPosttime(String posttime) {
		this.posttime = posttime;
	}


	public String getEdittime() {
		return edittime;
	}


	public void setEdittime(String edittime) {
		this.edittime = edittime;
	}



}
