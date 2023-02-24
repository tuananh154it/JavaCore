package logic;

import entity.Person;
import entity.PostType;

public class PostLogic {
    private PostType[] postTypes;

    public PostLogic(PostType[] postTypes) {
        this.postTypes = postTypes;
    }
    public void inputPost(){
        int newPostType = Input.inputNumber("Nhập số lượng bài viết mới: ",1);
        PostType postType = new PostType();
        for(int i = 0 ; i< newPostType){
            postType.inputInfor();
            save(postType);
        }
    }
    private void save(PostType p){
        for(int i = 0 ;i <postTypes.length; i++){
            if(postTypes[i] == null){
                postTypes[i] = p;
                break;
            }
        }
    }
    public void  print(){
        System.out.println("----------- Danh sách post ------------");
        for(int i = 0; i<= postTypes.length;i++){
            if(postTypes[i] != null){
                System.out.println(postTypes[i]);
            }
        }
    }
    public void printPost(){

    }
}
