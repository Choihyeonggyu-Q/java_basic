import siat.study.PostDTO;
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostResponseDTO;

public class ArrayMain {
    public static void main(String[] args) {
        /*
        배열(Array)
        - []
        - 고정길이를 갖는다
        - 단일 타입만 담는 그릇
        - resizing이 되지 않는다.
        - length 속성을 가짐
        - 참조 타입으로 취급됨
        */

        int [] ary = new int [10];
        System.out.println("배열의 길이 : " +  ary.length);

        // 외부 for loop
        for(int i = 0; i < ary.length ; i++){
            // System.out.println(ary[i]);

        }
        // Enhanced for loop
        for(int data : ary){
            System.out.println(data);
        }

        System.out.println(" >>>>> 참조타입의 객체를 배열에 담는다면? ");
        PostDTO dto = PostDTO.builder()
                        .title("제목")
                        .writer("jslim")
                        .regDate("ㅇㅇ")
                        .content("쉬는시간")
                        .viewCnt(2)
                        .build();
        PostDTO [] dtoAry = new PostDTO[10];
        dtoAry[0] = dto;
        dtoAry[1] = dto;
        dtoAry[2] = dto;

        for(PostDTO entity : dtoAry){
            if( entity != null){
                System.out.println(entity.getContent());
            }
        }
        ///////////////////////
        /// Quiz) PostDAO 객체 생성 후 selectRow() 메서드 호춯 후 출력
        PostDAO dao = PostDAO.builder().build();
        // PostResponseDTO [] dtoary = dao.selectRow();   
        // for(PostResponseDTO data : dtoary){
        //     if(data != null){
        //         System.out.println(data);
            }
        // }
    // }   
}
