import siat.study.PostDTO;
import siat.study.service.PostService;
import siat.study.view.PostView;

public class PostMain {
    // public static void main(String[] args) {
        
    //     PostDTO post = PostDTO.builder()
    //                         .writer("최형규")
    //                         .title("파이팅")

    //                         .build();
    //     System.out.printf("제목: %s, 작성자: %s, 작성일 %s, 조회수 %d", post.getTitle(), post.getWriter(), post.getRegDate(), post.getViewCnt());
    // }

    public static void main(String[] args) {
        // PostView view = PostView.builder()
        //                     .build();
        // view.menu();
        PostService service = PostService.builder()
                                .build();
            String saveMsg = service.savePost();
            String updateMsg = service.updatePost();
            String deleteMsg = service.deletePost();
            System.out.println(saveMsg);
            System.out.println(updateMsg);
            System.out.println(deleteMsg);    
    }
}
