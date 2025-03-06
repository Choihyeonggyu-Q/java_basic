
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostRequestDTO;
import siat.study.service.PostService;
import siat.study.view.PostView;

public class PostMain {
    public static void main(String[] args) {

        PostView view = PostView.builder()
                                .dao(PostDAO.builder()
                                            .requestAry(new PostRequestDTO[10])
                                            .build())
                                .build();
        view.menu();
    }
}
