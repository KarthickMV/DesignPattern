package Factory;

public class Blog extends Website {

	@Override
	public void createWebsites() {
		pages.add(new PostPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
